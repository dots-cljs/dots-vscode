(ns dots.vscode.window-state
  "Represents the state of a window.")

(defn focused?
  "Whether the current window is focused.
   
   **Returns:** `boolean`"
  ^js [window-state]
  (.-focused ^js window-state))

(defn active?
  "Whether the window has been interacted with recently. This will change
   immediately on activity, or after a short time of user inactivity.
   
   **Returns:** `boolean`"
  ^js [window-state]
  (.-active ^js window-state))
