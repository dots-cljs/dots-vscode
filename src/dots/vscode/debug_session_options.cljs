(ns dots.vscode.debug-session-options
  "Options for {@link debug.startDebugging starting a debug session}.")

(defn parent-session
  "When specified the newly created debug session is registered as a \"child\" session of this
   \"parent\" debug session."
  ^js [debug-session-options]
  (.-parentSession ^js debug-session-options))

(defn set-parent-session!
  "When specified the newly created debug session is registered as a \"child\" session of this
   \"parent\" debug session."
  ^js [debug-session-options value]
  (set! (.-parentSession ^js debug-session-options) value))

(defn lifecycle-managed-by-parent?
  "Controls whether lifecycle requests like 'restart' are sent to the newly created session or its parent session.
   By default (if the property is false or missing), lifecycle requests are sent to the new session.
   This property is ignored if the session has no parent session."
  ^js [debug-session-options]
  (.-lifecycleManagedByParent ^js debug-session-options))

(defn set-lifecycle-managed-by-parent!
  "Controls whether lifecycle requests like 'restart' are sent to the newly created session or its parent session.
   By default (if the property is false or missing), lifecycle requests are sent to the new session.
   This property is ignored if the session has no parent session."
  ^js [debug-session-options value]
  (set! (.-lifecycleManagedByParent ^js debug-session-options) value))

(defn console-mode
  "Controls whether this session should have a separate debug console or share it
   with the parent session. Has no effect for sessions which do not have a parent session.
   Defaults to Separate."
  ^js [debug-session-options]
  (.-consoleMode ^js debug-session-options))

(defn set-console-mode!
  "Controls whether this session should have a separate debug console or share it
   with the parent session. Has no effect for sessions which do not have a parent session.
   Defaults to Separate."
  ^js [debug-session-options value]
  (set! (.-consoleMode ^js debug-session-options) value))

(defn no-debug?
  "Controls whether this session should run without debugging, thus ignoring breakpoints.
   When this property is not specified, the value from the parent session (if there is one) is used."
  ^js [debug-session-options]
  (.-noDebug ^js debug-session-options))

(defn set-no-debug!
  "Controls whether this session should run without debugging, thus ignoring breakpoints.
   When this property is not specified, the value from the parent session (if there is one) is used."
  ^js [debug-session-options value]
  (set! (.-noDebug ^js debug-session-options) value))

(defn compact?
  "Controls if the debug session's parent session is shown in the CALL STACK view even if it has only a single child.
   By default, the debug session will never hide its parent.
   If compact is true, debug sessions with a single child are hidden in the CALL STACK view to make the tree more compact."
  ^js [debug-session-options]
  (.-compact ^js debug-session-options))

(defn set-compact!
  "Controls if the debug session's parent session is shown in the CALL STACK view even if it has only a single child.
   By default, the debug session will never hide its parent.
   If compact is true, debug sessions with a single child are hidden in the CALL STACK view to make the tree more compact."
  ^js [debug-session-options value]
  (set! (.-compact ^js debug-session-options) value))
