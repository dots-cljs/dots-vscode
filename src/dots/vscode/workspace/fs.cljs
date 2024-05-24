(ns dots.vscode.workspace.fs
  "A {@link FileSystem file system} instance that allows to interact with local and remote
   files, e.g. `vscode.workspace.fs.readDirectory(someUri)` allows to retrieve all entries
   of a directory or `vscode.workspace.fs.stat(anotherUri)` returns the meta data for a
   file."
  (:require ["vscode" :as vscode]))

(defn stat
  "Retrieve metadata about a file.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file to retrieve metadata about.
   
   **Returns:** `Thenable<FileStat>` - The file metadata about the file."
  ^js [uri]
  (.. vscode/workspace -fs (stat uri)))

(defn read-directory
  "Retrieve all entries of a {@link FileType.Directory directory}.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the folder.
   
   **Returns:** `Thenable<[string, FileType][]>` - An array of name/type-tuples or a thenable that resolves to such."
  ^js [uri]
  (.. vscode/workspace -fs (readDirectory uri)))

(defn create-directory
  "Create a new directory (Note, that new files are created via `write`-calls).
   
   *Note* that missing directories are created automatically, e.g this call has
   `mkdirp` semantics.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the new folder.
   
   **Returns:** `Thenable<void>`"
  ^js [uri]
  (.. vscode/workspace -fs (createDirectory uri)))

(defn read-file
  "Read the entire contents of a file.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file.
   
   **Returns:** `Thenable<Uint8Array>` - An array of bytes or a thenable that resolves to such."
  ^js [uri]
  (.. vscode/workspace -fs (readFile uri)))

(defn write-file
  "Write data to a file, replacing its entire contents.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file.
   - `content`: `Uint8Array` - The new content of the file.
   
   **Returns:** `Thenable<void>`"
  ^js [uri content]
  (.. vscode/workspace -fs (writeFile uri content)))

(defn delete
  "Delete a file.
   
   **Parameters:**
   - `uri`: `Uri` - The resource that is to be deleted.
   - `options`: `{ recursive?: boolean | undefined; useTrash?: boolean | undefined; } | undefined` - Defines if trash can should be used and if deletion of folders is recursive
   
   **Returns:** `Thenable<void>`"
  (^js [uri]
   (.. vscode/workspace -fs (delete uri)))
  (^js [uri options]
   (.. vscode/workspace -fs (delete uri options))))

(defn rename
  "Rename a file or folder.
   
   **Parameters:**
   - `source`: `Uri` - The existing file.
   - `target`: `Uri` - The new location.
   - `options`: `{ overwrite?: boolean | undefined; } | undefined` - Defines if existing files should be overwritten.
   
   **Returns:** `Thenable<void>`"
  (^js [source target]
   (.. vscode/workspace -fs (rename source target)))
  (^js [source target options]
   (.. vscode/workspace -fs (rename source target options))))

(defn copy
  "Copy files or folders.
   
   **Parameters:**
   - `source`: `Uri` - The existing file.
   - `target`: `Uri` - The destination location.
   - `options`: `{ overwrite?: boolean | undefined; } | undefined` - Defines if existing files should be overwritten.
   
   **Returns:** `Thenable<void>`"
  (^js [source target]
   (.. vscode/workspace -fs (copy source target)))
  (^js [source target options]
   (.. vscode/workspace -fs (copy source target options))))

(defn writable-file-system?
  "Check if a given file system supports writing files.
   
   Keep in mind that just because a file system supports writing, that does
   not mean that writes will always succeed. There may be permissions issues
   or other errors that prevent writing a file.
   
   **Parameters:**
   - `scheme`: `string` - The scheme of the filesystem, for example `file` or `git`.
   
   **Returns:** `boolean | undefined` - `true` if the file system supports writing, `false` if it does not
   support writing (i.e. it is readonly), and `undefined` if the editor does not
   know about the filesystem."
  ^js [scheme]
  (.. vscode/workspace -fs (isWritableFileSystem scheme)))
