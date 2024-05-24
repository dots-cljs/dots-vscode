(ns dots.vscode.comment-thread-state
  "The state of a comment thread."
  (:require ["vscode" :as vscode]))

(def unresolved
  "Unresolved thread state"
  (.-Unresolved vscode/CommentThreadState))

(def resolved
  "Resolved thread state"
  (.-Resolved vscode/CommentThreadState))
