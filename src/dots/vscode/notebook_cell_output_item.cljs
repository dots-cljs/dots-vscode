(ns dots.vscode.notebook-cell-output-item
  "One representation of a {@link NotebookCellOutput notebook output}, defined by MIME type and data."
  (:require ["vscode" :as vscode]))

(defn mime
  "The mime type which determines how the {@linkcode NotebookCellOutputItem.data data}-property
   is interpreted.
   
   Notebooks have built-in support for certain mime-types, extensions can add support for new
   types and override existing types."
  ^js [notebook-cell-output-item]
  (.-mime ^js notebook-cell-output-item))

(defn set-mime!
  "The mime type which determines how the {@linkcode NotebookCellOutputItem.data data}-property
   is interpreted.
   
   Notebooks have built-in support for certain mime-types, extensions can add support for new
   types and override existing types."
  ^js [notebook-cell-output-item value]
  (set! (.-mime ^js notebook-cell-output-item) value))

(defn data
  "The data of this output item. Must always be an array of unsigned 8-bit integers."
  ^js [notebook-cell-output-item]
  (.-data ^js notebook-cell-output-item))

(defn set-data!
  "The data of this output item. Must always be an array of unsigned 8-bit integers."
  ^js [notebook-cell-output-item value]
  (set! (.-data ^js notebook-cell-output-item) value))

(defn text
  "Factory function to create a `NotebookCellOutputItem` from a string.
   
   *Note* that an UTF-8 encoder is used to create bytes for the string."
  (^js [value]
   (.text vscode/NotebookCellOutputItem value))
  (^js [value mime]
   (.text vscode/NotebookCellOutputItem value mime)))

(defn json
  "Factory function to create a `NotebookCellOutputItem` from
   a JSON object.
   
   *Note* that this function is not expecting \"stringified JSON\" but
   an object that can be stringified. This function will throw an error
   when the passed value cannot be JSON-stringified."
  (^js [value]
   (.json vscode/NotebookCellOutputItem value))
  (^js [value mime]
   (.json vscode/NotebookCellOutputItem value mime)))

(defn stdout
  "Factory function to create a `NotebookCellOutputItem` that uses
   uses the `application/vnd.code.notebook.stdout` mime type."
  ^js [value]
  (.stdout vscode/NotebookCellOutputItem value))

(defn stderr
  "Factory function to create a `NotebookCellOutputItem` that uses
   uses the `application/vnd.code.notebook.stderr` mime type."
  ^js [value]
  (.stderr vscode/NotebookCellOutputItem value))

(defn error
  "Factory function to create a `NotebookCellOutputItem` that uses
   uses the `application/vnd.code.notebook.error` mime type."
  ^js [value]
  (.error vscode/NotebookCellOutputItem value))
