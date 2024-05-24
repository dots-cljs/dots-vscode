(ns dots.vscode.file-decoration-provider
  "The decoration provider interfaces defines the contract between extensions and
   file decorations.")

(defn on-did-change-file-decorations
  "An optional event to signal that decorations for one or many files have changed.
   
   *Note* that this event should be used to propagate information about children.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [file-decoration-provider]
   (.-onDidChangeFileDecorations ^js file-decoration-provider))
  (^js [file-decoration-provider listener]
   (.onDidChangeFileDecorations ^js file-decoration-provider listener))
  (^js [file-decoration-provider listener this-args]
   (.onDidChangeFileDecorations ^js file-decoration-provider listener this-args))
  (^js [file-decoration-provider listener this-args disposables]
   (.onDidChangeFileDecorations ^js file-decoration-provider listener this-args disposables)))

(defn set-on-did-change-file-decorations!
  "An optional event to signal that decorations for one or many files have changed.
   
   *Note* that this event should be used to propagate information about children."
  ^js [file-decoration-provider value]
  (set! (.-onDidChangeFileDecorations ^js file-decoration-provider) value))

(defn provide-file-decoration
  "Provide decorations for a given uri.
   
   *Note* that this function is only called when a file gets rendered in the UI.
   This means a decoration from a descendent that propagates upwards must be signaled
   to the editor via the {@link FileDecorationProvider.onDidChangeFileDecorations onDidChangeFileDecorations}-event.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file to provide a decoration for.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<FileDecoration>` - A decoration or a thenable that resolves to such."
  ^js [file-decoration-provider uri token]
  (.provideFileDecoration ^js file-decoration-provider uri token))
