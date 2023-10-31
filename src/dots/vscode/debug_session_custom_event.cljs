(ns dots.vscode.debug-session-custom-event
  "A custom Debug Adapter Protocol event received from a {@link DebugSession debug session}.")

(defn session
  "The {@link DebugSession debug session} for which the custom event was received."
  ^js [debug-session-custom-event]
  (.-session ^js debug-session-custom-event))

(defn event
  "Type of event."
  ^js [debug-session-custom-event]
  (.-event ^js debug-session-custom-event))

(defn body
  "Event specific information."
  ^js [debug-session-custom-event]
  (.-body ^js debug-session-custom-event))
