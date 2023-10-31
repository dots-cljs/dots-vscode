(ns dots.vscode
  (:require ["vscode" :as vscode]))

(defn version
  "The version of the editor."
  ^js []
  vscode/version)
