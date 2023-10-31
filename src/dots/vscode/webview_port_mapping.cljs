(ns dots.vscode.webview-port-mapping
  "Defines a port mapping used for localhost inside the webview.")

(defn webview-port
  "Localhost port to remap inside the webview."
  ^js [webview-port-mapping]
  (.-webviewPort ^js webview-port-mapping))

(defn extension-host-port
  "Destination port. The `webviewPort` is resolved to this port."
  ^js [webview-port-mapping]
  (.-extensionHostPort ^js webview-port-mapping))
