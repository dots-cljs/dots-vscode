(ns dots.vscode.file-system-watcher
  "A file system watcher notifies about changes to files and folders
   on disk or from other {@link FileSystemProvider FileSystemProviders}.
   
   To get an instance of a `FileSystemWatcher` use
   {@link workspace.createFileSystemWatcher createFileSystemWatcher}.")

(defn ignore-create-events?
  "true if this file system watcher has been created such that
   it ignores creation file system events.
   
   **Returns:** `boolean`"
  ^js [file-system-watcher]
  (.-ignoreCreateEvents ^js file-system-watcher))

(defn ignore-change-events?
  "true if this file system watcher has been created such that
   it ignores change file system events.
   
   **Returns:** `boolean`"
  ^js [file-system-watcher]
  (.-ignoreChangeEvents ^js file-system-watcher))

(defn ignore-delete-events?
  "true if this file system watcher has been created such that
   it ignores delete file system events.
   
   **Returns:** `boolean`"
  ^js [file-system-watcher]
  (.-ignoreDeleteEvents ^js file-system-watcher))

(defn on-did-create
  "An event which fires on file/folder creation.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [file-system-watcher]
   (.-onDidCreate ^js file-system-watcher))
  (^js [file-system-watcher listener]
   (.onDidCreate ^js file-system-watcher listener))
  (^js [file-system-watcher listener this-args]
   (.onDidCreate ^js file-system-watcher listener this-args))
  (^js [file-system-watcher listener this-args disposables]
   (.onDidCreate ^js file-system-watcher listener this-args disposables)))

(defn on-did-change
  "An event which fires on file/folder change.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [file-system-watcher]
   (.-onDidChange ^js file-system-watcher))
  (^js [file-system-watcher listener]
   (.onDidChange ^js file-system-watcher listener))
  (^js [file-system-watcher listener this-args]
   (.onDidChange ^js file-system-watcher listener this-args))
  (^js [file-system-watcher listener this-args disposables]
   (.onDidChange ^js file-system-watcher listener this-args disposables)))

(defn on-did-delete
  "An event which fires on file/folder deletion.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [file-system-watcher]
   (.-onDidDelete ^js file-system-watcher))
  (^js [file-system-watcher listener]
   (.onDidDelete ^js file-system-watcher listener))
  (^js [file-system-watcher listener this-args]
   (.onDidDelete ^js file-system-watcher listener this-args))
  (^js [file-system-watcher listener this-args disposables]
   (.onDidDelete ^js file-system-watcher listener this-args disposables)))

(defn dispose
  "Dispose this object.
   
   **Returns:** `any`"
  ^js [file-system-watcher]
  (.dispose ^js file-system-watcher))
