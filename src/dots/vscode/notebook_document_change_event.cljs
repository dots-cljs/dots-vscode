(ns dots.vscode.notebook-document-change-event
  "An event describing a transactional {@link NotebookDocument notebook} change.")

(defn notebook
  "The affected notebook."
  ^js [notebook-document-change-event]
  (.-notebook ^js notebook-document-change-event))

(defn metadata
  "The new metadata of the notebook or `undefined` when it did not change."
  ^js [notebook-document-change-event]
  (.-metadata ^js notebook-document-change-event))

(defn content-changes
  "An array of content changes describing added or removed {@link NotebookCell cells}."
  ^js [notebook-document-change-event]
  (.-contentChanges ^js notebook-document-change-event))

(defn cell-changes
  "An array of {@link NotebookDocumentCellChange cell changes}."
  ^js [notebook-document-change-event]
  (.-cellChanges ^js notebook-document-change-event))
