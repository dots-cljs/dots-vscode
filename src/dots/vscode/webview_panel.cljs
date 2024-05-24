(ns dots.vscode.webview-panel
  "A panel that contains a webview.")

(defn view-type
  "Identifies the type of the webview panel, such as `'markdown.preview'`."
  ^js [webview-panel]
  (.-viewType ^js webview-panel))

(defn title
  "Title of the panel shown in UI."
  ^js [webview-panel]
  (.-title ^js webview-panel))

(defn set-title!
  "Title of the panel shown in UI."
  ^js [webview-panel value]
  (set! (.-title ^js webview-panel) value))

(defn icon-path
  "Icon for the panel shown in UI."
  ^js [webview-panel]
  (.-iconPath ^js webview-panel))

(defn set-icon-path!
  "Icon for the panel shown in UI."
  ^js [webview-panel value]
  (set! (.-iconPath ^js webview-panel) value))

(defn webview
  "{@linkcode Webview } belonging to the panel."
  ^js [webview-panel]
  (.-webview ^js webview-panel))

(defn options
  "Content settings for the webview panel."
  ^js [webview-panel]
  (.-options ^js webview-panel))

(defn view-column
  "Editor position of the panel. This property is only set if the webview is in
   one of the editor view columns."
  ^js [webview-panel]
  (.-viewColumn ^js webview-panel))

(defn active?
  "Whether the panel is active (focused by the user)."
  ^js [webview-panel]
  (.-active ^js webview-panel))

(defn visible?
  "Whether the panel is visible."
  ^js [webview-panel]
  (.-visible ^js webview-panel))

(defn on-did-change-view-state
  "Fired when the panel's view state changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [webview-panel]
   (.-onDidChangeViewState ^js webview-panel))
  (^js [webview-panel listener]
   (.onDidChangeViewState ^js webview-panel listener))
  (^js [webview-panel listener this-args]
   (.onDidChangeViewState ^js webview-panel listener this-args))
  (^js [webview-panel listener this-args disposables]
   (.onDidChangeViewState ^js webview-panel listener this-args disposables)))

(defn on-did-dispose
  "Fired when the panel is disposed.
   
   This may be because the user closed the panel or because `.dispose()` was
   called on it.
   
   Trying to use the panel after it has been disposed throws an exception.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [webview-panel]
   (.-onDidDispose ^js webview-panel))
  (^js [webview-panel listener]
   (.onDidDispose ^js webview-panel listener))
  (^js [webview-panel listener this-args]
   (.onDidDispose ^js webview-panel listener this-args))
  (^js [webview-panel listener this-args disposables]
   (.onDidDispose ^js webview-panel listener this-args disposables)))

(defn reveal
  "Show the webview panel in a given column.
   
   A webview panel may only show in a single column at a time. If it is already showing, this
   method moves it to a new column.
   
   **Parameters:**
   - `view-column`: `ViewColumn | undefined` - View column to show the panel in. Shows in the current `viewColumn` if undefined.
   - `preserve-focus?`: `boolean | undefined` - When `true`, the webview will not take focus.
   
   **Returns:** `void`"
  (^js [webview-panel]
   (.reveal ^js webview-panel))
  (^js [webview-panel view-column]
   (.reveal ^js webview-panel view-column))
  (^js [webview-panel view-column preserve-focus?]
   (.reveal ^js webview-panel view-column preserve-focus?)))

(defn dispose
  "Dispose of the webview panel.
   
   This closes the panel if it showing and disposes of the resources owned by the webview.
   Webview panels are also disposed when the user closes the webview panel. Both cases
   fire the `onDispose` event.
   
   **Returns:** `any`"
  ^js [webview-panel]
  (.dispose ^js webview-panel))
