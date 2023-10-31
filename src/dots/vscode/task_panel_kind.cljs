(ns dots.vscode.task-panel-kind
  "Controls how the task channel is used between tasks"
  (:require ["vscode" :as vscode]))

(def shared
  "Shares a panel with other tasks. This is the default."
  (.-Shared vscode/TaskPanelKind))

(def dedicated
  "Uses a dedicated panel for this tasks. The panel is not
   shared with other tasks."
  (.-Dedicated vscode/TaskPanelKind))

(def new
  "Creates a new panel whenever this task is executed."
  (.-New vscode/TaskPanelKind))
