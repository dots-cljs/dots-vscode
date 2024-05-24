(ns dots.vscode.tree-data-provider
  "A data provider that provides tree data")

(defn on-did-change-tree-data
  "An optional event to signal that an element or root has changed.
   This will trigger the view to update the changed element/root and its children recursively (if shown).
   To signal that root has changed, do not pass any argument or pass `undefined` or `null`.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
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
  "Get {@link TreeItem } representation of the `element`
   
   **Parameters:**
   - `element`: `T` - The element for which {@link TreeItem } representation is asked for.
   
   **Returns:** `TreeItem | Thenable<TreeItem>` - TreeItem representation of the element."
  ^js [tree-data-provider element]
  (.getTreeItem ^js tree-data-provider element))

(defn children
  "Get the children of `element` or root if no element is passed.
   
   **Parameters:**
   - `element`: `T | undefined` - The element from which the provider gets children. Can be `undefined`.
   
   **Returns:** `ProviderResult<T[]>` - Children of `element` or root if no element is passed."
  (^js [tree-data-provider]
   (.getChildren ^js tree-data-provider))
  (^js [tree-data-provider element]
   (.getChildren ^js tree-data-provider element)))

(defn parent
  "Optional method to return the parent of `element`.
   Return `null` or `undefined` if `element` is a child of root.
   
   **NOTE:** This method should be implemented in order to access {@link TreeView.reveal reveal} API.
   
   **Parameters:**
   - `element`: `T` - The element for which the parent has to be returned.
   
   **Returns:** `ProviderResult<T>` - Parent of `element`."
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
   can be changed.
   
   **Parameters:**
   - `item`: `TreeItem` - Undefined properties of `item` should be set then `item` should be returned.
   - `element`: `T` - The object associated with the TreeItem.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TreeItem>` - The resolved tree item or a thenable that resolves to such. It is OK to return the given
   `item`. When no result is returned, the given `item` will be used."
  ^js [tree-data-provider item element token]
  (.resolveTreeItem ^js tree-data-provider item element token))
