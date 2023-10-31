(ns dots.vscode.inline-value-variable-lookup
  "Provide inline value through a variable lookup.
   If only a range is specified, the variable name will be extracted from the underlying document.
   An optional variable name can be used to override the extracted name."
  (:refer-clojure :exclude [range]))

(defn range
  "The document range for which the inline value applies.
   The range is used to extract the variable name from the underlying document."
  ^js [inline-value-variable-lookup]
  (.-range ^js inline-value-variable-lookup))

(defn variable-name
  "If specified the name of the variable to look up."
  ^js [inline-value-variable-lookup]
  (.-variableName ^js inline-value-variable-lookup))

(defn case-sensitive-lookup?
  "How to perform the lookup."
  ^js [inline-value-variable-lookup]
  (.-caseSensitiveLookup ^js inline-value-variable-lookup))
