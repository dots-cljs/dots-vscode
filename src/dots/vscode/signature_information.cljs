(ns dots.vscode.signature-information
  "Represents the signature of something callable. A signature
   can have a label, like a function-name, a doc-comment, and
   a set of parameters.")

(defn label
  "The label of this signature. Will be shown in
   the UI."
  ^js [signature-information]
  (.-label ^js signature-information))

(defn set-label!
  "The label of this signature. Will be shown in
   the UI."
  ^js [signature-information value]
  (set! (.-label ^js signature-information) value))

(defn documentation
  "The human-readable doc-comment of this signature. Will be shown
   in the UI but can be omitted."
  ^js [signature-information]
  (.-documentation ^js signature-information))

(defn set-documentation!
  "The human-readable doc-comment of this signature. Will be shown
   in the UI but can be omitted."
  ^js [signature-information value]
  (set! (.-documentation ^js signature-information) value))

(defn parameters
  "The parameters of this signature."
  ^js [signature-information]
  (.-parameters ^js signature-information))

(defn set-parameters!
  "The parameters of this signature."
  ^js [signature-information value]
  (set! (.-parameters ^js signature-information) value))

(defn active-parameter
  "The index of the active parameter.
   
   If provided, this is used in place of {@linkcode SignatureHelp.activeParameter }."
  ^js [signature-information]
  (.-activeParameter ^js signature-information))

(defn set-active-parameter!
  "The index of the active parameter.
   
   If provided, this is used in place of {@linkcode SignatureHelp.activeParameter }."
  ^js [signature-information value]
  (set! (.-activeParameter ^js signature-information) value))
