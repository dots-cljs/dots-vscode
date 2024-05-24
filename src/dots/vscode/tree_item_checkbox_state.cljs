(ns dots.vscode.tree-item-checkbox-state
  "Checkbox state of the tree item"
  (:require ["vscode" :as vscode]))

(def unchecked
  "Determines an item is unchecked"
  (.-Unchecked vscode/TreeItemCheckboxState))

(def checked
  "Determines an item is checked"
  (.-Checked vscode/TreeItemCheckboxState))
