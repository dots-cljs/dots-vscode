(ns dots.vscode.debug-adapter-tracker-factory
  "A debug adaper factory that creates {@link DebugAdapterTracker debug adapter trackers}.")

(defn create-debug-adapter-tracker
  "The method 'createDebugAdapterTracker' is called at the start of a debug session in order
   to return a \"tracker\" object that provides read-access to the communication between the editor and a debug adapter.
   
   **Parameters:**
   - `session`: `DebugSession` - The {@link DebugSession debug session} for which the debug adapter tracker will be used.
   
   **Returns:** `ProviderResult<DebugAdapterTracker>` - A {@link DebugAdapterTrackerdebug adapter tracker} or undefined."
  ^js [debug-adapter-tracker-factory session]
  (.createDebugAdapterTracker ^js debug-adapter-tracker-factory session))
