(ns dots.vscode.memento
  "A memento represents a storage utility. It can store and retrieve
   values."
  (:refer-clojure :exclude [get keys update]))

(defn keys
  "Returns the stored keys."
  ^js [memento]
  (.keys ^js memento))

(defn get
  "Return a value."
  (^js [memento key]
   (.get ^js memento key))
  (^js [memento key default-value]
   (.get ^js memento key default-value)))

(defn update
  "Store a value. The value must be JSON-stringifyable.
   
   *Note* that using `undefined` as value removes the key from the underlying
   storage."
  ^js [memento key value]
  (.update ^js memento key value))
