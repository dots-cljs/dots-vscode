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
   the change in an editor for example.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
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
   excludes.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file or folder to be watched.
   - `options`: `{ readonly recursive: boolean; readonly excludes: readonly string[]; }` - Configures the watch.
   
   **Returns:** `Disposable` - A disposable that tells the provider to stop watching the `uri`."
  ^js [file-system-provider uri options]
  (.watch ^js file-system-provider uri options))

(defn stat
  "Retrieve metadata about a file.
   
   Note that the metadata for symbolic links should be the metadata of the file they refer to.
   Still, the {@link FileType.SymbolicLink SymbolicLink}-type must be used in addition to the actual type, e.g.
   `FileType.SymbolicLink | FileType.Directory`.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file to retrieve metadata about.
   
   **Returns:** `FileStat | Thenable<FileStat>` - The file metadata about the file."
  ^js [file-system-provider uri]
  (.stat ^js file-system-provider uri))

(defn read-directory
  "Retrieve all entries of a {@link FileType.Directory directory}.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the folder.
   
   **Returns:** `[string, FileType][] | Thenable<[string, FileType][]>` - An array of name/type-tuples or a thenable that resolves to such."
  ^js [file-system-provider uri]
  (.readDirectory ^js file-system-provider uri))

(defn create-directory
  "Create a new directory (Note, that new files are created via `write`-calls).
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the new folder.
   
   **Returns:** `void | Thenable<void>`"
  ^js [file-system-provider uri]
  (.createDirectory ^js file-system-provider uri))

(defn read-file
  "Read the entire contents of a file.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file.
   
   **Returns:** `Uint8Array | Thenable<Uint8Array>` - An array of bytes or a thenable that resolves to such."
  ^js [file-system-provider uri]
  (.readFile ^js file-system-provider uri))

(defn write-file
  "Write data to a file, replacing its entire contents.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file.
   - `content`: `Uint8Array` - The new content of the file.
   - `options`: `{ readonly create: boolean; readonly overwrite: boolean; }` - Defines if missing files should or must be created.
   
   **Returns:** `void | Thenable<void>`"
  ^js [file-system-provider uri content options]
  (.writeFile ^js file-system-provider uri content options))

(defn delete
  "Delete a file.
   
   **Parameters:**
   - `uri`: `Uri` - The resource that is to be deleted.
   - `options`: `{ readonly recursive: boolean; }` - Defines if deletion of folders is recursive.
   
   **Returns:** `void | Thenable<void>`"
  ^js [file-system-provider uri options]
  (.delete ^js file-system-provider uri options))

(defn rename
  "Rename a file or folder.
   
   **Parameters:**
   - `old-uri`: `Uri` - The existing file.
   - `new-uri`: `Uri` - The new location.
   - `options`: `{ readonly overwrite: boolean; }` - Defines if existing files should be overwritten.
   
   **Returns:** `void | Thenable<void>`"
  ^js [file-system-provider old-uri new-uri options]
  (.rename ^js file-system-provider old-uri new-uri options))

(defn copy
  "Copy files or folders. Implementing this function is optional but it will speedup
   the copy operation.
   
   **Parameters:**
   - `source`: `Uri` - The existing file.
   - `destination`: `Uri` - The destination location.
   - `options`: `{ readonly overwrite: boolean; }` - Defines if existing files should be overwritten.
   
   **Returns:** `void | Thenable<void>`"
  ^js [file-system-provider source destination options]
  (.copy ^js file-system-provider source destination options))
