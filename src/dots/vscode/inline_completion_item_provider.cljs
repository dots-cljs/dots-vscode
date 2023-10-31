(ns dots.vscode.inline-completion-item-provider
  "The inline completion item provider interface defines the contract between extensions and
   the inline completion feature.
   
   Providers are asked for completions either explicitly by a user gesture or implicitly when typing.")

(defn provide-inline-completion-items
  "Provides inline completion items for the given position and document.
   If inline completions are enabled, this method will be called whenever the user stopped typing.
   It will also be called when the user explicitly triggers inline completions or explicitly asks for the next or previous inline completion.
   In that case, all available inline completions should be returned.
   `context.triggerKind` can be used to distinguish between these scenarios."
  ^js [inline-completion-item-provider document position context token]
  (.provideInlineCompletionItems ^js inline-completion-item-provider document position context token))
