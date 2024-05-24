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

(defn manage-checkbox-state-manually?
  "By default, when the children of a tree item have already been fetched, child checkboxes are automatically managed based on the checked state of the parent tree item.
   If the tree item is collapsed by default (meaning that the children haven't yet been fetched) then child checkboxes will not be updated.
   To override this behavior and manage child and parent checkbox state in the extension, set this to `true`.
   
   Examples where {@link TreeViewOptions.manageCheckboxStateManually } is false, the default behavior:
   
   1. A tree item is checked, then its children are fetched. The children will be checked.
   
   2. A tree item's parent is checked. The tree item and all of it's siblings will be checked.
     - [ ] Parent
       - [ ] Child 1
       - [ ] Child 2
     When the user checks Parent, the tree will look like this:
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
   
   3. A tree item and all of it's siblings are checked. The parent will be checked.
     - [ ] Parent
       - [ ] Child 1
       - [ ] Child 2
     When the user checks Child 1 and Child 2, the tree will look like this:
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
   
   4. A tree item is unchecked. The parent will be unchecked.
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
     When the user unchecks Child 1, the tree will look like this:
     - [ ] Parent
       - [ ] Child 1
       - [x] Child 2"
  ^js [tree-view-options]
  (.-manageCheckboxStateManually ^js tree-view-options))

(defn set-manage-checkbox-state-manually!
  "By default, when the children of a tree item have already been fetched, child checkboxes are automatically managed based on the checked state of the parent tree item.
   If the tree item is collapsed by default (meaning that the children haven't yet been fetched) then child checkboxes will not be updated.
   To override this behavior and manage child and parent checkbox state in the extension, set this to `true`.
   
   Examples where {@link TreeViewOptions.manageCheckboxStateManually } is false, the default behavior:
   
   1. A tree item is checked, then its children are fetched. The children will be checked.
   
   2. A tree item's parent is checked. The tree item and all of it's siblings will be checked.
     - [ ] Parent
       - [ ] Child 1
       - [ ] Child 2
     When the user checks Parent, the tree will look like this:
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
   
   3. A tree item and all of it's siblings are checked. The parent will be checked.
     - [ ] Parent
       - [ ] Child 1
       - [ ] Child 2
     When the user checks Child 1 and Child 2, the tree will look like this:
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
   
   4. A tree item is unchecked. The parent will be unchecked.
     - [x] Parent
       - [x] Child 1
       - [x] Child 2
     When the user unchecks Child 1, the tree will look like this:
     - [ ] Parent
       - [ ] Child 1
       - [x] Child 2"
  ^js [tree-view-options value]
  (set! (.-manageCheckboxStateManually ^js tree-view-options) value))
