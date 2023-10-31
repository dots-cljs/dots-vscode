(ns dots.vscode.declaration-provider
  "The declaration provider interface defines the contract between extensions and
   the go to declaration feature.")

(defn provide-declaration
  "Provide the declaration of the symbol at the given position and document."
  ^js [declaration-provider document position token]
  (.provideDeclaration ^js declaration-provider document position token))
