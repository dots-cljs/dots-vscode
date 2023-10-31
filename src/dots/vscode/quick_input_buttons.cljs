(ns dots.vscode.quick-input-buttons
  "Predefined buttons for {@link QuickPick } and {@link InputBox }.")

(defn back
  "A back button for {@link QuickPick } and {@link InputBox }.
   
   When a navigation 'back' button is needed this one should be used for consistency.
   It comes with a predefined icon, tooltip and location."
  ^js [quick-input-buttons]
  (.-Back ^js quick-input-buttons))
