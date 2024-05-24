(ns dots.vscode.debug-console
  "Represents the debug console.")

(defn append
  "Append the given value to the debug console.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [debug-console value]
  (.append ^js debug-console value))

(defn append-line
  "Append the given value and a line feed character
   to the debug console.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will be printed.
   
   **Returns:** `void`"
  ^js [debug-console value]
  (.appendLine ^js debug-console value))
