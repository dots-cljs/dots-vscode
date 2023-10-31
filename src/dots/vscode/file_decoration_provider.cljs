(ns dots.vscode.file-decoration-provider
  "The decoration provider interfaces defines the contract between extensions and
   file decorations.")

(defn on-did-change-file-decorations
  "An optional event to signal that decorations for one or many files have changed.
   
   *Note* that this event should be used to propagate information about children."
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
   to the editor via the {@link FileDecorationProvider.onDidChangeFileDecorations onDidChangeFileDecorations}-event."
  ^js [file-decoration-provider uri token]
  (.provideFileDecoration ^js file-decoration-provider uri token))
