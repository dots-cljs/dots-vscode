(ns dots.vscode.linked-editing-ranges
  "Represents a list of ranges that can be edited together along with a word pattern to describe valid range contents.")

(defn ranges
  "A list of ranges that can be edited together. The ranges must have
   identical length and text content. The ranges cannot overlap.
   
   **Returns:** `Range[]`"
  ^js [linked-editing-ranges]
  (.-ranges ^js linked-editing-ranges))

(defn word-pattern
  "An optional word pattern that describes valid contents for the given ranges.
   If no pattern is provided, the language configuration's word pattern will be used.
   
   **Returns:** `RegExp | undefined`"
  ^js [linked-editing-ranges]
  (.-wordPattern ^js linked-editing-ranges))
