(ns dots.vscode.selection-range-provider
  "The selection range provider interface defines the contract between extensions and the \"Expand and Shrink Selection\" feature.")

(defn provide-selection-ranges
  "Provide selection ranges for the given positions.
   
   Selection ranges should be computed individually and independent for each position. The editor will merge
   and deduplicate ranges but providers must return hierarchies of selection ranges so that a range
   is {@link Range.contains contained} by its parent.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `positions`: `readonly Position[]` - The positions at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<SelectionRange[]>` - Selection ranges or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [selection-range-provider document positions token]
  (.provideSelectionRanges ^js selection-range-provider document positions token))
