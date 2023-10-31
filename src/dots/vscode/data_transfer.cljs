(ns dots.vscode.data-transfer
  "A map containing a mapping of the mime type of the corresponding transferred data.
   
   Drag and drop controllers that implement {@link TreeDragAndDropController.handleDrag `handleDrag`} can add additional mime types to the
   data transfer. These additional mime types will only be included in the `handleDrop` when the the drag was initiated from
   an element in the same drag and drop controller."
  (:refer-clojure :exclude [get set]))

(defn get
  "Retrieves the data transfer item for a given mime type."
  ^js [data-transfer mime-type]
  (.get ^js data-transfer mime-type))

(defn set
  "Sets a mime type to data transfer item mapping."
  ^js [data-transfer mime-type value]
  (.set ^js data-transfer mime-type value))

(defn for-each
  "Allows iteration through the data transfer items."
  (^js [data-transfer callbackfn]
   (.forEach ^js data-transfer callbackfn))
  (^js [data-transfer callbackfn this-arg]
   (.forEach ^js data-transfer callbackfn this-arg)))
