(ns dots.vscode.clipboard
  "The clipboard provides read and write access to the system's clipboard.")

(defn read-text
  "Read the current clipboard contents as text."
  ^js [clipboard]
  (.readText ^js clipboard))

(defn write-text
  "Writes text into the clipboard."
  ^js [clipboard value]
  (.writeText ^js clipboard value))
