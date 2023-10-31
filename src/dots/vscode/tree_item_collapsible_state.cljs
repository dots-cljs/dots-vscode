(ns dots.vscode.tree-item-collapsible-state
  "Collapsible state of the tree item"
  (:require ["vscode" :as vscode]))

(def none
  "Determines an item can be neither collapsed nor expanded. Implies it has no children."
  (.-None vscode/TreeItemCollapsibleState))

(def collapsed
  "Determines an item is collapsed"
  (.-Collapsed vscode/TreeItemCollapsibleState))

(def expanded
  "Determines an item is expanded"
  (.-Expanded vscode/TreeItemCollapsibleState))
