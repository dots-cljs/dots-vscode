(ns dots.vscode.text-editor-line-numbers-style
  "Rendering style of the line numbers."
  (:require ["vscode" :as vscode]))

(def off
  "Do not render the line numbers."
  (.-Off vscode/TextEditorLineNumbersStyle))

(def on
  "Render the line numbers."
  (.-On vscode/TextEditorLineNumbersStyle))

(def relative
  "Render the line numbers with values relative to the primary cursor location."
  (.-Relative vscode/TextEditorLineNumbersStyle))

(def interval
  "Render the line numbers on every 10th line number."
  (.-Interval vscode/TextEditorLineNumbersStyle))
