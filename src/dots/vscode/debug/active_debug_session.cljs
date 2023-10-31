(ns dots.vscode.debug.active-debug-session
  "The currently active {@link DebugSession debug session} or `undefined`. The active debug session is the one
   represented by the debug action floating window or the one currently shown in the drop down menu of the debug action floating window.
   If no debug session is active, the value is `undefined`."
  (:refer-clojure :exclude [name type])
  (:require ["vscode" :as vscode]))

(defn id
  "The unique ID of this debug session."
  ^js []
  (.. vscode/debug -activeDebugSession -id))

(defn type
  "The debug session's type from the {@link DebugConfiguration debug configuration}."
  ^js []
  (.. vscode/debug -activeDebugSession -type))

(defn parent-session
  "The parent session of this debug session, if it was created as a child."
  ^js []
  (.. vscode/debug -activeDebugSession -parentSession))

(defn name
  "The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
   Any changes will be properly reflected in the UI."
  ^js []
  (.. vscode/debug -activeDebugSession -name))

(defn set-name!
  "The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
   Any changes will be properly reflected in the UI."
  ^js [value]
  (set! (.. vscode/debug -activeDebugSession -name) value))

(defn workspace-folder
  "The workspace folder of this session or `undefined` for a folderless setup."
  ^js []
  (.. vscode/debug -activeDebugSession -workspaceFolder))

(defn configuration
  "The \"resolved\" {@link DebugConfiguration debug configuration} of this session.
   \"Resolved\" means that
   - all variables have been substituted and
   - platform specific attribute sections have been \"flattened\" for the matching platform and removed for non-matching platforms."
  ^js []
  (.. vscode/debug -activeDebugSession -configuration))

(defn custom-request
  "Send a custom request to the debug adapter."
  (^js [command]
   (.. vscode/debug -activeDebugSession (customRequest command)))
  (^js [command args]
   (.. vscode/debug -activeDebugSession (customRequest command args))))

(defn debug-protocol-breakpoint
  "Maps a breakpoint in the editor to the corresponding Debug Adapter Protocol (DAP) breakpoint that is managed by the debug adapter of the debug session.
   If no DAP breakpoint exists (either because the editor breakpoint was not yet registered or because the debug adapter is not interested in the breakpoint), the value `undefined` is returned."
  ^js [breakpoint]
  (.. vscode/debug -activeDebugSession (getDebugProtocolBreakpoint breakpoint)))
