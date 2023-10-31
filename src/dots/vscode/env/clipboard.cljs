(ns dots.vscode.env.clipboard
  "The system clipboard."
  (:require ["vscode" :as vscode]))

(defn read-text
  "Read the current clipboard contents as text."
  ^js []
  (.. vscode/env -clipboard (readText)))

(defn write-text
  "Writes text into the clipboard."
  ^js [value]
  (.. vscode/env -clipboard (writeText value)))
