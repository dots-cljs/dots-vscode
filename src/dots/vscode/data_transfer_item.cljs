(ns dots.vscode.data-transfer-item
  "Encapsulates data transferred during drag and drop operations.")

(defn as-string
  "Get a string representation of this item.
   
   If {@linkcode DataTransferItem.value } is an object, this returns the result of json stringifying {@linkcode DataTransferItem.value } value.
   
   **Returns:** `Thenable<string>`"
  ^js [data-transfer-item]
  (.asString ^js data-transfer-item))

(defn as-file
  "Try getting the {@link DataTransferFile file} associated with this data transfer item.
   
   Note that the file object is only valid for the scope of the drag and drop operation.
   
   **Returns:** `DataTransferFile | undefined` - The file for the data transfer or `undefined` if the item is either not a file or the
   file data cannot be accessed."
  ^js [data-transfer-item]
  (.asFile ^js data-transfer-item))

(defn value
  "Custom data stored on this item.
   
   You can use `value` to share data across operations. The original object can be retrieved so long as the extension that
   created the `DataTransferItem` runs in the same extension host.
   
   **Returns:** `any`"
  ^js [data-transfer-item]
  (.-value ^js data-transfer-item))
