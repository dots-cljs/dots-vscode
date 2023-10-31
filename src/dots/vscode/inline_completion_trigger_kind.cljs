(ns dots.vscode.inline-completion-trigger-kind
  "Describes how an {@link InlineCompletionItemProvider inline completion provider} was triggered."
  (:require ["vscode" :as vscode]))

(def invoke
  "Completion was triggered explicitly by a user gesture.
   Return multiple completion items to enable cycling through them."
  (.-Invoke vscode/InlineCompletionTriggerKind))

(def automatic
  "Completion was triggered automatically while editing.
   It is sufficient to return a single completion item in this case."
  (.-Automatic vscode/InlineCompletionTriggerKind))
