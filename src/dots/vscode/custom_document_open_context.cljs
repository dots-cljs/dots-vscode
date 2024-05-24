(ns dots.vscode.custom-document-open-context
  "Additional information about the opening custom document.")

(defn backup-id
  "The id of the backup to restore the document from or `undefined` if there is no backup.
   
   If this is provided, your extension should restore the editor from the backup instead of reading the file
   from the user's workspace.
   
   **Returns:** `string | undefined`"
  ^js [custom-document-open-context]
  (.-backupId ^js custom-document-open-context))

(defn untitled-document-data
  "If the URI is an untitled file, this will be populated with the byte data of that file
   
   If this is provided, your extension should utilize this byte data rather than executing fs APIs on the URI passed in
   
   **Returns:** `Uint8Array | undefined`"
  ^js [custom-document-open-context]
  (.-untitledDocumentData ^js custom-document-open-context))
