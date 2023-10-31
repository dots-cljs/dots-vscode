(ns dots.vscode.position
  "Represents a line and character position, such as
   the position of the cursor.
   
   Position objects are __immutable__. Use the {@link Position.with with} or
   {@link Position.translate translate} methods to derive new positions
   from an existing position.")

(defn line
  "The zero-based line value."
  ^js [position]
  (.-line ^js position))

(defn character
  "The zero-based character value."
  ^js [position]
  (.-character ^js position))

(defn before?
  "Check if this position is before `other`."
  ^js [position other]
  (.isBefore ^js position other))

(defn before-or-equal?
  "Check if this position is before or equal to `other`."
  ^js [position other]
  (.isBeforeOrEqual ^js position other))

(defn after?
  "Check if this position is after `other`."
  ^js [position other]
  (.isAfter ^js position other))

(defn after-or-equal?
  "Check if this position is after or equal to `other`."
  ^js [position other]
  (.isAfterOrEqual ^js position other))

(defn equal?
  "Check if this position is equal to `other`."
  ^js [position other]
  (.isEqual ^js position other))

(defn compare-to
  "Compare this to `other`."
  ^js [position other]
  (.compareTo ^js position other))

(defn translate
  "Create a new position relative to this position.
   Derived a new position relative to this position."
  {:arglists '([position]
               [position change]
               [position line-delta]
               [position line-delta character-delta])}
  (^js [position]
   (.translate ^js position))
  (^js [a b]
   (.translate ^js a b))
  (^js [position line-delta character-delta]
   (.translate ^js position line-delta character-delta)))

(defn with
  "Create a new position derived from this position.
   Derived a new position from this position."
  {:arglists '([position]
               [position change]
               [position line]
               [position line character])}
  (^js [position]
   (.with ^js position))
  (^js [a b]
   (.with ^js a b))
  (^js [position line character]
   (.with ^js position line character)))
