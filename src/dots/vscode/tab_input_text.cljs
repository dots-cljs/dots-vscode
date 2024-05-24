(ns dots.vscode.tab-input-text
  "The tab represents a single text based resource.")

(defn uri
  "The uri represented by the tab.
   
   **Returns:** `Uri`"
  ^js [tab-input-text]
  (.-uri ^js tab-input-text))
