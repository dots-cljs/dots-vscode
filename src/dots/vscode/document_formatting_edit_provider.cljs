(ns dots.vscode.document-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-document-formatting-edits
  "Provide formatting edits for a whole document."
  ^js [document-formatting-edit-provider document options token]
  (.provideDocumentFormattingEdits ^js document-formatting-edit-provider document options token))
