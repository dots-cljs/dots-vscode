(ns dots.vscode.quick-diff-provider
  "A quick diff provider provides a {@link Uri uri} to the original state of a
   modified resource. The editor will use this information to render ad'hoc diffs
   within the text.")

(defn provide-original-resource
  "Provide a {@link Uri } to the original resource of any given resource uri.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the resource open in a text editor.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Uri>` - A thenable that resolves to uri of the matching original resource."
  ^js [quick-diff-provider uri token]
  (.provideOriginalResource ^js quick-diff-provider uri token))
