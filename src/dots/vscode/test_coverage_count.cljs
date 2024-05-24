(ns dots.vscode.test-coverage-count
  "A class that contains information about a covered resource. A count can
   be give for lines, branches, and declarations in a file.")

(defn covered
  "Number of items covered in the file.
   
   **Returns:** `number`"
  ^js [test-coverage-count]
  (.-covered ^js test-coverage-count))

(defn set-covered!
  "Number of items covered in the file."
  ^js [test-coverage-count value]
  (set! (.-covered ^js test-coverage-count) value))

(defn total
  "Total number of covered items in the file.
   
   **Returns:** `number`"
  ^js [test-coverage-count]
  (.-total ^js test-coverage-count))

(defn set-total!
  "Total number of covered items in the file."
  ^js [test-coverage-count value]
  (set! (.-total ^js test-coverage-count) value))
