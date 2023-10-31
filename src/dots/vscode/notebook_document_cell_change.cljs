(ns dots.vscode.notebook-document-cell-change
  "Describes a change to a notebook cell.")

(defn cell
  "The affected cell."
  ^js [notebook-document-cell-change]
  (.-cell ^js notebook-document-cell-change))

(defn document
  "The document of the cell or `undefined` when it did not change.
   
   *Note* that you should use the {@link workspace.onDidChangeTextDocument onDidChangeTextDocument}-event
   for detailed change information, like what edits have been performed."
  ^js [notebook-document-cell-change]
  (.-document ^js notebook-document-cell-change))

(defn metadata
  "The new metadata of the cell or `undefined` when it did not change."
  ^js [notebook-document-cell-change]
  (.-metadata ^js notebook-document-cell-change))

(defn outputs
  "The new outputs of the cell or `undefined` when they did not change."
  ^js [notebook-document-cell-change]
  (.-outputs ^js notebook-document-cell-change))

(defn execution-summary
  "The new execution summary of the cell or `undefined` when it did not change."
  ^js [notebook-document-cell-change]
  (.-executionSummary ^js notebook-document-cell-change))
