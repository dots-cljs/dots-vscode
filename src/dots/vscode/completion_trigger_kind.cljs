(ns dots.vscode.completion-trigger-kind
  "How a {@link CompletionItemProvider completion provider} was triggered"
  (:require ["vscode" :as vscode]))

(def invoke
  "Completion was triggered normally."
  (.-Invoke vscode/CompletionTriggerKind))

(def trigger-character
  "Completion was triggered by a trigger character."
  (.-TriggerCharacter vscode/CompletionTriggerKind))

(def trigger-for-incomplete-completions
  "Completion was re-triggered as current completion list is incomplete"
  (.-TriggerForIncompleteCompletions vscode/CompletionTriggerKind))
