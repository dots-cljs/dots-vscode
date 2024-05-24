(ns dots.vscode.statement-coverage
  "Contains coverage information for a single statement or line.")

(defn executed?
  "The number of times this statement was executed, or a boolean indicating
   whether it was executed if the exact count is unknown. If zero or false,
   the statement will be marked as un-covered."
  ^js [statement-coverage]
  (.-executed ^js statement-coverage))

(defn set-executed!
  "The number of times this statement was executed, or a boolean indicating
   whether it was executed if the exact count is unknown. If zero or false,
   the statement will be marked as un-covered."
  ^js [statement-coverage value]
  (set! (.-executed ^js statement-coverage) value))

(defn location
  "Statement location."
  ^js [statement-coverage]
  (.-location ^js statement-coverage))

(defn set-location!
  "Statement location."
  ^js [statement-coverage value]
  (set! (.-location ^js statement-coverage) value))

(defn branches
  "Coverage from branches of this line or statement. If it's not a
   conditional, this will be empty."
  ^js [statement-coverage]
  (.-branches ^js statement-coverage))

(defn set-branches!
  "Coverage from branches of this line or statement. If it's not a
   conditional, this will be empty."
  ^js [statement-coverage value]
  (set! (.-branches ^js statement-coverage) value))
