(ns dots.vscode.type-definition-provider
  "The type definition provider defines the contract between extensions and
   the go to type definition feature.")

(defn provide-type-definition
  "Provide the type definition of the symbol at the given position and document."
  ^js [type-definition-provider document position token]
  (.provideTypeDefinition ^js type-definition-provider document position token))
