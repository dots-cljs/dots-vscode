(ns dots.vscode.quick-diff-provider)

(defn provide-original-resource
  "Provide a {@link Uri } to the original resource of any given resource uri."
  ^js [quick-diff-provider uri token]
  (.provideOriginalResource ^js quick-diff-provider uri token))
