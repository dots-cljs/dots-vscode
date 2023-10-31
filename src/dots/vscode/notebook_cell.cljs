(ns dots.vscode.notebook-cell
  "Represents a cell of a {@link NotebookDocument notebook}, either a {@link NotebookCellKind.Code code}-cell
   or {@link NotebookCellKind.Markup markup}-cell.
   
   NotebookCell instances are immutable and are kept in sync for as long as they are part of their notebook.")

(defn index
  "The index of this cell in its {@link NotebookDocument.cellAt containing notebook}. The
   index is updated when a cell is moved within its notebook. The index is `-1`
   when the cell has been removed from its notebook."
  ^js [notebook-cell]
  (.-index ^js notebook-cell))

(defn notebook
  "The {@link NotebookDocument notebook} that contains this cell."
  ^js [notebook-cell]
  (.-notebook ^js notebook-cell))

(defn kind
  "The kind of this cell."
  ^js [notebook-cell]
  (.-kind ^js notebook-cell))

(defn document
  "The {@link TextDocument text} of this cell, represented as text document."
  ^js [notebook-cell]
  (.-document ^js notebook-cell))

(defn metadata
  "The metadata of this cell. Can be anything but must be JSON-stringifyable."
  ^js [notebook-cell]
  (.-metadata ^js notebook-cell))

(defn outputs
  "The outputs of this cell."
  ^js [notebook-cell]
  (.-outputs ^js notebook-cell))

(defn execution-summary
  "The most recent {@link NotebookCellExecutionSummary execution summary} for this cell."
  ^js [notebook-cell]
  (.-executionSummary ^js notebook-cell))
