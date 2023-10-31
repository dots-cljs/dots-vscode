(ns dots.vscode.text-editor-cursor-style
  "Rendering style of the cursor."
  (:require ["vscode" :as vscode]))

(def line
  "Render the cursor as a vertical thick line."
  (.-Line vscode/TextEditorCursorStyle))

(def block
  "Render the cursor as a block filled."
  (.-Block vscode/TextEditorCursorStyle))

(def underline
  "Render the cursor as a thick horizontal line."
  (.-Underline vscode/TextEditorCursorStyle))

(def line-thin
  "Render the cursor as a vertical thin line."
  (.-LineThin vscode/TextEditorCursorStyle))

(def block-outline
  "Render the cursor as a block outlined."
  (.-BlockOutline vscode/TextEditorCursorStyle))

(def underline-thin
  "Render the cursor as a thin horizontal line."
  (.-UnderlineThin vscode/TextEditorCursorStyle))
