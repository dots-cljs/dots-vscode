(ns dots.vscode.tab-input-text-diff
  "The tab represents two text based resources
   being rendered as a diff.")

(defn original
  "The uri of the original text resource.
   
   **Returns:** `Uri`"
  ^js [tab-input-text-diff]
  (.-original ^js tab-input-text-diff))

(defn modified
  "The uri of the modified text resource.
   
   **Returns:** `Uri`"
  ^js [tab-input-text-diff]
  (.-modified ^js tab-input-text-diff))
