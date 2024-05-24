(ns dots.vscode.data-transfer-file
  "A file associated with a {@linkcode DataTransferItem }.
   
   Instances of this type can only be created by the editor and not by extensions."
  (:refer-clojure :exclude [name]))

(defn name
  "The name of the file."
  ^js [data-transfer-file]
  (.-name ^js data-transfer-file))

(defn uri
  "The full file path of the file.
   
   May be `undefined` on web."
  ^js [data-transfer-file]
  (.-uri ^js data-transfer-file))

(defn data
  "The full file contents of the file.
   
   **Returns:** `Thenable<Uint8Array>`"
  ^js [data-transfer-file]
  (.data ^js data-transfer-file))
