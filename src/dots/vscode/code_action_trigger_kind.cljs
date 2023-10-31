(ns dots.vscode.code-action-trigger-kind
  "The reason why code actions were requested."
  (:require ["vscode" :as vscode]))

(def invoke
  "Code actions were explicitly requested by the user or by an extension."
  (.-Invoke vscode/CodeActionTriggerKind))

(def automatic
  "Code actions were requested automatically.
   
   This typically happens when current selection in a file changes, but can
   also be triggered when file content changes."
  (.-Automatic vscode/CodeActionTriggerKind))
