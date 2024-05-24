(ns dots.vscode.inlay-hints-provider
  "The inlay hints provider interface defines the contract between extensions and
   the inlay hints feature.")

(defn on-did-change-inlay-hints
  "An optional event to signal that inlay hints from this provider have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [inlay-hints-provider]
   (.-onDidChangeInlayHints ^js inlay-hints-provider))
  (^js [inlay-hints-provider listener]
   (.onDidChangeInlayHints ^js inlay-hints-provider listener))
  (^js [inlay-hints-provider listener this-args]
   (.onDidChangeInlayHints ^js inlay-hints-provider listener this-args))
  (^js [inlay-hints-provider listener this-args disposables]
   (.onDidChangeInlayHints ^js inlay-hints-provider listener this-args disposables)))

(defn set-on-did-change-inlay-hints!
  "An optional event to signal that inlay hints from this provider have changed."
  ^js [inlay-hints-provider value]
  (set! (.-onDidChangeInlayHints ^js inlay-hints-provider) value))

(defn provide-inlay-hints
  "Provide inlay hints for the given range and document.
   
   *Note* that inlay hints that are not {@link Range.contains contained} by the given range are ignored.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `range`: `Range` - The range for which inlay hints should be computed.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T[]>` - An array of inlay hints or a thenable that resolves to such."
  ^js [inlay-hints-provider document range token]
  (.provideInlayHints ^js inlay-hints-provider document range token))

(defn resolve-inlay-hint
  "Given an inlay hint fill in {@link InlayHint.tooltip tooltip}, {@link InlayHint.textEdits text edits},
   or complete label {@link InlayHintLabelPart parts}.
   
   *Note* that the editor will resolve an inlay hint at most once.
   
   **Parameters:**
   - `hint`: `T` - An inlay hint.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T>` - The resolved inlay hint or a thenable that resolves to such. It is OK to return the given `item`. When no result is returned, the given `item` will be used."
  ^js [inlay-hints-provider hint token]
  (.resolveInlayHint ^js inlay-hints-provider hint token))
