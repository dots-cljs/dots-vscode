(ns dots.vscode.extension
  "Represents an extension.
   
   To get an instance of an `Extension` use {@link extensions.getExtension getExtension}.")

(defn id
  "The canonical extension identifier in the form of: `publisher.name`."
  ^js [extension]
  (.-id ^js extension))

(defn extension-uri
  "The uri of the directory containing the extension."
  ^js [extension]
  (.-extensionUri ^js extension))

(defn extension-path
  "The absolute file path of the directory containing this extension. Shorthand
   notation for {@link Extension.extensionUri Extension.extensionUri.fsPath} (independent of the uri scheme)."
  ^js [extension]
  (.-extensionPath ^js extension))

(defn active?
  "`true` if the extension has been activated."
  ^js [extension]
  (.-isActive ^js extension))

(defn package-json
  "The parsed contents of the extension's package.json."
  ^js [extension]
  (.-packageJSON ^js extension))

(defn extension-kind
  "The extension kind describes if an extension runs where the UI runs
   or if an extension runs where the remote extension host runs. The extension kind
   is defined in the `package.json`-file of extensions but can also be refined
   via the `remote.extensionKind`-setting. When no remote extension host exists,
   the value is {@linkcode ExtensionKind.UI }."
  ^js [extension]
  (.-extensionKind ^js extension))

(defn set-extension-kind!
  "The extension kind describes if an extension runs where the UI runs
   or if an extension runs where the remote extension host runs. The extension kind
   is defined in the `package.json`-file of extensions but can also be refined
   via the `remote.extensionKind`-setting. When no remote extension host exists,
   the value is {@linkcode ExtensionKind.UI }."
  ^js [extension value]
  (set! (.-extensionKind ^js extension) value))

(defn exports
  "The public API exported by this extension (return value of `activate`).
   It is an invalid action to access this field before this extension has been activated."
  ^js [extension]
  (.-exports ^js extension))

(defn activate
  "Activates this extension and returns its public API."
  ^js [extension]
  (.activate ^js extension))
