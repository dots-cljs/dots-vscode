(ns dots.vscode.debug-session
  "A debug session."
  (:refer-clojure :exclude [name type]))

(defn id
  "The unique ID of this debug session."
  ^js [debug-session]
  (.-id ^js debug-session))

(defn type
  "The debug session's type from the {@link DebugConfiguration debug configuration}."
  ^js [debug-session]
  (.-type ^js debug-session))

(defn parent-session
  "The parent session of this debug session, if it was created as a child."
  ^js [debug-session]
  (.-parentSession ^js debug-session))

(defn name
  "The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
   Any changes will be properly reflected in the UI."
  ^js [debug-session]
  (.-name ^js debug-session))

(defn set-name!
  "The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
   Any changes will be properly reflected in the UI."
  ^js [debug-session value]
  (set! (.-name ^js debug-session) value))

(defn workspace-folder
  "The workspace folder of this session or `undefined` for a folderless setup."
  ^js [debug-session]
  (.-workspaceFolder ^js debug-session))

(defn configuration
  "The \"resolved\" {@link DebugConfiguration debug configuration} of this session.
   \"Resolved\" means that
   - all variables have been substituted and
   - platform specific attribute sections have been \"flattened\" for the matching platform and removed for non-matching platforms."
  ^js [debug-session]
  (.-configuration ^js debug-session))

(defn custom-request
  "Send a custom request to the debug adapter."
  (^js [debug-session command]
   (.customRequest ^js debug-session command))
  (^js [debug-session command args]
   (.customRequest ^js debug-session command args)))

(defn debug-protocol-breakpoint
  "Maps a breakpoint in the editor to the corresponding Debug Adapter Protocol (DAP) breakpoint that is managed by the debug adapter of the debug session.
   If no DAP breakpoint exists (either because the editor breakpoint was not yet registered or because the debug adapter is not interested in the breakpoint), the value `undefined` is returned."
  ^js [debug-session breakpoint]
  (.getDebugProtocolBreakpoint ^js debug-session breakpoint))
