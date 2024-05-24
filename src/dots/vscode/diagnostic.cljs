(ns dots.vscode.diagnostic
  "Represents a diagnostic, such as a compiler error or warning. Diagnostic objects
   are only valid in the scope of a file."
  (:refer-clojure :exclude [range]))

(defn range
  "The range to which this diagnostic applies.
   
   **Returns:** `Range`"
  ^js [diagnostic]
  (.-range ^js diagnostic))

(defn set-range!
  "The range to which this diagnostic applies."
  ^js [diagnostic value]
  (set! (.-range ^js diagnostic) value))

(defn message
  "The human-readable message.
   
   **Returns:** `string`"
  ^js [diagnostic]
  (.-message ^js diagnostic))

(defn set-message!
  "The human-readable message."
  ^js [diagnostic value]
  (set! (.-message ^js diagnostic) value))

(defn severity
  "The severity, default is {@link DiagnosticSeverity.Error error}.
   
   **Returns:** `DiagnosticSeverity`"
  ^js [diagnostic]
  (.-severity ^js diagnostic))

(defn set-severity!
  "The severity, default is {@link DiagnosticSeverity.Error error}."
  ^js [diagnostic value]
  (set! (.-severity ^js diagnostic) value))

(defn source
  "A human-readable string describing the source of this
   diagnostic, e.g. 'typescript' or 'super lint'.
   
   **Returns:** `string | undefined`"
  ^js [diagnostic]
  (.-source ^js diagnostic))

(defn set-source!
  "A human-readable string describing the source of this
   diagnostic, e.g. 'typescript' or 'super lint'."
  ^js [diagnostic value]
  (set! (.-source ^js diagnostic) value))

(defn code
  "A code or identifier for this diagnostic.
   Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}.
   
   **Returns:** `string | number | { value: string | number; target: Uri; } | undefined`"
  ^js [diagnostic]
  (.-code ^js diagnostic))

(defn set-code!
  "A code or identifier for this diagnostic.
   Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}."
  ^js [diagnostic value]
  (set! (.-code ^js diagnostic) value))

(defn related-information
  "An array of related diagnostic information, e.g. when symbol-names within
   a scope collide all definitions can be marked via this property.
   
   **Returns:** `DiagnosticRelatedInformation[] | undefined`"
  ^js [diagnostic]
  (.-relatedInformation ^js diagnostic))

(defn set-related-information!
  "An array of related diagnostic information, e.g. when symbol-names within
   a scope collide all definitions can be marked via this property."
  ^js [diagnostic value]
  (set! (.-relatedInformation ^js diagnostic) value))

(defn tags
  "Additional metadata about the diagnostic.
   
   **Returns:** `DiagnosticTag[] | undefined`"
  ^js [diagnostic]
  (.-tags ^js diagnostic))

(defn set-tags!
  "Additional metadata about the diagnostic."
  ^js [diagnostic value]
  (set! (.-tags ^js diagnostic) value))
