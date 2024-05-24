(ns dots.vscode.source-breakpoint
  "A breakpoint specified by a source location.")

(defn location
  "The source and line position of this breakpoint.
   
   **Returns:** `Location`"
  ^js [source-breakpoint]
  (.-location ^js source-breakpoint))

(defn id
  "The unique ID of the breakpoint.
   
   **Returns:** `string`"
  ^js [source-breakpoint]
  (.-id ^js source-breakpoint))

(defn enabled?
  "Is breakpoint enabled.
   
   **Returns:** `boolean`"
  ^js [source-breakpoint]
  (.-enabled ^js source-breakpoint))

(defn condition
  "An optional expression for conditional breakpoints.
   
   **Returns:** `string | undefined`"
  ^js [source-breakpoint]
  (.-condition ^js source-breakpoint))

(defn hit-condition
  "An optional expression that controls how many hits of the breakpoint are ignored.
   
   **Returns:** `string | undefined`"
  ^js [source-breakpoint]
  (.-hitCondition ^js source-breakpoint))

(defn log-message
  "An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
   
   **Returns:** `string | undefined`"
  ^js [source-breakpoint]
  (.-logMessage ^js source-breakpoint))
