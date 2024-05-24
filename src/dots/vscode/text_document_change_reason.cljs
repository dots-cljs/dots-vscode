(ns dots.vscode.text-document-change-reason
  "Reasons for why a text document has changed."
  (:require ["vscode" :as vscode]))

(def undo
  "The text change is caused by an undo operation."
  (.-Undo vscode/TextDocumentChangeReason))

(def redo
  "The text change is caused by an redo operation."
  (.-Redo vscode/TextDocumentChangeReason))
