(ns dots.vscode.selected-completion-info
  "Describes the currently selected completion item."
  (:refer-clojure :exclude [range]))

(defn range
  "The range that will be replaced if this completion item is accepted."
  ^js [selected-completion-info]
  (.-range ^js selected-completion-info))

(defn text
  "The text the range will be replaced with if this completion is accepted."
  ^js [selected-completion-info]
  (.-text ^js selected-completion-info))
