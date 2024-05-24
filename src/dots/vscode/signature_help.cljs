(ns dots.vscode.signature-help
  "Signature help represents the signature of something
   callable. There can be multiple signatures but only one
   active and only one active parameter.")

(defn signatures
  "One or more signatures.
   
   **Returns:** `SignatureInformation[]`"
  ^js [signature-help]
  (.-signatures ^js signature-help))

(defn set-signatures!
  "One or more signatures."
  ^js [signature-help value]
  (set! (.-signatures ^js signature-help) value))

(defn active-signature
  "The active signature.
   
   **Returns:** `number`"
  ^js [signature-help]
  (.-activeSignature ^js signature-help))

(defn set-active-signature!
  "The active signature."
  ^js [signature-help value]
  (set! (.-activeSignature ^js signature-help) value))

(defn active-parameter
  "The active parameter of the active signature.
   
   **Returns:** `number`"
  ^js [signature-help]
  (.-activeParameter ^js signature-help))

(defn set-active-parameter!
  "The active parameter of the active signature."
  ^js [signature-help value]
  (set! (.-activeParameter ^js signature-help) value))
