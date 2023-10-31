(ns dots.vscode.text-document-save-reason
  "Represents reasons why a text document is saved."
  (:require ["vscode" :as vscode]))

(def manual
  "Manually triggered, e.g. by the user pressing save, by starting debugging,
   or by an API call."
  (.-Manual vscode/TextDocumentSaveReason))

(def after-delay
  "Automatic after a delay."
  (.-AfterDelay vscode/TextDocumentSaveReason))

(def focus-out
  "When the editor lost focus."
  (.-FocusOut vscode/TextDocumentSaveReason))
