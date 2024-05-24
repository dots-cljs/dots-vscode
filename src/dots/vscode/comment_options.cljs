(ns dots.vscode.comment-options
  "Represents a {@link CommentController comment controller}'s {@link CommentController.options options}.")

(defn prompt
  "An optional string to show on the comment input box when it's collapsed.
   
   **Returns:** `string | undefined`"
  ^js [comment-options]
  (.-prompt ^js comment-options))

(defn set-prompt!
  "An optional string to show on the comment input box when it's collapsed."
  ^js [comment-options value]
  (set! (.-prompt ^js comment-options) value))

(defn place-holder
  "An optional string to show as placeholder in the comment input box when it's focused.
   
   **Returns:** `string | undefined`"
  ^js [comment-options]
  (.-placeHolder ^js comment-options))

(defn set-place-holder!
  "An optional string to show as placeholder in the comment input box when it's focused."
  ^js [comment-options value]
  (set! (.-placeHolder ^js comment-options) value))
