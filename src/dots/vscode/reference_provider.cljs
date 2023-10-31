(ns dots.vscode.reference-provider
  "The reference provider interface defines the contract between extensions and
   the [find references](https://code.visualstudio.com/docs/editor/editingevolved#_peek)-feature.")

(defn provide-references
  "Provide a set of project-wide references for the given position and document."
  ^js [reference-provider document position context token]
  (.provideReferences ^js reference-provider document position context token))
