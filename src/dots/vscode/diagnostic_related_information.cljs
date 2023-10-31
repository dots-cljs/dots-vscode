(ns dots.vscode.diagnostic-related-information
  "Represents a related message and source code location for a diagnostic. This should be
   used to point to code locations that cause or related to a diagnostics, e.g. when duplicating
   a symbol in a scope.")

(defn location
  "The location of this related diagnostic information."
  ^js [diagnostic-related-information]
  (.-location ^js diagnostic-related-information))

(defn set-location!
  "The location of this related diagnostic information."
  ^js [diagnostic-related-information value]
  (set! (.-location ^js diagnostic-related-information) value))

(defn message
  "The message of this related diagnostic information."
  ^js [diagnostic-related-information]
  (.-message ^js diagnostic-related-information))

(defn set-message!
  "The message of this related diagnostic information."
  ^js [diagnostic-related-information value]
  (set! (.-message ^js diagnostic-related-information) value))
