(ns dots.vscode.notebook-document-content-change
  "Describes a structural change to a notebook document, e.g newly added and removed cells."
  (:refer-clojure :exclude [range]))

(defn range
  "The range at which cells have been either added or removed.
   
   Note that no cells have been {@link NotebookDocumentContentChange.removedCells removed}
   when this range is {@link NotebookRange.isEmpty empty}.
   
   **Returns:** `NotebookRange`"
  ^js [notebook-document-content-change]
  (.-range ^js notebook-document-content-change))

(defn added-cells
  "Cells that have been added to the document.
   
   **Returns:** `readonly NotebookCell[]`"
  ^js [notebook-document-content-change]
  (.-addedCells ^js notebook-document-content-change))

(defn removed-cells
  "Cells that have been removed from the document.
   
   **Returns:** `readonly NotebookCell[]`"
  ^js [notebook-document-content-change]
  (.-removedCells ^js notebook-document-content-change))
