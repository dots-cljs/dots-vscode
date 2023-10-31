(ns dots.vscode.document-range-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-document-range-formatting-edits
  "Provide formatting edits for a range in a document.
   
   The given range is a hint and providers can decide to format a smaller
   or larger range. Often this is done by adjusting the start and end
   of the range to full syntax nodes."
  ^js [document-range-formatting-edit-provider document range options token]
  (.provideDocumentRangeFormattingEdits ^js document-range-formatting-edit-provider document range options token))
