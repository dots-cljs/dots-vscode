(ns dots.vscode.call-hierarchy-item
  "Represents programming constructs like functions or constructors in the context
   of call hierarchy."
  (:refer-clojure :exclude [name range]))

(defn name
  "The name of this item."
  ^js [call-hierarchy-item]
  (.-name ^js call-hierarchy-item))

(defn set-name!
  "The name of this item."
  ^js [call-hierarchy-item value]
  (set! (.-name ^js call-hierarchy-item) value))

(defn kind
  "The kind of this item."
  ^js [call-hierarchy-item]
  (.-kind ^js call-hierarchy-item))

(defn set-kind!
  "The kind of this item."
  ^js [call-hierarchy-item value]
  (set! (.-kind ^js call-hierarchy-item) value))

(defn tags
  "Tags for this item."
  ^js [call-hierarchy-item]
  (.-tags ^js call-hierarchy-item))

(defn set-tags!
  "Tags for this item."
  ^js [call-hierarchy-item value]
  (set! (.-tags ^js call-hierarchy-item) value))

(defn detail
  "More detail for this item, e.g. the signature of a function."
  ^js [call-hierarchy-item]
  (.-detail ^js call-hierarchy-item))

(defn set-detail!
  "More detail for this item, e.g. the signature of a function."
  ^js [call-hierarchy-item value]
  (set! (.-detail ^js call-hierarchy-item) value))

(defn uri
  "The resource identifier of this item."
  ^js [call-hierarchy-item]
  (.-uri ^js call-hierarchy-item))

(defn set-uri!
  "The resource identifier of this item."
  ^js [call-hierarchy-item value]
  (set! (.-uri ^js call-hierarchy-item) value))

(defn range
  "The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code."
  ^js [call-hierarchy-item]
  (.-range ^js call-hierarchy-item))

(defn set-range!
  "The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code."
  ^js [call-hierarchy-item value]
  (set! (.-range ^js call-hierarchy-item) value))

(defn selection-range
  "The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
   Must be contained by the {@linkcode CallHierarchyItem.range range}."
  ^js [call-hierarchy-item]
  (.-selectionRange ^js call-hierarchy-item))

(defn set-selection-range!
  "The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
   Must be contained by the {@linkcode CallHierarchyItem.range range}."
  ^js [call-hierarchy-item value]
  (set! (.-selectionRange ^js call-hierarchy-item) value))
