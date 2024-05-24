(ns dots.vscode.webview-view-provider
  "Provider for creating `WebviewView` elements.")

(defn resolve-webview-view
  "Resolves a webview view.
   
   `resolveWebviewView` is called when a view first becomes visible. This may happen when the view is
   first loaded or when the user hides and then shows a view again.
   
   **Parameters:**
   - `webview-view`: `WebviewView` - Webview view to restore. The provider should take ownership of this view. The
   provider must set the webview's `.html` and hook up all webview events it is interested in.
   - `context`: `WebviewViewResolveContext<unknown>` - Additional metadata about the view being resolved.
   - `token`: `CancellationToken` - Cancellation token indicating that the view being provided is no longer needed.
   
   **Returns:** `void | Thenable<void>` - Optional thenable indicating that the view has been fully resolved."
  ^js [webview-view-provider webview-view context token]
  (.resolveWebviewView ^js webview-view-provider webview-view context token))
