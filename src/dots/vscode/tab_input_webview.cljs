(ns dots.vscode.tab-input-webview
  "The tab represents a webview.")

(defn view-type
  "The type of webview. Maps to {@linkcode WebviewPanel.viewType WebviewPanel's viewType}"
  ^js [tab-input-webview]
  (.-viewType ^js tab-input-webview))
