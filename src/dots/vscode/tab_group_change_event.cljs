(ns dots.vscode.tab-group-change-event
  "An event describing changes to tab groups.")

(defn opened
  "Tab groups that have been opened.
   
   **Returns:** `readonly TabGroup[]`"
  ^js [tab-group-change-event]
  (.-opened ^js tab-group-change-event))

(defn closed
  "Tab groups that have been closed.
   
   **Returns:** `readonly TabGroup[]`"
  ^js [tab-group-change-event]
  (.-closed ^js tab-group-change-event))

(defn changed
  "Tab groups that have changed, e.g have changed
   their {@link TabGroup.isActive active} state.
   
   **Returns:** `readonly TabGroup[]`"
  ^js [tab-group-change-event]
  (.-changed ^js tab-group-change-event))
