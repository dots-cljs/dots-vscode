(ns dots.vscode.tab-input-notebook-diff
  "The tabs represents two notebooks in a diff configuration.")

(defn original
  "The uri of the original notebook."
  ^js [tab-input-notebook-diff]
  (.-original ^js tab-input-notebook-diff))

(defn modified
  "The uri of the modified notebook."
  ^js [tab-input-notebook-diff]
  (.-modified ^js tab-input-notebook-diff))

(defn notebook-type
  "The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}"
  ^js [tab-input-notebook-diff]
  (.-notebookType ^js tab-input-notebook-diff))
