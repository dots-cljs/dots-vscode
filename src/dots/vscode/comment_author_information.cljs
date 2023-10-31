(ns dots.vscode.comment-author-information
  "Author information of a {@link Comment }"
  (:refer-clojure :exclude [name]))

(defn name
  "The display name of the author of the comment"
  ^js [comment-author-information]
  (.-name ^js comment-author-information))

(defn set-name!
  "The display name of the author of the comment"
  ^js [comment-author-information value]
  (set! (.-name ^js comment-author-information) value))

(defn icon-path
  "The optional icon path for the author"
  ^js [comment-author-information]
  (.-iconPath ^js comment-author-information))

(defn set-icon-path!
  "The optional icon path for the author"
  ^js [comment-author-information value]
  (set! (.-iconPath ^js comment-author-information) value))
