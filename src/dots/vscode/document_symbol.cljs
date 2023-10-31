(ns dots.vscode.document-symbol
  "Represents programming constructs like variables, classes, interfaces etc. that appear in a document. Document
   symbols can be hierarchical and they have two ranges: one that encloses its definition and one that points to
   its most interesting range, e.g. the range of an identifier."
  (:refer-clojure :exclude [name range]))

(defn name
  "The name of this symbol."
  ^js [document-symbol]
  (.-name ^js document-symbol))

(defn set-name!
  "The name of this symbol."
  ^js [document-symbol value]
  (set! (.-name ^js document-symbol) value))

(defn detail
  "More detail for this symbol, e.g. the signature of a function."
  ^js [document-symbol]
  (.-detail ^js document-symbol))

(defn set-detail!
  "More detail for this symbol, e.g. the signature of a function."
  ^js [document-symbol value]
  (set! (.-detail ^js document-symbol) value))

(defn kind
  "The kind of this symbol."
  ^js [document-symbol]
  (.-kind ^js document-symbol))

(defn set-kind!
  "The kind of this symbol."
  ^js [document-symbol value]
  (set! (.-kind ^js document-symbol) value))

(defn tags
  "Tags for this symbol."
  ^js [document-symbol]
  (.-tags ^js document-symbol))

(defn set-tags!
  "Tags for this symbol."
  ^js [document-symbol value]
  (set! (.-tags ^js document-symbol) value))

(defn range
  "The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code."
  ^js [document-symbol]
  (.-range ^js document-symbol))

(defn set-range!
  "The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code."
  ^js [document-symbol value]
  (set! (.-range ^js document-symbol) value))

(defn selection-range
  "The range that should be selected and reveal when this symbol is being picked, e.g. the name of a function.
   Must be contained by the {@linkcode DocumentSymbol.range range}."
  ^js [document-symbol]
  (.-selectionRange ^js document-symbol))

(defn set-selection-range!
  "The range that should be selected and reveal when this symbol is being picked, e.g. the name of a function.
   Must be contained by the {@linkcode DocumentSymbol.range range}."
  ^js [document-symbol value]
  (set! (.-selectionRange ^js document-symbol) value))

(defn children
  "Children of this symbol, e.g. properties of a class."
  ^js [document-symbol]
  (.-children ^js document-symbol))

(defn set-children!
  "Children of this symbol, e.g. properties of a class."
  ^js [document-symbol value]
  (set! (.-children ^js document-symbol) value))
