(ns dots.vscode.notebook-cell-execution-summary
  "The summary of a notebook cell execution.")

(defn execution-order
  "The order in which the execution happened.
   
   **Returns:** `number | undefined`"
  ^js [notebook-cell-execution-summary]
  (.-executionOrder ^js notebook-cell-execution-summary))

(defn success?
  "If the execution finished successfully.
   
   **Returns:** `boolean | undefined`"
  ^js [notebook-cell-execution-summary]
  (.-success ^js notebook-cell-execution-summary))

(defn timing
  "The times at which execution started and ended, as unix timestamps
   
   **Returns:** `{ readonly startTime: number; readonly endTime: number; } | undefined`"
  ^js [notebook-cell-execution-summary]
  (.-timing ^js notebook-cell-execution-summary))
