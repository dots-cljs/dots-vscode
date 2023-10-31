(ns dots.vscode.notebook-editor-selection-change-event
  "Represents an event describing the change in a {@link NotebookEditor.selections notebook editor's selections}.")

(defn notebook-editor
  "The {@link NotebookEditor notebook editor} for which the selections have changed."
  ^js [notebook-editor-selection-change-event]
  (.-notebookEditor ^js notebook-editor-selection-change-event))

(defn selections
  "The new value for the {@link NotebookEditor.selections notebook editor's selections}."
  ^js [notebook-editor-selection-change-event]
  (.-selections ^js notebook-editor-selection-change-event))
