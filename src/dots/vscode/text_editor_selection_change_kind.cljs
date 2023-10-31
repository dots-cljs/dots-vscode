(ns dots.vscode.text-editor-selection-change-kind
  "Represents sources that can cause {@link window.onDidChangeTextEditorSelection selection change events}."
  (:require ["vscode" :as vscode]))

(def keyboard
  "Selection changed due to typing in the editor."
  (.-Keyboard vscode/TextEditorSelectionChangeKind))

(def mouse
  "Selection change due to clicking in the editor."
  (.-Mouse vscode/TextEditorSelectionChangeKind))

(def command
  "Selection changed because a command ran."
  (.-Command vscode/TextEditorSelectionChangeKind))
