(ns dots.vscode.text-document
  "Represents a text document, such as a source file. Text documents have
   {@link TextLine lines} and knowledge about an underlying resource like a file.")

(defn uri
  "The associated uri for this document.
   
   *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
   saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk."
  ^js [text-document]
  (.-uri ^js text-document))

(defn file-name
  "The file system path of the associated resource. Shorthand
   notation for {@link TextDocument.uri TextDocument.uri.fsPath}. Independent of the uri scheme."
  ^js [text-document]
  (.-fileName ^js text-document))

(defn untitled?
  "Is this document representing an untitled file which has never been saved yet. *Note* that
   this does not mean the document will be saved to disk, use {@linkcode Uri.scheme }
   to figure out where a document will be {@link FileSystemProvider saved}, e.g. `file`, `ftp` etc."
  ^js [text-document]
  (.-isUntitled ^js text-document))

(defn language-id
  "The identifier of the language associated with this document."
  ^js [text-document]
  (.-languageId ^js text-document))

(defn version
  "The version number of this document (it will strictly increase after each
   change, including undo/redo)."
  ^js [text-document]
  (.-version ^js text-document))

(defn dirty?
  "`true` if there are unpersisted changes."
  ^js [text-document]
  (.-isDirty ^js text-document))

(defn closed?
  "`true` if the document has been closed. A closed document isn't synchronized anymore
   and won't be re-used when the same resource is opened again."
  ^js [text-document]
  (.-isClosed ^js text-document))

(defn save
  "Save the underlying file."
  ^js [text-document]
  (.save ^js text-document))

(defn eol
  "The {@link EndOfLine end of line} sequence that is predominately
   used in this document."
  ^js [text-document]
  (.-eol ^js text-document))

(defn line-count
  "The number of lines in this document."
  ^js [text-document]
  (.-lineCount ^js text-document))

(defn line-at
  "Returns a text line denoted by the line number. Note
   that the returned object is *not* live and changes to the
   document are not reflected.
   Returns a text line denoted by the position. Note
   that the returned object is *not* live and changes to the
   document are not reflected.
   
   The position will be {@link TextDocument.validatePosition adjusted}."
  {:arglists '([text-document line]
               [text-document position])}
  ^js [a b]
  (.lineAt ^js a b))

(defn offset-at
  "Converts the position to a zero-based offset.
   
   The position will be {@link TextDocument.validatePosition adjusted}."
  ^js [text-document position]
  (.offsetAt ^js text-document position))

(defn position-at
  "Converts a zero-based offset to a position."
  ^js [text-document offset]
  (.positionAt ^js text-document offset))

(defn text
  "Get the text of this document. A substring can be retrieved by providing
   a range. The range will be {@link TextDocument.validateRange adjusted}."
  (^js [text-document]
   (.getText ^js text-document))
  (^js [text-document range]
   (.getText ^js text-document range)))

(defn word-range-at-position
  "Get a word-range at the given position. By default words are defined by
   common separators, like space, -, _, etc. In addition, per language custom
   [word definitions} can be defined. It
   is also possible to provide a custom regular expression.
   
   * *Note 1:* A custom regular expression must not match the empty string and
   if it does, it will be ignored.
   * *Note 2:* A custom regular expression will fail to match multiline strings
   and in the name of speed regular expressions should not match words with
   spaces. Use {@linkcode TextLine.text } for more complex, non-wordy, scenarios.
   
   The position will be {@link TextDocument.validatePosition adjusted}."
  (^js [text-document position]
   (.getWordRangeAtPosition ^js text-document position))
  (^js [text-document position regex]
   (.getWordRangeAtPosition ^js text-document position regex)))

(defn validate-range
  "Ensure a range is completely contained in this document."
  ^js [text-document range]
  (.validateRange ^js text-document range))

(defn validate-position
  "Ensure a position is contained in the range of this document."
  ^js [text-document position]
  (.validatePosition ^js text-document position))
