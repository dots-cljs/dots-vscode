(ns dots.vscode.color-information
  "Represents a color range from a document."
  (:refer-clojure :exclude [range]))

(defn range
  "The range in the document where this color appears.
   
   **Returns:** `Range`"
  ^js [color-information]
  (.-range ^js color-information))

(defn set-range!
  "The range in the document where this color appears."
  ^js [color-information value]
  (set! (.-range ^js color-information) value))

(defn color
  "The actual color value for this color range.
   
   **Returns:** `Color`"
  ^js [color-information]
  (.-color ^js color-information))

(defn set-color!
  "The actual color value for this color range."
  ^js [color-information value]
  (set! (.-color ^js color-information) value))
