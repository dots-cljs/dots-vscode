(ns dots.vscode.custom-document
  "Represents a custom document used by a {@linkcode CustomEditorProvider }.
   
   Custom documents are only used within a given `CustomEditorProvider`. The lifecycle of a `CustomDocument` is
   managed by the editor. When no more references remain to a `CustomDocument`, it is disposed of.")

(defn uri
  "The associated uri for this document."
  ^js [custom-document]
  (.-uri ^js custom-document))

(defn dispose
  "Dispose of the custom document.
   
   This is invoked by the editor when there are no more references to a given `CustomDocument` (for example when
   all editors associated with the document have been closed.)
   
   **Returns:** `void`"
  ^js [custom-document]
  (.dispose ^js custom-document))
