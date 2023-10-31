(ns dots.vscode.document-symbol-provider
  "The document symbol provider interface defines the contract between extensions and
   the [go to symbol](https://code.visualstudio.com/docs/editor/editingevolved#_go-to-symbol)-feature.")

(defn provide-document-symbols
  "Provide symbol information for the given document."
  ^js [document-symbol-provider document token]
  (.provideDocumentSymbols ^js document-symbol-provider document token))
