(ns dots.vscode.comment-thread
  "A collection of {@link Comment comments} representing a conversation at a particular range in a document."
  (:refer-clojure :exclude [range]))

(defn uri
  "The uri of the document the thread has been created on."
  ^js [comment-thread]
  (.-uri ^js comment-thread))

(defn range
  "The range the comment thread is located within the document. The thread icon will be shown
   at the last line of the range."
  ^js [comment-thread]
  (.-range ^js comment-thread))

(defn set-range!
  "The range the comment thread is located within the document. The thread icon will be shown
   at the last line of the range."
  ^js [comment-thread value]
  (set! (.-range ^js comment-thread) value))

(defn comments
  "The ordered comments of the thread."
  ^js [comment-thread]
  (.-comments ^js comment-thread))

(defn set-comments!
  "The ordered comments of the thread."
  ^js [comment-thread value]
  (set! (.-comments ^js comment-thread) value))

(defn collapsible-state
  "Whether the thread should be collapsed or expanded when opening the document.
   Defaults to Collapsed."
  ^js [comment-thread]
  (.-collapsibleState ^js comment-thread))

(defn set-collapsible-state!
  "Whether the thread should be collapsed or expanded when opening the document.
   Defaults to Collapsed."
  ^js [comment-thread value]
  (set! (.-collapsibleState ^js comment-thread) value))

(defn can-reply?
  "Whether the thread supports reply.
   Defaults to true."
  ^js [comment-thread]
  (.-canReply ^js comment-thread))

(defn set-can-reply!
  "Whether the thread supports reply.
   Defaults to true."
  ^js [comment-thread value]
  (set! (.-canReply ^js comment-thread) value))

(defn context-value
  "Context value of the comment thread. This can be used to contribute thread specific actions.
   For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
   using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
   ```json
   \"contributes\": {
     \"menus\": {
       \"comments/commentThread/title\": [
         {
           \"command\": \"extension.deleteCommentThread\",
           \"when\": \"commentThread == editable\"
         }
       ]
     }
   }
   ```
   This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`."
  ^js [comment-thread]
  (.-contextValue ^js comment-thread))

(defn set-context-value!
  "Context value of the comment thread. This can be used to contribute thread specific actions.
   For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
   using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
   ```json
   \"contributes\": {
     \"menus\": {
       \"comments/commentThread/title\": [
         {
           \"command\": \"extension.deleteCommentThread\",
           \"when\": \"commentThread == editable\"
         }
       ]
     }
   }
   ```
   This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`."
  ^js [comment-thread value]
  (set! (.-contextValue ^js comment-thread) value))

(defn label
  "The optional human-readable label describing the {@link CommentThread Comment Thread}"
  ^js [comment-thread]
  (.-label ^js comment-thread))

(defn set-label!
  "The optional human-readable label describing the {@link CommentThread Comment Thread}"
  ^js [comment-thread value]
  (set! (.-label ^js comment-thread) value))

(defn dispose
  "Dispose this comment thread.
   
   Once disposed, this comment thread will be removed from visible editors and Comment Panel when appropriate."
  ^js [comment-thread]
  (.dispose ^js comment-thread))
