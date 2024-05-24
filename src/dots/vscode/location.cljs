(ns dots.vscode.location
  "Represents a location inside a resource, such as a line
   inside a text file."
  (:refer-clojure :exclude [range]))

(defn uri
  "The resource identifier of this location.
   
   **Returns:** `Uri`"
  ^js [location]
  (.-uri ^js location))

(defn set-uri!
  "The resource identifier of this location."
  ^js [location value]
  (set! (.-uri ^js location) value))

(defn range
  "The document range of this location.
   
   **Returns:** `Range`"
  ^js [location]
  (.-range ^js location))

(defn set-range!
  "The document range of this location."
  ^js [location value]
  (set! (.-range ^js location) value))
