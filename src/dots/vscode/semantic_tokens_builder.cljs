(ns dots.vscode.semantic-tokens-builder
  "A semantic tokens builder can help with creating a `SemanticTokens` instance
   which contains delta encoded semantic tokens.")

(defn push
  "Add another token.
   Add another token. Use only when providing a legend.
   
   **Parameters:**
   - `line`: `number` - The token start line number (absolute value).
   - `range`: `Range` - The range of the token. Must be single-line.
   - `char`: `number` - The token start character (absolute value).
   - `token-type`: `string` - The token type.
   - `length`: `number` - The token length in characters.
   - `token-modifiers`: `readonly string[] | undefined` - The token modifiers.
   
   **Returns:** `void`"
  (^js [semantic-tokens-builder range token-type]
   (.push ^js semantic-tokens-builder range token-type))
  (^js [semantic-tokens-builder range token-type token-modifiers]
   (.push ^js semantic-tokens-builder range token-type token-modifiers))
  (^js [semantic-tokens-builder line char length token-type]
   (.push ^js semantic-tokens-builder line char length token-type))
  (^js [semantic-tokens-builder line char length token-type token-modifiers]
   (.push ^js semantic-tokens-builder line char length token-type token-modifiers)))

(defn build
  "Finish and create a `SemanticTokens` instance.
   
   **Parameters:**
   - `result-id`: `string | undefined`
   
   **Returns:** `SemanticTokens`"
  (^js [semantic-tokens-builder]
   (.build ^js semantic-tokens-builder))
  (^js [semantic-tokens-builder result-id]
   (.build ^js semantic-tokens-builder result-id)))
