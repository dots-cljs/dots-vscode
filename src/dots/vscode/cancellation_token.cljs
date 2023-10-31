(ns dots.vscode.cancellation-token
  "A cancellation token is passed to an asynchronous or long running
   operation to request cancellation, like cancelling a request
   for completion items because the user continued to type.
   
   To get an instance of a `CancellationToken` use a
   {@link CancellationTokenSource }.")

(defn cancellation-requested?
  "Is `true` when the token has been cancelled, `false` otherwise."
  ^js [cancellation-token]
  (.-isCancellationRequested ^js cancellation-token))

(defn set-is-cancellation-requested!
  "Is `true` when the token has been cancelled, `false` otherwise."
  ^js [cancellation-token value]
  (set! (.-isCancellationRequested ^js cancellation-token) value))

(defn on-cancellation-requested
  "An {@link Event } which fires upon cancellation."
  (^js [cancellation-token]
   (.-onCancellationRequested ^js cancellation-token))
  (^js [cancellation-token listener]
   (.onCancellationRequested ^js cancellation-token listener))
  (^js [cancellation-token listener this-args]
   (.onCancellationRequested ^js cancellation-token listener this-args))
  (^js [cancellation-token listener this-args disposables]
   (.onCancellationRequested ^js cancellation-token listener this-args disposables)))

(defn set-on-cancellation-requested!
  "An {@link Event } which fires upon cancellation."
  ^js [cancellation-token value]
  (set! (.-onCancellationRequested ^js cancellation-token) value))
