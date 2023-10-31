(ns dots.vscode.tab-groups
  "Represents the main editor area which consists of multple groups which contain tabs.")

(defn all
  "All the groups within the group container."
  ^js [tab-groups]
  (.-all ^js tab-groups))

(defn active-tab-group
  "The currently active group."
  ^js [tab-groups]
  (.-activeTabGroup ^js tab-groups))

(defn on-did-change-tab-groups
  "An {@link Event event} which fires when {@link TabGroup tab groups} have changed."
  (^js [tab-groups]
   (.-onDidChangeTabGroups ^js tab-groups))
  (^js [tab-groups listener]
   (.onDidChangeTabGroups ^js tab-groups listener))
  (^js [tab-groups listener this-args]
   (.onDidChangeTabGroups ^js tab-groups listener this-args))
  (^js [tab-groups listener this-args disposables]
   (.onDidChangeTabGroups ^js tab-groups listener this-args disposables)))

(defn on-did-change-tabs
  "An {@link Event event} which fires when {@link Tab tabs} have changed."
  (^js [tab-groups]
   (.-onDidChangeTabs ^js tab-groups))
  (^js [tab-groups listener]
   (.onDidChangeTabs ^js tab-groups listener))
  (^js [tab-groups listener this-args]
   (.onDidChangeTabs ^js tab-groups listener this-args))
  (^js [tab-groups listener this-args disposables]
   (.onDidChangeTabs ^js tab-groups listener this-args disposables)))

(defn close
  "Closes the tab. This makes the tab object invalid and the tab
   should no longer be used for further actions.
   Note: In the case of a dirty tab, a confirmation dialog will be shown which may be cancelled. If cancelled the tab is still valid
   Closes the tab group. This makes the tab group object invalid and the tab group
   should no longer be used for further actions."
  {:arglists '([tab-groups tab]
               [tab-groups tab preserve-focus?]
               [tab-groups tab-group]
               [tab-groups tab-group preserve-focus?])}
  (^js [a b]
   (.close ^js a b))
  (^js [a b c]
   (.close ^js a b c)))
