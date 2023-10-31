(ns dots.vscode.comment-thread-collapsible-state
  "Collapsible state of a {@link CommentThread comment thread}"
  (:require ["vscode" :as vscode]))

(def collapsed
  "Determines an item is collapsed"
  (.-Collapsed vscode/CommentThreadCollapsibleState))

(def expanded
  "Determines an item is expanded"
  (.-Expanded vscode/CommentThreadCollapsibleState))
