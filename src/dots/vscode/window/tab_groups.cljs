(ns dots.vscode.window.tab-groups
  "Represents the grid widget within the main editor area"
  (:require ["vscode" :as vscode]))

(defn all
  "All the groups within the group container."
  ^js []
  (.. vscode/window -tabGroups -all))

(defn active-tab-group
  "The currently active group."
  ^js []
  (.. vscode/window -tabGroups -activeTabGroup))

(defn on-did-change-tab-groups
  "An {@link Event event} which fires when {@link TabGroup tab groups} have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.. vscode/window -tabGroups -onDidChangeTabGroups))
  (^js [listener]
   (.. vscode/window -tabGroups (onDidChangeTabGroups listener)))
  (^js [listener this-args]
   (.. vscode/window -tabGroups (onDidChangeTabGroups listener this-args)))
  (^js [listener this-args disposables]
   (.. vscode/window -tabGroups (onDidChangeTabGroups listener this-args disposables))))

(defn on-did-change-tabs
  "An {@link Event event} which fires when {@link Tab tabs} have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.. vscode/window -tabGroups -onDidChangeTabs))
  (^js [listener]
   (.. vscode/window -tabGroups (onDidChangeTabs listener)))
  (^js [listener this-args]
   (.. vscode/window -tabGroups (onDidChangeTabs listener this-args)))
  (^js [listener this-args disposables]
   (.. vscode/window -tabGroups (onDidChangeTabs listener this-args disposables))))

(defn close
  "Closes the tab. This makes the tab object invalid and the tab
   should no longer be used for further actions.
   Note: In the case of a dirty tab, a confirmation dialog will be shown which may be cancelled. If cancelled the tab is still valid
   Closes the tab group. This makes the tab group object invalid and the tab group
   should no longer be used for further actions.
   
   **Parameters:**
   - `tab`: `Tab | readonly Tab[]` - The tab to close.
   - `tab-group`: `TabGroup | readonly TabGroup[]` - The tab group to close.
   - `preserve-focus?`: `boolean | undefined` - When `true` focus will remain in its current position.
   
   **Returns:** `Thenable<boolean>` - A promise that resolves to `true` when all tab groups have been closed."
  {:arglists '([tab]
               [tab preserve-focus?]
               [tab-group]
               [tab-group preserve-focus?])}
  (^js [a]
   (.. vscode/window -tabGroups (close a)))
  (^js [a b]
   (.. vscode/window -tabGroups (close a b))))
