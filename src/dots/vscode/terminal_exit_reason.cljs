(ns dots.vscode.terminal-exit-reason
  "Terminal exit reason kind."
  (:require ["vscode" :as vscode]))

(def unknown
  "Unknown reason."
  (.-Unknown vscode/TerminalExitReason))

(def shutdown
  "The window closed/reloaded."
  (.-Shutdown vscode/TerminalExitReason))

(def process
  "The shell process exited."
  (.-Process vscode/TerminalExitReason))

(def user
  "The user closed the terminal."
  (.-User vscode/TerminalExitReason))

(def extension
  "An extension disposed the terminal."
  (.-Extension vscode/TerminalExitReason))
