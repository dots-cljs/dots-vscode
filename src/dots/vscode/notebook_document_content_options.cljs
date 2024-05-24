(ns dots.vscode.notebook-document-content-options
  "Notebook content options define what parts of a notebook are persisted. Note
   
   For instance, a notebook serializer can opt-out of saving outputs and in that case the editor doesn't mark a
   notebooks as {@link NotebookDocument.isDirty dirty} when its output has changed.")

(defn transient-outputs?
  "Controls if output change events will trigger notebook document content change events and
   if it will be used in the diff editor, defaults to false. If the content provider doesn't
   persist the outputs in the file document, this should be set to true.
   
   **Returns:** `boolean | undefined`"
  ^js [notebook-document-content-options]
  (.-transientOutputs ^js notebook-document-content-options))

(defn set-transient-outputs!
  "Controls if output change events will trigger notebook document content change events and
   if it will be used in the diff editor, defaults to false. If the content provider doesn't
   persist the outputs in the file document, this should be set to true."
  ^js [notebook-document-content-options value]
  (set! (.-transientOutputs ^js notebook-document-content-options) value))

(defn transient-cell-metadata
  "Controls if a cell metadata property change event will trigger notebook document content
   change events and if it will be used in the diff editor, defaults to false. If the
   content provider doesn't persist a metadata property in the file document, it should be
   set to true.
   
   **Returns:** `{ [key: string]: boolean | undefined; } | undefined`"
  ^js [notebook-document-content-options]
  (.-transientCellMetadata ^js notebook-document-content-options))

(defn set-transient-cell-metadata!
  "Controls if a cell metadata property change event will trigger notebook document content
   change events and if it will be used in the diff editor, defaults to false. If the
   content provider doesn't persist a metadata property in the file document, it should be
   set to true."
  ^js [notebook-document-content-options value]
  (set! (.-transientCellMetadata ^js notebook-document-content-options) value))

(defn transient-document-metadata
  "Controls if a document metadata property change event will trigger notebook document
   content change event and if it will be used in the diff editor, defaults to false. If the
   content provider doesn't persist a metadata property in the file document, it should be
   set to true.
   
   **Returns:** `{ [key: string]: boolean | undefined; } | undefined`"
  ^js [notebook-document-content-options]
  (.-transientDocumentMetadata ^js notebook-document-content-options))

(defn set-transient-document-metadata!
  "Controls if a document metadata property change event will trigger notebook document
   content change event and if it will be used in the diff editor, defaults to false. If the
   content provider doesn't persist a metadata property in the file document, it should be
   set to true."
  ^js [notebook-document-content-options value]
  (set! (.-transientDocumentMetadata ^js notebook-document-content-options) value))
