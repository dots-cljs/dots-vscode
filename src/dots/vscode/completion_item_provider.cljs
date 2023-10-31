(ns dots.vscode.completion-item-provider
  "The completion item provider interface defines the contract between extensions and
   [IntelliSense](https://code.visualstudio.com/docs/editor/intellisense).
   
   Providers can delay the computation of the {@linkcode CompletionItem.detail detail}
   and {@linkcode CompletionItem.documentation documentation} properties by implementing the
   {@linkcode CompletionItemProvider.resolveCompletionItem resolveCompletionItem}-function. However, properties that
   are needed for the initial sorting and filtering, like `sortText`, `filterText`, `insertText`, and `range`, must
   not be changed during resolve.
   
   Providers are asked for completions either explicitly by a user gesture or -depending on the configuration-
   implicitly when typing words or trigger characters.")

(defn provide-completion-items
  "Provide completion items for the given position and document."
  ^js [completion-item-provider document position token context]
  (.provideCompletionItems ^js completion-item-provider document position token context))

(defn resolve-completion-item
  "Given a completion item fill in more data, like {@link CompletionItem.documentation doc-comment}
   or {@link CompletionItem.detail details}.
   
   The editor will only resolve a completion item once.
   
   *Note* that this function is called when completion items are already showing in the UI or when an item has been
   selected for insertion. Because of that, no property that changes the presentation (label, sorting, filtering etc)
   or the (primary) insert behaviour ({@link CompletionItem.insertText insertText}) can be changed.
   
   This function may fill in {@link CompletionItem.additionalTextEdits additionalTextEdits}. However, that means an item might be
   inserted *before* resolving is done and in that case the editor will do a best effort to still apply those additional
   text edits."
  ^js [completion-item-provider item token]
  (.resolveCompletionItem ^js completion-item-provider item token))
