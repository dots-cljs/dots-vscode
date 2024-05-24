(ns dots.vscode.notebook-editor-visible-ranges-change-event
  "Represents an event describing the change in a {@link NotebookEditor.visibleRanges notebook editor's visibleRanges}.")

(defn notebook-editor
  "The {@link NotebookEditor notebook editor} for which the visible ranges have changed.
   
   **Returns:** `NotebookEditor`"
  ^js [notebook-editor-visible-ranges-change-event]
  (.-notebookEditor ^js notebook-editor-visible-ranges-change-event))

(defn visible-ranges
  "The new value for the {@link NotebookEditor.visibleRanges notebook editor's visibleRanges}.
   
   **Returns:** `readonly NotebookRange[]`"
  ^js [notebook-editor-visible-ranges-change-event]
  (.-visibleRanges ^js notebook-editor-visible-ranges-change-event))
