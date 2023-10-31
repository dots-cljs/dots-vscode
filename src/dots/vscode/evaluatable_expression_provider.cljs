(ns dots.vscode.evaluatable-expression-provider
  "The evaluatable expression provider interface defines the contract between extensions and
   the debug hover. In this contract the provider returns an evaluatable expression for a given position
   in a document and the editor evaluates this expression in the active debug session and shows the result in a debug hover.")

(defn provide-evaluatable-expression
  "Provide an evaluatable expression for the given document and position.
   The editor will evaluate this expression in the active debug session and will show the result in the debug hover.
   The expression can be implicitly specified by the range in the underlying document or by explicitly returning an expression."
  ^js [evaluatable-expression-provider document position token]
  (.provideEvaluatableExpression ^js evaluatable-expression-provider document position token))
