(ns dots.vscode.extension-context
  "An extension context is a collection of utilities private to an
   extension.
   
   An instance of an `ExtensionContext` is provided as the first
   parameter to the `activate`-call of an extension.")

(defn subscriptions
  "An array to which disposables can be added. When this
   extension is deactivated the disposables will be disposed.
   
   *Note* that asynchronous dispose-functions aren't awaited."
  ^js [extension-context]
  (.-subscriptions ^js extension-context))

(defn workspace-state
  "A memento object that stores state in the context
   of the currently opened {@link workspace.workspaceFolders workspace}."
  ^js [extension-context]
  (.-workspaceState ^js extension-context))

(defn global-state
  "A memento object that stores state independent
   of the current opened {@link workspace.workspaceFolders workspace}."
  ^js [extension-context]
  (.-globalState ^js extension-context))

(defn secrets
  "A storage utility for secrets. Secrets are persisted across reloads and are independent of the
   current opened {@link workspace.workspaceFolders workspace}."
  ^js [extension-context]
  (.-secrets ^js extension-context))

(defn extension-uri
  "The uri of the directory containing the extension."
  ^js [extension-context]
  (.-extensionUri ^js extension-context))

(defn extension-path
  "The absolute file path of the directory containing the extension. Shorthand
   notation for {@link TextDocument.uri ExtensionContext.extensionUri.fsPath} (independent of the uri scheme)."
  ^js [extension-context]
  (.-extensionPath ^js extension-context))

(defn environment-variable-collection
  "Gets the extension's environment variable collection for this workspace, enabling changes
   to be applied to terminal environment variables."
  ^js [extension-context]
  (.-environmentVariableCollection ^js extension-context))

(defn as-absolute-path
  "Get the absolute path of a resource contained in the extension.
   
   *Note* that an absolute uri can be constructed via {@linkcode Uri.joinPath } and
   {@linkcode ExtensionContext.extensionUri extensionUri}, e.g. `vscode.Uri.joinPath(context.extensionUri, relativePath);`"
  ^js [extension-context relative-path]
  (.asAbsolutePath ^js extension-context relative-path))

(defn storage-uri
  "The uri of a workspace specific directory in which the extension
   can store private state. The directory might not exist and creation is
   up to the extension. However, the parent directory is guaranteed to be existent.
   The value is `undefined` when no workspace nor folder has been opened.
   
   Use {@linkcode ExtensionContext.workspaceState workspaceState} or
   {@linkcode ExtensionContext.globalState globalState} to store key value data."
  ^js [extension-context]
  (.-storageUri ^js extension-context))

(defn storage-path
  "An absolute file path of a workspace specific directory in which the extension
   can store private state. The directory might not exist on disk and creation is
   up to the extension. However, the parent directory is guaranteed to be existent.
   
   Use {@linkcode ExtensionContext.workspaceState workspaceState} or
   {@linkcode ExtensionContext.globalState globalState} to store key value data."
  ^js [extension-context]
  (.-storagePath ^js extension-context))

(defn global-storage-uri
  "The uri of a directory in which the extension can store global state.
   The directory might not exist on disk and creation is
   up to the extension. However, the parent directory is guaranteed to be existent.
   
   Use {@linkcode ExtensionContext.globalState globalState} to store key value data."
  ^js [extension-context]
  (.-globalStorageUri ^js extension-context))

(defn global-storage-path
  "An absolute file path in which the extension can store global state.
   The directory might not exist on disk and creation is
   up to the extension. However, the parent directory is guaranteed to be existent.
   
   Use {@linkcode ExtensionContext.globalState globalState} to store key value data."
  ^js [extension-context]
  (.-globalStoragePath ^js extension-context))

(defn log-uri
  "The uri of a directory in which the extension can create log files.
   The directory might not exist on disk and creation is up to the extension. However,
   the parent directory is guaranteed to be existent."
  ^js [extension-context]
  (.-logUri ^js extension-context))

(defn log-path
  "An absolute file path of a directory in which the extension can create log files.
   The directory might not exist on disk and creation is up to the extension. However,
   the parent directory is guaranteed to be existent."
  ^js [extension-context]
  (.-logPath ^js extension-context))

(defn extension-mode
  "The mode the extension is running in. This is specific to the current
   extension. One extension may be in `ExtensionMode.Development` while
   other extensions in the host run in `ExtensionMode.Release`."
  ^js [extension-context]
  (.-extensionMode ^js extension-context))

(defn extension
  "The current `Extension` instance."
  ^js [extension-context]
  (.-extension ^js extension-context))
