(ns dots.vscode.file-stat
  "The `FileStat`-type represents metadata about a file"
  (:refer-clojure :exclude [type]))

(defn type
  "The type of the file, e.g. is a regular file, a directory, or symbolic link
   to a file.
   
   *Note:* This value might be a bitmask, e.g. `FileType.File | FileType.SymbolicLink`.
   
   **Returns:** `FileType`"
  ^js [file-stat]
  (.-type ^js file-stat))

(defn set-type!
  "The type of the file, e.g. is a regular file, a directory, or symbolic link
   to a file.
   
   *Note:* This value might be a bitmask, e.g. `FileType.File | FileType.SymbolicLink`."
  ^js [file-stat value]
  (set! (.-type ^js file-stat) value))

(defn ctime
  "The creation timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
   
   **Returns:** `number`"
  ^js [file-stat]
  (.-ctime ^js file-stat))

(defn set-ctime!
  "The creation timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC."
  ^js [file-stat value]
  (set! (.-ctime ^js file-stat) value))

(defn mtime
  "The modification timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
   
   *Note:* If the file changed, it is important to provide an updated `mtime` that advanced
   from the previous value. Otherwise there may be optimizations in place that will not show
   the updated file contents in an editor for example.
   
   **Returns:** `number`"
  ^js [file-stat]
  (.-mtime ^js file-stat))

(defn set-mtime!
  "The modification timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
   
   *Note:* If the file changed, it is important to provide an updated `mtime` that advanced
   from the previous value. Otherwise there may be optimizations in place that will not show
   the updated file contents in an editor for example."
  ^js [file-stat value]
  (set! (.-mtime ^js file-stat) value))

(defn size
  "The size in bytes.
   
   *Note:* If the file changed, it is important to provide an updated `size`. Otherwise there
   may be optimizations in place that will not show the updated file contents in an editor for
   example.
   
   **Returns:** `number`"
  ^js [file-stat]
  (.-size ^js file-stat))

(defn set-size!
  "The size in bytes.
   
   *Note:* If the file changed, it is important to provide an updated `size`. Otherwise there
   may be optimizations in place that will not show the updated file contents in an editor for
   example."
  ^js [file-stat value]
  (set! (.-size ^js file-stat) value))

(defn permissions
  "The permissions of the file, e.g. whether the file is readonly.
   
   *Note:* This value might be a bitmask, e.g. `FilePermission.Readonly | FilePermission.Other`.
   
   **Returns:** `FilePermission | undefined`"
  ^js [file-stat]
  (.-permissions ^js file-stat))

(defn set-permissions!
  "The permissions of the file, e.g. whether the file is readonly.
   
   *Note:* This value might be a bitmask, e.g. `FilePermission.Readonly | FilePermission.Other`."
  ^js [file-stat value]
  (set! (.-permissions ^js file-stat) value))
