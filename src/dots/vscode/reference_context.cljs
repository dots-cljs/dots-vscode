(ns dots.vscode.reference-context
  "Value-object that contains additional information when
   requesting references.")

(defn include-declaration?
  "Include the declaration of the current symbol.
   
   **Returns:** `boolean`"
  ^js [reference-context]
  (.-includeDeclaration ^js reference-context))
