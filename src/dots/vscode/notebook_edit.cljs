(ns dots.vscode.notebook-edit
  "A notebook edit represents edits that should be applied to the contents of a notebook."
  (:refer-clojure :exclude [range])
  (:require ["vscode" :as vscode]))

(defn range
  "Range of the cells being edited. May be empty.
   
   **Returns:** `NotebookRange`"
  ^js [notebook-edit]
  (.-range ^js notebook-edit))

(defn set-range!
  "Range of the cells being edited. May be empty."
  ^js [notebook-edit value]
  (set! (.-range ^js notebook-edit) value))

(defn new-cells
  "New cells being inserted. May be empty.
   
   **Returns:** `NotebookCellData[]`"
  ^js [notebook-edit]
  (.-newCells ^js notebook-edit))

(defn set-new-cells!
  "New cells being inserted. May be empty."
  ^js [notebook-edit value]
  (set! (.-newCells ^js notebook-edit) value))

(defn new-cell-metadata
  "Optional new metadata for the cells.
   
   **Returns:** `{ [key: string]: any; } | undefined`"
  ^js [notebook-edit]
  (.-newCellMetadata ^js notebook-edit))

(defn set-new-cell-metadata!
  "Optional new metadata for the cells."
  ^js [notebook-edit value]
  (set! (.-newCellMetadata ^js notebook-edit) value))

(defn new-notebook-metadata
  "Optional new metadata for the notebook.
   
   **Returns:** `{ [key: string]: any; } | undefined`"
  ^js [notebook-edit]
  (.-newNotebookMetadata ^js notebook-edit))

(defn set-new-notebook-metadata!
  "Optional new metadata for the notebook."
  ^js [notebook-edit value]
  (set! (.-newNotebookMetadata ^js notebook-edit) value))

(defn replace-cells
  "Utility to create a edit that replaces cells in a notebook.
   
   **Parameters:**
   - `range`: `NotebookRange` - The range of cells to replace
   - `new-cells`: `NotebookCellData[]` - The new notebook cells.
   
   **Returns:** `NotebookEdit`"
  ^js [range new-cells]
  (.replaceCells vscode/NotebookEdit range new-cells))

(defn insert-cells
  "Utility to create an edit that replaces cells in a notebook.
   
   **Parameters:**
   - `index`: `number` - The index to insert cells at.
   - `new-cells`: `NotebookCellData[]` - The new notebook cells.
   
   **Returns:** `NotebookEdit`"
  ^js [index new-cells]
  (.insertCells vscode/NotebookEdit index new-cells))

(defn delete-cells
  "Utility to create an edit that deletes cells in a notebook.
   
   **Parameters:**
   - `range`: `NotebookRange` - The range of cells to delete.
   
   **Returns:** `NotebookEdit`"
  ^js [range]
  (.deleteCells vscode/NotebookEdit range))

(defn update-cell-metadata
  "Utility to create an edit that update a cell's metadata.
   
   **Parameters:**
   - `index`: `number` - The index of the cell to update.
   - `new-cell-metadata`: `{ [key: string]: any; }` - The new metadata for the cell.
   
   **Returns:** `NotebookEdit`"
  ^js [index new-cell-metadata]
  (.updateCellMetadata vscode/NotebookEdit index new-cell-metadata))

(defn update-notebook-metadata
  "Utility to create an edit that updates the notebook's metadata.
   
   **Parameters:**
   - `new-notebook-metadata`: `{ [key: string]: any; }` - The new metadata for the notebook.
   
   **Returns:** `NotebookEdit`"
  ^js [new-notebook-metadata]
  (.updateNotebookMetadata vscode/NotebookEdit new-notebook-metadata))
