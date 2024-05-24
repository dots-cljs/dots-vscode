(ns dots.vscode.workspace
  "Namespace for dealing with the current workspace. A workspace is the collection of one
   or more folders that are opened in an editor window (instance).
   
   It is also possible to open an editor without a workspace. For example, when you open a
   new editor window by selecting a file from your platform's File menu, you will not be
   inside a workspace. In this mode, some of the editor's capabilities are reduced but you can
   still open text files and edit them.
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
   the concept of workspaces.
   
   The workspace offers support for {@link workspace.createFileSystemWatcher listening} to fs
   events and for {@link workspace.findFiles finding} files. Both perform well and run _outside_
   the editor-process so that they should be always used instead of nodejs-equivalents."
  (:refer-clojure :exclude [name])
  (:require ["vscode" :as vscode]))

(defn workspace-folder
  "Returns the {@link WorkspaceFolder workspace folder} that contains a given uri.
   * returns `undefined` when the given uri doesn't match any workspace folder
   * returns the *input* when the given uri is a workspace folder itself
   
   **Parameters:**
   - `uri`: `Uri` - An uri.
   
   **Returns:** `WorkspaceFolder | undefined` - A workspace folder or `undefined`"
  ^js [uri]
  (.getWorkspaceFolder vscode/workspace uri))

(defn as-relative-path
  "Returns a path that is relative to the workspace folder or folders.
   
   When there are no {@link workspace.workspaceFolders workspace folders} or when the path
   is not contained in them, the input is returned.
   
   **Parameters:**
   - `path-or-uri`: `string | Uri` - A path or uri. When a uri is given its {@link Uri.fsPath fsPath} is used.
   - `include-workspace-folder?`: `boolean | undefined` - When `true` and when the given path is contained inside a
   workspace folder the name of the workspace is prepended. Defaults to `true` when there are
   multiple workspace folders and `false` otherwise.
   
   **Returns:** `string` - A path relative to the root or the input."
  (^js [path-or-uri]
   (.asRelativePath vscode/workspace path-or-uri))
  (^js [path-or-uri include-workspace-folder?]
   (.asRelativePath vscode/workspace path-or-uri include-workspace-folder?)))

(defn update-workspace-folders?
  "This method replaces `deleteCount` {@link workspace.workspaceFolders workspace folders} starting at index `start`
   by an optional set of `workspaceFoldersToAdd` on the `vscode.workspace.workspaceFolders` array. This \"splice\"
   behavior can be used to add, remove and change workspace folders in a single operation.
   
   **Note:** in some cases calling this method may result in the currently executing extensions (including the
   one that called this method) to be terminated and restarted. For example when the first workspace folder is
   added, removed or changed the (deprecated) `rootPath` property is updated to point to the first workspace
   folder. Another case is when transitioning from an empty or single-folder workspace into a multi-folder
   workspace (see also: https://code.visualstudio.com/docs/editor/workspaces).
   
   Use the {@linkcode onDidChangeWorkspaceFolders onDidChangeWorkspaceFolders()} event to get notified when the
   workspace folders have been updated.
   
   **Example:** adding a new workspace folder at the end of workspace folders
   ```typescript
   workspace.updateWorkspaceFolders(workspace.workspaceFolders ? workspace.workspaceFolders.length : 0, null, { uri: ...});
   ```
   
   **Example:** removing the first workspace folder
   ```typescript
   workspace.updateWorkspaceFolders(0, 1);
   ```
   
   **Example:** replacing an existing workspace folder with a new one
   ```typescript
   workspace.updateWorkspaceFolders(0, 1, { uri: ...});
   ```
   
   It is valid to remove an existing workspace folder and add it again with a different name
   to rename that folder.
   
   **Note:** it is not valid to call {@link updateWorkspaceFolders updateWorkspaceFolders()} multiple times
   without waiting for the {@linkcode onDidChangeWorkspaceFolders onDidChangeWorkspaceFolders()} to fire.
   
   **Parameters:**
   - `start`: `number` - the zero-based location in the list of currently opened {@link WorkspaceFolder workspace folders}from which to start deleting workspace folders.
   - `delete-count`: `number | null | undefined` - the optional number of workspace folders to remove.
   - `workspace-folders-to-add`: `{ readonly uri: Uri; readonly name?: string | undefined; }[]` - the optional variable set of workspace folders to add in place of the deleted ones.
   Each workspace is identified with a mandatory URI and an optional name.
   
   **Returns:** `boolean` - true if the operation was successfully started and false otherwise if arguments were used that would result
   in invalid workspace folder state (e.g. 2 folders with the same URI)."
  (^js [start]
   (.updateWorkspaceFolders vscode/workspace start))
  (^js [start delete-count & workspace-folders-to-add]
   (.. vscode/workspace -updateWorkspaceFolders (apply vscode/workspace (to-array (list* start delete-count workspace-folders-to-add))))))

(defn create-file-system-watcher
  "Creates a file system watcher that is notified on file events (create, change, delete)
   depending on the parameters provided.
   
   By default, all opened {@link workspace.workspaceFolders workspace folders} will be watched
   for file changes recursively.
   
   Additional paths can be added for file watching by providing a {@link RelativePattern } with
   a `base` path to watch. If the path is a folder and the `pattern` is complex (e.g. contains
   `**` or path segments), it will be watched recursively and otherwise will be watched
   non-recursively (i.e. only changes to the first level of the path will be reported).
   
   *Note* that paths must exist in the file system to be watched. File watching may stop when
   the watched path is renamed or deleted.
   
   If possible, keep the use of recursive watchers to a minimum because recursive file watching
   is quite resource intense.
   
   Providing a `string` as `globPattern` acts as convenience method for watching file events in
   all opened workspace folders. It cannot be used to add more folders for file watching, nor will
   it report any file events from folders that are not part of the opened workspace folders.
   
   Optionally, flags to ignore certain kinds of events can be provided.
   
   To stop listening to events the watcher must be disposed.
   
   *Note* that file events from recursive file watchers may be excluded based on user configuration.
   The setting `files.watcherExclude` helps to reduce the overhead of file events from folders
   that are known to produce many file changes at once (such as `node_modules` folders). As such,
   it is highly recommended to watch with simple patterns that do not require recursive watchers
   where the exclude settings are ignored and you have full control over the events.
   
   *Note* that symbolic links are not automatically followed for file watching unless the path to
   watch itself is a symbolic link.
   
   *Note* that file changes for the path to be watched may not be delivered when the path itself
   changes. For example, when watching a path `/Users/somename/Desktop` and the path itself is
   being deleted, the watcher may not report an event and may not work anymore from that moment on.
   The underlying behaviour depends on the path that is provided for watching:
   * if the path is within any of the workspace folders, deletions are tracked and reported unless
     excluded via `files.watcherExclude` setting
   * if the path is equal to any of the workspace folders, deletions are not tracked
   * if the path is outside of any of the workspace folders, deletions are not tracked
   
   If you are interested in being notified when the watched path itself is being deleted, you have
   to watch it's parent folder. Make sure to use a simple `pattern` (such as putting the name of the
   folder) to not accidentally watch all sibling folders recursively.
   
   *Note* that the file paths that are reported for having changed may have a different path casing
   compared to the actual casing on disk on case-insensitive platforms (typically macOS and Windows
   but not Linux). We allow a user to open a workspace folder with any desired path casing and try
   to preserve that. This means:
   * if the path is within any of the workspace folders, the path will match the casing of the
     workspace folder up to that portion of the path and match the casing on disk for children
   * if the path is outside of any of the workspace folders, the casing will match the case of the
     path that was provided for watching
   In the same way, symbolic links are preserved, i.e. the file event will report the path of the
   symbolic link as it was provided for watching and not the target.
   
   ### Examples
   
   The basic anatomy of a file watcher is as follows:
   
   ```ts
   const watcher = vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(<folder>, <pattern>));
   
   watcher.onDidChange(uri => { ... }); // listen to files being changed
   watcher.onDidCreate(uri => { ... }); // listen to files/folders being created
   watcher.onDidDelete(uri => { ... }); // listen to files/folders getting deleted
   
   watcher.dispose(); // dispose after usage
   ```
   
   #### Workspace file watching
   
   If you only care about file events in a specific workspace folder:
   
   ```ts
   vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.workspace.workspaceFolders[0], '**​/*.js'));
   ```
   
   If you want to monitor file events across all opened workspace folders:
   
   ```ts
   vscode.workspace.createFileSystemWatcher('**​/*.js');
   ```
   
   *Note:* the array of workspace folders can be empty if no workspace is opened (empty window).
   
   #### Out of workspace file watching
   
   To watch a folder for changes to *.js files outside the workspace (non recursively), pass in a `Uri` to such
   a folder:
   
   ```ts
   vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.Uri.file(<path to folder outside workspace>), '*.js'));
   ```
   
   And use a complex glob pattern to watch recursively:
   
   ```ts
   vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.Uri.file(<path to folder outside workspace>), '**​/*.js'));
   ```
   
   Here is an example for watching the active editor for file changes:
   
   ```ts
   vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.window.activeTextEditor.document.uri, '*'));
   ```
   
   **Parameters:**
   - `glob-pattern`: `GlobPattern` - A {@link GlobPattern glob pattern} that controls which file events the watcher should report.
   - `ignore-create-events?`: `boolean | undefined` - Ignore when files have been created.
   - `ignore-change-events?`: `boolean | undefined` - Ignore when files have been changed.
   - `ignore-delete-events?`: `boolean | undefined` - Ignore when files have been deleted.
   
   **Returns:** `FileSystemWatcher` - A new file system watcher instance. Must be disposed when no longer needed."
  (^js [glob-pattern]
   (.createFileSystemWatcher vscode/workspace glob-pattern))
  (^js [glob-pattern ignore-create-events?]
   (.createFileSystemWatcher vscode/workspace glob-pattern ignore-create-events?))
  (^js [glob-pattern ignore-create-events? ignore-change-events?]
   (.createFileSystemWatcher vscode/workspace glob-pattern ignore-create-events? ignore-change-events?))
  (^js [glob-pattern ignore-create-events? ignore-change-events? ignore-delete-events?]
   (.createFileSystemWatcher vscode/workspace glob-pattern ignore-create-events? ignore-change-events? ignore-delete-events?)))

(defn find-files
  "Find files across all {@link workspace.workspaceFolders workspace folders} in the workspace.
   
   **Parameters:**
   - `include`: `GlobPattern` - A {@link GlobPattern glob pattern} that defines the files to search for. The glob pattern
   will be matched against the file paths of resulting matches relative to their workspace. Use a {@link RelativePattern relative pattern}
   to restrict the search results to a {@link WorkspaceFolder workspace folder}.
   - `exclude`: `GlobPattern | null | undefined` - A {@link GlobPattern glob pattern} that defines files and folders to exclude. The glob pattern
   will be matched against the file paths of resulting matches relative to their workspace. When `undefined`, default file-excludes (e.g. the `files.exclude`-setting
   but not `search.exclude`) will apply. When `null`, no excludes will apply.
   - `max-results`: `number | undefined` - An upper-bound for the result.
   - `token`: `CancellationToken | undefined` - A token that can be used to signal cancellation to the underlying search engine.
   
   **Returns:** `Thenable<Uri[]>` - A thenable that resolves to an array of resource identifiers. Will return no results if no
   {@link workspace.workspaceFoldersworkspace folders} are opened."
  (^js [include]
   (.findFiles vscode/workspace include))
  (^js [include exclude]
   (.findFiles vscode/workspace include exclude))
  (^js [include exclude max-results]
   (.findFiles vscode/workspace include exclude max-results))
  (^js [include exclude max-results token]
   (.findFiles vscode/workspace include exclude max-results token)))

(defn save
  "Saves the editor identified by the given resource and returns the resulting resource or `undefined`
   if save was not successful or no editor with the given resource was found.
   
   **Note** that an editor with the provided resource must be opened in order to be saved.
   
   **Parameters:**
   - `uri`: `Uri` - the associated uri for the opened editor to save.
   
   **Returns:** `Thenable<Uri | undefined>` - A thenable that resolves when the save operation has finished."
  ^js [uri]
  (.save vscode/workspace uri))

(defn save-as
  "Saves the editor identified by the given resource to a new file name as provided by the user and
   returns the resulting resource or `undefined` if save was not successful or cancelled or no editor
   with the given resource was found.
   
   **Note** that an editor with the provided resource must be opened in order to be saved as.
   
   **Parameters:**
   - `uri`: `Uri` - the associated uri for the opened editor to save as.
   
   **Returns:** `Thenable<Uri | undefined>` - A thenable that resolves when the save-as operation has finished."
  ^js [uri]
  (.saveAs vscode/workspace uri))

(defn save-all
  "Save all dirty files.
   
   **Parameters:**
   - `include-untitled?`: `boolean | undefined` - Also save files that have been created during this session.
   
   **Returns:** `Thenable<boolean>` - A thenable that resolves when the files have been saved. Will return `false`
   for any file that failed to save."
  (^js []
   (.saveAll vscode/workspace))
  (^js [include-untitled?]
   (.saveAll vscode/workspace include-untitled?)))

(defn apply-edit
  "Make changes to one or many resources or create, delete, and rename resources as defined by the given
   {@link WorkspaceEdit workspace edit}.
   
   All changes of a workspace edit are applied in the same order in which they have been added. If
   multiple textual inserts are made at the same position, these strings appear in the resulting text
   in the order the 'inserts' were made, unless that are interleaved with resource edits. Invalid sequences
   like 'delete file a' -> 'insert text in file a' cause failure of the operation.
   
   When applying a workspace edit that consists only of text edits an 'all-or-nothing'-strategy is used.
   A workspace edit with resource creations or deletions aborts the operation, e.g. consecutive edits will
   not be attempted, when a single edit fails.
   
   **Parameters:**
   - `edit`: `WorkspaceEdit` - A workspace edit.
   - `metadata`: `WorkspaceEditMetadata | undefined` - Optional {@link WorkspaceEditMetadata metadata} for the edit.
   
   **Returns:** `Thenable<boolean>` - A thenable that resolves when the edit could be applied."
  (^js [edit]
   (.applyEdit vscode/workspace edit))
  (^js [edit metadata]
   (.applyEdit vscode/workspace edit metadata)))

(defn open-text-document
  "Opens a document. Will return early if this document is already open. Otherwise
   the document is loaded and the {@link workspace.onDidOpenTextDocument didOpen}-event fires.
   
   The document is denoted by an {@link Uri }. Depending on the {@link Uri.scheme scheme} the
   following rules apply:
   * `file`-scheme: Open a file on disk (`openTextDocument(Uri.file(path))`). Will be rejected if the file
   does not exist or cannot be loaded.
   * `untitled`-scheme: Open a blank untitled file with associated path (`openTextDocument(Uri.file(path).with({ scheme: 'untitled' }))`).
   The language will be derived from the file name.
   * For all other schemes contributed {@link TextDocumentContentProvider text document content providers} and
   {@link FileSystemProvider file system providers} are consulted.
   
   *Note* that the lifecycle of the returned document is owned by the editor and not by the extension. That means an
   {@linkcode workspace.onDidCloseTextDocument onDidClose}-event can occur at any time after opening it.
   A short-hand for `openTextDocument(Uri.file(path))`.
   Opens an untitled text document. The editor will prompt the user for a file
   path when the document is to be saved. The `options` parameter allows to
   specify the *language* and/or the *content* of the document.
   
   **Parameters:**
   - `options`: `{ language?: string | undefined; content?: string | undefined; } | undefined` - Options to control how the document will be created.
   - `path`: `string` - A path of a file on disk.
   - `uri`: `Uri` - Identifies the resource to open.
   
   **Returns:** `Thenable<TextDocument>` - A promise that resolves to a {@link TextDocumentdocument}."
  {:arglists '([]
               [options]
               [path]
               [uri])}
  (^js []
   (.openTextDocument vscode/workspace))
  (^js [a]
   (.openTextDocument vscode/workspace a)))

(defn register-text-document-content-provider
  "Register a text document content provider.
   
   Only one provider can be registered per scheme.
   
   **Parameters:**
   - `scheme`: `string` - The uri-scheme to register for.
   - `provider`: `TextDocumentContentProvider` - A content provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [scheme provider]
  (.registerTextDocumentContentProvider vscode/workspace scheme provider))

(defn open-notebook-document
  "Open a notebook. Will return early if this notebook is already {@link notebookDocuments loaded}. Otherwise
   the notebook is loaded and the {@linkcode onDidOpenNotebookDocument }-event fires.
   
   *Note* that the lifecycle of the returned notebook is owned by the editor and not by the extension. That means an
   {@linkcode onDidCloseNotebookDocument }-event can occur at any time after.
   
   *Note* that opening a notebook does not show a notebook editor. This function only returns a notebook document which
   can be shown in a notebook editor but it can also be used for other things.
   Open an untitled notebook. The editor will prompt the user for a file
   path when the document is to be saved.
   
   **Parameters:**
   - `notebook-type`: `string` - The notebook type that should be used.
   - `uri`: `Uri` - The resource to open.
   - `content`: `NotebookData | undefined` - The initial contents of the notebook.
   
   **Returns:** `Thenable<NotebookDocument>` - A promise that resolves to a {@link NotebookDocumentnotebook}."
  {:arglists '([notebook-type]
               [notebook-type content]
               [uri])}
  (^js [a]
   (.openNotebookDocument vscode/workspace a))
  (^js [notebook-type content]
   (.openNotebookDocument vscode/workspace notebook-type content)))

(defn register-notebook-serializer
  "Register a {@link NotebookSerializer notebook serializer}.
   
   A notebook serializer must be contributed through the `notebooks` extension point. When opening a notebook file, the editor will send
   the `onNotebook:<notebookType>` activation event, and extensions must register their serializer in return.
   
   **Parameters:**
   - `notebook-type`: `string` - A notebook.
   - `serializer`: `NotebookSerializer` - A notebook serializer.
   - `options`: `NotebookDocumentContentOptions | undefined` - Optional context options that define what parts of a notebook should be persisted
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this serializer when being disposed."
  (^js [notebook-type serializer]
   (.registerNotebookSerializer vscode/workspace notebook-type serializer))
  (^js [notebook-type serializer options]
   (.registerNotebookSerializer vscode/workspace notebook-type serializer options)))

(defn configuration
  "Get a workspace configuration object.
   
   When a section-identifier is provided only that part of the configuration
   is returned. Dots in the section-identifier are interpreted as child-access,
   like `{ myExt: { setting: { doIt: true }}}` and `getConfiguration('myExt.setting').get('doIt') === true`.
   
   When a scope is provided configuration confined to that scope is returned. Scope can be a resource or a language identifier or both.
   
   **Parameters:**
   - `section`: `string | undefined` - A dot-separated identifier.
   - `scope`: `ConfigurationScope | null | undefined` - A scope for which the configuration is asked for.
   
   **Returns:** `WorkspaceConfiguration` - The full configuration or a subset."
  (^js []
   (.getConfiguration vscode/workspace))
  (^js [section]
   (.getConfiguration vscode/workspace section))
  (^js [section scope]
   (.getConfiguration vscode/workspace section scope)))

(defn register-task-provider
  "Register a task provider.
   
   **Parameters:**
   - `type`: `string` - The task kind type this provider is registered for.
   - `provider`: `TaskProvider<Task>` - A task provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [type provider]
  (.registerTaskProvider vscode/workspace type provider))

(defn register-file-system-provider
  "Register a filesystem provider for a given scheme, e.g. `ftp`.
   
   There can only be one provider per scheme and an error is being thrown when a scheme
   has been claimed by another provider or when it is reserved.
   
   **Parameters:**
   - `scheme`: `string` - The uri-{@link Uri.scheme scheme} the provider registers for.
   - `provider`: `FileSystemProvider` - The filesystem provider.
   - `options`: `{ readonly isCaseSensitive?: boolean | undefined; readonly isReadonly?: boolean | MarkdownString | undefined; } | undefined` - Immutable metadata about the provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  (^js [scheme provider]
   (.registerFileSystemProvider vscode/workspace scheme provider))
  (^js [scheme provider options]
   (.registerFileSystemProvider vscode/workspace scheme provider options)))

(defn fs
  "A {@link FileSystem file system} instance that allows to interact with local and remote
   files, e.g. `vscode.workspace.fs.readDirectory(someUri)` allows to retrieve all entries
   of a directory or `vscode.workspace.fs.stat(anotherUri)` returns the meta data for a
   file.
   
   **Returns:** `FileSystem`"
  ^js []
  (.-fs vscode/workspace))

(defn root-path
  "The uri of the first entry of {@linkcode workspace.workspaceFolders workspaceFolders}
   as `string`. `undefined` if there is no first entry.
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information
   on workspaces.
   
   **Returns:** `string | undefined`"
  ^js []
  (.-rootPath vscode/workspace))

(defn workspace-folders
  "List of workspace folders (0-N) that are open in the editor. `undefined` when no workspace
   has been opened.
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information
   on workspaces.
   
   **Returns:** `readonly WorkspaceFolder[] | undefined`"
  ^js []
  (.-workspaceFolders vscode/workspace))

(defn name
  "The name of the workspace. `undefined` when no workspace
   has been opened.
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
   the concept of workspaces.
   
   **Returns:** `string | undefined`"
  ^js []
  (.-name vscode/workspace))

(defn workspace-file
  "The location of the workspace file, for example:
   
   `file:///Users/name/Development/myProject.code-workspace`
   
   or
   
   `untitled:1555503116870`
   
   for a workspace that is untitled and not yet saved.
   
   Depending on the workspace that is opened, the value will be:
    * `undefined` when no workspace is opened
    * the path of the workspace file as `Uri` otherwise. if the workspace
   is untitled, the returned URI will use the `untitled:` scheme
   
   The location can e.g. be used with the `vscode.openFolder` command to
   open the workspace again after it has been closed.
   
   **Example:**
   ```typescript
   vscode.commands.executeCommand('vscode.openFolder', uriOfWorkspace);
   ```
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
   the concept of workspaces.
   
   **Note:** it is not advised to use `workspace.workspaceFile` to write
   configuration data into the file. You can use `workspace.getConfiguration().update()`
   for that purpose which will work both when a single folder is opened as
   well as an untitled or saved workspace.
   
   **Returns:** `Uri | undefined`"
  ^js []
  (.-workspaceFile vscode/workspace))

(defn on-did-change-workspace-folders
  "An event that is emitted when a workspace folder is added or removed.
   
   **Note:** this event will not fire if the first workspace folder is added, removed or changed,
   because in that case the currently executing extensions (including the one that listens to this
   event) will be terminated and restarted so that the (deprecated) `rootPath` property is updated
   to point to the first workspace folder.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeWorkspaceFolders vscode/workspace))
  (^js [listener]
   (.onDidChangeWorkspaceFolders vscode/workspace listener))
  (^js [listener this-args]
   (.onDidChangeWorkspaceFolders vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeWorkspaceFolders vscode/workspace listener this-args disposables)))

(defn text-documents
  "All text documents currently known to the editor.
   
   **Returns:** `readonly TextDocument[]`"
  ^js []
  (.-textDocuments vscode/workspace))

(defn on-did-open-text-document
  "An event that is emitted when a {@link TextDocument text document} is opened or when the language id
   of a text document {@link languages.setTextDocumentLanguage has been changed}.
   
   To add an event listener when a visible text document is opened, use the {@link TextEditor } events in the
   {@link window } namespace. Note that:
   
   - The event is emitted before the {@link TextDocument document} is updated in the
   {@link window.activeTextEditor active text editor}
   - When a {@link TextDocument text document} is already open (e.g.: open in another {@link window.visibleTextEditors visible text editor}) this event is not emitted
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidOpenTextDocument vscode/workspace))
  (^js [listener]
   (.onDidOpenTextDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidOpenTextDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidOpenTextDocument vscode/workspace listener this-args disposables)))

(defn on-did-close-text-document
  "An event that is emitted when a {@link TextDocument text document} is disposed or when the language id
   of a text document {@link languages.setTextDocumentLanguage has been changed}.
   
   *Note 1:* There is no guarantee that this event fires when an editor tab is closed, use the
   {@linkcode window.onDidChangeVisibleTextEditors onDidChangeVisibleTextEditors}-event to know when editors change.
   
   *Note 2:* A document can be open but not shown in an editor which means this event can fire
   for a document that has not been shown in an editor.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidCloseTextDocument vscode/workspace))
  (^js [listener]
   (.onDidCloseTextDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidCloseTextDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidCloseTextDocument vscode/workspace listener this-args disposables)))

(defn on-did-change-text-document
  "An event that is emitted when a {@link TextDocument text document} is changed. This usually happens
   when the {@link TextDocument.getText contents} changes but also when other things like the
   {@link TextDocument.isDirty dirty}-state changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTextDocument vscode/workspace))
  (^js [listener]
   (.onDidChangeTextDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidChangeTextDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextDocument vscode/workspace listener this-args disposables)))

(defn on-will-save-text-document
  "An event that is emitted when a {@link TextDocument text document} will be saved to disk.
   
   *Note 1:* Subscribers can delay saving by registering asynchronous work. For the sake of data integrity the editor
   might save without firing this event. For instance when shutting down with dirty files.
   
   *Note 2:* Subscribers are called sequentially and they can {@link TextDocumentWillSaveEvent.waitUntil delay} saving
   by registering asynchronous work. Protection against misbehaving listeners is implemented as such:
    * there is an overall time budget that all listeners share and if that is exhausted no further listener is called
    * listeners that take a long time or produce errors frequently will not be called anymore
   
   The current thresholds are 1.5 seconds as overall time budget and a listener can misbehave 3 times before being ignored.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onWillSaveTextDocument vscode/workspace))
  (^js [listener]
   (.onWillSaveTextDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onWillSaveTextDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onWillSaveTextDocument vscode/workspace listener this-args disposables)))

(defn on-did-save-text-document
  "An event that is emitted when a {@link TextDocument text document} is saved to disk.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidSaveTextDocument vscode/workspace))
  (^js [listener]
   (.onDidSaveTextDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidSaveTextDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidSaveTextDocument vscode/workspace listener this-args disposables)))

(defn notebook-documents
  "All notebook documents currently known to the editor.
   
   **Returns:** `readonly NotebookDocument[]`"
  ^js []
  (.-notebookDocuments vscode/workspace))

(defn on-did-change-notebook-document
  "An event that is emitted when a {@link NotebookDocument notebook} has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeNotebookDocument vscode/workspace))
  (^js [listener]
   (.onDidChangeNotebookDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidChangeNotebookDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeNotebookDocument vscode/workspace listener this-args disposables)))

(defn on-will-save-notebook-document
  "An event that is emitted when a {@link NotebookDocument notebook document} will be saved to disk.
   
   *Note 1:* Subscribers can delay saving by registering asynchronous work. For the sake of data integrity the editor
   might save without firing this event. For instance when shutting down with dirty files.
   
   *Note 2:* Subscribers are called sequentially and they can {@link NotebookDocumentWillSaveEvent.waitUntil delay} saving
   by registering asynchronous work. Protection against misbehaving listeners is implemented as such:
    * there is an overall time budget that all listeners share and if that is exhausted no further listener is called
    * listeners that take a long time or produce errors frequently will not be called anymore
   
   The current thresholds are 1.5 seconds as overall time budget and a listener can misbehave 3 times before being ignored.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onWillSaveNotebookDocument vscode/workspace))
  (^js [listener]
   (.onWillSaveNotebookDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onWillSaveNotebookDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onWillSaveNotebookDocument vscode/workspace listener this-args disposables)))

(defn on-did-save-notebook-document
  "An event that is emitted when a {@link NotebookDocument notebook} is saved.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidSaveNotebookDocument vscode/workspace))
  (^js [listener]
   (.onDidSaveNotebookDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidSaveNotebookDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidSaveNotebookDocument vscode/workspace listener this-args disposables)))

(defn on-did-open-notebook-document
  "An event that is emitted when a {@link NotebookDocument notebook} is opened.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidOpenNotebookDocument vscode/workspace))
  (^js [listener]
   (.onDidOpenNotebookDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidOpenNotebookDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidOpenNotebookDocument vscode/workspace listener this-args disposables)))

(defn on-did-close-notebook-document
  "An event that is emitted when a {@link NotebookDocument notebook} is disposed.
   
   *Note 1:* There is no guarantee that this event fires when an editor tab is closed.
   
   *Note 2:* A notebook can be open but not shown in an editor which means this event can fire
   for a notebook that has not been shown in an editor.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidCloseNotebookDocument vscode/workspace))
  (^js [listener]
   (.onDidCloseNotebookDocument vscode/workspace listener))
  (^js [listener this-args]
   (.onDidCloseNotebookDocument vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidCloseNotebookDocument vscode/workspace listener this-args disposables)))

(defn on-will-create-files
  "An event that is emitted when files are being created.
   
   *Note 1:* This event is triggered by user gestures, like creating a file from the
   explorer, or from the {@linkcode workspace.applyEdit }-api. This event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   *Note 2:* When this event is fired, edits to files that are are being created cannot be applied.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onWillCreateFiles vscode/workspace))
  (^js [listener]
   (.onWillCreateFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onWillCreateFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onWillCreateFiles vscode/workspace listener this-args disposables)))

(defn on-did-create-files
  "An event that is emitted when files have been created.
   
   *Note:* This event is triggered by user gestures, like creating a file from the
   explorer, or from the {@linkcode workspace.applyEdit }-api, but this event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidCreateFiles vscode/workspace))
  (^js [listener]
   (.onDidCreateFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onDidCreateFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidCreateFiles vscode/workspace listener this-args disposables)))

(defn on-will-delete-files
  "An event that is emitted when files are being deleted.
   
   *Note 1:* This event is triggered by user gestures, like deleting a file from the
   explorer, or from the {@linkcode workspace.applyEdit }-api, but this event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   *Note 2:* When deleting a folder with children only one event is fired.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onWillDeleteFiles vscode/workspace))
  (^js [listener]
   (.onWillDeleteFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onWillDeleteFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onWillDeleteFiles vscode/workspace listener this-args disposables)))

(defn on-did-delete-files
  "An event that is emitted when files have been deleted.
   
   *Note 1:* This event is triggered by user gestures, like deleting a file from the
   explorer, or from the {@linkcode workspace.applyEdit }-api, but this event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   *Note 2:* When deleting a folder with children only one event is fired.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidDeleteFiles vscode/workspace))
  (^js [listener]
   (.onDidDeleteFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onDidDeleteFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidDeleteFiles vscode/workspace listener this-args disposables)))

(defn on-will-rename-files
  "An event that is emitted when files are being renamed.
   
   *Note 1:* This event is triggered by user gestures, like renaming a file from the
   explorer, and from the {@linkcode workspace.applyEdit }-api, but this event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   *Note 2:* When renaming a folder with children only one event is fired.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onWillRenameFiles vscode/workspace))
  (^js [listener]
   (.onWillRenameFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onWillRenameFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onWillRenameFiles vscode/workspace listener this-args disposables)))

(defn on-did-rename-files
  "An event that is emitted when files have been renamed.
   
   *Note 1:* This event is triggered by user gestures, like renaming a file from the
   explorer, and from the {@linkcode workspace.applyEdit }-api, but this event is *not* fired when
   files change on disk, e.g triggered by another application, or when using the
   {@linkcode FileSystem workspace.fs}-api.
   
   *Note 2:* When renaming a folder with children only one event is fired.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidRenameFiles vscode/workspace))
  (^js [listener]
   (.onDidRenameFiles vscode/workspace listener))
  (^js [listener this-args]
   (.onDidRenameFiles vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidRenameFiles vscode/workspace listener this-args disposables)))

(defn on-did-change-configuration
  "An event that is emitted when the {@link WorkspaceConfiguration configuration} changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeConfiguration vscode/workspace))
  (^js [listener]
   (.onDidChangeConfiguration vscode/workspace listener))
  (^js [listener this-args]
   (.onDidChangeConfiguration vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeConfiguration vscode/workspace listener this-args disposables)))

(defn trusted?
  "When true, the user has explicitly trusted the contents of the workspace.
   
   **Returns:** `boolean`"
  ^js []
  (.-isTrusted vscode/workspace))

(defn on-did-grant-workspace-trust
  "Event that fires when the current workspace has been trusted.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidGrantWorkspaceTrust vscode/workspace))
  (^js [listener]
   (.onDidGrantWorkspaceTrust vscode/workspace listener))
  (^js [listener this-args]
   (.onDidGrantWorkspaceTrust vscode/workspace listener this-args))
  (^js [listener this-args disposables]
   (.onDidGrantWorkspaceTrust vscode/workspace listener this-args disposables)))
