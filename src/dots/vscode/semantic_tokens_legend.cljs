(ns dots.vscode.semantic-tokens-legend
  "A semantic tokens legend contains the needed information to decipher
   the integer encoded representation of semantic tokens.")

(defn token-types
  "The possible token types.
   
   **Returns:** `string[]`"
  ^js [semantic-tokens-legend]
  (.-tokenTypes ^js semantic-tokens-legend))

(defn token-modifiers
  "The possible token modifiers.
   
   **Returns:** `string[]`"
  ^js [semantic-tokens-legend]
  (.-tokenModifiers ^js semantic-tokens-legend))
