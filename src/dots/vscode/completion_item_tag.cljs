(ns dots.vscode.completion-item-tag
  "Completion item tags are extra annotations that tweak the rendering of a completion
   item."
  (:require ["vscode" :as vscode]))

(def deprecated
  "Render a completion as obsolete, usually using a strike-out."
  (.-Deprecated vscode/CompletionItemTag))
