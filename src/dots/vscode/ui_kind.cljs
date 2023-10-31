(ns dots.vscode.ui-kind
  "Possible kinds of UI that can use extensions."
  (:require ["vscode" :as vscode]))

(def desktop
  "Extensions are accessed from a desktop application."
  (.-Desktop vscode/UIKind))

(def web
  "Extensions are accessed from a web browser."
  (.-Web vscode/UIKind))
