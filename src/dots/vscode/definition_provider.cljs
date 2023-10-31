(ns dots.vscode.definition-provider
  "The definition provider interface defines the contract between extensions and
   the [go to definition](https://code.visualstudio.com/docs/editor/editingevolved#_go-to-definition)
   and peek definition features.")

(defn provide-definition
  "Provide the definition of the symbol at the given position and document."
  ^js [definition-provider document position token]
  (.provideDefinition ^js definition-provider document position token))
