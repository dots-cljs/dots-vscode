(ns dots.vscode.branch-coverage
  "Contains coverage information for a branch of a {@link StatementCoverage }.")

(defn executed?
  "The number of times this branch was executed, or a boolean indicating
   whether it was executed if the exact count is unknown. If zero or false,
   the branch will be marked as un-covered."
  ^js [branch-coverage]
  (.-executed ^js branch-coverage))

(defn set-executed!
  "The number of times this branch was executed, or a boolean indicating
   whether it was executed if the exact count is unknown. If zero or false,
   the branch will be marked as un-covered."
  ^js [branch-coverage value]
  (set! (.-executed ^js branch-coverage) value))

(defn location
  "Branch location."
  ^js [branch-coverage]
  (.-location ^js branch-coverage))

(defn set-location!
  "Branch location."
  ^js [branch-coverage value]
  (set! (.-location ^js branch-coverage) value))

(defn label
  "Label for the branch, used in the context of \"the ${label} branch was
   not taken,\" for example."
  ^js [branch-coverage]
  (.-label ^js branch-coverage))

(defn set-label!
  "Label for the branch, used in the context of \"the ${label} branch was
   not taken,\" for example."
  ^js [branch-coverage value]
  (set! (.-label ^js branch-coverage) value))
