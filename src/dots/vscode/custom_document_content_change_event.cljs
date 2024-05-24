(ns dots.vscode.custom-document-content-change-event
  "Event triggered by extensions to signal to the editor that the content of a {@linkcode CustomDocument }
   has changed.")

(defn document
  "The document that the change is for.
   
   **Returns:** `T`"
  ^js [custom-document-content-change-event]
  (.-document ^js custom-document-content-change-event))
