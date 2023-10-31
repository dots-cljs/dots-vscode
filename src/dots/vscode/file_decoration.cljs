(ns dots.vscode.file-decoration
  "A file decoration represents metadata that can be rendered with a file.")

(defn badge
  "A very short string that represents this decoration."
  ^js [file-decoration]
  (.-badge ^js file-decoration))

(defn set-badge!
  "A very short string that represents this decoration."
  ^js [file-decoration value]
  (set! (.-badge ^js file-decoration) value))

(defn tooltip
  "A human-readable tooltip for this decoration."
  ^js [file-decoration]
  (.-tooltip ^js file-decoration))

(defn set-tooltip!
  "A human-readable tooltip for this decoration."
  ^js [file-decoration value]
  (set! (.-tooltip ^js file-decoration) value))

(defn color
  "The color of this decoration."
  ^js [file-decoration]
  (.-color ^js file-decoration))

(defn set-color!
  "The color of this decoration."
  ^js [file-decoration value]
  (set! (.-color ^js file-decoration) value))

(defn propagate?
  "A flag expressing that this decoration should be
   propagated to its parents."
  ^js [file-decoration]
  (.-propagate ^js file-decoration))

(defn set-propagate!
  "A flag expressing that this decoration should be
   propagated to its parents."
  ^js [file-decoration value]
  (set! (.-propagate ^js file-decoration) value))
