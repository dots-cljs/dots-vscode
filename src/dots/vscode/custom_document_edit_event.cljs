(ns dots.vscode.custom-document-edit-event
  "Event triggered by extensions to signal to the editor that an edit has occurred on an {@linkcode CustomDocument }.")

(defn document
  "The document that the edit is for."
  ^js [custom-document-edit-event]
  (.-document ^js custom-document-edit-event))

(defn undo
  "Undo the edit operation.
   
   This is invoked by the editor when the user undoes this edit. To implement `undo`, your
   extension should restore the document and editor to the state they were in just before this
   edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`."
  ^js [custom-document-edit-event]
  (.undo ^js custom-document-edit-event))

(defn redo
  "Redo the edit operation.
   
   This is invoked by the editor when the user redoes this edit. To implement `redo`, your
   extension should restore the document and editor to the state they were in just after this
   edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`."
  ^js [custom-document-edit-event]
  (.redo ^js custom-document-edit-event))

(defn label
  "Display name describing the edit.
   
   This will be shown to users in the UI for undo/redo operations."
  ^js [custom-document-edit-event]
  (.-label ^js custom-document-edit-event))
