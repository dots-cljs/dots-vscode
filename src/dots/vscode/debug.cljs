(ns dots.vscode.debug
  "Namespace for debug functionality."
  (:require ["vscode" :as vscode]))

(defn register-debug-configuration-provider
  "Register a {@link DebugConfigurationProvider debug configuration provider} for a specific debug type.
   The optional {@link DebugConfigurationProviderTriggerKind triggerKind} can be used to specify when the `provideDebugConfigurations` method of the provider is triggered.
   Currently two trigger kinds are possible: with the value `Initial` (or if no trigger kind argument is given) the `provideDebugConfigurations` method is used to provide the initial debug configurations to be copied into a newly created launch.json.
   With the trigger kind `Dynamic` the `provideDebugConfigurations` method is used to dynamically determine debug configurations to be presented to the user (in addition to the static configurations from the launch.json).
   Please note that the `triggerKind` argument only applies to the `provideDebugConfigurations` method: so the `resolveDebugConfiguration` methods are not affected at all.
   Registering a single provider with resolve methods for different trigger kinds, results in the same resolve methods called multiple times.
   More than one provider can be registered for the same type."
  (^js [debug-type provider]
   (.registerDebugConfigurationProvider vscode/debug debug-type provider))
  (^js [debug-type provider trigger-kind]
   (.registerDebugConfigurationProvider vscode/debug debug-type provider trigger-kind)))

(defn register-debug-adapter-descriptor-factory
  "Register a {@link DebugAdapterDescriptorFactory debug adapter descriptor factory} for a specific debug type.
   An extension is only allowed to register a DebugAdapterDescriptorFactory for the debug type(s) defined by the extension. Otherwise an error is thrown.
   Registering more than one DebugAdapterDescriptorFactory for a debug type results in an error."
  ^js [debug-type factory]
  (.registerDebugAdapterDescriptorFactory vscode/debug debug-type factory))

(defn register-debug-adapter-tracker-factory
  "Register a debug adapter tracker factory for the given debug type."
  ^js [debug-type factory]
  (.registerDebugAdapterTrackerFactory vscode/debug debug-type factory))

(defn start-debugging
  "Start debugging by using either a named launch or named compound configuration,
   or by directly passing a {@link DebugConfiguration }.
   The named configurations are looked up in '.vscode/launch.json' found in the given folder.
   Before debugging starts, all unsaved files are saved and the launch configurations are brought up-to-date.
   Folder specific variables used in the configuration (e.g. '${workspaceFolder}') are resolved against the given folder."
  (^js []
   (.startDebugging vscode/debug))
  (^js [folder]
   (.startDebugging vscode/debug folder))
  (^js [folder name-or-configuration]
   (.startDebugging vscode/debug folder name-or-configuration))
  (^js [folder name-or-configuration parent-session-or-options]
   (.startDebugging vscode/debug folder name-or-configuration parent-session-or-options)))

(defn stop-debugging
  "Stop the given debug session or stop all debug sessions if session is omitted."
  (^js []
   (.stopDebugging vscode/debug))
  (^js [session]
   (.stopDebugging vscode/debug session)))

(defn add-breakpoints
  "Add breakpoints."
  ^js [breakpoints]
  (.addBreakpoints vscode/debug breakpoints))

(defn remove-breakpoints
  "Remove breakpoints."
  ^js [breakpoints]
  (.removeBreakpoints vscode/debug breakpoints))

(defn as-debug-source-uri
  "Converts a \"Source\" descriptor object received via the Debug Adapter Protocol into a Uri that can be used to load its contents.
   If the source descriptor is based on a path, a file Uri is returned.
   If the source descriptor uses a reference number, a specific debug Uri (scheme 'debug') is constructed that requires a corresponding ContentProvider and a running debug session
   
   If the \"Source\" descriptor has insufficient information for creating the Uri, an error is thrown."
  (^js [source]
   (.asDebugSourceUri vscode/debug source))
  (^js [source session]
   (.asDebugSourceUri vscode/debug source session)))

(defn active-debug-session
  "The currently active {@link DebugSession debug session} or `undefined`. The active debug session is the one
   represented by the debug action floating window or the one currently shown in the drop down menu of the debug action floating window.
   If no debug session is active, the value is `undefined`."
  ^js []
  (.-activeDebugSession vscode/debug))

(defn active-debug-console
  "The currently active {@link DebugConsole debug console}.
   If no debug session is active, output sent to the debug console is not shown."
  ^js []
  (.-activeDebugConsole vscode/debug))

(defn breakpoints
  "List of breakpoints."
  ^js []
  (.-breakpoints vscode/debug))

(defn on-did-change-active-debug-session
  "An {@link Event } which fires when the {@link debug.activeDebugSession active debug session}
   has changed. *Note* that the event also fires when the active debug session changes
   to `undefined`."
  (^js []
   (.-onDidChangeActiveDebugSession vscode/debug))
  (^js [listener]
   (.onDidChangeActiveDebugSession vscode/debug listener))
  (^js [listener this-args]
   (.onDidChangeActiveDebugSession vscode/debug listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveDebugSession vscode/debug listener this-args disposables)))

(defn on-did-start-debug-session
  "An {@link Event } which fires when a new {@link DebugSession debug session} has been started."
  (^js []
   (.-onDidStartDebugSession vscode/debug))
  (^js [listener]
   (.onDidStartDebugSession vscode/debug listener))
  (^js [listener this-args]
   (.onDidStartDebugSession vscode/debug listener this-args))
  (^js [listener this-args disposables]
   (.onDidStartDebugSession vscode/debug listener this-args disposables)))

(defn on-did-receive-debug-session-custom-event
  "An {@link Event } which fires when a custom DAP event is received from the {@link DebugSession debug session}."
  (^js []
   (.-onDidReceiveDebugSessionCustomEvent vscode/debug))
  (^js [listener]
   (.onDidReceiveDebugSessionCustomEvent vscode/debug listener))
  (^js [listener this-args]
   (.onDidReceiveDebugSessionCustomEvent vscode/debug listener this-args))
  (^js [listener this-args disposables]
   (.onDidReceiveDebugSessionCustomEvent vscode/debug listener this-args disposables)))

(defn on-did-terminate-debug-session
  "An {@link Event } which fires when a {@link DebugSession debug session} has terminated."
  (^js []
   (.-onDidTerminateDebugSession vscode/debug))
  (^js [listener]
   (.onDidTerminateDebugSession vscode/debug listener))
  (^js [listener this-args]
   (.onDidTerminateDebugSession vscode/debug listener this-args))
  (^js [listener this-args disposables]
   (.onDidTerminateDebugSession vscode/debug listener this-args disposables)))

(defn on-did-change-breakpoints
  "An {@link Event } that is emitted when the set of breakpoints is added, removed, or changed."
  (^js []
   (.-onDidChangeBreakpoints vscode/debug))
  (^js [listener]
   (.onDidChangeBreakpoints vscode/debug listener))
  (^js [listener this-args]
   (.onDidChangeBreakpoints vscode/debug listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeBreakpoints vscode/debug listener this-args disposables)))
