(ns dots.vscode.debug-adapter
  "A debug adapter that implements the Debug Adapter Protocol can be registered with the editor if it implements the DebugAdapter interface.")

(defn on-did-send-message
  "An event which fires after the debug adapter has sent a Debug Adapter Protocol message to the editor.
   Messages can be requests, responses, or events.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [debug-adapter]
   (.-onDidSendMessage ^js debug-adapter))
  (^js [debug-adapter listener]
   (.onDidSendMessage ^js debug-adapter listener))
  (^js [debug-adapter listener this-args]
   (.onDidSendMessage ^js debug-adapter listener this-args))
  (^js [debug-adapter listener this-args disposables]
   (.onDidSendMessage ^js debug-adapter listener this-args disposables)))

(defn handle-message
  "Handle a Debug Adapter Protocol message.
   Messages can be requests, responses, or events.
   Results or errors are returned via onSendMessage events.
   
   **Parameters:**
   - `message`: `DebugProtocolMessage` - A Debug Adapter Protocol message
   
   **Returns:** `void`"
  ^js [debug-adapter message]
  (.handleMessage ^js debug-adapter message))

(defn dispose
  "Dispose this object.
   
   **Returns:** `any`"
  ^js [debug-adapter]
  (.dispose ^js debug-adapter))
