(ns dots.vscode.clipboard
  "The clipboard provides read and write access to the system's clipboard.")

(defn read-text
  "Read the current clipboard contents as text.
   
   **Returns:** `Thenable<string>` - A thenable that resolves to a string."
  ^js [clipboard]
  (.readText ^js clipboard))

(defn write-text
  "Writes text into the clipboard.
   
   **Parameters:**
   - `value`: `string`
   
   **Returns:** `Thenable<void>` - A thenable that resolves when writing happened."
  ^js [clipboard value]
  (.writeText ^js clipboard value))
