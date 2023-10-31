(ns dots.vscode.location-link
  "Represents the connection of two locations. Provides additional metadata over normal {@link Location locations},
   including an origin range.")

(defn origin-selection-range
  "Span of the origin of this link.
   
   Used as the underlined span for mouse definition hover. Defaults to the word range at
   the definition position."
  ^js [location-link]
  (.-originSelectionRange ^js location-link))

(defn set-origin-selection-range!
  "Span of the origin of this link.
   
   Used as the underlined span for mouse definition hover. Defaults to the word range at
   the definition position."
  ^js [location-link value]
  (set! (.-originSelectionRange ^js location-link) value))

(defn target-uri
  "The target resource identifier of this link."
  ^js [location-link]
  (.-targetUri ^js location-link))

(defn set-target-uri!
  "The target resource identifier of this link."
  ^js [location-link value]
  (set! (.-targetUri ^js location-link) value))

(defn target-range
  "The full target range of this link."
  ^js [location-link]
  (.-targetRange ^js location-link))

(defn set-target-range!
  "The full target range of this link."
  ^js [location-link value]
  (set! (.-targetRange ^js location-link) value))

(defn target-selection-range
  "The span of this link."
  ^js [location-link]
  (.-targetSelectionRange ^js location-link))

(defn set-target-selection-range!
  "The span of this link."
  ^js [location-link value]
  (set! (.-targetSelectionRange ^js location-link) value))
