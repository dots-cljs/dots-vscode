(ns dots.vscode.test-item-collection
  "Collection of test items, found in {@link TestItem.children } and
   {@link TestController.items }."
  (:refer-clojure :exclude [get replace]))

(defn size
  "Gets the number of items in the collection."
  ^js [test-item-collection]
  (.-size ^js test-item-collection))

(defn replace
  "Replaces the items stored by the collection.
   
   **Parameters:**
   - `items`: `readonly TestItem[]` - Items to store.
   
   **Returns:** `void`"
  ^js [test-item-collection items]
  (.replace ^js test-item-collection items))

(defn for-each
  "Iterate over each entry in this collection.
   
   **Parameters:**
   - `callback`: `(item: TestItem, collection: TestItemCollection) => unknown` - Function to execute for each entry.
   - `this-arg`: `any` - The `this` context used when invoking the handler function.
   
   **Returns:** `void`"
  (^js [test-item-collection callback]
   (.forEach ^js test-item-collection callback))
  (^js [test-item-collection callback this-arg]
   (.forEach ^js test-item-collection callback this-arg)))

(defn add
  "Adds the test item to the children. If an item with the same ID already
   exists, it'll be replaced.
   
   **Parameters:**
   - `item`: `TestItem` - Item to add.
   
   **Returns:** `void`"
  ^js [test-item-collection item]
  (.add ^js test-item-collection item))

(defn delete
  "Removes a single test item from the collection.
   
   **Parameters:**
   - `item-id`: `string` - Item ID to delete.
   
   **Returns:** `void`"
  ^js [test-item-collection item-id]
  (.delete ^js test-item-collection item-id))

(defn get
  "Efficiently gets a test item by ID, if it exists, in the children.
   
   **Parameters:**
   - `item-id`: `string` - Item ID to get.
   
   **Returns:** `TestItem | undefined` - The found item or undefined if it does not exist."
  ^js [test-item-collection item-id]
  (.get ^js test-item-collection item-id))
