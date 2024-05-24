(ns dots.vscode.quick-input-button
  "Button for an action in a {@link QuickPick } or {@link InputBox }.")

(defn icon-path
  "Icon for the button.
   
   **Returns:** `Uri | ThemeIcon | { light: Uri; dark: Uri; }`"
  ^js [quick-input-button]
  (.-iconPath ^js quick-input-button))

(defn tooltip
  "An optional tooltip.
   
   **Returns:** `string | undefined`"
  ^js [quick-input-button]
  (.-tooltip ^js quick-input-button))
