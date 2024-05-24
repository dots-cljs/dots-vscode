(ns dots.vscode.inline-value-text
  "Provide inline value as text."
  (:refer-clojure :exclude [range]))

(defn range
  "The document range for which the inline value applies.
   
   **Returns:** `Range`"
  ^js [inline-value-text]
  (.-range ^js inline-value-text))

(defn text
  "The text of the inline value.
   
   **Returns:** `string`"
  ^js [inline-value-text]
  (.-text ^js inline-value-text))
