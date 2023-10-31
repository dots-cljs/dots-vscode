(ns dots.vscode.view-badge
  "A badge presenting a value for a view")

(defn tooltip
  "A label to present in tooltip for the badge."
  ^js [view-badge]
  (.-tooltip ^js view-badge))

(defn value
  "The value to present in the badge."
  ^js [view-badge]
  (.-value ^js view-badge))
