(ns dots.vscode.task-process-end-event
  "An event signaling the end of a process execution
   triggered through a task")

(defn execution
  "The task execution for which the process got started.
   
   **Returns:** `TaskExecution`"
  ^js [task-process-end-event]
  (.-execution ^js task-process-end-event))

(defn exit-code
  "The process's exit code. Will be `undefined` when the task is terminated.
   
   **Returns:** `number | undefined`"
  ^js [task-process-end-event]
  (.-exitCode ^js task-process-end-event))
