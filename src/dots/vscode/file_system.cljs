(ns dots.vscode.file-system
  "The file system interface exposes the editor's built-in and contributed
   {@link FileSystemProvider file system providers}. It allows extensions to work
   with files from the local disk as well as files from remote places, like the
   remote extension host or ftp-servers.
   
   *Note* that an instance of this interface is available as {@linkcode workspace.fs }.")

(defn stat
  "Retrieve metadata about a file."
  ^js [file-system uri]
  (.stat ^js file-system uri))

(defn read-directory
  "Retrieve all entries of a {@link FileType.Directory directory}."
  ^js [file-system uri]
  (.readDirectory ^js file-system uri))

(defn create-directory
  "Create a new directory (Note, that new files are created via `write`-calls).
   
   *Note* that missing directories are created automatically, e.g this call has
   `mkdirp` semantics."
  ^js [file-system uri]
  (.createDirectory ^js file-system uri))

(defn read-file
  "Read the entire contents of a file."
  ^js [file-system uri]
  (.readFile ^js file-system uri))

(defn write-file
  "Write data to a file, replacing its entire contents."
  ^js [file-system uri content]
  (.writeFile ^js file-system uri content))

(defn delete
  "Delete a file."
  (^js [file-system uri]
   (.delete ^js file-system uri))
  (^js [file-system uri options]
   (.delete ^js file-system uri options)))

(defn rename
  "Rename a file or folder."
  (^js [file-system source target]
   (.rename ^js file-system source target))
  (^js [file-system source target options]
   (.rename ^js file-system source target options)))

(defn copy
  "Copy files or folders."
  (^js [file-system source target]
   (.copy ^js file-system source target))
  (^js [file-system source target options]
   (.copy ^js file-system source target options)))

(defn writable-file-system?
  "Check if a given file system supports writing files.
   
   Keep in mind that just because a file system supports writing, that does
   not mean that writes will always succeed. There may be permissions issues
   or other errors that prevent writing a file."
  ^js [file-system scheme]
  (.isWritableFileSystem ^js file-system scheme))
