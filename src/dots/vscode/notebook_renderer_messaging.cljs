(ns dots.vscode.notebook-renderer-messaging
  "Renderer messaging is used to communicate with a single renderer. It's returned from {@link notebooks.createRendererMessaging }.")

(defn on-did-receive-message
  "An event that fires when a message is received from a renderer."
  (^js [notebook-renderer-messaging]
   (.-onDidReceiveMessage ^js notebook-renderer-messaging))
  (^js [notebook-renderer-messaging listener]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener))
  (^js [notebook-renderer-messaging listener this-args]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener this-args))
  (^js [notebook-renderer-messaging listener this-args disposables]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener this-args disposables)))

(defn post-message
  "Send a message to one or all renderer."
  (^js [notebook-renderer-messaging message]
   (.postMessage ^js notebook-renderer-messaging message))
  (^js [notebook-renderer-messaging message editor]
   (.postMessage ^js notebook-renderer-messaging message editor)))
