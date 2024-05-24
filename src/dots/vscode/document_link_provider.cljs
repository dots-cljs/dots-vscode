(ns dots.vscode.document-link-provider
  "The document link provider defines the contract between extensions and feature of showing
   links in the editor.")

(defn provide-document-links
  "Provide links for the given document. Note that the editor ships with a default provider that detects
   `http(s)` and `file` links.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T[]>` - An array of {@link DocumentLinkdocument links} or a thenable that resolves to such. The lack of a result
   can be signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-link-provider document token]
  (.provideDocumentLinks ^js document-link-provider document token))

(defn resolve-document-link
  "Given a link fill in its {@link DocumentLink.target target}. This method is called when an incomplete
   link is selected in the UI. Providers can implement this method and return incomplete links
   (without target) from the {@linkcode DocumentLinkProvider.provideDocumentLinks provideDocumentLinks} method which
   often helps to improve performance.
   
   **Parameters:**
   - `link`: `T` - The link that is to be resolved.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T>`"
  ^js [document-link-provider link token]
  (.resolveDocumentLink ^js document-link-provider link token))
