(ns dots.vscode.configuration-target
  "The configuration target"
  (:require ["vscode" :as vscode]))

(def global
  "Global configuration"
  (.-Global vscode/ConfigurationTarget))

(def workspace
  "Workspace configuration"
  (.-Workspace vscode/ConfigurationTarget))

(def workspace-folder
  "Workspace folder configuration"
  (.-WorkspaceFolder vscode/ConfigurationTarget))
