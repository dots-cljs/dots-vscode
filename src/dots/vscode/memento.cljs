(ns dots.vscode.memento
  "A memento represents a storage utility. It can store and retrieve
   values."
  (:refer-clojure :exclude [get keys update]))

(defn keys
  "Returns the stored keys.
   
   **Returns:** `readonly string[]` - The stored keys."
  ^js [memento]
  (.keys ^js memento))

(defn get
  "Return a value.
   
   **Parameters:**
   - `key`: `string` - A string.
   - `default-value`: `T` - A value that should be returned when there is no
   value (`undefined`) with the given key.
   
   **Returns:** `T` - The stored value or the defaultValue."
  (^js [memento key]
   (.get ^js memento key))
  (^js [memento key default-value]
   (.get ^js memento key default-value)))

(defn update
  "Store a value. The value must be JSON-stringifyable.
   
   *Note* that using `undefined` as value removes the key from the underlying
   storage.
   
   **Parameters:**
   - `key`: `string` - A string.
   - `value`: `any` - A value. MUST not contain cyclic references.
   
   **Returns:** `Thenable<void>`"
  ^js [memento key value]
  (.update ^js memento key value))
