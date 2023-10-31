(ns dots.vscode.diagnostic-change-event
  "The event that is fired when diagnostics change.")

(defn uris
  "An array of resources for which diagnostics have changed."
  ^js [diagnostic-change-event]
  (.-uris ^js diagnostic-change-event))
