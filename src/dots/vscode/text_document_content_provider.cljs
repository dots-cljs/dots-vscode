(ns dots.vscode.text-document-content-provider
  "A text document content provider allows to add readonly documents
   to the editor, such as source from a dll or generated html from md.
   
   Content providers are {@link workspace.registerTextDocumentContentProvider registered}
   for a {@link Uri.scheme uri-scheme}. When a uri with that scheme is to
   be {@link workspace.openTextDocument loaded} the content provider is
   asked.")

(defn on-did-change
  "An event to signal a resource has changed."
  (^js [text-document-content-provider]
   (.-onDidChange ^js text-document-content-provider))
  (^js [text-document-content-provider listener]
   (.onDidChange ^js text-document-content-provider listener))
  (^js [text-document-content-provider listener this-args]
   (.onDidChange ^js text-document-content-provider listener this-args))
  (^js [text-document-content-provider listener this-args disposables]
   (.onDidChange ^js text-document-content-provider listener this-args disposables)))

(defn set-on-did-change!
  "An event to signal a resource has changed."
  ^js [text-document-content-provider value]
  (set! (.-onDidChange ^js text-document-content-provider) value))

(defn provide-text-document-content
  "Provide textual content for a given uri.
   
   The editor will use the returned string-content to create a readonly
   {@link TextDocument document}. Resources allocated should be released when
   the corresponding document has been {@link workspace.onDidCloseTextDocument closed}.
   
   **Note**: The contents of the created {@link TextDocument document} might not be
   identical to the provided text due to end-of-line-sequence normalization."
  ^js [text-document-content-provider uri token]
  (.provideTextDocumentContent ^js text-document-content-provider uri token))
