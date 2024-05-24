(ns dots.vscode.cancellation-error
  "An error type that should be used to signal cancellation of an operation.
   
   This type can be used in response to a {@link CancellationToken cancellation token}
   being cancelled or when an operation is being cancelled by the
   executor of that operation."
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [cancellation-error]
  (.-name ^js cancellation-error))

(defn set-name!
  ^js [cancellation-error value]
  (set! (.-name ^js cancellation-error) value))

(defn message
  "**Returns:** `string`"
  ^js [cancellation-error]
  (.-message ^js cancellation-error))

(defn set-message!
  ^js [cancellation-error value]
  (set! (.-message ^js cancellation-error) value))

(defn stack
  "**Returns:** `string | undefined`"
  ^js [cancellation-error]
  (.-stack ^js cancellation-error))

(defn set-stack!
  ^js [cancellation-error value]
  (set! (.-stack ^js cancellation-error) value))
