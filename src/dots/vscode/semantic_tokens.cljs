(ns dots.vscode.semantic-tokens
  "Represents semantic tokens, either in a range or in an entire document.")

(defn result-id
  "The result id of the tokens.
   
   This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
   
   **Returns:** `string | undefined`"
  ^js [semantic-tokens]
  (.-resultId ^js semantic-tokens))

(defn data
  "The actual tokens data.
   
   **Returns:** `Uint32Array`"
  ^js [semantic-tokens]
  (.-data ^js semantic-tokens))
