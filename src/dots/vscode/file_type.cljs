(ns dots.vscode.file-type
  "Enumeration of file types. The types `File` and `Directory` can also be
   a symbolic links, in that case use `FileType.File | FileType.SymbolicLink` and
   `FileType.Directory | FileType.SymbolicLink`."
  (:require ["vscode" :as vscode]))

(def unknown
  "The file type is unknown."
  (.-Unknown vscode/FileType))

(def file
  "A regular file."
  (.-File vscode/FileType))

(def directory
  "A directory."
  (.-Directory vscode/FileType))

(def symbolic-link
  "A symbolic link to a file."
  (.-SymbolicLink vscode/FileType))
