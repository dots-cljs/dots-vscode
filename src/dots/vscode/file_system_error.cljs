(ns dots.vscode.file-system-error
  "A type that filesystem providers should use to signal errors.
   
   This class has factory methods for common error-cases, like `FileNotFound` when
   a file or folder doesn't exist, use them like so: `throw vscode.FileSystemError.FileNotFound(someUri);`"
  (:refer-clojure :exclude [name])
  (:require ["vscode" :as vscode]))

(defn code
  "A code that identifies this error.
   
   Possible values are names of errors, like {@linkcode FileSystemError.FileNotFound FileNotFound},
   or `Unknown` for unspecified errors.
   
   **Returns:** `string`"
  ^js [file-system-error]
  (.-code ^js file-system-error))

(defn name
  "**Returns:** `string`"
  ^js [file-system-error]
  (.-name ^js file-system-error))

(defn set-name!
  ^js [file-system-error value]
  (set! (.-name ^js file-system-error) value))

(defn message
  "**Returns:** `string`"
  ^js [file-system-error]
  (.-message ^js file-system-error))

(defn set-message!
  ^js [file-system-error value]
  (set! (.-message ^js file-system-error) value))

(defn stack
  "**Returns:** `string | undefined`"
  ^js [file-system-error]
  (.-stack ^js file-system-error))

(defn set-stack!
  ^js [file-system-error value]
  (set! (.-stack ^js file-system-error) value))

(defn file-not-found
  "Create an error to signal that a file or folder wasn't found.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.FileNotFound vscode/FileSystemError))
  (^js [message-or-uri]
   (.FileNotFound vscode/FileSystemError message-or-uri)))

(defn file-exists
  "Create an error to signal that a file or folder already exists, e.g. when
   creating but not overwriting a file.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.FileExists vscode/FileSystemError))
  (^js [message-or-uri]
   (.FileExists vscode/FileSystemError message-or-uri)))

(defn file-not-a-directory
  "Create an error to signal that a file is not a folder.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.FileNotADirectory vscode/FileSystemError))
  (^js [message-or-uri]
   (.FileNotADirectory vscode/FileSystemError message-or-uri)))

(defn file-is-a-directory
  "Create an error to signal that a file is a folder.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.FileIsADirectory vscode/FileSystemError))
  (^js [message-or-uri]
   (.FileIsADirectory vscode/FileSystemError message-or-uri)))

(defn no-permissions
  "Create an error to signal that an operation lacks required permissions.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.NoPermissions vscode/FileSystemError))
  (^js [message-or-uri]
   (.NoPermissions vscode/FileSystemError message-or-uri)))

(defn unavailable
  "Create an error to signal that the file system is unavailable or too busy to
   complete a request.
   
   **Parameters:**
   - `message-or-uri`: `string | Uri | undefined` - Message or uri.
   
   **Returns:** `FileSystemError`"
  (^js []
   (.Unavailable vscode/FileSystemError))
  (^js [message-or-uri]
   (.Unavailable vscode/FileSystemError message-or-uri)))
