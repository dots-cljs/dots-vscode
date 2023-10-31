(ns dots.vscode.task-execution
  "An object representing an executed Task. It can be used
   to terminate a task.
   
   This interface is not intended to be implemented.")

(defn task
  "The task that got started."
  ^js [task-execution]
  (.-task ^js task-execution))

(defn set-task!
  "The task that got started."
  ^js [task-execution value]
  (set! (.-task ^js task-execution) value))

(defn terminate
  "Terminates the task execution."
  ^js [task-execution]
  (.terminate ^js task-execution))
