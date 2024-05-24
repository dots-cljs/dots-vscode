(ns dots.vscode.text-document-will-save-event
  "An event that is fired when a {@link TextDocument document} will be saved.
   
   To make modifications to the document before it is being saved, call the
   {@linkcode TextDocumentWillSaveEvent.waitUntil waitUntil}-function with a thenable
   that resolves to an array of {@link TextEdit text edits}.")

(defn document
  "The document that will be saved."
  ^js [text-document-will-save-event]
  (.-document ^js text-document-will-save-event))

(defn reason
  "The reason why save was triggered."
  ^js [text-document-will-save-event]
  (.-reason ^js text-document-will-save-event))

(defn wait-until
  "Allows to pause the event loop and to apply {@link TextEdit pre-save-edits}.
   Edits of subsequent calls to this function will be applied in order. The
   edits will be *ignored* if concurrent modifications of the document happened.
   
   *Note:* This function can only be called during event dispatch and not
   in an asynchronous manner:
   
   ```ts
   workspace.onWillSaveTextDocument(event => {
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
  ^js [text-document-will-save-event thenable]
  (.waitUntil ^js text-document-will-save-event thenable))
