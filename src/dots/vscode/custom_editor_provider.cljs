(ns dots.vscode.custom-editor-provider
  "Provider for editable custom editors that use a custom document model.
   
   Custom editors use {@linkcode CustomDocument } as their document model instead of a {@linkcode TextDocument }.
   This gives extensions full control over actions such as edit, save, and backup.
   
   You should use this type of custom editor when dealing with binary files or more complex scenarios. For simple
   text based documents, use {@linkcode CustomTextEditorProvider } instead.")

(defn on-did-change-custom-document
  "Signal that an edit has occurred inside a custom editor.
   
   This event must be fired by your extension whenever an edit happens in a custom editor. An edit can be
   anything from changing some text, to cropping an image, to reordering a list. Your extension is free to
   define what an edit is and what data is stored on each edit.
   
   Firing `onDidChange` causes the editors to be marked as being dirty. This is cleared when the user either
   saves or reverts the file.
   
   Editors that support undo/redo must fire a `CustomDocumentEditEvent` whenever an edit happens. This allows
   users to undo and redo the edit using the editor's standard keyboard shortcuts. The editor will also mark
   the editor as no longer being dirty if the user undoes all edits to the last saved state.
   
   Editors that support editing but cannot use the editor's standard undo/redo mechanism must fire a `CustomDocumentContentChangeEvent`.
   The only way for a user to clear the dirty state of an editor that does not support undo/redo is to either
   `save` or `revert` the file.
   
   An editor should only ever fire `CustomDocumentEditEvent` events, or only ever fire `CustomDocumentContentChangeEvent` events."
  ^js [custom-editor-provider]
  (.-onDidChangeCustomDocument ^js custom-editor-provider))

(defn save-custom-document
  "Save a custom document.
   
   This method is invoked by the editor when the user saves a custom editor. This can happen when the user
   triggers save while the custom editor is active, by commands such as `save all`, or by auto save if enabled.
   
   To implement `save`, the implementer must persist the custom editor. This usually means writing the
   file data for the custom document to disk. After `save` completes, any associated editor instances will
   no longer be marked as dirty."
  ^js [custom-editor-provider document cancellation]
  (.saveCustomDocument ^js custom-editor-provider document cancellation))

(defn save-custom-document-as
  "Save a custom document to a different location.
   
   This method is invoked by the editor when the user triggers 'save as' on a custom editor. The implementer must
   persist the custom editor to `destination`.
   
   When the user accepts save as, the current editor is be replaced by an non-dirty editor for the newly saved file."
  ^js [custom-editor-provider document destination cancellation]
  (.saveCustomDocumentAs ^js custom-editor-provider document destination cancellation))

(defn revert-custom-document
  "Revert a custom document to its last saved state.
   
   This method is invoked by the editor when the user triggers `File: Revert File` in a custom editor. (Note that
   this is only used using the editor's `File: Revert File` command and not on a `git revert` of the file).
   
   To implement `revert`, the implementer must make sure all editor instances (webviews) for `document`
   are displaying the document in the same state is saved in. This usually means reloading the file from the
   workspace."
  ^js [custom-editor-provider document cancellation]
  (.revertCustomDocument ^js custom-editor-provider document cancellation))

(defn backup-custom-document
  "Back up a dirty custom document.
   
   Backups are used for hot exit and to prevent data loss. Your `backup` method should persist the resource in
   its current state, i.e. with the edits applied. Most commonly this means saving the resource to disk in
   the `ExtensionContext.storagePath`. When the editor reloads and your custom editor is opened for a resource,
   your extension should first check to see if any backups exist for the resource. If there is a backup, your
   extension should load the file contents from there instead of from the resource in the workspace.
   
   `backup` is triggered approximately one second after the user stops editing the document. If the user
   rapidly edits the document, `backup` will not be invoked until the editing stops.
   
   `backup` is not invoked when `auto save` is enabled (since auto save already persists the resource)."
  ^js [custom-editor-provider document context cancellation]
  (.backupCustomDocument ^js custom-editor-provider document context cancellation))

(defn open-custom-document
  "Create a new document for a given resource.
   
   `openCustomDocument` is called when the first time an editor for a given resource is opened. The opened
   document is then passed to `resolveCustomEditor` so that the editor can be shown to the user.
   
   Already opened `CustomDocument` are re-used if the user opened additional editors. When all editors for a
   given resource are closed, the `CustomDocument` is disposed of. Opening an editor at this point will
   trigger another call to `openCustomDocument`."
  ^js [custom-editor-provider uri open-context token]
  (.openCustomDocument ^js custom-editor-provider uri open-context token))

(defn resolve-custom-editor
  "Resolve a custom editor for a given resource.
   
   This is called whenever the user opens a new editor for this `CustomEditorProvider`."
  ^js [custom-editor-provider document webview-panel token]
  (.resolveCustomEditor ^js custom-editor-provider document webview-panel token))
