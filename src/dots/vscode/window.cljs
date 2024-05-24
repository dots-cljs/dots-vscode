(ns dots.vscode.window
  "Namespace for dealing with the current window of the editor. That is visible
   and active editors, as well as, UI elements to show messages, selections, and
   asking for user input."
  (:require ["vscode" :as vscode]))

(defn show-text-document
  "Show the given document in a text editor. A {@link ViewColumn column} can be provided
   to control where the editor is being shown. Might change the {@link window.activeTextEditor active editor}.
   Show the given document in a text editor. {@link TextDocumentShowOptions Options} can be provided
   to control options of the editor is being shown. Might change the {@link window.activeTextEditor active editor}.
   A short-hand for `openTextDocument(uri).then(document => showTextDocument(document, options))`.
   
   **Parameters:**
   - `document`: `TextDocument` - A text document to be shown.
   - `uri`: `Uri` - A resource identifier.
   - `column`: `ViewColumn | undefined` - A view column in which the {@link TextEditor editor} should be shown. The default is the {@link ViewColumn.Active active}.
   Columns that do not exist will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }. Use {@linkcode ViewColumn.Beside }to open the editor to the side of the currently active one.
   - `options`: `TextDocumentShowOptions | undefined` - {@link TextDocumentShowOptions Editor options} to configure the behavior of showing the {@link TextEditor editor}.
   - `preserve-focus?`: `boolean | undefined` - When `true` the editor will not take focus.
   
   **Returns:** `Thenable<TextEditor>` - A promise that resolves to an {@link TextEditoreditor}."
  {:arglists '([document]
               [document column]
               [document column preserve-focus?]
               [document options]
               [uri]
               [uri options])}
  (^js [a]
   (.showTextDocument vscode/window a))
  (^js [a b]
   (.showTextDocument vscode/window a b))
  (^js [document column preserve-focus?]
   (.showTextDocument vscode/window document column preserve-focus?)))

(defn show-notebook-document
  "Show the given {@link NotebookDocument } in a {@link NotebookEditor notebook editor}.
   
   **Parameters:**
   - `document`: `NotebookDocument` - A text document to be shown.
   - `options`: `NotebookDocumentShowOptions | undefined` - {@link NotebookDocumentShowOptions Editor options} to configure the behavior of showing the {@link NotebookEditor notebook editor}.
   
   **Returns:** `Thenable<NotebookEditor>` - A promise that resolves to an {@link NotebookEditornotebook editor}."
  (^js [document]
   (.showNotebookDocument vscode/window document))
  (^js [document options]
   (.showNotebookDocument vscode/window document options)))

(defn create-text-editor-decoration-type
  "Create a TextEditorDecorationType that can be used to add decorations to text editors.
   
   **Parameters:**
   - `options`: `DecorationRenderOptions` - Rendering options for the decoration type.
   
   **Returns:** `TextEditorDecorationType` - A new decoration type instance."
  ^js [options]
  (.createTextEditorDecorationType vscode/window options))

(defn show-information-message
  "Show an information message to users. Optionally provide an array of items which will be presented as
   clickable buttons.
   Show an information message.
   
   **Parameters:**
   - `message`: `string` - The message to show.
   - `options`: `MessageOptions` - Configures the behaviour of the message.
   - `items`: `T[]` - A set of items that will be rendered as actions in the message.
   
   **Returns:** `Thenable<T | undefined>` - A thenable that resolves to the selected item or `undefined` when being dismissed."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showInformationMessage (apply vscode/window (to-array (cons a more)))))

(defn show-warning-message
  "Show a warning message.
   
   **Parameters:**
   - `message`: `string` - The message to show.
   - `options`: `MessageOptions` - Configures the behaviour of the message.
   - `items`: `T[]` - A set of items that will be rendered as actions in the message.
   
   **Returns:** `Thenable<T | undefined>` - A thenable that resolves to the selected item or `undefined` when being dismissed."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showWarningMessage (apply vscode/window (to-array (cons a more)))))

(defn show-error-message
  "Show an error message.
   
   **Parameters:**
   - `message`: `string` - The message to show.
   - `options`: `MessageOptions` - Configures the behaviour of the message.
   - `items`: `T[]` - A set of items that will be rendered as actions in the message.
   
   **Returns:** `Thenable<T | undefined>` - A thenable that resolves to the selected item or `undefined` when being dismissed."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showErrorMessage (apply vscode/window (to-array (cons a more)))))

(defn show-quick-pick
  "Shows a selection list allowing multiple selections.
   Shows a selection list.
   
   **Parameters:**
   - `items`: `readonly T[] | Thenable<readonly T[]>` - An array of items, or a promise that resolves to an array of items.
   - `options`: `QuickPickOptions | undefined` - Configures the behavior of the selection list.
   - `token`: `CancellationToken | undefined` - A token that can be used to signal cancellation.
   
   **Returns:** `Thenable<T | undefined>` - A promise that resolves to the selected item or `undefined`."
  (^js [items]
   (.showQuickPick vscode/window items))
  (^js [items options]
   (.showQuickPick vscode/window items options))
  (^js [items options token]
   (.showQuickPick vscode/window items options token)))

(defn show-workspace-folder-pick
  "Shows a selection list of {@link workspace.workspaceFolders workspace folders} to pick from.
   Returns `undefined` if no folder is open.
   
   **Parameters:**
   - `options`: `WorkspaceFolderPickOptions | undefined` - Configures the behavior of the workspace folder list.
   
   **Returns:** `Thenable<WorkspaceFolder | undefined>` - A promise that resolves to the workspace folder or `undefined`."
  (^js []
   (.showWorkspaceFolderPick vscode/window))
  (^js [options]
   (.showWorkspaceFolderPick vscode/window options)))

(defn show-open-dialog
  "Shows a file open dialog to the user which allows to select a file
   for opening-purposes.
   
   **Parameters:**
   - `options`: `OpenDialogOptions | undefined` - Options that control the dialog.
   
   **Returns:** `Thenable<Uri[] | undefined>` - A promise that resolves to the selected resources or `undefined`."
  (^js []
   (.showOpenDialog vscode/window))
  (^js [options]
   (.showOpenDialog vscode/window options)))

(defn show-save-dialog
  "Shows a file save dialog to the user which allows to select a file
   for saving-purposes.
   
   **Parameters:**
   - `options`: `SaveDialogOptions | undefined` - Options that control the dialog.
   
   **Returns:** `Thenable<Uri | undefined>` - A promise that resolves to the selected resource or `undefined`."
  (^js []
   (.showSaveDialog vscode/window))
  (^js [options]
   (.showSaveDialog vscode/window options)))

(defn show-input-box
  "Opens an input box to ask the user for input.
   
   The returned value will be `undefined` if the input box was canceled (e.g. pressing ESC). Otherwise the
   returned value will be the string typed by the user or an empty string if the user did not type
   anything but dismissed the input box with OK.
   
   **Parameters:**
   - `options`: `InputBoxOptions | undefined` - Configures the behavior of the input box.
   - `token`: `CancellationToken | undefined` - A token that can be used to signal cancellation.
   
   **Returns:** `Thenable<string | undefined>` - A promise that resolves to a string the user provided or to `undefined` in case of dismissal."
  (^js []
   (.showInputBox vscode/window))
  (^js [options]
   (.showInputBox vscode/window options))
  (^js [options token]
   (.showInputBox vscode/window options token)))

(defn create-quick-pick
  "Creates a {@link QuickPick } to let the user pick an item from a list
   of items of type T.
   
   Note that in many cases the more convenient {@link window.showQuickPick }
   is easier to use. {@link window.createQuickPick } should be used
   when {@link window.showQuickPick } does not offer the required flexibility.
   
   **Returns:** `QuickPick<T>` - A new {@link QuickPick}."
  ^js []
  (.createQuickPick vscode/window))

(defn create-input-box
  "Creates a {@link InputBox } to let the user enter some text input.
   
   Note that in many cases the more convenient {@link window.showInputBox }
   is easier to use. {@link window.createInputBox } should be used
   when {@link window.showInputBox } does not offer the required flexibility.
   
   **Returns:** `InputBox` - A new {@link InputBox}."
  ^js []
  (.createInputBox vscode/window))

(defn create-output-channel
  "Creates a new {@link OutputChannel output channel} with the given name and language id
   If language id is not provided, then **Log** is used as default language id.
   
   You can access the visible or active output channel as a {@link TextDocument text document} from {@link window.visibleTextEditors visible editors} or {@link window.activeTextEditor active editor}
   and use the language id to contribute language features like syntax coloring, code lens etc.,
   Creates a new {@link LogOutputChannel log output channel} with the given name.
   
   **Parameters:**
   - `name`: `string` - Human-readable string which will be used to represent the channel in the UI.
   - `language-id`: `string | undefined` - The identifier of the language associated with the channel.
   - `options`: `{ log: true; }` - Options for the log output channel.
   
   **Returns:** `LogOutputChannel` - A new log output channel."
  {:arglists '([name]
               [name language-id]
               [name options])}
  (^js [name]
   (.createOutputChannel vscode/window name))
  (^js [a b]
   (.createOutputChannel vscode/window a b)))

(defn create-webview-panel
  "Create and show a new webview panel.
   
   **Parameters:**
   - `view-type`: `string` - Identifies the type of the webview panel.
   - `title`: `string` - Title of the panel.
   - `show-options`: `ViewColumn | { readonly viewColumn: ViewColumn; readonly preserveFocus?: boolean | undefined; }` - Where to show the webview in the editor. If preserveFocus is set, the new webview will not take focus.
   - `options`: `(WebviewPanelOptions & WebviewOptions) | undefined` - Settings for the new panel.
   
   **Returns:** `WebviewPanel` - New webview panel."
  (^js [view-type title show-options]
   (.createWebviewPanel vscode/window view-type title show-options))
  (^js [view-type title show-options options]
   (.createWebviewPanel vscode/window view-type title show-options options)))

(defn set-status-bar-message
  "Set a message to the status bar. This is a short hand for the more powerful
   status bar {@link window.createStatusBarItem items}.
   Set a message to the status bar. This is a short hand for the more powerful
   status bar {@link window.createStatusBarItem items}.
   
   *Note* that status bar messages stack and that they must be disposed when no
   longer used.
   
   **Parameters:**
   - `text`: `string` - The message to show, supports icon substitution as in status bar {@link StatusBarItem.text items}.
   - `hide-after-timeout`: `number` - Timeout in milliseconds after which the message will be disposed.
   - `hide-when-done`: `Thenable<any>` - Thenable on which completion (resolve or reject) the message will be disposed.
   
   **Returns:** `Disposable` - A disposable which hides the status bar message."
  {:arglists '([text]
               [text hide-after-timeout]
               [text hide-when-done])}
  (^js [text]
   (.setStatusBarMessage vscode/window text))
  (^js [a b]
   (.setStatusBarMessage vscode/window a b)))

(defn with-scm-progress
  "Show progress in the Source Control viewlet while running the given callback and while
   its returned promise isn't resolve or rejected.
   
   **Parameters:**
   - `task`: `(progress: Progress<number>) => Thenable<R>` - A callback returning a promise. Progress increments can be reported with
   the provided {@link Progress }-object.
   
   **Returns:** `Thenable<R>` - The thenable the task did return."
  ^js [task]
  (.withScmProgress vscode/window task))

(defn with-progress
  "Show progress in the editor. Progress is shown while running the given callback
   and while the promise it returned isn't resolved nor rejected. The location at which
   progress should show (and other details) is defined via the passed {@linkcode ProgressOptions }.
   
   **Parameters:**
   - `options`: `ProgressOptions` - A {@linkcode ProgressOptions }-object describing the options to use for showing progress, like its location
   - `task`: `(progress: Progress<{ message?: string | undefined; increment?: number | undefined; }>, token: CancellationToken) => Thenable<R>` - A callback returning a promise. Progress state can be reported with
   the provided {@link Progress }-object.
   
   To report discrete progress, use `increment` to indicate how much work has been completed. Each call with
   a `increment` value will be summed up and reflected as overall progress until 100% is reached (a value of
   e.g. `10` accounts for `10%` of work done).
   Note that currently only `ProgressLocation.Notification` is capable of showing discrete progress.
   
   To monitor if the operation has been cancelled by the user, use the provided {@linkcode CancellationToken }.
   Note that currently only `ProgressLocation.Notification` is supporting to show a cancel button to cancel the
   long running operation.
   
   **Returns:** `Thenable<R>` - The thenable the task-callback returned."
  ^js [options task]
  (.withProgress vscode/window options task))

(defn create-status-bar-item
  "Creates a status bar {@link StatusBarItem item}.
   
   **Parameters:**
   - `alignment`: `StatusBarAlignment | undefined` - The alignment of the item.
   - `id`: `string` - The identifier of the item. Must be unique within the extension.
   - `priority`: `number | undefined` - The priority of the item. Higher values mean the item should be shown more to the left.
   
   **Returns:** `StatusBarItem` - A new status bar item."
  {:arglists '([]
               [alignment]
               [alignment priority]
               [id]
               [id alignment]
               [id alignment priority])}
  (^js []
   (.createStatusBarItem vscode/window))
  (^js [a]
   (.createStatusBarItem vscode/window a))
  (^js [a b]
   (.createStatusBarItem vscode/window a b))
  (^js [id alignment priority]
   (.createStatusBarItem vscode/window id alignment priority)))

(defn create-terminal
  "Creates a {@link Terminal } with a backing shell process. The cwd of the terminal will be the workspace
   directory if it exists.
   Creates a {@link Terminal } with a backing shell process.
   Creates a {@link Terminal } where an extension controls its input and output.
   
   **Parameters:**
   - `name`: `string | undefined` - Optional human-readable string which will be used to represent the terminal in the UI.
   - `options`: `ExtensionTerminalOptions` - An {@link ExtensionTerminalOptions } object describing
   the characteristics of the new terminal.
   - `shell-path`: `string | undefined` - Optional path to a custom shell executable to be used in the terminal.
   - `shell-args`: `string | readonly string[] | undefined` - Optional args for the custom shell executable. A string can be used on Windows only which
   allows specifying shell args in
   [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
   
   **Returns:** `Terminal` - A new Terminal."
  {:arglists '([]
               [name]
               [name shell-path]
               [name shell-path shell-args]
               [options])}
  (^js []
   (.createTerminal vscode/window))
  (^js [a]
   (.createTerminal vscode/window a))
  (^js [name shell-path]
   (.createTerminal vscode/window name shell-path))
  (^js [name shell-path shell-args]
   (.createTerminal vscode/window name shell-path shell-args)))

(defn register-tree-data-provider
  "Register a {@link TreeDataProvider } for the view contributed using the extension point `views`.
   This will allow you to contribute data to the {@link TreeView } and update if the data changes.
   
   **Note:** To get access to the {@link TreeView } and perform operations on it, use {@link window.createTreeView createTreeView}.
   
   **Parameters:**
   - `view-id`: `string` - Id of the view contributed using the extension point `views`.
   - `tree-data-provider`: `TreeDataProvider<T>` - A {@link TreeDataProvider } that provides tree data for the view
   
   **Returns:** `Disposable` - A {@link Disposabledisposable} that unregisters the {@link TreeDataProvider}."
  ^js [view-id tree-data-provider]
  (.registerTreeDataProvider vscode/window view-id tree-data-provider))

(defn create-tree-view
  "Create a {@link TreeView } for the view contributed using the extension point `views`.
   
   **Parameters:**
   - `view-id`: `string` - Id of the view contributed using the extension point `views`.
   - `options`: `TreeViewOptions<T>` - Options for creating the {@link TreeView }
   
   **Returns:** `TreeView<T>` - a {@link TreeView}."
  ^js [view-id options]
  (.createTreeView vscode/window view-id options))

(defn register-uri-handler
  "Registers a {@link UriHandler uri handler} capable of handling system-wide {@link Uri uris}.
   In case there are multiple windows open, the topmost window will handle the uri.
   A uri handler is scoped to the extension it is contributed from; it will only
   be able to handle uris which are directed to the extension itself. A uri must respect
   the following rules:
   
   - The uri-scheme must be `vscode.env.uriScheme`;
   - The uri-authority must be the extension id (e.g. `my.extension`);
   - The uri-path, -query and -fragment parts are arbitrary.
   
   For example, if the `my.extension` extension registers a uri handler, it will only
   be allowed to handle uris with the prefix `product-name://my.extension`.
   
   An extension can only register a single uri handler in its entire activation lifetime.
   
   * *Note:* There is an activation event `onUri` that fires when a uri directed for
   the current extension is about to be handled.
   
   **Parameters:**
   - `handler`: `UriHandler` - The uri handler to register for this extension.
   
   **Returns:** `Disposable` - A {@link Disposabledisposable} that unregisters the handler."
  ^js [handler]
  (.registerUriHandler vscode/window handler))

(defn register-webview-panel-serializer
  "Registers a webview panel serializer.
   
   Extensions that support reviving should have an `\"onWebviewPanel:viewType\"` activation event and
   make sure that `registerWebviewPanelSerializer` is called during activation.
   
   Only a single serializer may be registered at a time for a given `viewType`.
   
   **Parameters:**
   - `view-type`: `string` - Type of the webview panel that can be serialized.
   - `serializer`: `WebviewPanelSerializer<unknown>` - Webview serializer.
   
   **Returns:** `Disposable` - A {@link Disposabledisposable} that unregisters the serializer."
  ^js [view-type serializer]
  (.registerWebviewPanelSerializer vscode/window view-type serializer))

(defn register-webview-view-provider
  "Register a new provider for webview views.
   
   **Parameters:**
   - `view-id`: `string` - Unique id of the view. This should match the `id` from the
   `views` contribution in the package.json.
   - `provider`: `WebviewViewProvider` - Provider for the webview views.
   - `options`: `{ readonly webviewOptions?: { readonly retainContextWhenHidden?: boolean | undefined; } | undefined; } | undefined`
   
   **Returns:** `Disposable` - Disposable that unregisters the provider."
  (^js [view-id provider]
   (.registerWebviewViewProvider vscode/window view-id provider))
  (^js [view-id provider options]
   (.registerWebviewViewProvider vscode/window view-id provider options)))

(defn register-custom-editor-provider
  "Register a provider for custom editors for the `viewType` contributed by the `customEditors` extension point.
   
   When a custom editor is opened, an `onCustomEditor:viewType` activation event is fired. Your extension
   must register a {@linkcode CustomTextEditorProvider }, {@linkcode CustomReadonlyEditorProvider },
   {@linkcode CustomEditorProvider }for `viewType` as part of activation.
   
   **Parameters:**
   - `view-type`: `string` - Unique identifier for the custom editor provider. This should match the `viewType` from the
   `customEditors` contribution point.
   - `provider`: `CustomTextEditorProvider | CustomReadonlyEditorProvider<CustomDocument> | CustomEditorProvider<CustomDocument>` - Provider that resolves custom editors.
   - `options`: `{ readonly webviewOptions?: WebviewPanelOptions | undefined; readonly supportsMultipleEditorsPerDocument?: boolean | undefined; } | undefined` - Options for the provider.
   
   **Returns:** `Disposable` - Disposable that unregisters the provider."
  (^js [view-type provider]
   (.registerCustomEditorProvider vscode/window view-type provider))
  (^js [view-type provider options]
   (.registerCustomEditorProvider vscode/window view-type provider options)))

(defn register-terminal-link-provider
  "Register provider that enables the detection and handling of links within the terminal.
   
   **Parameters:**
   - `provider`: `TerminalLinkProvider<TerminalLink>` - The provider that provides the terminal links.
   
   **Returns:** `Disposable` - Disposable that unregisters the provider."
  ^js [provider]
  (.registerTerminalLinkProvider vscode/window provider))

(defn register-terminal-profile-provider
  "Registers a provider for a contributed terminal profile.
   
   **Parameters:**
   - `id`: `string` - The ID of the contributed terminal profile.
   - `provider`: `TerminalProfileProvider` - The terminal profile provider.
   
   **Returns:** `Disposable` - A {@link Disposabledisposable} that unregisters the provider."
  ^js [id provider]
  (.registerTerminalProfileProvider vscode/window id provider))

(defn register-file-decoration-provider
  "Register a file decoration provider.
   
   **Parameters:**
   - `provider`: `FileDecorationProvider` - A {@link FileDecorationProvider }.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters the provider."
  ^js [provider]
  (.registerFileDecorationProvider vscode/window provider))

(defn tab-groups
  "Represents the grid widget within the main editor area"
  ^js []
  (.-tabGroups vscode/window))

(defn active-text-editor
  "The currently active editor or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  ^js []
  (.-activeTextEditor vscode/window))

(defn visible-text-editors
  "The currently visible editors or an empty array."
  ^js []
  (.-visibleTextEditors vscode/window))

(defn on-did-change-active-text-editor
  "An {@link Event } which fires when the {@link window.activeTextEditor active editor}
   has changed. *Note* that the event also fires when the active editor changes
   to `undefined`.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeActiveTextEditor vscode/window))
  (^js [listener]
   (.onDidChangeActiveTextEditor vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveTextEditor vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveTextEditor vscode/window listener this-args disposables)))

(defn on-did-change-visible-text-editors
  "An {@link Event } which fires when the array of {@link window.visibleTextEditors visible editors}
   has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeVisibleTextEditors vscode/window))
  (^js [listener]
   (.onDidChangeVisibleTextEditors vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeVisibleTextEditors vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeVisibleTextEditors vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-selection
  "An {@link Event } which fires when the selection in an editor has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTextEditorSelection vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorSelection vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorSelection vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorSelection vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-visible-ranges
  "An {@link Event } which fires when the visible ranges of an editor has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTextEditorVisibleRanges vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-options
  "An {@link Event } which fires when the options of an editor have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTextEditorOptions vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorOptions vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorOptions vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorOptions vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-view-column
  "An {@link Event } which fires when the view column of an editor has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTextEditorViewColumn vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorViewColumn vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorViewColumn vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorViewColumn vscode/window listener this-args disposables)))

(defn visible-notebook-editors
  "The currently visible {@link NotebookEditor notebook editors} or an empty array."
  ^js []
  (.-visibleNotebookEditors vscode/window))

(defn on-did-change-visible-notebook-editors
  "An {@link Event } which fires when the {@link window.visibleNotebookEditors visible notebook editors}
   has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeVisibleNotebookEditors vscode/window))
  (^js [listener]
   (.onDidChangeVisibleNotebookEditors vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeVisibleNotebookEditors vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeVisibleNotebookEditors vscode/window listener this-args disposables)))

(defn active-notebook-editor
  "The currently active {@link NotebookEditor notebook editor} or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  ^js []
  (.-activeNotebookEditor vscode/window))

(defn on-did-change-active-notebook-editor
  "An {@link Event } which fires when the {@link window.activeNotebookEditor active notebook editor}
   has changed. *Note* that the event also fires when the active editor changes
   to `undefined`.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeActiveNotebookEditor vscode/window))
  (^js [listener]
   (.onDidChangeActiveNotebookEditor vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveNotebookEditor vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveNotebookEditor vscode/window listener this-args disposables)))

(defn on-did-change-notebook-editor-selection
  "An {@link Event } which fires when the {@link NotebookEditor.selections notebook editor selections}
   have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeNotebookEditorSelection vscode/window))
  (^js [listener]
   (.onDidChangeNotebookEditorSelection vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeNotebookEditorSelection vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeNotebookEditorSelection vscode/window listener this-args disposables)))

(defn on-did-change-notebook-editor-visible-ranges
  "An {@link Event } which fires when the {@link NotebookEditor.visibleRanges notebook editor visible ranges}
   have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeNotebookEditorVisibleRanges vscode/window))
  (^js [listener]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener this-args disposables)))

(defn terminals
  "The currently opened terminals or an empty array."
  ^js []
  (.-terminals vscode/window))

(defn active-terminal
  "The currently active terminal or `undefined`. The active terminal is the one that
   currently has focus or most recently had focus."
  ^js []
  (.-activeTerminal vscode/window))

(defn on-did-change-active-terminal
  "An {@link Event } which fires when the {@link window.activeTerminal active terminal}
   has changed. *Note* that the event also fires when the active terminal changes
   to `undefined`.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeActiveTerminal vscode/window))
  (^js [listener]
   (.onDidChangeActiveTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveTerminal vscode/window listener this-args disposables)))

(defn on-did-open-terminal
  "An {@link Event } which fires when a terminal has been created, either through the
   {@link window.createTerminal createTerminal} API or commands.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidOpenTerminal vscode/window))
  (^js [listener]
   (.onDidOpenTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidOpenTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidOpenTerminal vscode/window listener this-args disposables)))

(defn on-did-close-terminal
  "An {@link Event } which fires when a terminal is disposed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidCloseTerminal vscode/window))
  (^js [listener]
   (.onDidCloseTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidCloseTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidCloseTerminal vscode/window listener this-args disposables)))

(defn on-did-change-terminal-state
  "An {@link Event } which fires when a {@link Terminal.state terminal's state} has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTerminalState vscode/window))
  (^js [listener]
   (.onDidChangeTerminalState vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTerminalState vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTerminalState vscode/window listener this-args disposables)))

(defn state
  "Represents the current window's state."
  ^js []
  (.-state vscode/window))

(defn on-did-change-window-state
  "An {@link Event } which fires when the focus or activity state of the current window
   changes. The value of the event represents whether the window is focused.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeWindowState vscode/window))
  (^js [listener]
   (.onDidChangeWindowState vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeWindowState vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeWindowState vscode/window listener this-args disposables)))

(defn active-color-theme
  "The currently active color theme as configured in the settings. The active
   theme can be changed via the `workbench.colorTheme` setting."
  ^js []
  (.-activeColorTheme vscode/window))

(defn on-did-change-active-color-theme
  "An {@link Event } which fires when the active color theme is changed or has changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeActiveColorTheme vscode/window))
  (^js [listener]
   (.onDidChangeActiveColorTheme vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveColorTheme vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveColorTheme vscode/window listener this-args disposables)))
