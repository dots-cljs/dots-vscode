(ns dots.vscode.diagnostic
  "Represents a diagnostic, such as a compiler error or warning. Diagnostic objects
   are only valid in the scope of a file."
  (:refer-clojure :exclude [range]))

(defn range
  "The range to which this diagnostic applies."
  ^js [diagnostic]
  (.-range ^js diagnostic))

(defn set-range!
  "The range to which this diagnostic applies."
  ^js [diagnostic value]
  (set! (.-range ^js diagnostic) value))

(defn message
  "The human-readable message."
  ^js [diagnostic]
  (.-message ^js diagnostic))

(defn set-message!
  "The human-readable message."
  ^js [diagnostic value]
  (set! (.-message ^js diagnostic) value))

(defn severity
  "The severity, default is {@link DiagnosticSeverity.Error error}."
  ^js [diagnostic]
  (.-severity ^js diagnostic))

(defn set-severity!
  "The severity, default is {@link DiagnosticSeverity.Error error}."
  ^js [diagnostic value]
  (set! (.-severity ^js diagnostic) value))

(defn source
  "A human-readable string describing the source of this
   diagnostic, e.g. 'typescript' or 'super lint'."
  ^js [diagnostic]
  (.-source ^js diagnostic))

(defn set-source!
  "A human-readable string describing the source of this
   diagnostic, e.g. 'typescript' or 'super lint'."
  ^js [diagnostic value]
  (set! (.-source ^js diagnostic) value))

(defn code
  "A code or identifier for this diagnostic.
   Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}."
  ^js [diagnostic]
  (.-code ^js diagnostic))

(defn set-code!
  "A code or identifier for this diagnostic.
   Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}."
  ^js [diagnostic value]
  (set! (.-code ^js diagnostic) value))

(defn related-information
  "An array of related diagnostic information, e.g. when symbol-names within
   a scope collide all definitions can be marked via this property."
  ^js [diagnostic]
  (.-relatedInformation ^js diagnostic))

(defn set-related-information!
  "An array of related diagnostic information, e.g. when symbol-names within
   a scope collide all definitions can be marked via this property."
  ^js [diagnostic value]
  (set! (.-relatedInformation ^js diagnostic) value))

(defn tags
  "Additional metadata about the diagnostic."
  ^js [diagnostic]
  (.-tags ^js diagnostic))

(defn set-tags!
  "Additional metadata about the diagnostic."
  ^js [diagnostic value]
  (set! (.-tags ^js diagnostic) value))
