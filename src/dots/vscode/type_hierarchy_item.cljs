(ns dots.vscode.type-hierarchy-item
  "Represents an item of a type hierarchy, like a class or an interface."
  (:refer-clojure :exclude [name range]))

(defn name
  "The name of this item."
  ^js [type-hierarchy-item]
  (.-name ^js type-hierarchy-item))

(defn set-name!
  "The name of this item."
  ^js [type-hierarchy-item value]
  (set! (.-name ^js type-hierarchy-item) value))

(defn kind
  "The kind of this item."
  ^js [type-hierarchy-item]
  (.-kind ^js type-hierarchy-item))

(defn set-kind!
  "The kind of this item."
  ^js [type-hierarchy-item value]
  (set! (.-kind ^js type-hierarchy-item) value))

(defn tags
  "Tags for this item."
  ^js [type-hierarchy-item]
  (.-tags ^js type-hierarchy-item))

(defn set-tags!
  "Tags for this item."
  ^js [type-hierarchy-item value]
  (set! (.-tags ^js type-hierarchy-item) value))

(defn detail
  "More detail for this item, e.g. the signature of a function."
  ^js [type-hierarchy-item]
  (.-detail ^js type-hierarchy-item))

(defn set-detail!
  "More detail for this item, e.g. the signature of a function."
  ^js [type-hierarchy-item value]
  (set! (.-detail ^js type-hierarchy-item) value))

(defn uri
  "The resource identifier of this item."
  ^js [type-hierarchy-item]
  (.-uri ^js type-hierarchy-item))

(defn set-uri!
  "The resource identifier of this item."
  ^js [type-hierarchy-item value]
  (set! (.-uri ^js type-hierarchy-item) value))

(defn range
  "The range enclosing this symbol not including leading/trailing whitespace
   but everything else, e.g. comments and code."
  ^js [type-hierarchy-item]
  (.-range ^js type-hierarchy-item))

(defn set-range!
  "The range enclosing this symbol not including leading/trailing whitespace
   but everything else, e.g. comments and code."
  ^js [type-hierarchy-item value]
  (set! (.-range ^js type-hierarchy-item) value))

(defn selection-range
  "The range that should be selected and revealed when this symbol is being
   picked, e.g. the name of a class. Must be contained by the {@link TypeHierarchyItem.range range}-property."
  ^js [type-hierarchy-item]
  (.-selectionRange ^js type-hierarchy-item))

(defn set-selection-range!
  "The range that should be selected and revealed when this symbol is being
   picked, e.g. the name of a class. Must be contained by the {@link TypeHierarchyItem.range range}-property."
  ^js [type-hierarchy-item value]
  (set! (.-selectionRange ^js type-hierarchy-item) value))
