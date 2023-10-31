(ns dots.vscode.file-system-provider
  "The filesystem provider defines what the editor needs to read, write, discover,
   and to manage files and folders. It allows extensions to serve files from remote places,
   like ftp-servers, and to seamlessly integrate those into the editor.
   
   * *Note 1:* The filesystem provider API works with {@link Uri uris} and assumes hierarchical
   paths, e.g. `foo:/my/path` is a child of `foo:/my/` and a parent of `foo:/my/path/deeper`.
   * *Note 2:* There is an activation event `onFileSystem:<scheme>` that fires when a file
   or folder is being accessed.
   * *Note 3:* The word 'file' is often used to denote all {@link FileType kinds} of files, e.g.
   folders, symbolic links, and regular files.")

(defn on-did-change-file
  "An event to signal that a resource has been created, changed, or deleted. This
   event should fire for resources that are being {@link FileSystemProvider.watch watched}
   by clients of this provider.
   
   *Note:* It is important that the metadata of the file that changed provides an
   updated `mtime` that advanced from the previous value in the {@link FileStat stat} and a
   correct `size` value. Otherwise there may be optimizations in place that will not show
   the change in an editor for example."
  (^js [file-system-provider]
   (.-onDidChangeFile ^js file-system-provider))
  (^js [file-system-provider listener]
   (.onDidChangeFile ^js file-system-provider listener))
  (^js [file-system-provider listener this-args]
   (.onDidChangeFile ^js file-system-provider listener this-args))
  (^js [file-system-provider listener this-args disposables]
   (.onDidChangeFile ^js file-system-provider listener this-args disposables)))

(defn watch
  "Subscribes to file change events in the file or folder denoted by `uri`. For folders,
   the option `recursive` indicates whether subfolders, sub-subfolders, etc. should
   be watched for file changes as well. With `recursive: false`, only changes to the
   files that are direct children of the folder should trigger an event.
   
   The `excludes` array is used to indicate paths that should be excluded from file
   watching. It is typically derived from the `files.watcherExclude` setting that
   is configurable by the user. Each entry can be be:
   - the absolute path to exclude
   - a relative path to exclude (for example `build/output`)
   - a simple glob pattern (for example `**​/build`, `output/**`)
   
   It is the file system provider's job to call {@linkcode FileSystemProvider.onDidChangeFile onDidChangeFile}
   for every change given these rules. No event should be emitted for files that match any of the provided
   excludes."
  ^js [file-system-provider uri options]
  (.watch ^js file-system-provider uri options))

(defn stat
  "Retrieve metadata about a file.
   
   Note that the metadata for symbolic links should be the metadata of the file they refer to.
   Still, the {@link FileType.SymbolicLink SymbolicLink}-type must be used in addition to the actual type, e.g.
   `FileType.SymbolicLink | FileType.Directory`."
  ^js [file-system-provider uri]
  (.stat ^js file-system-provider uri))

(defn read-directory
  "Retrieve all entries of a {@link FileType.Directory directory}."
  ^js [file-system-provider uri]
  (.readDirectory ^js file-system-provider uri))

(defn create-directory
  "Create a new directory (Note, that new files are created via `write`-calls)."
  ^js [file-system-provider uri]
  (.createDirectory ^js file-system-provider uri))

(defn read-file
  "Read the entire contents of a file."
  ^js [file-system-provider uri]
  (.readFile ^js file-system-provider uri))

(defn write-file
  "Write data to a file, replacing its entire contents."
  ^js [file-system-provider uri content options]
  (.writeFile ^js file-system-provider uri content options))

(defn delete
  "Delete a file."
  ^js [file-system-provider uri options]
  (.delete ^js file-system-provider uri options))

(defn rename
  "Rename a file or folder."
  ^js [file-system-provider old-uri new-uri options]
  (.rename ^js file-system-provider old-uri new-uri options))

(defn copy
  "Copy files or folders. Implementing this function is optional but it will speedup
   the copy operation."
  ^js [file-system-provider source destination options]
  (.copy ^js file-system-provider source destination options))
