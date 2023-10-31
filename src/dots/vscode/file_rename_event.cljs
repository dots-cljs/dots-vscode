(ns dots.vscode.file-rename-event
  "An event that is fired after files are renamed.")

(defn files
  "The files that got renamed."
  ^js [file-rename-event]
  (.-files ^js file-rename-event))
