(ns dots.vscode.folding-range-provider
  "The folding range provider interface defines the contract between extensions and
   [Folding](https://code.visualstudio.com/docs/editor/codebasics#_folding) in the editor.")

(defn on-did-change-folding-ranges
  "An optional event to signal that the folding ranges from this provider have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [folding-range-provider]
   (.-onDidChangeFoldingRanges ^js folding-range-provider))
  (^js [folding-range-provider listener]
   (.onDidChangeFoldingRanges ^js folding-range-provider listener))
  (^js [folding-range-provider listener this-args]
   (.onDidChangeFoldingRanges ^js folding-range-provider listener this-args))
  (^js [folding-range-provider listener this-args disposables]
   (.onDidChangeFoldingRanges ^js folding-range-provider listener this-args disposables)))

(defn set-on-did-change-folding-ranges!
  "An optional event to signal that the folding ranges from this provider have changed."
  ^js [folding-range-provider value]
  (set! (.-onDidChangeFoldingRanges ^js folding-range-provider) value))

(defn provide-folding-ranges
  "Returns a list of folding ranges or null and undefined if the provider
   does not want to participate or was cancelled.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `context`: `FoldingContext` - Additional context information (for future use)
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<FoldingRange[]>`"
  ^js [folding-range-provider document context token]
  (.provideFoldingRanges ^js folding-range-provider document context token))
