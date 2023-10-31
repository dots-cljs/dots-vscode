(ns dots.vscode.tasks
  "Namespace for tasks functionality."
  (:require ["vscode" :as vscode]))

(defn register-task-provider
  "Register a task provider."
  ^js [type provider]
  (.registerTaskProvider vscode/tasks type provider))

(defn fetch-tasks
  "Fetches all tasks available in the systems. This includes tasks
   from `tasks.json` files as well as tasks from task providers
   contributed through extensions."
  (^js []
   (.fetchTasks vscode/tasks))
  (^js [filter]
   (.fetchTasks vscode/tasks filter)))

(defn execute-task
  "Executes a task that is managed by the editor. The returned
   task execution can be used to terminate the task."
  ^js [task]
  (.executeTask vscode/tasks task))

(defn task-executions
  "The currently active task executions or an empty array."
  ^js []
  (.-taskExecutions vscode/tasks))

(defn on-did-start-task
  "Fires when a task starts."
  (^js []
   (.-onDidStartTask vscode/tasks))
  (^js [listener]
   (.onDidStartTask vscode/tasks listener))
  (^js [listener this-args]
   (.onDidStartTask vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidStartTask vscode/tasks listener this-args disposables)))

(defn on-did-end-task
  "Fires when a task ends."
  (^js []
   (.-onDidEndTask vscode/tasks))
  (^js [listener]
   (.onDidEndTask vscode/tasks listener))
  (^js [listener this-args]
   (.onDidEndTask vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidEndTask vscode/tasks listener this-args disposables)))

(defn on-did-start-task-process
  "Fires when the underlying process has been started.
   This event will not fire for tasks that don't
   execute an underlying process."
  (^js []
   (.-onDidStartTaskProcess vscode/tasks))
  (^js [listener]
   (.onDidStartTaskProcess vscode/tasks listener))
  (^js [listener this-args]
   (.onDidStartTaskProcess vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidStartTaskProcess vscode/tasks listener this-args disposables)))

(defn on-did-end-task-process
  "Fires when the underlying process has ended.
   This event will not fire for tasks that don't
   execute an underlying process."
  (^js []
   (.-onDidEndTaskProcess vscode/tasks))
  (^js [listener]
   (.onDidEndTaskProcess vscode/tasks listener))
  (^js [listener this-args]
   (.onDidEndTaskProcess vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidEndTaskProcess vscode/tasks listener this-args disposables)))
