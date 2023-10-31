(ns dots.vscode.custom-document-backup
  "A backup for an {@linkcode CustomDocument }.")

(defn id
  "Unique identifier for the backup.
   
   This id is passed back to your extension in `openCustomDocument` when opening a custom editor from a backup."
  ^js [custom-document-backup]
  (.-id ^js custom-document-backup))

(defn delete
  "Delete the current backup.
   
   This is called by the editor when it is clear the current backup is no longer needed, such as when a new backup
   is made or when the file is saved."
  ^js [custom-document-backup]
  (.delete ^js custom-document-backup))
