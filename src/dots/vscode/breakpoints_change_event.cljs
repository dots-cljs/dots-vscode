(ns dots.vscode.breakpoints-change-event
  "An event describing the changes to the set of {@link Breakpoint breakpoints}.")

(defn added
  "Added breakpoints."
  ^js [breakpoints-change-event]
  (.-added ^js breakpoints-change-event))

(defn removed
  "Removed breakpoints."
  ^js [breakpoints-change-event]
  (.-removed ^js breakpoints-change-event))

(defn changed
  "Changed breakpoints."
  ^js [breakpoints-change-event]
  (.-changed ^js breakpoints-change-event))
