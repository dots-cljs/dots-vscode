(ns dots.vscode.comment-mode
  "Comment mode of a {@link Comment }"
  (:require ["vscode" :as vscode]))

(def editing
  "Displays the comment editor"
  (.-Editing vscode/CommentMode))

(def preview
  "Displays the preview of the comment"
  (.-Preview vscode/CommentMode))
