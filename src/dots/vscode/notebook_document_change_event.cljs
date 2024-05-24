(ns dots.vscode.notebook-document-change-event
  "An event describing a transactional {@link NotebookDocument notebook} change.")

(defn notebook
  "The affected notebook.
   
   **Returns:** `NotebookDocument`"
  ^js [notebook-document-change-event]
  (.-notebook ^js notebook-document-change-event))

(defn metadata
  "The new metadata of the notebook or `undefined` when it did not change.
   
   **Returns:** `{ [key: string]: any; } | undefined`"
  ^js [notebook-document-change-event]
  (.-metadata ^js notebook-document-change-event))

(defn content-changes
  "An array of content changes describing added or removed {@link NotebookCell cells}.
   
   **Returns:** `readonly NotebookDocumentContentChange[]`"
  ^js [notebook-document-change-event]
  (.-contentChanges ^js notebook-document-change-event))

(defn cell-changes
  "An array of {@link NotebookDocumentCellChange cell changes}.
   
   **Returns:** `readonly NotebookDocumentCellChange[]`"
  ^js [notebook-document-change-event]
  (.-cellChanges ^js notebook-document-change-event))
