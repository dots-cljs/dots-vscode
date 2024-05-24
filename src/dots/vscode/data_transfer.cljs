(ns dots.vscode.data-transfer
  "A map containing a mapping of the mime type of the corresponding transferred data.
   
   Drag and drop controllers that implement {@link TreeDragAndDropController.handleDrag `handleDrag`} can add additional mime types to the
   data transfer. These additional mime types will only be included in the `handleDrop` when the the drag was initiated from
   an element in the same drag and drop controller."
  (:refer-clojure :exclude [get set]))

(defn get
  "Retrieves the data transfer item for a given mime type.
   
   **Parameters:**
   - `mime-type`: `string` - The mime type to get the data transfer item for, such as `text/plain` or `image/png`.
   Mimes type look ups are case-insensitive.
   
   Special mime types:
   - `text/uri-list` — A string with `toString()`ed Uris separated by `\\r\\n`. To specify a cursor position in the file,
   set the Uri's fragment to `L3,5`, where 3 is the line number and 5 is the column number.
   
   **Returns:** `DataTransferItem | undefined`"
  ^js [data-transfer mime-type]
  (.get ^js data-transfer mime-type))

(defn set
  "Sets a mime type to data transfer item mapping.
   
   **Parameters:**
   - `mime-type`: `string` - The mime type to set the data for. Mimes types stored in lower case, with case-insensitive looks up.
   - `value`: `DataTransferItem` - The data transfer item for the given mime type.
   
   **Returns:** `void`"
  ^js [data-transfer mime-type value]
  (.set ^js data-transfer mime-type value))

(defn for-each
  "Allows iteration through the data transfer items.
   
   **Parameters:**
   - `callbackfn`: `(item: DataTransferItem, mimeType: string, dataTransfer: DataTransfer) => void` - Callback for iteration through the data transfer items.
   - `this-arg`: `any` - The `this` context used when invoking the handler function.
   
   **Returns:** `void`"
  (^js [data-transfer callbackfn]
   (.forEach ^js data-transfer callbackfn))
  (^js [data-transfer callbackfn this-arg]
   (.forEach ^js data-transfer callbackfn this-arg)))
