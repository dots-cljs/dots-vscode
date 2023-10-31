(ns dots.vscode.run-options
  "Run options for a task.")

(defn reevaluate-on-rerun?
  "Controls whether task variables are re-evaluated on rerun."
  ^js [run-options]
  (.-reevaluateOnRerun ^js run-options))

(defn set-reevaluate-on-rerun!
  "Controls whether task variables are re-evaluated on rerun."
  ^js [run-options value]
  (set! (.-reevaluateOnRerun ^js run-options) value))
