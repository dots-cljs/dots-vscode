(ns dots.vscode.tab-input-custom
  "The tab represents a custom editor.")

(defn uri
  "The uri that the tab is representing.
   
   **Returns:** `Uri`"
  ^js [tab-input-custom]
  (.-uri ^js tab-input-custom))

(defn view-type
  "The type of custom editor.
   
   **Returns:** `string`"
  ^js [tab-input-custom]
  (.-viewType ^js tab-input-custom))
