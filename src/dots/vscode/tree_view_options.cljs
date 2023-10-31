(ns dots.vscode.tree-view-options
  "Options for creating a {@link TreeView }")

(defn tree-data-provider
  "A data provider that provides tree data."
  ^js [tree-view-options]
  (.-treeDataProvider ^js tree-view-options))

(defn set-tree-data-provider!
  "A data provider that provides tree data."
  ^js [tree-view-options value]
  (set! (.-treeDataProvider ^js tree-view-options) value))

(defn show-collapse-all?
  "Whether to show collapse all action or not."
  ^js [tree-view-options]
  (.-showCollapseAll ^js tree-view-options))

(defn set-show-collapse-all!
  "Whether to show collapse all action or not."
  ^js [tree-view-options value]
  (set! (.-showCollapseAll ^js tree-view-options) value))

(defn can-select-many?
  "Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
   the first argument to the command is the tree item that the command was executed on and the second argument is an
   array containing all selected tree items."
  ^js [tree-view-options]
  (.-canSelectMany ^js tree-view-options))

(defn set-can-select-many!
  "Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
   the first argument to the command is the tree item that the command was executed on and the second argument is an
   array containing all selected tree items."
  ^js [tree-view-options value]
  (set! (.-canSelectMany ^js tree-view-options) value))

(defn drag-and-drop-controller
  "An optional interface to implement drag and drop in the tree view."
  ^js [tree-view-options]
  (.-dragAndDropController ^js tree-view-options))

(defn set-drag-and-drop-controller!
  "An optional interface to implement drag and drop in the tree view."
  ^js [tree-view-options value]
  (set! (.-dragAndDropController ^js tree-view-options) value))
