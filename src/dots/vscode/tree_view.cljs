(ns dots.vscode.tree-view
  "Represents a Tree view")

(defn on-did-expand-element
  "Event that is fired when an element is expanded
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [tree-view]
   (.-onDidExpandElement ^js tree-view))
  (^js [tree-view listener]
   (.onDidExpandElement ^js tree-view listener))
  (^js [tree-view listener this-args]
   (.onDidExpandElement ^js tree-view listener this-args))
  (^js [tree-view listener this-args disposables]
   (.onDidExpandElement ^js tree-view listener this-args disposables)))

(defn on-did-collapse-element
  "Event that is fired when an element is collapsed
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [tree-view]
   (.-onDidCollapseElement ^js tree-view))
  (^js [tree-view listener]
   (.onDidCollapseElement ^js tree-view listener))
  (^js [tree-view listener this-args]
   (.onDidCollapseElement ^js tree-view listener this-args))
  (^js [tree-view listener this-args disposables]
   (.onDidCollapseElement ^js tree-view listener this-args disposables)))

(defn selection
  "Currently selected elements.
   
   **Returns:** `readonly T[]`"
  ^js [tree-view]
  (.-selection ^js tree-view))

(defn on-did-change-selection
  "Event that is fired when the {@link TreeView.selection selection} has changed
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [tree-view]
   (.-onDidChangeSelection ^js tree-view))
  (^js [tree-view listener]
   (.onDidChangeSelection ^js tree-view listener))
  (^js [tree-view listener this-args]
   (.onDidChangeSelection ^js tree-view listener this-args))
  (^js [tree-view listener this-args disposables]
   (.onDidChangeSelection ^js tree-view listener this-args disposables)))

(defn visible?
  "`true` if the {@link TreeView tree view} is visible otherwise `false`.
   
   **Returns:** `boolean`"
  ^js [tree-view]
  (.-visible ^js tree-view))

(defn on-did-change-visibility
  "Event that is fired when {@link TreeView.visible visibility} has changed
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [tree-view]
   (.-onDidChangeVisibility ^js tree-view))
  (^js [tree-view listener]
   (.onDidChangeVisibility ^js tree-view listener))
  (^js [tree-view listener this-args]
   (.onDidChangeVisibility ^js tree-view listener this-args))
  (^js [tree-view listener this-args disposables]
   (.onDidChangeVisibility ^js tree-view listener this-args disposables)))

(defn on-did-change-checkbox-state
  "An event to signal that an element or root has either been checked or unchecked.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [tree-view]
   (.-onDidChangeCheckboxState ^js tree-view))
  (^js [tree-view listener]
   (.onDidChangeCheckboxState ^js tree-view listener))
  (^js [tree-view listener this-args]
   (.onDidChangeCheckboxState ^js tree-view listener this-args))
  (^js [tree-view listener this-args disposables]
   (.onDidChangeCheckboxState ^js tree-view listener this-args disposables)))

(defn message
  "An optional human-readable message that will be rendered in the view.
   Setting the message to null, undefined, or empty string will remove the message from the view.
   
   **Returns:** `string | undefined`"
  ^js [tree-view]
  (.-message ^js tree-view))

(defn set-message!
  "An optional human-readable message that will be rendered in the view.
   Setting the message to null, undefined, or empty string will remove the message from the view."
  ^js [tree-view value]
  (set! (.-message ^js tree-view) value))

(defn title
  "The tree view title is initially taken from the extension package.json
   Changes to the title property will be properly reflected in the UI in the title of the view.
   
   **Returns:** `string | undefined`"
  ^js [tree-view]
  (.-title ^js tree-view))

(defn set-title!
  "The tree view title is initially taken from the extension package.json
   Changes to the title property will be properly reflected in the UI in the title of the view."
  ^js [tree-view value]
  (set! (.-title ^js tree-view) value))

(defn description
  "An optional human-readable description which is rendered less prominently in the title of the view.
   Setting the title description to null, undefined, or empty string will remove the description from the view.
   
   **Returns:** `string | undefined`"
  ^js [tree-view]
  (.-description ^js tree-view))

(defn set-description!
  "An optional human-readable description which is rendered less prominently in the title of the view.
   Setting the title description to null, undefined, or empty string will remove the description from the view."
  ^js [tree-view value]
  (set! (.-description ^js tree-view) value))

(defn badge
  "The badge to display for this TreeView.
   To remove the badge, set to undefined.
   
   **Returns:** `ViewBadge | undefined`"
  ^js [tree-view]
  (.-badge ^js tree-view))

(defn set-badge!
  "The badge to display for this TreeView.
   To remove the badge, set to undefined."
  ^js [tree-view value]
  (set! (.-badge ^js tree-view) value))

(defn reveal
  "Reveals the given element in the tree view.
   If the tree view is not visible then the tree view is shown and element is revealed.
   
   By default revealed element is selected.
   In order to not to select, set the option `select` to `false`.
   In order to focus, set the option `focus` to `true`.
   In order to expand the revealed element, set the option `expand` to `true`. To expand recursively set `expand` to the number of levels to expand.
   
   * *NOTE:* You can expand only to 3 levels maximum.
   * *NOTE:* The {@link TreeDataProvider } that the `TreeView` {@link window.createTreeView is registered with} with must implement {@link TreeDataProvider.getParent getParent} method to access this API.
   
   **Parameters:**
   - `element`: `T`
   - `options`: `{ select?: boolean | undefined; focus?: boolean | undefined; expand?: number | boolean | undefined; } | undefined`
   
   **Returns:** `Thenable<void>`"
  (^js [tree-view element]
   (.reveal ^js tree-view element))
  (^js [tree-view element options]
   (.reveal ^js tree-view element options)))

(defn dispose
  "Dispose this object.
   
   **Returns:** `any`"
  ^js [tree-view]
  (.dispose ^js tree-view))
