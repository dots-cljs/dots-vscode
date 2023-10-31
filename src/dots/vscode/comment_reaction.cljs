(ns dots.vscode.comment-reaction
  "Reactions of a {@link Comment }"
  (:refer-clojure :exclude [count]))

(defn label
  "The human-readable label for the reaction"
  ^js [comment-reaction]
  (.-label ^js comment-reaction))

(defn icon-path
  "Icon for the reaction shown in UI."
  ^js [comment-reaction]
  (.-iconPath ^js comment-reaction))

(defn count
  "The number of users who have reacted to this reaction"
  ^js [comment-reaction]
  (.-count ^js comment-reaction))

(defn author-has-reacted?
  "Whether the {@link CommentAuthorInformation author} of the comment has reacted to this reaction"
  ^js [comment-reaction]
  (.-authorHasReacted ^js comment-reaction))
