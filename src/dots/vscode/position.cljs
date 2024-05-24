(ns dots.vscode.position
  "Represents a line and character position, such as
   the position of the cursor.
   
   Position objects are __immutable__. Use the {@link Position. with with} or
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
  "Check if this position is before `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `boolean` - `true` if position is on a smaller line
   or on the same line on a smaller character."
  ^js [position other]
  (.isBefore ^js position other))

(defn before-or-equal?
  "Check if this position is before or equal to `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `boolean` - `true` if position is on a smaller line
   or on the same line on a smaller or equal character."
  ^js [position other]
  (.isBeforeOrEqual ^js position other))

(defn after?
  "Check if this position is after `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `boolean` - `true` if position is on a greater line
   or on the same line on a greater character."
  ^js [position other]
  (.isAfter ^js position other))

(defn after-or-equal?
  "Check if this position is after or equal to `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `boolean` - `true` if position is on a greater line
   or on the same line on a greater or equal character."
  ^js [position other]
  (.isAfterOrEqual ^js position other))

(defn equal?
  "Check if this position is equal to `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `boolean` - `true` if the line and character of the given position are equal to
   the line and character of this position."
  ^js [position other]
  (.isEqual ^js position other))

(defn compare-to
  "Compare this to `other`.
   
   **Parameters:**
   - `other`: `Position` - A position.
   
   **Returns:** `number` - A number smaller than zero if this position is before the given position,
   a number greater than zero if this position is after the given position, or zero when
   this and the given position are equal."
  ^js [position other]
  (.compareTo ^js position other))

(defn translate
  "Create a new position relative to this position.
   Derived a new position relative to this position.
   
   **Parameters:**
   - `change`: `{ lineDelta?: number | undefined; characterDelta?: number | undefined; }` - An object that describes a delta to this position.
   - `line-delta`: `number | undefined` - Delta value for the line value, default is `0`.
   - `character-delta`: `number | undefined` - Delta value for the character value, default is `0`.
   
   **Returns:** `Position` - A position that reflects the given delta. Will return `this` position if the change
   is not changing anything."
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
   Derived a new position from this position.
   
   **Parameters:**
   - `change`: `{ line?: number | undefined; character?: number | undefined; }` - An object that describes a change to this position.
   - `line`: `number | undefined` - Value that should be used as line value, default is the {@link Position.line existing value}
   - `character`: `number | undefined` - Value that should be used as character value, default is the {@link Position.character existing value}
   
   **Returns:** `Position` - A position that reflects the given change. Will return `this` position if the change
   is not changing anything."
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
