(ns dots.vscode.breakpoints-change-event
  "An event describing the changes to the set of {@link Breakpoint breakpoints}.")

(defn added
  "Added breakpoints.
   
   **Returns:** `readonly Breakpoint[]`"
  ^js [breakpoints-change-event]
  (.-added ^js breakpoints-change-event))

(defn removed
  "Removed breakpoints.
   
   **Returns:** `readonly Breakpoint[]`"
  ^js [breakpoints-change-event]
  (.-removed ^js breakpoints-change-event))

(defn changed
  "Changed breakpoints.
   
   **Returns:** `readonly Breakpoint[]`"
  ^js [breakpoints-change-event]
  (.-changed ^js breakpoints-change-event))
