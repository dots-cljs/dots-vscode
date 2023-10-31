(ns dots.vscode.window.state
  "Represents the current window's state."
  (:require ["vscode" :as vscode]))

(defn focused?
  "Whether the current window is focused."
  ^js []
  (.. vscode/window -state -focused))
