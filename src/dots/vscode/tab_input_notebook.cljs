(ns dots.vscode.tab-input-notebook
  "The tab represents a notebook.")

(defn uri
  "The uri that the tab is representing.
   
   **Returns:** `Uri`"
  ^js [tab-input-notebook]
  (.-uri ^js tab-input-notebook))

(defn notebook-type
  "The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
   
   **Returns:** `string`"
  ^js [tab-input-notebook]
  (.-notebookType ^js tab-input-notebook))
