(ns dots.vscode.text-document-change-event
  "An event describing a transactional {@link TextDocument document} change.")

(defn document
  "The affected document.
   
   **Returns:** `TextDocument`"
  ^js [text-document-change-event]
  (.-document ^js text-document-change-event))

(defn content-changes
  "An array of content changes.
   
   **Returns:** `readonly TextDocumentContentChangeEvent[]`"
  ^js [text-document-change-event]
  (.-contentChanges ^js text-document-change-event))

(defn reason
  "The reason why the document was changed.
   Is `undefined` if the reason is not known.
   
   **Returns:** `TextDocumentChangeReason | undefined`"
  ^js [text-document-change-event]
  (.-reason ^js text-document-change-event))
