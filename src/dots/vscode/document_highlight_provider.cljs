(ns dots.vscode.document-highlight-provider
  "The document highlight provider interface defines the contract between extensions and
   the word-highlight-feature.")

(defn provide-document-highlights
  "Provide a set of document highlights, like all occurrences of a variable or
   all exit-points of a function.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<DocumentHighlight[]>` - An array of document highlights or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-highlight-provider document position token]
  (.provideDocumentHighlights ^js document-highlight-provider document position token))
