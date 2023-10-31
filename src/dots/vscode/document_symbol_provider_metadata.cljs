(ns dots.vscode.document-symbol-provider-metadata
  "Metadata about a document symbol provider.")

(defn label
  "A human-readable string that is shown when multiple outlines trees show for one document."
  ^js [document-symbol-provider-metadata]
  (.-label ^js document-symbol-provider-metadata))

(defn set-label!
  "A human-readable string that is shown when multiple outlines trees show for one document."
  ^js [document-symbol-provider-metadata value]
  (set! (.-label ^js document-symbol-provider-metadata) value))
