(ns dots.vscode.comments
  (:require ["vscode" :as vscode]))

(defn create-comment-controller
  "Creates a new {@link CommentController comment controller} instance.
   
   **Parameters:**
   - `id`: `string` - An `id` for the comment controller.
   - `label`: `string` - A human-readable string for the comment controller.
   
   **Returns:** `CommentController` - An instance of {@link CommentControllercomment controller}."
  ^js [id label]
  (.createCommentController vscode/comments id label))
