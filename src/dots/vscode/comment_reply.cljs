(ns dots.vscode.comment-reply
  "Command argument for actions registered in `comments/commentThread/context`.")

(defn thread
  "The active {@link CommentThread comment thread}
   
   **Returns:** `CommentThread`"
  ^js [comment-reply]
  (.-thread ^js comment-reply))

(defn set-thread!
  "The active {@link CommentThread comment thread}"
  ^js [comment-reply value]
  (set! (.-thread ^js comment-reply) value))

(defn text
  "The value in the comment editor
   
   **Returns:** `string`"
  ^js [comment-reply]
  (.-text ^js comment-reply))

(defn set-text!
  "The value in the comment editor"
  ^js [comment-reply value]
  (set! (.-text ^js comment-reply) value))
