(ns dots.vscode.notebook-data
  "Raw representation of a notebook.
   
   Extensions are responsible for creating {@linkcode NotebookData } so that the editor
   can create a {@linkcode NotebookDocument }.")

(defn cells
  "The cell data of this notebook data."
  ^js [notebook-data]
  (.-cells ^js notebook-data))

(defn set-cells!
  "The cell data of this notebook data."
  ^js [notebook-data value]
  (set! (.-cells ^js notebook-data) value))

(defn metadata
  "Arbitrary metadata of notebook data."
  ^js [notebook-data]
  (.-metadata ^js notebook-data))

(defn set-metadata!
  "Arbitrary metadata of notebook data."
  ^js [notebook-data value]
  (set! (.-metadata ^js notebook-data) value))
