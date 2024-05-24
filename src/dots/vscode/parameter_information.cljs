(ns dots.vscode.parameter-information
  "Represents a parameter of a callable-signature. A parameter can
   have a label and a doc-comment.")

(defn label
  "The label of this signature.
   
   Either a string or inclusive start and exclusive end offsets within its containing
   {@link SignatureInformation.label signature label}. *Note*: A label of type string must be
   a substring of its containing signature information's {@link SignatureInformation.label label}.
   
   **Returns:** `string | [number, number]`"
  ^js [parameter-information]
  (.-label ^js parameter-information))

(defn set-label!
  "The label of this signature.
   
   Either a string or inclusive start and exclusive end offsets within its containing
   {@link SignatureInformation.label signature label}. *Note*: A label of type string must be
   a substring of its containing signature information's {@link SignatureInformation.label label}."
  ^js [parameter-information value]
  (set! (.-label ^js parameter-information) value))

(defn documentation
  "The human-readable doc-comment of this signature. Will be shown
   in the UI but can be omitted.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [parameter-information]
  (.-documentation ^js parameter-information))

(defn set-documentation!
  "The human-readable doc-comment of this signature. Will be shown
   in the UI but can be omitted."
  ^js [parameter-information value]
  (set! (.-documentation ^js parameter-information) value))
