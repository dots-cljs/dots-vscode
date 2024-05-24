(ns dots.vscode.notebook-cell-output
  "Notebook cell output represents a result of executing a cell. It is a container type for multiple
   {@link NotebookCellOutputItem output items} where contained items represent the same result but
   use different MIME types.")

(defn items
  "The output items of this output. Each item must represent the same result. _Note_ that repeated
   MIME types per output is invalid and that the editor will just pick one of them.
   
   ```ts
   new vscode.NotebookCellOutput([
   	vscode.NotebookCellOutputItem.text('Hello', 'text/plain'),
   	vscode.NotebookCellOutputItem.text('<i>Hello</i>', 'text/html'),
   	vscode.NotebookCellOutputItem.text('_Hello_', 'text/markdown'),
   	vscode.NotebookCellOutputItem.text('Hey', 'text/plain'), // INVALID: repeated type, editor will pick just one
   ])
   ```
   
   **Returns:** `NotebookCellOutputItem[]`"
  ^js [notebook-cell-output]
  (.-items ^js notebook-cell-output))

(defn set-items!
  "The output items of this output. Each item must represent the same result. _Note_ that repeated
   MIME types per output is invalid and that the editor will just pick one of them.
   
   ```ts
   new vscode.NotebookCellOutput([
   	vscode.NotebookCellOutputItem.text('Hello', 'text/plain'),
   	vscode.NotebookCellOutputItem.text('<i>Hello</i>', 'text/html'),
   	vscode.NotebookCellOutputItem.text('_Hello_', 'text/markdown'),
   	vscode.NotebookCellOutputItem.text('Hey', 'text/plain'), // INVALID: repeated type, editor will pick just one
   ])
   ```"
  ^js [notebook-cell-output value]
  (set! (.-items ^js notebook-cell-output) value))

(defn metadata
  "Arbitrary metadata for this cell output. Can be anything but must be JSON-stringifyable.
   
   **Returns:** `{ [key: string]: any; } | undefined`"
  ^js [notebook-cell-output]
  (.-metadata ^js notebook-cell-output))

(defn set-metadata!
  "Arbitrary metadata for this cell output. Can be anything but must be JSON-stringifyable."
  ^js [notebook-cell-output value]
  (set! (.-metadata ^js notebook-cell-output) value))
