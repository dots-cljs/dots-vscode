(ns dots.vscode.quick-pick-item-button-event
  "An event signaling when a button in a particular {@link QuickPickItem } was triggered.
   This event does not fire for buttons in the title bar.")

(defn button
  "The button that was clicked.
   
   **Returns:** `QuickInputButton`"
  ^js [quick-pick-item-button-event]
  (.-button ^js quick-pick-item-button-event))

(defn item
  "The item that the button belongs to.
   
   **Returns:** `T`"
  ^js [quick-pick-item-button-event]
  (.-item ^js quick-pick-item-button-event))
