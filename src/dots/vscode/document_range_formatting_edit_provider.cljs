(ns dots.vscode.document-range-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-document-range-formatting-edits
  "Provide formatting edits for a range in a document.
   
   The given range is a hint and providers can decide to format a smaller
   or larger range. Often this is done by adjusting the start and end
   of the range to full syntax nodes.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `range`: `Range` - The range which should be formatted.
   - `options`: `FormattingOptions` - Options controlling formatting.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TextEdit[]>` - A set of text edits or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-range-formatting-edit-provider document range options token]
  (.provideDocumentRangeFormattingEdits ^js document-range-formatting-edit-provider document range options token))

(defn provide-document-ranges-formatting-edits
  "Provide formatting edits for multiple ranges in a document.
   
   This function is optional but allows a formatter to perform faster when formatting only modified ranges or when
   formatting a large number of selections.
   
   The given ranges are hints and providers can decide to format a smaller
   or larger range. Often this is done by adjusting the start and end
   of the range to full syntax nodes.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `ranges`: `Range[]` - The ranges which should be formatted.
   - `options`: `FormattingOptions` - Options controlling formatting.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TextEdit[]>` - A set of text edits or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-range-formatting-edit-provider document ranges options token]
  (.provideDocumentRangesFormattingEdits ^js document-range-formatting-edit-provider document ranges options token))
