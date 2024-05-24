(ns dots.vscode.source-control-input-box
  "Represents the input box in the Source Control viewlet.")

(defn value
  "Setter and getter for the contents of the input box.
   
   **Returns:** `string`"
  ^js [source-control-input-box]
  (.-value ^js source-control-input-box))

(defn set-value!
  "Setter and getter for the contents of the input box."
  ^js [source-control-input-box value]
  (set! (.-value ^js source-control-input-box) value))

(defn placeholder
  "A string to show as placeholder in the input box to guide the user.
   
   **Returns:** `string`"
  ^js [source-control-input-box]
  (.-placeholder ^js source-control-input-box))

(defn set-placeholder!
  "A string to show as placeholder in the input box to guide the user."
  ^js [source-control-input-box value]
  (set! (.-placeholder ^js source-control-input-box) value))

(defn enabled?
  "Controls whether the input box is enabled (default is `true`).
   
   **Returns:** `boolean`"
  ^js [source-control-input-box]
  (.-enabled ^js source-control-input-box))

(defn set-enabled!
  "Controls whether the input box is enabled (default is `true`)."
  ^js [source-control-input-box value]
  (set! (.-enabled ^js source-control-input-box) value))

(defn visible?
  "Controls whether the input box is visible (default is `true`).
   
   **Returns:** `boolean`"
  ^js [source-control-input-box]
  (.-visible ^js source-control-input-box))

(defn set-visible!
  "Controls whether the input box is visible (default is `true`)."
  ^js [source-control-input-box value]
  (set! (.-visible ^js source-control-input-box) value))
