(ns dots.vscode.task
  "A task to execute"
  (:refer-clojure :exclude [name]))

(defn definition
  "The task's definition.
   
   **Returns:** `TaskDefinition`"
  ^js [task]
  (.-definition ^js task))

(defn set-definition!
  "The task's definition."
  ^js [task value]
  (set! (.-definition ^js task) value))

(defn scope
  "The task's scope.
   
   **Returns:** `TaskScope | WorkspaceFolder | undefined`"
  ^js [task]
  (.-scope ^js task))

(defn name
  "The task's name
   
   **Returns:** `string`"
  ^js [task]
  (.-name ^js task))

(defn set-name!
  "The task's name"
  ^js [task value]
  (set! (.-name ^js task) value))

(defn detail
  "A human-readable string which is rendered less prominently on a separate line in places
   where the task's name is displayed. Supports rendering of {@link ThemeIcon theme icons}
   via the `$(<name>)`-syntax.
   
   **Returns:** `string | undefined`"
  ^js [task]
  (.-detail ^js task))

(defn set-detail!
  "A human-readable string which is rendered less prominently on a separate line in places
   where the task's name is displayed. Supports rendering of {@link ThemeIcon theme icons}
   via the `$(<name>)`-syntax."
  ^js [task value]
  (set! (.-detail ^js task) value))

(defn execution
  "The task's execution engine
   
   **Returns:** `ProcessExecution | ShellExecution | CustomExecution | undefined`"
  ^js [task]
  (.-execution ^js task))

(defn set-execution!
  "The task's execution engine"
  ^js [task value]
  (set! (.-execution ^js task) value))

(defn background?
  "Whether the task is a background task or not.
   
   **Returns:** `boolean`"
  ^js [task]
  (.-isBackground ^js task))

(defn set-is-background!
  "Whether the task is a background task or not."
  ^js [task value]
  (set! (.-isBackground ^js task) value))

(defn source
  "A human-readable string describing the source of this shell task, e.g. 'gulp'
   or 'npm'. Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
   
   **Returns:** `string`"
  ^js [task]
  (.-source ^js task))

(defn set-source!
  "A human-readable string describing the source of this shell task, e.g. 'gulp'
   or 'npm'. Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax."
  ^js [task value]
  (set! (.-source ^js task) value))

(defn group
  "The task group this tasks belongs to. See TaskGroup
   for a predefined set of available groups.
   Defaults to undefined meaning that the task doesn't
   belong to any special group.
   
   **Returns:** `TaskGroup | undefined`"
  ^js [task]
  (.-group ^js task))

(defn set-group!
  "The task group this tasks belongs to. See TaskGroup
   for a predefined set of available groups.
   Defaults to undefined meaning that the task doesn't
   belong to any special group."
  ^js [task value]
  (set! (.-group ^js task) value))

(defn presentation-options
  "The presentation options. Defaults to an empty literal.
   
   **Returns:** `TaskPresentationOptions`"
  ^js [task]
  (.-presentationOptions ^js task))

(defn set-presentation-options!
  "The presentation options. Defaults to an empty literal."
  ^js [task value]
  (set! (.-presentationOptions ^js task) value))

(defn problem-matchers
  "The problem matchers attached to the task. Defaults to an empty
   array.
   
   **Returns:** `string[]`"
  ^js [task]
  (.-problemMatchers ^js task))

(defn set-problem-matchers!
  "The problem matchers attached to the task. Defaults to an empty
   array."
  ^js [task value]
  (set! (.-problemMatchers ^js task) value))

(defn run-options
  "Run options for the task
   
   **Returns:** `RunOptions`"
  ^js [task]
  (.-runOptions ^js task))

(defn set-run-options!
  "Run options for the task"
  ^js [task value]
  (set! (.-runOptions ^js task) value))
