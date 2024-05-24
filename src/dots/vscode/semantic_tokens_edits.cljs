(ns dots.vscode.semantic-tokens-edits
  "Represents edits to semantic tokens.")

(defn result-id
  "The result id of the tokens.
   
   This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
   
   **Returns:** `string | undefined`"
  ^js [semantic-tokens-edits]
  (.-resultId ^js semantic-tokens-edits))

(defn edits
  "The edits to the tokens data.
   All edits refer to the initial data state.
   
   **Returns:** `SemanticTokensEdit[]`"
  ^js [semantic-tokens-edits]
  (.-edits ^js semantic-tokens-edits))
