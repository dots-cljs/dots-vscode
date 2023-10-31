(ns dots.vscode.debug-console
  "Represents the debug console.")

(defn append
  "Append the given value to the debug console."
  ^js [debug-console value]
  (.append ^js debug-console value))

(defn append-line
  "Append the given value and a line feed character
   to the debug console."
  ^js [debug-console value]
  (.appendLine ^js debug-console value))
