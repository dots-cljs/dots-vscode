(ns dots.vscode.inlay-hint-kind
  "Inlay hint kinds.
   
   The kind of an inline hint defines its appearance, e.g the corresponding foreground and background colors are being
   used."
  (:refer-clojure :exclude [type])
  (:require ["vscode" :as vscode]))

(def type
  "An inlay hint that for a type annotation."
  (.-Type vscode/InlayHintKind))

(def parameter
  "An inlay hint that is for a parameter."
  (.-Parameter vscode/InlayHintKind))
