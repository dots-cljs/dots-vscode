(ns dots.vscode.text-editor-view-column-change-event
  "Represents an event describing the change of a {@link TextEditor.viewColumn text editor's view column}.")

(defn text-editor
  "The {@link TextEditor text editor} for which the view column has changed.
   
   **Returns:** `TextEditor`"
  ^js [text-editor-view-column-change-event]
  (.-textEditor ^js text-editor-view-column-change-event))

(defn view-column
  "The new value for the {@link TextEditor.viewColumn text editor's view column}.
   
   **Returns:** `ViewColumn`"
  ^js [text-editor-view-column-change-event]
  (.-viewColumn ^js text-editor-view-column-change-event))
