(ns dots.vscode.webview
  "Displays html content, similarly to an iframe.")

(defn options
  "Content settings for the webview."
  ^js [webview]
  (.-options ^js webview))

(defn set-options!
  "Content settings for the webview."
  ^js [webview value]
  (set! (.-options ^js webview) value))

(defn html
  "HTML contents of the webview.
   
   This should be a complete, valid html document. Changing this property causes the webview to be reloaded.
   
   Webviews are sandboxed from normal extension process, so all communication with the webview must use
   message passing. To send a message from the extension to the webview, use {@linkcode Webview.postMessage postMessage}.
   To send message from the webview back to an extension, use the `acquireVsCodeApi` function inside the webview
   to get a handle to the editor's api and then call `.postMessage()`:
   
   ```html
   <script>
       const vscode = acquireVsCodeApi(); // acquireVsCodeApi can only be invoked once
       vscode.postMessage({ message: 'hello!' });
   </script>
   ```
   
   To load a resources from the workspace inside a webview, use the {@linkcode Webview.asWebviewUri asWebviewUri} method
   and ensure the resource's directory is listed in {@linkcode WebviewOptions.localResourceRoots }.
   
   Keep in mind that even though webviews are sandboxed, they still allow running scripts and loading arbitrary content,
   so extensions must follow all standard web security best practices when working with webviews. This includes
   properly sanitizing all untrusted input (including content from the workspace) and
   setting a [content security policy](https://aka.ms/vscode-api-webview-csp)."
  ^js [webview]
  (.-html ^js webview))

(defn set-html!
  "HTML contents of the webview.
   
   This should be a complete, valid html document. Changing this property causes the webview to be reloaded.
   
   Webviews are sandboxed from normal extension process, so all communication with the webview must use
   message passing. To send a message from the extension to the webview, use {@linkcode Webview.postMessage postMessage}.
   To send message from the webview back to an extension, use the `acquireVsCodeApi` function inside the webview
   to get a handle to the editor's api and then call `.postMessage()`:
   
   ```html
   <script>
       const vscode = acquireVsCodeApi(); // acquireVsCodeApi can only be invoked once
       vscode.postMessage({ message: 'hello!' });
   </script>
   ```
   
   To load a resources from the workspace inside a webview, use the {@linkcode Webview.asWebviewUri asWebviewUri} method
   and ensure the resource's directory is listed in {@linkcode WebviewOptions.localResourceRoots }.
   
   Keep in mind that even though webviews are sandboxed, they still allow running scripts and loading arbitrary content,
   so extensions must follow all standard web security best practices when working with webviews. This includes
   properly sanitizing all untrusted input (including content from the workspace) and
   setting a [content security policy](https://aka.ms/vscode-api-webview-csp)."
  ^js [webview value]
  (set! (.-html ^js webview) value))

(defn on-did-receive-message
  "Fired when the webview content posts a message.
   
   Webview content can post strings or json serializable objects back to an extension. They cannot
   post `Blob`, `File`, `ImageData` and other DOM specific objects since the extension that receives the
   message does not run in a browser environment."
  (^js [webview]
   (.-onDidReceiveMessage ^js webview))
  (^js [webview listener]
   (.onDidReceiveMessage ^js webview listener))
  (^js [webview listener this-args]
   (.onDidReceiveMessage ^js webview listener this-args))
  (^js [webview listener this-args disposables]
   (.onDidReceiveMessage ^js webview listener this-args disposables)))

(defn post-message
  "Post a message to the webview content.
   
   Messages are only delivered if the webview is live (either visible or in the
   background with `retainContextWhenHidden`)."
  ^js [webview message]
  (.postMessage ^js webview message))

(defn as-webview-uri
  "Convert a uri for the local file system to one that can be used inside webviews.
   
   Webviews cannot directly load resources from the workspace or local file system using `file:` uris. The
   `asWebviewUri` function takes a local `file:` uri and converts it into a uri that can be used inside of
   a webview to load the same resource:
   
   ```ts
   webview.html = `<img src=\"${webview.asWebviewUri(vscode.Uri.file('/Users/codey/workspace/cat.gif'))}\">`
   ```"
  ^js [webview local-resource]
  (.asWebviewUri ^js webview local-resource))

(defn csp-source
  "Content security policy source for webview resources.
   
   This is the origin that should be used in a content security policy rule:
   
   ```ts
   `img-src https: ${webview.cspSource} ...;`
   ```"
  ^js [webview]
  (.-cspSource ^js webview))
