(ns dots.vscode.document-color-provider
  "The document color provider defines the contract between extensions and feature of
   picking and modifying colors in the editor.")

(defn provide-document-colors
  "Provide colors for the given document."
  ^js [document-color-provider document token]
  (.provideDocumentColors ^js document-color-provider document token))

(defn provide-color-presentations
  "Provide {@link ColorPresentation representations} for a color."
  ^js [document-color-provider color context token]
  (.provideColorPresentations ^js document-color-provider color context token))
