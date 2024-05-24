(ns dots.vscode.linked-editing-range-provider
  "The linked editing range provider interface defines the contract between extensions and
   the linked editing feature.")

(defn provide-linked-editing-ranges
  "For a given position in a document, returns the range of the symbol at the position and all ranges
   that have the same content. A change to one of the ranges can be applied to all other ranges if the new content
   is valid. An optional word pattern can be returned with the result to describe valid contents.
   If no result-specific word pattern is provided, the word pattern from the language configuration is used.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the provider was invoked.
   - `position`: `Position` - The position at which the provider was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<LinkedEditingRanges>` - A list of ranges that can be edited together"
  ^js [linked-editing-range-provider document position token]
  (.provideLinkedEditingRanges ^js linked-editing-range-provider document position token))
