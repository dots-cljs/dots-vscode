(ns dots.vscode.notebook-cell-data
  "NotebookCellData is the raw representation of notebook cells. Its is part of {@linkcode NotebookData }.")

(defn kind
  "The {@link NotebookCellKind kind} of this cell data.
   
   **Returns:** `NotebookCellKind`"
  ^js [notebook-cell-data]
  (.-kind ^js notebook-cell-data))

(defn set-kind!
  "The {@link NotebookCellKind kind} of this cell data."
  ^js [notebook-cell-data value]
  (set! (.-kind ^js notebook-cell-data) value))

(defn value
  "The source value of this cell data - either source code or formatted text.
   
   **Returns:** `string`"
  ^js [notebook-cell-data]
  (.-value ^js notebook-cell-data))

(defn set-value!
  "The source value of this cell data - either source code or formatted text."
  ^js [notebook-cell-data value]
  (set! (.-value ^js notebook-cell-data) value))

(defn language-id
  "The language identifier of the source value of this cell data. Any value from
   {@linkcode languages.getLanguages getLanguages} is possible.
   
   **Returns:** `string`"
  ^js [notebook-cell-data]
  (.-languageId ^js notebook-cell-data))

(defn set-language-id!
  "The language identifier of the source value of this cell data. Any value from
   {@linkcode languages.getLanguages getLanguages} is possible."
  ^js [notebook-cell-data value]
  (set! (.-languageId ^js notebook-cell-data) value))

(defn outputs
  "The outputs of this cell data.
   
   **Returns:** `NotebookCellOutput[] | undefined`"
  ^js [notebook-cell-data]
  (.-outputs ^js notebook-cell-data))

(defn set-outputs!
  "The outputs of this cell data."
  ^js [notebook-cell-data value]
  (set! (.-outputs ^js notebook-cell-data) value))

(defn metadata
  "Arbitrary metadata of this cell data. Can be anything but must be JSON-stringifyable.
   
   **Returns:** `{ [key: string]: any; } | undefined`"
  ^js [notebook-cell-data]
  (.-metadata ^js notebook-cell-data))

(defn set-metadata!
  "Arbitrary metadata of this cell data. Can be anything but must be JSON-stringifyable."
  ^js [notebook-cell-data value]
  (set! (.-metadata ^js notebook-cell-data) value))

(defn execution-summary
  "The execution summary of this cell data.
   
   **Returns:** `NotebookCellExecutionSummary | undefined`"
  ^js [notebook-cell-data]
  (.-executionSummary ^js notebook-cell-data))

(defn set-execution-summary!
  "The execution summary of this cell data."
  ^js [notebook-cell-data value]
  (set! (.-executionSummary ^js notebook-cell-data) value))
