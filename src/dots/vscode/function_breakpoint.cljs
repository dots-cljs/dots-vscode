(ns dots.vscode.function-breakpoint
  "A breakpoint specified by a function name.")

(defn function-name
  "The name of the function to which this breakpoint is attached.
   
   **Returns:** `string`"
  ^js [function-breakpoint]
  (.-functionName ^js function-breakpoint))

(defn id
  "The unique ID of the breakpoint.
   
   **Returns:** `string`"
  ^js [function-breakpoint]
  (.-id ^js function-breakpoint))

(defn enabled?
  "Is breakpoint enabled.
   
   **Returns:** `boolean`"
  ^js [function-breakpoint]
  (.-enabled ^js function-breakpoint))

(defn condition
  "An optional expression for conditional breakpoints.
   
   **Returns:** `string | undefined`"
  ^js [function-breakpoint]
  (.-condition ^js function-breakpoint))

(defn hit-condition
  "An optional expression that controls how many hits of the breakpoint are ignored.
   
   **Returns:** `string | undefined`"
  ^js [function-breakpoint]
  (.-hitCondition ^js function-breakpoint))

(defn log-message
  "An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
   
   **Returns:** `string | undefined`"
  ^js [function-breakpoint]
  (.-logMessage ^js function-breakpoint))
