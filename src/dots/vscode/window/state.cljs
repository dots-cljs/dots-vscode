(ns dots.vscode.window.state
  "Represents the current window's state."
  (:require ["vscode" :as vscode]))

(defn focused?
  "Whether the current window is focused.
   
   **Returns:** `boolean`"
  ^js []
  (.. vscode/window -state -focused))

(defn active?
  "Whether the window has been interacted with recently. This will change
   immediately on activity, or after a short time of user inactivity.
   
   **Returns:** `boolean`"
  ^js []
  (.. vscode/window -state -active))
