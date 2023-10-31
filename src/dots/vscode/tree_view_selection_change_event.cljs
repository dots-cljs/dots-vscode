(ns dots.vscode.tree-view-selection-change-event
  "The event that is fired when there is a change in {@link TreeView.selection tree view's selection}")

(defn selection
  "Selected elements."
  ^js [tree-view-selection-change-event]
  (.-selection ^js tree-view-selection-change-event))
