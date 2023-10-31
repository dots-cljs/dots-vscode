(ns dots.vscode.implementation-provider
  "The implementation provider interface defines the contract between extensions and
   the go to implementation feature.")

(defn provide-implementation
  "Provide the implementations of the symbol at the given position and document."
  ^js [implementation-provider document position token]
  (.provideImplementation ^js implementation-provider document position token))
