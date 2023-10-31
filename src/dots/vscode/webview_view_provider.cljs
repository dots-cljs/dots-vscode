(ns dots.vscode.webview-view-provider
  "Provider for creating `WebviewView` elements.")

(defn resolve-webview-view
  "Revolves a webview view.
   
   `resolveWebviewView` is called when a view first becomes visible. This may happen when the view is
   first loaded or when the user hides and then shows a view again."
  ^js [webview-view-provider webview-view context token]
  (.resolveWebviewView ^js webview-view-provider webview-view context token))
