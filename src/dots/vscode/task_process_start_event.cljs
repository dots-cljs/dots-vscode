(ns dots.vscode.task-process-start-event
  "An event signaling the start of a process execution
   triggered through a task")

(defn execution
  "The task execution for which the process got started.
   
   **Returns:** `TaskExecution`"
  ^js [task-process-start-event]
  (.-execution ^js task-process-start-event))

(defn process-id
  "The underlying process id.
   
   **Returns:** `number`"
  ^js [task-process-start-event]
  (.-processId ^js task-process-start-event))
