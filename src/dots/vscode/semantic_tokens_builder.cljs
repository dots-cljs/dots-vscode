(ns dots.vscode.semantic-tokens-builder
  "A semantic tokens builder can help with creating a `SemanticTokens` instance
   which contains delta encoded semantic tokens.")

(defn push
  "Add another token.
   Add another token. Use only when providing a legend."
  (^js [semantic-tokens-builder range token-type]
   (.push ^js semantic-tokens-builder range token-type))
  (^js [semantic-tokens-builder range token-type token-modifiers]
   (.push ^js semantic-tokens-builder range token-type token-modifiers))
  (^js [semantic-tokens-builder line char length token-type]
   (.push ^js semantic-tokens-builder line char length token-type))
  (^js [semantic-tokens-builder line char length token-type token-modifiers]
   (.push ^js semantic-tokens-builder line char length token-type token-modifiers)))

(defn build
  "Finish and create a `SemanticTokens` instance."
  (^js [semantic-tokens-builder]
   (.build ^js semantic-tokens-builder))
  (^js [semantic-tokens-builder result-id]
   (.build ^js semantic-tokens-builder result-id)))
