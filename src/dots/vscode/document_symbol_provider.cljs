(ns dots.vscode.document-symbol-provider
  "The document symbol provider interface defines the contract between extensions and
   the [go to symbol](https://code.visualstudio.com/docs/editor/editingevolved#_go-to-symbol)-feature.")

(defn provide-document-symbols
  "Provide symbol information for the given document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<DocumentSymbol[] | SymbolInformation[]>` - An array of document highlights or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-symbol-provider document token]
  (.provideDocumentSymbols ^js document-symbol-provider document token))
