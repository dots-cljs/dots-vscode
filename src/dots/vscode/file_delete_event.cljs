(ns dots.vscode.file-delete-event
  "An event that is fired after files are deleted.")

(defn files
  "The files that got deleted."
  ^js [file-delete-event]
  (.-files ^js file-delete-event))
