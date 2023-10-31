(ns dots.vscode.signature-help-trigger-kind
  "How a {@linkcode SignatureHelpProvider } was triggered."
  (:require ["vscode" :as vscode]))

(def invoke
  "Signature help was invoked manually by the user or by a command."
  (.-Invoke vscode/SignatureHelpTriggerKind))

(def trigger-character
  "Signature help was triggered by a trigger character."
  (.-TriggerCharacter vscode/SignatureHelpTriggerKind))

(def content-change
  "Signature help was triggered by the cursor moving or by the document content changing."
  (.-ContentChange vscode/SignatureHelpTriggerKind))
