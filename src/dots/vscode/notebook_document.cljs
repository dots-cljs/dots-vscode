(ns dots.vscode.notebook-document
  "Represents a notebook which itself is a sequence of {@link NotebookCell code or markup cells}. Notebook documents are
   created from {@link NotebookData notebook data}.")

(defn uri
  "The associated uri for this notebook.
   
   *Note* that most notebooks use the `file`-scheme, which means they are files on disk. However, **not** all notebooks are
   saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk."
  ^js [notebook-document]
  (.-uri ^js notebook-document))

(defn notebook-type
  "The type of notebook."
  ^js [notebook-document]
  (.-notebookType ^js notebook-document))

(defn version
  "The version number of this notebook (it will strictly increase after each
   change, including undo/redo)."
  ^js [notebook-document]
  (.-version ^js notebook-document))

(defn dirty?
  "`true` if there are unpersisted changes."
  ^js [notebook-document]
  (.-isDirty ^js notebook-document))

(defn untitled?
  "Is this notebook representing an untitled file which has not been saved yet."
  ^js [notebook-document]
  (.-isUntitled ^js notebook-document))

(defn closed?
  "`true` if the notebook has been closed. A closed notebook isn't synchronized anymore
   and won't be re-used when the same resource is opened again."
  ^js [notebook-document]
  (.-isClosed ^js notebook-document))

(defn metadata
  "Arbitrary metadata for this notebook. Can be anything but must be JSON-stringifyable."
  ^js [notebook-document]
  (.-metadata ^js notebook-document))

(defn cell-count
  "The number of cells in the notebook."
  ^js [notebook-document]
  (.-cellCount ^js notebook-document))

(defn cell-at
  "Return the cell at the specified index. The index will be adjusted to the notebook.
   
   **Parameters:**
   - `index`: `number` - - The index of the cell to retrieve.
   
   **Returns:** `NotebookCell` - A {@link NotebookCellcell}."
  ^js [notebook-document index]
  (.cellAt ^js notebook-document index))

(defn cells
  "Get the cells of this notebook. A subset can be retrieved by providing
   a range. The range will be adjusted to the notebook.
   
   **Parameters:**
   - `range`: `NotebookRange | undefined` - A notebook range.
   
   **Returns:** `NotebookCell[]` - The cells contained by the range or all cells."
  (^js [notebook-document]
   (.getCells ^js notebook-document))
  (^js [notebook-document range]
   (.getCells ^js notebook-document range)))

(defn save
  "Save the document. The saving will be handled by the corresponding {@link NotebookSerializer serializer}.
   
   **Returns:** `Thenable<boolean>` - A promise that will resolve to true when the document
   has been saved. Will return false if the file was not dirty or when save failed."
  ^js [notebook-document]
  (.save ^js notebook-document))
