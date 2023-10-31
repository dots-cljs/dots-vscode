(ns dots.vscode.completion-context
  "Contains additional information about the context in which
   {@link CompletionItemProvider.provideCompletionItems completion provider} is triggered.")

(defn trigger-kind
  "How the completion was triggered."
  ^js [completion-context]
  (.-triggerKind ^js completion-context))

(defn trigger-character
  "Character that triggered the completion item provider.
   
   `undefined` if the provider was not triggered by a character.
   
   The trigger character is already in the document when the completion provider is triggered."
  ^js [completion-context]
  (.-triggerCharacter ^js completion-context))
