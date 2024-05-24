(ns dots.vscode.declaration-coverage
  "Contains coverage information for a declaration. Depending on the reporter
   and language, this may be types such as functions, methods, or namespaces."
  (:refer-clojure :exclude [name]))

(defn name
  "Name of the declaration.
   
   **Returns:** `string`"
  ^js [declaration-coverage]
  (.-name ^js declaration-coverage))

(defn set-name!
  "Name of the declaration."
  ^js [declaration-coverage value]
  (set! (.-name ^js declaration-coverage) value))

(defn executed?
  "The number of times this declaration was executed, or a boolean
   indicating whether it was executed if the exact count is unknown. If
   zero or false, the declaration will be marked as un-covered.
   
   **Returns:** `number | boolean`"
  ^js [declaration-coverage]
  (.-executed ^js declaration-coverage))

(defn set-executed!
  "The number of times this declaration was executed, or a boolean
   indicating whether it was executed if the exact count is unknown. If
   zero or false, the declaration will be marked as un-covered."
  ^js [declaration-coverage value]
  (set! (.-executed ^js declaration-coverage) value))

(defn location
  "Declaration location.
   
   **Returns:** `Range | Position`"
  ^js [declaration-coverage]
  (.-location ^js declaration-coverage))

(defn set-location!
  "Declaration location."
  ^js [declaration-coverage value]
  (set! (.-location ^js declaration-coverage) value))
