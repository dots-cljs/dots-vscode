(ns dots.vscode.task-end-event
  "An event signaling the end of an executed task.
   
   This interface is not intended to be implemented.")

(defn execution
  "The task item representing the task that finished.
   
   **Returns:** `TaskExecution`"
  ^js [task-end-event]
  (.-execution ^js task-end-event))
