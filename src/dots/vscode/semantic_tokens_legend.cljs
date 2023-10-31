(ns dots.vscode.semantic-tokens-legend
  "A semantic tokens legend contains the needed information to decipher
   the integer encoded representation of semantic tokens.")

(defn token-types
  "The possible token types."
  ^js [semantic-tokens-legend]
  (.-tokenTypes ^js semantic-tokens-legend))

(defn token-modifiers
  "The possible token modifiers."
  ^js [semantic-tokens-legend]
  (.-tokenModifiers ^js semantic-tokens-legend))
