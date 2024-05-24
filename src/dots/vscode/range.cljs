(ns dots.vscode.range
  "A range represents an ordered pair of two positions.
   It is guaranteed that {@link Range.start start}.isBeforeOrEqual({@link Range.end end})
   
   Range objects are __immutable__. Use the {@link Range. with with},
   {@link Range.intersection intersection}, or {@link Range.union union} methods
   to derive new ranges from an existing range."
  (:refer-clojure :exclude [contains? empty?]))

(defn start
  "The start position. It is before or equal to {@link Range.end end}.
   
   **Returns:** `Position`"
  ^js [range]
  (.-start ^js range))

(defn end
  "The end position. It is after or equal to {@link Range.start start}.
   
   **Returns:** `Position`"
  ^js [range]
  (.-end ^js range))

(defn empty?
  "`true` if `start` and `end` are equal.
   
   **Returns:** `boolean`"
  ^js [range]
  (.-isEmpty ^js range))

(defn set-is-empty!
  "`true` if `start` and `end` are equal."
  ^js [range value]
  (set! (.-isEmpty ^js range) value))

(defn single-line?
  "`true` if `start.line` and `end.line` are equal.
   
   **Returns:** `boolean`"
  ^js [range]
  (.-isSingleLine ^js range))

(defn set-is-single-line!
  "`true` if `start.line` and `end.line` are equal."
  ^js [range value]
  (set! (.-isSingleLine ^js range) value))

(defn contains?
  "Check if a position or a range is contained in this range.
   
   **Parameters:**
   - `position-or-range`: `Range | Position` - A position or a range.
   
   **Returns:** `boolean` - `true` if the position or range is inside or equal
   to this range."
  ^js [range position-or-range]
  (.contains ^js range position-or-range))

(defn equal?
  "Check if `other` equals this range.
   
   **Parameters:**
   - `other`: `Range` - A range.
   
   **Returns:** `boolean` - `true` when start and end are {@link Position.isEqualequal} to
   start and end of this range."
  ^js [range other]
  (.isEqual ^js range other))

(defn intersection
  "Intersect `range` with this range and returns a new range or `undefined`
   if the ranges have no overlap.
   
   **Parameters:**
   - `range`: `Range` - A range.
   
   **Returns:** `Range | undefined` - A range of the greater start and smaller end positions. Will
   return undefined when there is no overlap."
  ^js [this-range range]
  (.intersection ^js this-range range))

(defn union
  "Compute the union of `other` with this range.
   
   **Parameters:**
   - `other`: `Range` - A range.
   
   **Returns:** `Range` - A range of smaller start position and the greater end position."
  ^js [range other]
  (.union ^js range other))

(defn with
  "Derived a new range from this range.
   
   **Parameters:**
   - `change`: `{ start?: Position | undefined; end?: Position | undefined; }` - An object that describes a change to this range.
   - `start`: `Position | undefined` - A position that should be used as start. The default value is the {@link Range.start current start}.
   - `end`: `Position | undefined` - A position that should be used as end. The default value is the {@link Range.end current end}.
   
   **Returns:** `Range` - A range that reflects the given change. Will return `this` range if the change
   is not changing anything."
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
