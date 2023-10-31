(ns dots.vscode.task-start-event
  "An event signaling the start of a task execution.
   
   This interface is not intended to be implemented.")

(defn execution
  "The task item representing the task that got started."
  ^js [task-start-event]
  (.-execution ^js task-start-event))
