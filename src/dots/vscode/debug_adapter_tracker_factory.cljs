(ns dots.vscode.debug-adapter-tracker-factory)

(defn create-debug-adapter-tracker
  "The method 'createDebugAdapterTracker' is called at the start of a debug session in order
   to return a \"tracker\" object that provides read-access to the communication between the editor and a debug adapter."
  ^js [debug-adapter-tracker-factory session]
  (.createDebugAdapterTracker ^js debug-adapter-tracker-factory session))
