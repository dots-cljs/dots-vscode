(ns dots.vscode.document-range-semantic-tokens-provider
  "The document range semantic tokens provider interface defines the contract between extensions and
   semantic tokens.")

(defn provide-document-range-semantic-tokens
  ^js [document-range-semantic-tokens-provider document range token]
  (.provideDocumentRangeSemanticTokens ^js document-range-semantic-tokens-provider document range token))
