(ns dots.vscode.inline-values-provider
  "The inline values provider interface defines the contract between extensions and the editor's debugger inline values feature.
   In this contract the provider returns inline value information for a given document range
   and the editor shows this information in the editor at the end of lines.")

(defn on-did-change-inline-values
  "An optional event to signal that inline values have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [inline-values-provider]
   (.-onDidChangeInlineValues ^js inline-values-provider))
  (^js [inline-values-provider listener]
   (.onDidChangeInlineValues ^js inline-values-provider listener))
  (^js [inline-values-provider listener this-args]
   (.onDidChangeInlineValues ^js inline-values-provider listener this-args))
  (^js [inline-values-provider listener this-args disposables]
   (.onDidChangeInlineValues ^js inline-values-provider listener this-args disposables)))

(defn set-on-did-change-inline-values!
  "An optional event to signal that inline values have changed."
  ^js [inline-values-provider value]
  (set! (.-onDidChangeInlineValues ^js inline-values-provider) value))

(defn provide-inline-values
  "Provide \"inline value\" information for a given document and range.
   The editor calls this method whenever debugging stops in the given document.
   The returned inline values information is rendered in the editor at the end of lines.
   
   **Parameters:**
   - `document`: `TextDocument` - The document for which the inline values information is needed.
   - `view-port`: `Range` - The visible document range for which inline values should be computed.
   - `context`: `InlineValueContext` - A bag containing contextual information like the current location.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<InlineValue[]>` - An array of InlineValueDescriptors or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [inline-values-provider document view-port context token]
  (.provideInlineValues ^js inline-values-provider document view-port context token))
