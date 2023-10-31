(ns dots.vscode.document-link-provider
  "The document link provider defines the contract between extensions and feature of showing
   links in the editor.")

(defn provide-document-links
  "Provide links for the given document. Note that the editor ships with a default provider that detects
   `http(s)` and `file` links."
  ^js [document-link-provider document token]
  (.provideDocumentLinks ^js document-link-provider document token))

(defn resolve-document-link
  "Given a link fill in its {@link DocumentLink.target target}. This method is called when an incomplete
   link is selected in the UI. Providers can implement this method and return incomplete links
   (without target) from the {@linkcode DocumentLinkProvider.provideDocumentLinks provideDocumentLinks} method which
   often helps to improve performance."
  ^js [document-link-provider link token]
  (.resolveDocumentLink ^js document-link-provider link token))
