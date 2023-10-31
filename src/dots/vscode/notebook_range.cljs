(ns dots.vscode.notebook-range
  "A notebook range represents an ordered pair of two cell indices.
   It is guaranteed that start is less than or equal to end."
  (:refer-clojure :exclude [empty?]))

(defn start
  "The zero-based start index of this range."
  ^js [notebook-range]
  (.-start ^js notebook-range))

(defn end
  "The exclusive end index of this range (zero-based)."
  ^js [notebook-range]
  (.-end ^js notebook-range))

(defn empty?
  "`true` if `start` and `end` are equal."
  ^js [notebook-range]
  (.-isEmpty ^js notebook-range))

(defn with
  "Derive a new range for this range."
  ^js [notebook-range change]
  (.with ^js notebook-range change))
