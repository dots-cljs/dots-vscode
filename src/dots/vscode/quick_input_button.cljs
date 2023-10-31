(ns dots.vscode.quick-input-button
  "Button for an action in a {@link QuickPick } or {@link InputBox }.")

(defn icon-path
  "Icon for the button."
  ^js [quick-input-button]
  (.-iconPath ^js quick-input-button))

(defn tooltip
  "An optional tooltip."
  ^js [quick-input-button]
  (.-tooltip ^js quick-input-button))
