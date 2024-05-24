(ns dots.vscode.task-provider
  "A task provider allows to add tasks to the task service.
   A task provider is registered via {@link tasks.registerTaskProvider }.")

(defn provide-tasks
  "Provides tasks.
   
   **Parameters:**
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T[]>` - an array of tasks"
  ^js [task-provider token]
  (.provideTasks ^js task-provider token))

(defn resolve-task
  "Resolves a task that has no {@linkcode Task.execution execution} set. Tasks are
   often created from information found in the `tasks.json`-file. Such tasks miss
   the information on how to execute them and a task provider must fill in
   the missing information in the `resolveTask`-method. This method will not be
   called for tasks returned from the above `provideTasks` method since those
   tasks are always fully resolved. A valid default implementation for the
   `resolveTask` method is to return `undefined`.
   
   Note that when filling in the properties of `task`, you _must_ be sure to
   use the exact same `TaskDefinition` and not create a new one. Other properties
   may be changed.
   
   **Parameters:**
   - `task`: `T` - The task to resolve.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T>` - The resolved task"
  ^js [task-provider task token]
  (.resolveTask ^js task-provider task token))
