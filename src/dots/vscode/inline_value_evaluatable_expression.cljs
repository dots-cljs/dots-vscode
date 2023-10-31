(ns dots.vscode.inline-value-evaluatable-expression
  "Provide an inline value through an expression evaluation.
   If only a range is specified, the expression will be extracted from the underlying document.
   An optional expression can be used to override the extracted expression."
  (:refer-clojure :exclude [range]))

(defn range
  "The document range for which the inline value applies.
   The range is used to extract the evaluatable expression from the underlying document."
  ^js [inline-value-evaluatable-expression]
  (.-range ^js inline-value-evaluatable-expression))

(defn expression
  "If specified the expression overrides the extracted expression."
  ^js [inline-value-evaluatable-expression]
  (.-expression ^js inline-value-evaluatable-expression))
