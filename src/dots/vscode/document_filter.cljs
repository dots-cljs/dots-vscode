(ns dots.vscode.document-filter
  "A document filter denotes a document by different properties like
   the {@link TextDocument.languageId language}, the {@link Uri.scheme scheme} of
   its resource, or a glob-pattern that is applied to the {@link TextDocument.fileName path}.")

(defn language
  "A language id, like `typescript`."
  ^js [document-filter]
  (.-language ^js document-filter))

(defn notebook-type
  "The {@link NotebookDocument.notebookType type} of a notebook, like `jupyter-notebook`. This allows
   to narrow down on the type of a notebook that a {@link NotebookCell.document cell document} belongs to.
   
   *Note* that setting the `notebookType`-property changes how `scheme` and `pattern` are interpreted. When set
   they are evaluated against the {@link NotebookDocument.uri notebook uri}, not the document uri."
  ^js [document-filter]
  (.-notebookType ^js document-filter))

(defn scheme
  "A Uri {@link Uri.scheme scheme}, like `file` or `untitled`."
  ^js [document-filter]
  (.-scheme ^js document-filter))

(defn pattern
  "A {@link GlobPattern glob pattern} that is matched on the absolute path of the document. Use a {@link RelativePattern relative pattern}
   to filter documents to a {@link WorkspaceFolder workspace folder}."
  ^js [document-filter]
  (.-pattern ^js document-filter))
