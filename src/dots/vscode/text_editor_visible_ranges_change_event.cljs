(ns dots.vscode.text-editor-visible-ranges-change-event
  "Represents an event describing the change in a {@link TextEditor.visibleRanges text editor's visible ranges}.")

(defn text-editor
  "The {@link TextEditor text editor} for which the visible ranges have changed.
   
   **Returns:** `TextEditor`"
  ^js [text-editor-visible-ranges-change-event]
  (.-textEditor ^js text-editor-visible-ranges-change-event))

(defn visible-ranges
  "The new value for the {@link TextEditor.visibleRanges text editor's visible ranges}.
   
   **Returns:** `readonly Range[]`"
  ^js [text-editor-visible-ranges-change-event]
  (.-visibleRanges ^js text-editor-visible-ranges-change-event))
