(ns dots.vscode.text-document
  "Represents a text document, such as a source file. Text documents have
   {@link TextLine lines} and knowledge about an underlying resource like a file.")

(defn uri
  "The associated uri for this document.
   
   *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
   saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
   
   **Returns:** `Uri`"
  ^js [text-document]
  (.-uri ^js text-document))

(defn file-name
  "The file system path of the associated resource. Shorthand
   notation for {@link TextDocument.uri TextDocument.uri.fsPath}. Independent of the uri scheme.
   
   **Returns:** `string`"
  ^js [text-document]
  (.-fileName ^js text-document))

(defn untitled?
  "Is this document representing an untitled file which has never been saved yet. *Note* that
   this does not mean the document will be saved to disk, use {@linkcode Uri.scheme }
   to figure out where a document will be {@link FileSystemProvider saved}, e.g. `file`, `ftp` etc.
   
   **Returns:** `boolean`"
  ^js [text-document]
  (.-isUntitled ^js text-document))

(defn language-id
  "The identifier of the language associated with this document.
   
   **Returns:** `string`"
  ^js [text-document]
  (.-languageId ^js text-document))

(defn version
  "The version number of this document (it will strictly increase after each
   change, including undo/redo).
   
   **Returns:** `number`"
  ^js [text-document]
  (.-version ^js text-document))

(defn dirty?
  "`true` if there are unpersisted changes.
   
   **Returns:** `boolean`"
  ^js [text-document]
  (.-isDirty ^js text-document))

(defn closed?
  "`true` if the document has been closed. A closed document isn't synchronized anymore
   and won't be re-used when the same resource is opened again.
   
   **Returns:** `boolean`"
  ^js [text-document]
  (.-isClosed ^js text-document))

(defn save
  "Save the underlying file.
   
   **Returns:** `Thenable<boolean>` - A promise that will resolve to `true` when the file
   has been saved. If the save failed, will return `false`."
  ^js [text-document]
  (.save ^js text-document))

(defn eol
  "The {@link EndOfLine end of line} sequence that is predominately
   used in this document.
   
   **Returns:** `EndOfLine`"
  ^js [text-document]
  (.-eol ^js text-document))

(defn line-count
  "The number of lines in this document.
   
   **Returns:** `number`"
  ^js [text-document]
  (.-lineCount ^js text-document))

(defn line-at
  "Returns a text line denoted by the line number. Note
   that the returned object is *not* live and changes to the
   document are not reflected.
   Returns a text line denoted by the position. Note
   that the returned object is *not* live and changes to the
   document are not reflected.
   
   The position will be {@link TextDocument.validatePosition adjusted}.
   
   **Parameters:**
   - `line`: `number` - A line number in [0, lineCount).
   - `position`: `Position` - A position.
   
   **Returns:** `TextLine` - A {@link TextLineline}."
  {:arglists '([text-document line]
               [text-document position])}
  ^js [a b]
  (.lineAt ^js a b))

(defn offset-at
  "Converts the position to a zero-based offset.
   
   The position will be {@link TextDocument.validatePosition adjusted}.
   
   **Parameters:**
   - `position`: `Position` - A position.
   
   **Returns:** `number` - A valid zero-based offset."
  ^js [text-document position]
  (.offsetAt ^js text-document position))

(defn position-at
  "Converts a zero-based offset to a position.
   
   **Parameters:**
   - `offset`: `number` - A zero-based offset.
   
   **Returns:** `Position` - A valid {@link Position}."
  ^js [text-document offset]
  (.positionAt ^js text-document offset))

(defn text
  "Get the text of this document. A substring can be retrieved by providing
   a range. The range will be {@link TextDocument.validateRange adjusted}.
   
   **Parameters:**
   - `range`: `Range | undefined` - Include only the text included by the range.
   
   **Returns:** `string` - The text inside the provided range or the entire text."
  (^js [text-document]
   (.getText ^js text-document))
  (^js [text-document range]
   (.getText ^js text-document range)))

(defn word-range-at-position
  "Get a word-range at the given position. By default words are defined by
   common separators, like space, -, _, etc. In addition, per language custom
   [word definitions] can be defined. It
   is also possible to provide a custom regular expression.
   
   * *Note 1:* A custom regular expression must not match the empty string and
   if it does, it will be ignored.
   * *Note 2:* A custom regular expression will fail to match multiline strings
   and in the name of speed regular expressions should not match words with
   spaces. Use {@linkcode TextLine.text } for more complex, non-wordy, scenarios.
   
   The position will be {@link TextDocument.validatePosition adjusted}.
   
   **Parameters:**
   - `position`: `Position` - A position.
   - `regex`: `RegExp | undefined` - Optional regular expression that describes what a word is.
   
   **Returns:** `Range | undefined` - A range spanning a word, or `undefined`."
  (^js [text-document position]
   (.getWordRangeAtPosition ^js text-document position))
  (^js [text-document position regex]
   (.getWordRangeAtPosition ^js text-document position regex)))

(defn validate-range
  "Ensure a range is completely contained in this document.
   
   **Parameters:**
   - `range`: `Range` - A range.
   
   **Returns:** `Range` - The given range or a new, adjusted range."
  ^js [text-document range]
  (.validateRange ^js text-document range))

(defn validate-position
  "Ensure a position is contained in the range of this document.
   
   **Parameters:**
   - `position`: `Position` - A position.
   
   **Returns:** `Position` - The given position or a new, adjusted position."
  ^js [text-document position]
  (.validatePosition ^js text-document position))
