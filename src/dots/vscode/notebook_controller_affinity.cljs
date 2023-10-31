(ns dots.vscode.notebook-controller-affinity
  "Notebook controller affinity for notebook documents."
  (:require ["vscode" :as vscode]))

(def default
  "Default affinity."
  (.-Default vscode/NotebookControllerAffinity))

(def preferred
  "A controller is preferred for a notebook."
  (.-Preferred vscode/NotebookControllerAffinity))
