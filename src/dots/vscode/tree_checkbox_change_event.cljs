(ns dots.vscode.tree-checkbox-change-event
  "An event describing the change in a tree item's checkbox state.")

(defn items
  "The items that were checked or unchecked."
  ^js [tree-checkbox-change-event]
  (.-items ^js tree-checkbox-change-event))
