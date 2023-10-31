(ns dots.vscode.file-change-type
  "Enumeration of file change types."
  (:require ["vscode" :as vscode]))

(def changed
  "The contents or metadata of a file have changed."
  (.-Changed vscode/FileChangeType))

(def created
  "A file has been created."
  (.-Created vscode/FileChangeType))

(def deleted
  "A file has been deleted."
  (.-Deleted vscode/FileChangeType))
