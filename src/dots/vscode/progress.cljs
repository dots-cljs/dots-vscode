(ns dots.vscode.progress
  "Defines a generalized way of reporting progress updates.")

(defn report
  "Report a progress update."
  ^js [progress value]
  (.report ^js progress value))
