(ns dots.vscode.inline-value-context
  "A value-object that contains contextual information when requesting inline values from a InlineValuesProvider.")

(defn frame-id
  "The stack frame (as a DAP Id) where the execution has stopped.
   
   **Returns:** `number`"
  ^js [inline-value-context]
  (.-frameId ^js inline-value-context))

(defn stopped-location
  "The document range where execution has stopped.
   Typically the end position of the range denotes the line where the inline values are shown.
   
   **Returns:** `Range`"
  ^js [inline-value-context]
  (.-stoppedLocation ^js inline-value-context))
