(ns dots.vscode.comments
  (:require ["vscode" :as vscode]))

(defn create-comment-controller
  "Creates a new {@link CommentController comment controller} instance."
  ^js [id label]
  (.createCommentController vscode/comments id label))
