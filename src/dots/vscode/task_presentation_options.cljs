(ns dots.vscode.task-presentation-options
  "Controls how the task is presented in the UI.")

(defn reveal
  "Controls whether the task output is reveal in the user interface.
   Defaults to `RevealKind.Always`."
  ^js [task-presentation-options]
  (.-reveal ^js task-presentation-options))

(defn set-reveal!
  "Controls whether the task output is reveal in the user interface.
   Defaults to `RevealKind.Always`."
  ^js [task-presentation-options value]
  (set! (.-reveal ^js task-presentation-options) value))

(defn echo?
  "Controls whether the command associated with the task is echoed
   in the user interface."
  ^js [task-presentation-options]
  (.-echo ^js task-presentation-options))

(defn set-echo!
  "Controls whether the command associated with the task is echoed
   in the user interface."
  ^js [task-presentation-options value]
  (set! (.-echo ^js task-presentation-options) value))

(defn focus?
  "Controls whether the panel showing the task output is taking focus."
  ^js [task-presentation-options]
  (.-focus ^js task-presentation-options))

(defn set-focus!
  "Controls whether the panel showing the task output is taking focus."
  ^js [task-presentation-options value]
  (set! (.-focus ^js task-presentation-options) value))

(defn panel
  "Controls if the task panel is used for this task only (dedicated),
   shared between tasks (shared) or if a new panel is created on
   every task execution (new). Defaults to `TaskInstanceKind.Shared`"
  ^js [task-presentation-options]
  (.-panel ^js task-presentation-options))

(defn set-panel!
  "Controls if the task panel is used for this task only (dedicated),
   shared between tasks (shared) or if a new panel is created on
   every task execution (new). Defaults to `TaskInstanceKind.Shared`"
  ^js [task-presentation-options value]
  (set! (.-panel ^js task-presentation-options) value))

(defn show-reuse-message?
  "Controls whether to show the \"Terminal will be reused by tasks, press any key to close it\" message."
  ^js [task-presentation-options]
  (.-showReuseMessage ^js task-presentation-options))

(defn set-show-reuse-message!
  "Controls whether to show the \"Terminal will be reused by tasks, press any key to close it\" message."
  ^js [task-presentation-options value]
  (set! (.-showReuseMessage ^js task-presentation-options) value))

(defn clear?
  "Controls whether the terminal is cleared before executing the task."
  ^js [task-presentation-options]
  (.-clear ^js task-presentation-options))

(defn set-clear!
  "Controls whether the terminal is cleared before executing the task."
  ^js [task-presentation-options value]
  (set! (.-clear ^js task-presentation-options) value))
