(ns dots.vscode.env.clipboard
  "The system clipboard."
  (:require ["vscode" :as vscode]))

(defn read-text
  "Read the current clipboard contents as text.
   
   **Returns:** `Thenable<string>` - A thenable that resolves to a string."
  ^js []
  (.. vscode/env -clipboard (readText)))

(defn write-text
  "Writes text into the clipboard.
   
   **Parameters:**
   - `value`: `string`
   
   **Returns:** `Thenable<void>` - A thenable that resolves when writing happened."
  ^js [value]
  (.. vscode/env -clipboard (writeText value)))
