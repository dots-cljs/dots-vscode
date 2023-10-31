(ns dots.vscode.selection
  "Represents a text selection in an editor."
  (:refer-clojure :exclude [contains? empty?]))

(defn anchor
  "The position at which the selection starts.
   This position might be before or after {@link Selection.active active}."
  ^js [selection]
  (.-anchor ^js selection))

(defn set-anchor!
  "The position at which the selection starts.
   This position might be before or after {@link Selection.active active}."
  ^js [selection value]
  (set! (.-anchor ^js selection) value))

(defn active
  "The position of the cursor.
   This position might be before or after {@link Selection.anchor anchor}."
  ^js [selection]
  (.-active ^js selection))

(defn set-active!
  "The position of the cursor.
   This position might be before or after {@link Selection.anchor anchor}."
  ^js [selection value]
  (set! (.-active ^js selection) value))

(defn reversed?
  "A selection is reversed if its {@link Selection.anchor anchor} is the {@link Selection.end end} position."
  ^js [selection]
  (.-isReversed ^js selection))

(defn set-is-reversed!
  "A selection is reversed if its {@link Selection.anchor anchor} is the {@link Selection.end end} position."
  ^js [selection value]
  (set! (.-isReversed ^js selection) value))

(defn start
  "The start position. It is before or equal to {@link Range.end end}."
  ^js [selection]
  (.-start ^js selection))

(defn end
  "The end position. It is after or equal to {@link Range.start start}."
  ^js [selection]
  (.-end ^js selection))

(defn empty?
  "`true` if `start` and `end` are equal."
  ^js [selection]
  (.-isEmpty ^js selection))

(defn set-is-empty!
  "`true` if `start` and `end` are equal."
  ^js [selection value]
  (set! (.-isEmpty ^js selection) value))

(defn single-line?
  "`true` if `start.line` and `end.line` are equal."
  ^js [selection]
  (.-isSingleLine ^js selection))

(defn set-is-single-line!
  "`true` if `start.line` and `end.line` are equal."
  ^js [selection value]
  (set! (.-isSingleLine ^js selection) value))

(defn contains?
  "Check if a position or a range is contained in this range."
  ^js [selection position-or-range]
  (.contains ^js selection position-or-range))

(defn equal?
  "Check if `other` equals this range."
  ^js [selection other]
  (.isEqual ^js selection other))

(defn intersection
  "Intersect `range` with this range and returns a new range or `undefined`
   if the ranges have no overlap."
  ^js [selection range]
  (.intersection ^js selection range))

(defn union
  "Compute the union of `other` with this range."
  ^js [selection other]
  (.union ^js selection other))

(defn with
  "Derived a new range from this range."
  {:arglists '([selection]
               [selection change]
               [selection start]
               [selection start end])}
  (^js [selection]
   (.with ^js selection))
  (^js [a b]
   (.with ^js a b))
  (^js [selection start end]
   (.with ^js selection start end)))
