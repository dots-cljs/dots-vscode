(ns dots.vscode.selection-range
  "A selection range represents a part of a selection hierarchy. A selection range
   may have a parent selection range that contains it."
  (:refer-clojure :exclude [range]))

(defn range
  "The {@link Range } of this selection range.
   
   **Returns:** `Range`"
  ^js [selection-range]
  (.-range ^js selection-range))

(defn set-range!
  "The {@link Range } of this selection range."
  ^js [selection-range value]
  (set! (.-range ^js selection-range) value))

(defn parent
  "The parent selection range containing this range.
   
   **Returns:** `SelectionRange | undefined`"
  ^js [selection-range]
  (.-parent ^js selection-range))

(defn set-parent!
  "The parent selection range containing this range."
  ^js [selection-range value]
  (set! (.-parent ^js selection-range) value))
