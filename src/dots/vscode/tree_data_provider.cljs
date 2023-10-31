(ns dots.vscode.tree-data-provider
  "A data provider that provides tree data")

(defn on-did-change-tree-data
  "An optional event to signal that an element or root has changed.
   This will trigger the view to update the changed element/root and its children recursively (if shown).
   To signal that root has changed, do not pass any argument or pass `undefined` or `null`."
  (^js [tree-data-provider]
   (.-onDidChangeTreeData ^js tree-data-provider))
  (^js [tree-data-provider listener]
   (.onDidChangeTreeData ^js tree-data-provider listener))
  (^js [tree-data-provider listener this-args]
   (.onDidChangeTreeData ^js tree-data-provider listener this-args))
  (^js [tree-data-provider listener this-args disposables]
   (.onDidChangeTreeData ^js tree-data-provider listener this-args disposables)))

(defn set-on-did-change-tree-data!
  "An optional event to signal that an element or root has changed.
   This will trigger the view to update the changed element/root and its children recursively (if shown).
   To signal that root has changed, do not pass any argument or pass `undefined` or `null`."
  ^js [tree-data-provider value]
  (set! (.-onDidChangeTreeData ^js tree-data-provider) value))

(defn tree-item
  "Get {@link TreeItem } representation of the `element`"
  ^js [tree-data-provider element]
  (.getTreeItem ^js tree-data-provider element))

(defn children
  "Get the children of `element` or root if no element is passed."
  (^js [tree-data-provider]
   (.getChildren ^js tree-data-provider))
  (^js [tree-data-provider element]
   (.getChildren ^js tree-data-provider element)))

(defn parent
  "Optional method to return the parent of `element`.
   Return `null` or `undefined` if `element` is a child of root.
   
   **NOTE:** This method should be implemented in order to access {@link TreeView.reveal reveal} API."
  ^js [tree-data-provider element]
  (.getParent ^js tree-data-provider element))

(defn resolve-tree-item
  "Called on hover to resolve the {@link TreeItem.tooltip TreeItem} property if it is undefined.
   Called on tree item click/open to resolve the {@link TreeItem.command TreeItem} property if it is undefined.
   Only properties that were undefined can be resolved in `resolveTreeItem`.
   Functionality may be expanded later to include being called to resolve other missing
   properties on selection and/or on open.
   
   Will only ever be called once per TreeItem.
   
   onDidChangeTreeData should not be triggered from within resolveTreeItem.
   
   *Note* that this function is called when tree items are already showing in the UI.
   Because of that, no property that changes the presentation (label, description, etc.)
   can be changed."
  ^js [tree-data-provider item element token]
  (.resolveTreeItem ^js tree-data-provider item element token))
