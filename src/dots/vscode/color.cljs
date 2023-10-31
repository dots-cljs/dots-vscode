(ns dots.vscode.color
  "Represents a color in RGBA space.")

(defn red
  "The red component of this color in the range [0-1]."
  ^js [color]
  (.-red ^js color))

(defn green
  "The green component of this color in the range [0-1]."
  ^js [color]
  (.-green ^js color))

(defn blue
  "The blue component of this color in the range [0-1]."
  ^js [color]
  (.-blue ^js color))

(defn alpha
  "The alpha component of this color in the range [0-1]."
  ^js [color]
  (.-alpha ^js color))
