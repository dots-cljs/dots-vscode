(ns dots.vscode.document-drop-edit
  "An edit operation applied {@link DocumentDropEditProvider on drop}.")

(defn insert-text
  "The text or snippet to insert at the drop location."
  ^js [document-drop-edit]
  (.-insertText ^js document-drop-edit))

(defn set-insert-text!
  "The text or snippet to insert at the drop location."
  ^js [document-drop-edit value]
  (set! (.-insertText ^js document-drop-edit) value))

(defn additional-edit
  "An optional additional edit to apply on drop."
  ^js [document-drop-edit]
  (.-additionalEdit ^js document-drop-edit))

(defn set-additional-edit!
  "An optional additional edit to apply on drop."
  ^js [document-drop-edit value]
  (set! (.-additionalEdit ^js document-drop-edit) value))
