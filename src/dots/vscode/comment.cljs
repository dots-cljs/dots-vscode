(ns dots.vscode.comment
  "A comment is displayed within the editor or the Comments Panel, depending on how it is provided.")

(defn body
  "The human-readable comment body
   
   **Returns:** `string | MarkdownString`"
  ^js [comment]
  (.-body ^js comment))

(defn set-body!
  "The human-readable comment body"
  ^js [comment value]
  (set! (.-body ^js comment) value))

(defn mode
  "{@link CommentMode Comment mode} of the comment
   
   **Returns:** `CommentMode`"
  ^js [comment]
  (.-mode ^js comment))

(defn set-mode!
  "{@link CommentMode Comment mode} of the comment"
  ^js [comment value]
  (set! (.-mode ^js comment) value))

(defn author
  "The {@link CommentAuthorInformation author information} of the comment
   
   **Returns:** `CommentAuthorInformation`"
  ^js [comment]
  (.-author ^js comment))

(defn set-author!
  "The {@link CommentAuthorInformation author information} of the comment"
  ^js [comment value]
  (set! (.-author ^js comment) value))

(defn context-value
  "Context value of the comment. This can be used to contribute comment specific actions.
   For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
   using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
   ```json
   \"contributes\": {
   	\"menus\": {
   		\"comments/comment/title\": [
   			{
   				\"command\": \"extension.deleteComment\",
   				\"when\": \"comment == editable\"
   			}
   		]
   	}
   }
   ```
   This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`.
   
   **Returns:** `string | undefined`"
  ^js [comment]
  (.-contextValue ^js comment))

(defn set-context-value!
  "Context value of the comment. This can be used to contribute comment specific actions.
   For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
   using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
   ```json
   \"contributes\": {
   	\"menus\": {
   		\"comments/comment/title\": [
   			{
   				\"command\": \"extension.deleteComment\",
   				\"when\": \"comment == editable\"
   			}
   		]
   	}
   }
   ```
   This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`."
  ^js [comment value]
  (set! (.-contextValue ^js comment) value))

(defn reactions
  "Optional reactions of the {@link Comment }
   
   **Returns:** `CommentReaction[] | undefined`"
  ^js [comment]
  (.-reactions ^js comment))

(defn set-reactions!
  "Optional reactions of the {@link Comment }"
  ^js [comment value]
  (set! (.-reactions ^js comment) value))

(defn label
  "Optional label describing the {@link Comment }
   Label will be rendered next to authorName if exists.
   
   **Returns:** `string | undefined`"
  ^js [comment]
  (.-label ^js comment))

(defn set-label!
  "Optional label describing the {@link Comment }
   Label will be rendered next to authorName if exists."
  ^js [comment value]
  (set! (.-label ^js comment) value))

(defn timestamp
  "Optional timestamp that will be displayed in comments.
   The date will be formatted according to the user's locale and settings.
   
   **Returns:** `Date | undefined`"
  ^js [comment]
  (.-timestamp ^js comment))

(defn set-timestamp!
  "Optional timestamp that will be displayed in comments.
   The date will be formatted according to the user's locale and settings."
  ^js [comment value]
  (set! (.-timestamp ^js comment) value))
