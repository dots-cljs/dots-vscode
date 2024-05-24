(ns dots.vscode.progress
  "Defines a generalized way of reporting progress updates.")

(defn report
  "Report a progress update.
   
   **Parameters:**
   - `value`: `T` - A progress item, like a message and/or an
   report on how much work finished
   
   **Returns:** `void`"
  ^js [progress value]
  (.report ^js progress value))
