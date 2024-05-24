(ns dots.vscode.text-editor-selection-change-event
  "Represents an event describing the change in a {@link TextEditor.selections text editor's selections}.")

(defn text-editor
  "The {@link TextEditor text editor} for which the selections have changed.
   
   **Returns:** `TextEditor`"
  ^js [text-editor-selection-change-event]
  (.-textEditor ^js text-editor-selection-change-event))

(defn selections
  "The new value for the {@link TextEditor.selections text editor's selections}.
   
   **Returns:** `readonly Selection[]`"
  ^js [text-editor-selection-change-event]
  (.-selections ^js text-editor-selection-change-event))

(defn kind
  "The {@link TextEditorSelectionChangeKind change kind} which has triggered this
   event. Can be `undefined`.
   
   **Returns:** `TextEditorSelectionChangeKind | undefined`"
  ^js [text-editor-selection-change-event]
  (.-kind ^js text-editor-selection-change-event))
