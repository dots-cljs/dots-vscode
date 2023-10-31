(ns dots.vscode.file-create-event
  "An event that is fired after files are created.")

(defn files
  "The files that got created."
  ^js [file-create-event]
  (.-files ^js file-create-event))
