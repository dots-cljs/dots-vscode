(ns dots.vscode.document-highlight-kind
  "A document highlight kind."
  (:require ["vscode" :as vscode]))

(def text
  "A textual occurrence."
  (.-Text vscode/DocumentHighlightKind))

(def read
  "Read-access of a symbol, like reading a variable."
  (.-Read vscode/DocumentHighlightKind))

(def write
  "Write-access of a symbol, like writing to a variable."
  (.-Write vscode/DocumentHighlightKind))
