(ns dots.vscode.notebook-serializer
  "The notebook serializer enables the editor to open notebook files.
   
   At its core the editor only knows a {@link NotebookData notebook data structure} but not
   how that data structure is written to a file, nor how it is read from a file. The
   notebook serializer bridges this gap by deserializing bytes into notebook data and
   vice versa.")

(defn deserialize-notebook
  "Deserialize contents of a notebook file into the notebook data structure."
  ^js [notebook-serializer content token]
  (.deserializeNotebook ^js notebook-serializer content token))

(defn serialize-notebook
  "Serialize notebook data into file contents."
  ^js [notebook-serializer data token]
  (.serializeNotebook ^js notebook-serializer data token))
