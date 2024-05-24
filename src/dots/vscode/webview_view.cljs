(ns dots.vscode.webview-view
  "A webview based view.")

(defn view-type
  "Identifies the type of the webview view, such as `'hexEditor.dataView'`.
   
   **Returns:** `string`"
  ^js [webview-view]
  (.-viewType ^js webview-view))

(defn webview
  "The underlying webview for the view.
   
   **Returns:** `Webview`"
  ^js [webview-view]
  (.-webview ^js webview-view))

(defn title
  "View title displayed in the UI.
   
   The view title is initially taken from the extension `package.json` contribution.
   
   **Returns:** `string | undefined`"
  ^js [webview-view]
  (.-title ^js webview-view))

(defn set-title!
  "View title displayed in the UI.
   
   The view title is initially taken from the extension `package.json` contribution."
  ^js [webview-view value]
  (set! (.-title ^js webview-view) value))

(defn description
  "Human-readable string which is rendered less prominently in the title.
   
   **Returns:** `string | undefined`"
  ^js [webview-view]
  (.-description ^js webview-view))

(defn set-description!
  "Human-readable string which is rendered less prominently in the title."
  ^js [webview-view value]
  (set! (.-description ^js webview-view) value))

(defn badge
  "The badge to display for this webview view.
   To remove the badge, set to undefined.
   
   **Returns:** `ViewBadge | undefined`"
  ^js [webview-view]
  (.-badge ^js webview-view))

(defn set-badge!
  "The badge to display for this webview view.
   To remove the badge, set to undefined."
  ^js [webview-view value]
  (set! (.-badge ^js webview-view) value))

(defn on-did-dispose
  "Event fired when the view is disposed.
   
   Views are disposed when they are explicitly hidden by a user (this happens when a user
   right clicks in a view and unchecks the webview view).
   
   Trying to use the view after it has been disposed throws an exception.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [webview-view]
   (.-onDidDispose ^js webview-view))
  (^js [webview-view listener]
   (.onDidDispose ^js webview-view listener))
  (^js [webview-view listener this-args]
   (.onDidDispose ^js webview-view listener this-args))
  (^js [webview-view listener this-args disposables]
   (.onDidDispose ^js webview-view listener this-args disposables)))

(defn visible?
  "Tracks if the webview is currently visible.
   
   Views are visible when they are on the screen and expanded.
   
   **Returns:** `boolean`"
  ^js [webview-view]
  (.-visible ^js webview-view))

(defn on-did-change-visibility
  "Event fired when the visibility of the view changes.
   
   Actions that trigger a visibility change:
   
   - The view is collapsed or expanded.
   - The user switches to a different view group in the sidebar or panel.
   
   Note that hiding a view using the context menu instead disposes of the view and fires `onDidDispose`.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [webview-view]
   (.-onDidChangeVisibility ^js webview-view))
  (^js [webview-view listener]
   (.onDidChangeVisibility ^js webview-view listener))
  (^js [webview-view listener this-args]
   (.onDidChangeVisibility ^js webview-view listener this-args))
  (^js [webview-view listener this-args disposables]
   (.onDidChangeVisibility ^js webview-view listener this-args disposables)))

(defn show
  "Reveal the view in the UI.
   
   If the view is collapsed, this will expand it.
   
   **Parameters:**
   - `preserve-focus?`: `boolean | undefined` - When `true` the view will not take focus.
   
   **Returns:** `void`"
  (^js [webview-view]
   (.show ^js webview-view))
  (^js [webview-view preserve-focus?]
   (.show ^js webview-view preserve-focus?)))
