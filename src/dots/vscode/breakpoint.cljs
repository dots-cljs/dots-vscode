(ns dots.vscode.breakpoint
  "The base class of all breakpoint types.")

(defn id
  "The unique ID of the breakpoint."
  ^js [breakpoint]
  (.-id ^js breakpoint))

(defn enabled?
  "Is breakpoint enabled."
  ^js [breakpoint]
  (.-enabled ^js breakpoint))

(defn condition
  "An optional expression for conditional breakpoints."
  ^js [breakpoint]
  (.-condition ^js breakpoint))

(defn hit-condition
  "An optional expression that controls how many hits of the breakpoint are ignored."
  ^js [breakpoint]
  (.-hitCondition ^js breakpoint))

(defn log-message
  "An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter."
  ^js [breakpoint]
  (.-logMessage ^js breakpoint))
