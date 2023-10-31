(ns dots.vscode.webview-options
  "Content settings for a webview.")

(defn enable-scripts?
  "Controls whether scripts are enabled in the webview content or not.
   
   Defaults to false (scripts-disabled)."
  ^js [webview-options]
  (.-enableScripts ^js webview-options))

(defn enable-forms?
  "Controls whether forms are enabled in the webview content or not.
   
   Defaults to true if {@link WebviewOptions.enableScripts scripts are enabled}. Otherwise defaults to false.
   Explicitly setting this property to either true or false overrides the default."
  ^js [webview-options]
  (.-enableForms ^js webview-options))

(defn enable-command-uris?
  "Controls whether command uris are enabled in webview content or not.
   
   Defaults to false."
  ^js [webview-options]
  (.-enableCommandUris ^js webview-options))

(defn local-resource-roots
  "Root paths from which the webview can load local (filesystem) resources using uris from `asWebviewUri`
   
   Default to the root folders of the current workspace plus the extension's install directory.
   
   Pass in an empty array to disallow access to any local resources."
  ^js [webview-options]
  (.-localResourceRoots ^js webview-options))

(defn port-mapping
  "Mappings of localhost ports used inside the webview.
   
   Port mapping allow webviews to transparently define how localhost ports are resolved. This can be used
   to allow using a static localhost port inside the webview that is resolved to random port that a service is
   running on.
   
   If a webview accesses localhost content, we recommend that you specify port mappings even if
   the `webviewPort` and `extensionHostPort` ports are the same.
   
   *Note* that port mappings only work for `http` or `https` urls. Websocket urls (e.g. `ws://localhost:3000`)
   cannot be mapped to another port."
  ^js [webview-options]
  (.-portMapping ^js webview-options))
