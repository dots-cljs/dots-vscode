(ns dots.vscode.breakpoint
  "The base class of all breakpoint types.")

(defn id
  "The unique ID of the breakpoint.
   
   **Returns:** `string`"
  ^js [breakpoint]
  (.-id ^js breakpoint))

(defn enabled?
  "Is breakpoint enabled.
   
   **Returns:** `boolean`"
  ^js [breakpoint]
  (.-enabled ^js breakpoint))

(defn condition
  "An optional expression for conditional breakpoints.
   
   **Returns:** `string | undefined`"
  ^js [breakpoint]
  (.-condition ^js breakpoint))

(defn hit-condition
  "An optional expression that controls how many hits of the breakpoint are ignored.
   
   **Returns:** `string | undefined`"
  ^js [breakpoint]
  (.-hitCondition ^js breakpoint))

(defn log-message
  "An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
   
   **Returns:** `string | undefined`"
  ^js [breakpoint]
  (.-logMessage ^js breakpoint))
