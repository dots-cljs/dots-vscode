(ns dots.vscode.document-highlight-provider
  "The document highlight provider interface defines the contract between extensions and
   the word-highlight-feature.")

(defn provide-document-highlights
  "Provide a set of document highlights, like all occurrences of a variable or
   all exit-points of a function."
  ^js [document-highlight-provider document position token]
  (.provideDocumentHighlights ^js document-highlight-provider document position token))
