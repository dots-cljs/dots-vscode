(ns dots.vscode.webview-panel-on-did-change-view-state-event
  "Event fired when a webview panel's view state changes.")

(defn webview-panel
  "Webview panel whose view state changed."
  ^js [webview-panel-on-did-change-view-state-event]
  (.-webviewPanel ^js webview-panel-on-did-change-view-state-event))
