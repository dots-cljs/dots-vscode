(ns dots.vscode.tasks
  "Namespace for tasks functionality."
  (:require ["vscode" :as vscode]))

(defn register-task-provider
  "Register a task provider.
   
   **Parameters:**
   - `type`: `string` - The task kind type this provider is registered for.
   - `provider`: `TaskProvider<Task>` - A task provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [type provider]
  (.registerTaskProvider vscode/tasks type provider))

(defn fetch-tasks
  "Fetches all tasks available in the systems. This includes tasks
   from `tasks.json` files as well as tasks from task providers
   contributed through extensions.
   
   **Parameters:**
   - `filter`: `TaskFilter | undefined` - Optional filter to select tasks of a certain type or version.
   
   **Returns:** `Thenable<Task[]>` - A thenable that resolves to an array of tasks."
  (^js []
   (.fetchTasks vscode/tasks))
  (^js [filter]
   (.fetchTasks vscode/tasks filter)))

(defn execute-task
  "Executes a task that is managed by the editor. The returned
   task execution can be used to terminate the task.
   
   **Parameters:**
   - `task`: `Task` - the task to execute
   
   **Returns:** `Thenable<TaskExecution>` - A thenable that resolves to a task execution."
  ^js [task]
  (.executeTask vscode/tasks task))

(defn task-executions
  "The currently active task executions or an empty array."
  ^js []
  (.-taskExecutions vscode/tasks))

(defn on-did-start-task
  "Fires when a task starts.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidStartTask vscode/tasks))
  (^js [listener]
   (.onDidStartTask vscode/tasks listener))
  (^js [listener this-args]
   (.onDidStartTask vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidStartTask vscode/tasks listener this-args disposables)))

(defn on-did-end-task
  "Fires when a task ends.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
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
   execute an underlying process.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
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
   execute an underlying process.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidEndTaskProcess vscode/tasks))
  (^js [listener]
   (.onDidEndTaskProcess vscode/tasks listener))
  (^js [listener this-args]
   (.onDidEndTaskProcess vscode/tasks listener this-args))
  (^js [listener this-args disposables]
   (.onDidEndTaskProcess vscode/tasks listener this-args disposables)))
