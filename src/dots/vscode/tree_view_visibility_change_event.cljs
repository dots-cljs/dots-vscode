(ns dots.vscode.tree-view-visibility-change-event
  "The event that is fired when there is a change in {@link TreeView.visible tree view's visibility}")

(defn visible?
  "`true` if the {@link TreeView tree view} is visible otherwise `false`."
  ^js [tree-view-visibility-change-event]
  (.-visible ^js tree-view-visibility-change-event))
