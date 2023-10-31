(ns dots.vscode.symbol-tag
  "Symbol tags are extra annotations that tweak the rendering of a symbol."
  (:require ["vscode" :as vscode]))

(def deprecated
  "Render a symbol as obsolete, usually using a strike-out."
  (.-Deprecated vscode/SymbolTag))
