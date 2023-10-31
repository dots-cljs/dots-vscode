(ns dots.vscode.terminal-location
  "The location of the terminal."
  (:require ["vscode" :as vscode]))

(def panel
  "In the terminal view"
  (.-Panel vscode/TerminalLocation))

(def editor
  "In the editor area"
  (.-Editor vscode/TerminalLocation))
