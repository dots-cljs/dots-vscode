(ns dots.vscode.tree-view-expansion-event
  "The event that is fired when an element in the {@link TreeView } is expanded or collapsed")

(defn element
  "Element that is expanded or collapsed."
  ^js [tree-view-expansion-event]
  (.-element ^js tree-view-expansion-event))
