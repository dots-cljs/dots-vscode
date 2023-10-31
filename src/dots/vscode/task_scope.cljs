(ns dots.vscode.task-scope
  "The scope of a task."
  (:require ["vscode" :as vscode]))

(def global
  "The task is a global task. Global tasks are currently not supported."
  (.-Global vscode/TaskScope))

(def workspace
  "The task is a workspace task"
  (.-Workspace vscode/TaskScope))
