(ns dots.vscode.process-execution
  "The execution of a task happens as an external process
   without shell interaction.")

(defn process
  "The process to be executed.
   
   **Returns:** `string`"
  ^js [process-execution]
  (.-process ^js process-execution))

(defn set-process!
  "The process to be executed."
  ^js [process-execution value]
  (set! (.-process ^js process-execution) value))

(defn args
  "The arguments passed to the process. Defaults to an empty array.
   
   **Returns:** `string[]`"
  ^js [process-execution]
  (.-args ^js process-execution))

(defn set-args!
  "The arguments passed to the process. Defaults to an empty array."
  ^js [process-execution value]
  (set! (.-args ^js process-execution) value))

(defn options
  "The process options used when the process is executed.
   Defaults to undefined.
   
   **Returns:** `ProcessExecutionOptions | undefined`"
  ^js [process-execution]
  (.-options ^js process-execution))

(defn set-options!
  "The process options used when the process is executed.
   Defaults to undefined."
  ^js [process-execution value]
  (set! (.-options ^js process-execution) value))
