(ns dots.vscode.document-drop-edit-provider
  "Provider which handles dropping of resources into a text editor.
   
   This allows users to drag and drop resources (including resources from external apps) into the editor. While dragging
   and dropping files, users can hold down `shift` to drop the file into the editor instead of opening it.
   Requires `editor.dropIntoEditor.enabled` to be on.")

(defn provide-document-drop-edits
  "Provide edits which inserts the content being dragged and dropped into the document."
  ^js [document-drop-edit-provider document position data-transfer token]
  (.provideDocumentDropEdits ^js document-drop-edit-provider document position data-transfer token))
