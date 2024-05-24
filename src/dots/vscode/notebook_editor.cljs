(ns dots.vscode.notebook-editor
  "Represents a notebook editor that is attached to a {@link NotebookDocument notebook}.
   Additional properties of the NotebookEditor are available in the proposed
   API, which will be finalized later.")

(defn notebook
  "The {@link NotebookDocument notebook document} associated with this notebook editor.
   
   **Returns:** `NotebookDocument`"
  ^js [notebook-editor]
  (.-notebook ^js notebook-editor))

(defn selection
  "The primary selection in this notebook editor.
   
   **Returns:** `NotebookRange`"
  ^js [notebook-editor]
  (.-selection ^js notebook-editor))

(defn set-selection!
  "The primary selection in this notebook editor."
  ^js [notebook-editor value]
  (set! (.-selection ^js notebook-editor) value))

(defn selections
  "All selections in this notebook editor.
   
   The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;
   
   **Returns:** `readonly NotebookRange[]`"
  ^js [notebook-editor]
  (.-selections ^js notebook-editor))

(defn set-selections!
  "All selections in this notebook editor.
   
   The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;"
  ^js [notebook-editor value]
  (set! (.-selections ^js notebook-editor) value))

(defn visible-ranges
  "The current visible ranges in the editor (vertically).
   
   **Returns:** `readonly NotebookRange[]`"
  ^js [notebook-editor]
  (.-visibleRanges ^js notebook-editor))

(defn view-column
  "The column in which this editor shows.
   
   **Returns:** `ViewColumn | undefined`"
  ^js [notebook-editor]
  (.-viewColumn ^js notebook-editor))

(defn reveal-range
  "Scroll as indicated by `revealType` in order to reveal the given range.
   
   **Parameters:**
   - `range`: `NotebookRange` - A range.
   - `reveal-type`: `NotebookEditorRevealType | undefined` - The scrolling strategy for revealing `range`.
   
   **Returns:** `void`"
  (^js [notebook-editor range]
   (.revealRange ^js notebook-editor range))
  (^js [notebook-editor range reveal-type]
   (.revealRange ^js notebook-editor range reveal-type)))
