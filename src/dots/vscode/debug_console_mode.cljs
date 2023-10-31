(ns dots.vscode.debug-console-mode
  "Debug console mode used by debug session, see {@link DebugSessionOptions options}."
  (:require ["vscode" :as vscode]))

(def separate
  "Debug session should have a separate debug console."
  (.-Separate vscode/DebugConsoleMode))

(def merge-with-parent
  "Debug session should share debug console with its parent session.
   This value has no effect for sessions which do not have a parent session."
  (.-MergeWithParent vscode/DebugConsoleMode))
