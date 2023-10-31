(ns dots.vscode.range
  "A range represents an ordered pair of two positions.
   It is guaranteed that {@link Range.start start}.isBeforeOrEqual({@link Range.end end})
   
   Range objects are __immutable__. Use the {@link Range.with with},
   {@link Range.intersection intersection}, or {@link Range.union union} methods
   to derive new ranges from an existing range."
  (:refer-clojure :exclude [contains? empty?]))

(defn start
  "The start position. It is before or equal to {@link Range.end end}."
  ^js [range]
  (.-start ^js range))

(defn end
  "The end position. It is after or equal to {@link Range.start start}."
  ^js [range]
  (.-end ^js range))

(defn empty?
  "`true` if `start` and `end` are equal."
  ^js [range]
  (.-isEmpty ^js range))

(defn set-is-empty!
  "`true` if `start` and `end` are equal."
  ^js [range value]
  (set! (.-isEmpty ^js range) value))

(defn single-line?
  "`true` if `start.line` and `end.line` are equal."
  ^js [range]
  (.-isSingleLine ^js range))

(defn set-is-single-line!
  "`true` if `start.line` and `end.line` are equal."
  ^js [range value]
  (set! (.-isSingleLine ^js range) value))

(defn contains?
  "Check if a position or a range is contained in this range."
  ^js [range position-or-range]
  (.contains ^js range position-or-range))

(defn equal?
  "Check if `other` equals this range."
  ^js [range other]
  (.isEqual ^js range other))

(defn intersection
  "Intersect `range` with this range and returns a new range or `undefined`
   if the ranges have no overlap."
  ^js [this-range range]
  (.intersection ^js this-range range))

(defn union
  "Compute the union of `other` with this range."
  ^js [range other]
  (.union ^js range other))

(defn with
  "Derived a new range from this range."
  {:arglists '([range]
               [range change]
               [range start]
               [range start end])}
  (^js [range]
   (.with ^js range))
  (^js [a b]
   (.with ^js a b))
  (^js [range start end]
   (.with ^js range start end)))
