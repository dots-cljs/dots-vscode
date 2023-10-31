(ns dots.vscode.text-editor-options-change-event
  "Represents an event describing the change in a {@link TextEditor.options text editor's options}.")

(defn text-editor
  "The {@link TextEditor text editor} for which the options have changed."
  ^js [text-editor-options-change-event]
  (.-textEditor ^js text-editor-options-change-event))

(defn options
  "The new value for the {@link TextEditor.options text editor's options}."
  ^js [text-editor-options-change-event]
  (.-options ^js text-editor-options-change-event))
