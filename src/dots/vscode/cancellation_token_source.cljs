(ns dots.vscode.cancellation-token-source
  "A cancellation source creates and controls a {@link CancellationToken cancellation token}.")

(defn token
  "The cancellation token of this source.
   
   **Returns:** `CancellationToken`"
  ^js [cancellation-token-source]
  (.-token ^js cancellation-token-source))

(defn set-token!
  "The cancellation token of this source."
  ^js [cancellation-token-source value]
  (set! (.-token ^js cancellation-token-source) value))

(defn cancel
  "Signal cancellation on the token.
   
   **Returns:** `void`"
  ^js [cancellation-token-source]
  (.cancel ^js cancellation-token-source))

(defn dispose
  "Dispose object and free resources.
   
   **Returns:** `void`"
  ^js [cancellation-token-source]
  (.dispose ^js cancellation-token-source))
