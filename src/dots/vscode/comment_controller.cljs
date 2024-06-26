(ns dots.vscode.comment-controller
  "A comment controller is able to provide {@link CommentThread comments} support to the editor and
   provide users various ways to interact with comments.")

(defn id
  "The id of this comment controller.
   
   **Returns:** `string`"
  ^js [comment-controller]
  (.-id ^js comment-controller))

(defn label
  "The human-readable label of this comment controller.
   
   **Returns:** `string`"
  ^js [comment-controller]
  (.-label ^js comment-controller))

(defn options
  "Comment controller options
   
   **Returns:** `CommentOptions | undefined`"
  ^js [comment-controller]
  (.-options ^js comment-controller))

(defn set-options!
  "Comment controller options"
  ^js [comment-controller value]
  (set! (.-options ^js comment-controller) value))

(defn commenting-range-provider
  "Optional commenting range provider. Provide a list {@link Range ranges} which support commenting to any given resource uri.
   
   If not provided, users cannot leave any comments.
   
   **Returns:** `CommentingRangeProvider | undefined`"
  ^js [comment-controller]
  (.-commentingRangeProvider ^js comment-controller))

(defn set-commenting-range-provider!
  "Optional commenting range provider. Provide a list {@link Range ranges} which support commenting to any given resource uri.
   
   If not provided, users cannot leave any comments."
  ^js [comment-controller value]
  (set! (.-commentingRangeProvider ^js comment-controller) value))

(defn create-comment-thread
  "Create a {@link CommentThread comment thread}. The comment thread will be displayed in visible text editors (if the resource matches)
   and Comments Panel once created.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the document the thread has been created on.
   - `range`: `Range` - The range the comment thread is located within the document.
   - `comments`: `readonly Comment[]` - The ordered comments of the thread.
   
   **Returns:** `CommentThread`"
  ^js [comment-controller uri range comments]
  (.createCommentThread ^js comment-controller uri range comments))

(defn reaction-handler
  "Optional reaction handler for creating and deleting reactions on a {@link Comment }.
   
   **Returns:** `((comment: Comment, reaction: CommentReaction) => Thenable<void>) | undefined`"
  ^js [comment-controller]
  (.-reactionHandler ^js comment-controller))

(defn set-reaction-handler!
  "Optional reaction handler for creating and deleting reactions on a {@link Comment }."
  ^js [comment-controller value]
  (set! (.-reactionHandler ^js comment-controller) value))

(defn dispose
  "Dispose this comment controller.
   
   Once disposed, all {@link CommentThread comment threads} created by this comment controller will also be removed from the editor
   and Comments Panel.
   
   **Returns:** `void`"
  ^js [comment-controller]
  (.dispose ^js comment-controller))
