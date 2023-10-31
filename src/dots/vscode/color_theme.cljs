(ns dots.vscode.color-theme
  "Represents a color theme.")

(defn kind
  "The kind of this color theme: light, dark, high contrast dark and high contrast light."
  ^js [color-theme]
  (.-kind ^js color-theme))
