(ns dots.vscode.notebook-renderer-messaging
  "Renderer messaging is used to communicate with a single renderer. It's returned from {@link notebooks.createRendererMessaging }.")

(defn on-did-receive-message
  "An event that fires when a message is received from a renderer.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [notebook-renderer-messaging]
   (.-onDidReceiveMessage ^js notebook-renderer-messaging))
  (^js [notebook-renderer-messaging listener]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener))
  (^js [notebook-renderer-messaging listener this-args]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener this-args))
  (^js [notebook-renderer-messaging listener this-args disposables]
   (.onDidReceiveMessage ^js notebook-renderer-messaging listener this-args disposables)))

(defn post-message
  "Send a message to one or all renderer.
   
   **Parameters:**
   - `message`: `any` - Message to send
   - `editor`: `NotebookEditor | undefined` - Editor to target with the message. If not provided, the
   message is sent to all renderers.
   
   **Returns:** `Thenable<boolean>` - a boolean indicating whether the message was successfully
   delivered to any renderer."
  (^js [notebook-renderer-messaging message]
   (.postMessage ^js notebook-renderer-messaging message))
  (^js [notebook-renderer-messaging message editor]
   (.postMessage ^js notebook-renderer-messaging message editor)))
