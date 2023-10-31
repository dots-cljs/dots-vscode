(ns dots.vscode.window-state
  "Represents the state of a window.")

(defn focused?
  "Whether the current window is focused."
  ^js [window-state]
  (.-focused ^js window-state))
