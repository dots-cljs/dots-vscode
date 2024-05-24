(ns dots.vscode.enter-action
  "Describes what to do when pressing Enter.")

(defn indent-action
  "Describe what to do with the indentation.
   
   **Returns:** `IndentAction`"
  ^js [enter-action]
  (.-indentAction ^js enter-action))

(defn set-indent-action!
  "Describe what to do with the indentation."
  ^js [enter-action value]
  (set! (.-indentAction ^js enter-action) value))

(defn append-text
  "Describes text to be appended after the new line and after the indentation.
   
   **Returns:** `string | undefined`"
  ^js [enter-action]
  (.-appendText ^js enter-action))

(defn set-append-text!
  "Describes text to be appended after the new line and after the indentation."
  ^js [enter-action value]
  (set! (.-appendText ^js enter-action) value))

(defn remove-text
  "Describes the number of characters to remove from the new line's indentation.
   
   **Returns:** `number | undefined`"
  ^js [enter-action]
  (.-removeText ^js enter-action))

(defn set-remove-text!
  "Describes the number of characters to remove from the new line's indentation."
  ^js [enter-action value]
  (set! (.-removeText ^js enter-action) value))
