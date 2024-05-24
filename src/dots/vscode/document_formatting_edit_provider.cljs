(ns dots.vscode.document-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-document-formatting-edits
  "Provide formatting edits for a whole document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `options`: `FormattingOptions` - Options controlling formatting.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TextEdit[]>` - A set of text edits or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-formatting-edit-provider document options token]
  (.provideDocumentFormattingEdits ^js document-formatting-edit-provider document options token))
