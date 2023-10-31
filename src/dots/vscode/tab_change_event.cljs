(ns dots.vscode.tab-change-event
  "An event describing change to tabs.")

(defn opened
  "The tabs that have been opened."
  ^js [tab-change-event]
  (.-opened ^js tab-change-event))

(defn closed
  "The tabs that have been closed."
  ^js [tab-change-event]
  (.-closed ^js tab-change-event))

(defn changed
  "Tabs that have changed, e.g have changed
   their {@link Tab.isActive active} state."
  ^js [tab-change-event]
  (.-changed ^js tab-change-event))
