(ns dots.vscode.workspace.fs
  "A {@link FileSystem file system} instance that allows to interact with local and remote
   files, e.g. `vscode.workspace.fs.readDirectory(someUri)` allows to retrieve all entries
   of a directory or `vscode.workspace.fs.stat(anotherUri)` returns the meta data for a
   file."
  (:require ["vscode" :as vscode]))

(defn stat
  "Retrieve metadata about a file."
  ^js [uri]
  (.. vscode/workspace -fs (stat uri)))

(defn read-directory
  "Retrieve all entries of a {@link FileType.Directory directory}."
  ^js [uri]
  (.. vscode/workspace -fs (readDirectory uri)))

(defn create-directory
  "Create a new directory (Note, that new files are created via `write`-calls).
   
   *Note* that missing directories are created automatically, e.g this call has
   `mkdirp` semantics."
  ^js [uri]
  (.. vscode/workspace -fs (createDirectory uri)))

(defn read-file
  "Read the entire contents of a file."
  ^js [uri]
  (.. vscode/workspace -fs (readFile uri)))

(defn write-file
  "Write data to a file, replacing its entire contents."
  ^js [uri content]
  (.. vscode/workspace -fs (writeFile uri content)))

(defn delete
  "Delete a file."
  (^js [uri]
   (.. vscode/workspace -fs (delete uri)))
  (^js [uri options]
   (.. vscode/workspace -fs (delete uri options))))

(defn rename
  "Rename a file or folder."
  (^js [source target]
   (.. vscode/workspace -fs (rename source target)))
  (^js [source target options]
   (.. vscode/workspace -fs (rename source target options))))

(defn copy
  "Copy files or folders."
  (^js [source target]
   (.. vscode/workspace -fs (copy source target)))
  (^js [source target options]
   (.. vscode/workspace -fs (copy source target options))))

(defn writable-file-system?
  "Check if a given file system supports writing files.
   
   Keep in mind that just because a file system supports writing, that does
   not mean that writes will always succeed. There may be permissions issues
   or other errors that prevent writing a file."
  ^js [scheme]
  (.. vscode/workspace -fs (isWritableFileSystem scheme)))
