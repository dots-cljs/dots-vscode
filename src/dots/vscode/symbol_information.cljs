(ns dots.vscode.symbol-information
  "Represents information about programming constructs like variables, classes,
   interfaces etc."
  (:refer-clojure :exclude [name]))

(defn name
  "The name of this symbol."
  ^js [symbol-information]
  (.-name ^js symbol-information))

(defn set-name!
  "The name of this symbol."
  ^js [symbol-information value]
  (set! (.-name ^js symbol-information) value))

(defn container-name
  "The name of the symbol containing this symbol."
  ^js [symbol-information]
  (.-containerName ^js symbol-information))

(defn set-container-name!
  "The name of the symbol containing this symbol."
  ^js [symbol-information value]
  (set! (.-containerName ^js symbol-information) value))

(defn kind
  "The kind of this symbol."
  ^js [symbol-information]
  (.-kind ^js symbol-information))

(defn set-kind!
  "The kind of this symbol."
  ^js [symbol-information value]
  (set! (.-kind ^js symbol-information) value))

(defn tags
  "Tags for this symbol."
  ^js [symbol-information]
  (.-tags ^js symbol-information))

(defn set-tags!
  "Tags for this symbol."
  ^js [symbol-information value]
  (set! (.-tags ^js symbol-information) value))

(defn location
  "The location of this symbol."
  ^js [symbol-information]
  (.-location ^js symbol-information))

(defn set-location!
  "The location of this symbol."
  ^js [symbol-information value]
  (set! (.-location ^js symbol-information) value))
