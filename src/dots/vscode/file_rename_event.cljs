(ns dots.vscode.file-rename-event
  "An event that is fired after files are renamed.")

(defn files
  "The files that got renamed.
   
   **Returns:** `readonly { readonly oldUri: Uri; readonly newUri: Uri; }[]`"
  ^js [file-rename-event]
  (.-files ^js file-rename-event))
