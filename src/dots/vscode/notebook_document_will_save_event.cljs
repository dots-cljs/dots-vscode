(ns dots.vscode.notebook-document-will-save-event
  "An event that is fired when a {@link NotebookDocument notebook document} will be saved.
   
   To make modifications to the document before it is being saved, call the
   {@linkcode NotebookDocumentWillSaveEvent.waitUntil waitUntil}-function with a thenable
   that resolves to a {@link WorkspaceEdit workspace edit}.")

(defn token
  "A cancellation token."
  ^js [notebook-document-will-save-event]
  (.-token ^js notebook-document-will-save-event))

(defn notebook
  "The {@link NotebookDocument notebook document} that will be saved."
  ^js [notebook-document-will-save-event]
  (.-notebook ^js notebook-document-will-save-event))

(defn reason
  "The reason why save was triggered."
  ^js [notebook-document-will-save-event]
  (.-reason ^js notebook-document-will-save-event))

(defn wait-until
  "Allows to pause the event loop and to apply {@link WorkspaceEdit workspace edit}.
   Edits of subsequent calls to this function will be applied in order. The
   edits will be *ignored* if concurrent modifications of the notebook document happened.
   
   *Note:* This function can only be called during event dispatch and not
   in an asynchronous manner:
   
   ```ts
   workspace.onWillSaveNotebookDocument(event => {
   	// async, will *throw* an error
   	setTimeout(() => event.waitUntil(promise));
   
   	// sync, OK
   	event.waitUntil(promise);
   })
   ```
   Allows to pause the event loop until the provided thenable resolved.
   
   *Note:* This function can only be called during event dispatch.
   
   **Parameters:**
   - `thenable`: `Thenable<any>` - A thenable that delays saving.
   
   **Returns:** `void`"
  ^js [notebook-document-will-save-event thenable]
  (.waitUntil ^js notebook-document-will-save-event thenable))
