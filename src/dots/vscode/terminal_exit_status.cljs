(ns dots.vscode.terminal-exit-status
  "Represents how a terminal exited.")

(defn code
  "The exit code that a terminal exited with, it can have the following values:
   - Zero: the terminal process or custom execution succeeded.
   - Non-zero: the terminal process or custom execution failed.
   - `undefined`: the user forcibly closed the terminal or a custom execution exited
     without providing an exit code."
  ^js [terminal-exit-status]
  (.-code ^js terminal-exit-status))

(defn reason
  "The reason that triggered the exit of a terminal."
  ^js [terminal-exit-status]
  (.-reason ^js terminal-exit-status))
