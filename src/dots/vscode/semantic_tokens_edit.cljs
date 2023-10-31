(ns dots.vscode.semantic-tokens-edit
  "Represents an edit to semantic tokens.")

(defn start
  "The start offset of the edit."
  ^js [semantic-tokens-edit]
  (.-start ^js semantic-tokens-edit))

(defn delete-count
  "The count of elements to remove."
  ^js [semantic-tokens-edit]
  (.-deleteCount ^js semantic-tokens-edit))

(defn data
  "The elements to insert."
  ^js [semantic-tokens-edit]
  (.-data ^js semantic-tokens-edit))
