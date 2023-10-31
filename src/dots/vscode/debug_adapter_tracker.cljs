(ns dots.vscode.debug-adapter-tracker
  "A Debug Adapter Tracker is a means to track the communication between the editor and a Debug Adapter.")

(defn on-will-start-session
  "A session with the debug adapter is about to be started."
  ^js [debug-adapter-tracker]
  (.onWillStartSession ^js debug-adapter-tracker))

(defn on-will-receive-message
  "The debug adapter is about to receive a Debug Adapter Protocol message from the editor."
  ^js [debug-adapter-tracker message]
  (.onWillReceiveMessage ^js debug-adapter-tracker message))

(defn on-did-send-message
  "The debug adapter has sent a Debug Adapter Protocol message to the editor."
  ^js [debug-adapter-tracker message]
  (.onDidSendMessage ^js debug-adapter-tracker message))

(defn on-will-stop-session
  "The debug adapter session is about to be stopped."
  ^js [debug-adapter-tracker]
  (.onWillStopSession ^js debug-adapter-tracker))

(defn on-error
  "An error with the debug adapter has occurred."
  ^js [debug-adapter-tracker error]
  (.onError ^js debug-adapter-tracker error))

(defn on-exit
  "The debug adapter has exited with the given exit code or signal."
  (^js [debug-adapter-tracker]
   (.onExit ^js debug-adapter-tracker))
  (^js [debug-adapter-tracker code]
   (.onExit ^js debug-adapter-tracker code))
  (^js [debug-adapter-tracker code signal]
   (.onExit ^js debug-adapter-tracker code signal)))
