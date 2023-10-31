(ns dots.vscode.debug-adapter-descriptor-factory)

(defn create-debug-adapter-descriptor
  "'createDebugAdapterDescriptor' is called at the start of a debug session to provide details about the debug adapter to use.
   These details must be returned as objects of type {@link DebugAdapterDescriptor }.
   Currently two types of debug adapters are supported:
   - a debug adapter executable is specified as a command path and arguments (see {@link DebugAdapterExecutable }),
   - a debug adapter server reachable via a communication port (see {@link DebugAdapterServer }).
   If the method is not implemented the default behavior is this:
     createDebugAdapter(session: DebugSession, executable: DebugAdapterExecutable) {
        if (typeof session.configuration.debugServer === 'number') {
           return new DebugAdapterServer(session.configuration.debugServer);
        }
        return executable;
     }"
  (^js [debug-adapter-descriptor-factory session]
   (.createDebugAdapterDescriptor ^js debug-adapter-descriptor-factory session))
  (^js [debug-adapter-descriptor-factory session executable]
   (.createDebugAdapterDescriptor ^js debug-adapter-descriptor-factory session executable)))
