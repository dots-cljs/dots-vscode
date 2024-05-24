(ns dots.vscode.notebook-cell-status-bar-item-provider
  "A provider that can contribute items to the status bar that appears below a cell's editor.")

(defn on-did-change-cell-status-bar-items
  "An optional event to signal that statusbar items have changed. The provide method will be called again.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [notebook-cell-status-bar-item-provider]
   (.-onDidChangeCellStatusBarItems ^js notebook-cell-status-bar-item-provider))
  (^js [notebook-cell-status-bar-item-provider listener]
   (.onDidChangeCellStatusBarItems ^js notebook-cell-status-bar-item-provider listener))
  (^js [notebook-cell-status-bar-item-provider listener this-args]
   (.onDidChangeCellStatusBarItems ^js notebook-cell-status-bar-item-provider listener this-args))
  (^js [notebook-cell-status-bar-item-provider listener this-args disposables]
   (.onDidChangeCellStatusBarItems ^js notebook-cell-status-bar-item-provider listener this-args disposables)))

(defn set-on-did-change-cell-status-bar-items!
  "An optional event to signal that statusbar items have changed. The provide method will be called again."
  ^js [notebook-cell-status-bar-item-provider value]
  (set! (.-onDidChangeCellStatusBarItems ^js notebook-cell-status-bar-item-provider) value))

(defn provide-cell-status-bar-items
  "The provider will be called when the cell scrolls into view, when its content, outputs, language, or metadata change, and when it changes execution state.
   
   **Parameters:**
   - `cell`: `NotebookCell` - The cell for which to return items.
   - `token`: `CancellationToken` - A token triggered if this request should be cancelled.
   
   **Returns:** `ProviderResult<NotebookCellStatusBarItem | NotebookCellStatusBarItem[]>` - One or more {@link NotebookCellStatusBarItemcell statusbar items}"
  ^js [notebook-cell-status-bar-item-provider cell token]
  (.provideCellStatusBarItems ^js notebook-cell-status-bar-item-provider cell token))
