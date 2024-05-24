(ns dots.vscode.debug.active-debug-console
  "The currently active {@link DebugConsole debug console}.
   If no debug session is active, output sent to the debug console is not shown."
  (:require ["vscode" :as vscode]))

(defn append
  "Append the given value to the debug console.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [value]
  (.. vscode/debug -activeDebugConsole (append value)))

(defn append-line
  "Append the given value and a line feed character
   to the debug console.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will be printed.
   
   **Returns:** `void`"
  ^js [value]
  (.. vscode/debug -activeDebugConsole (appendLine value)))
