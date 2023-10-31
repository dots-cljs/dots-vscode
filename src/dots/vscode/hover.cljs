(ns dots.vscode.hover
  "A hover represents additional information for a symbol or word. Hovers are
   rendered in a tooltip-like widget."
  (:refer-clojure :exclude [range]))

(defn contents
  "The contents of this hover."
  ^js [hover]
  (.-contents ^js hover))

(defn set-contents!
  "The contents of this hover."
  ^js [hover value]
  (set! (.-contents ^js hover) value))

(defn range
  "The range to which this hover applies. When missing, the
   editor will use the range at the current position or the
   current position itself."
  ^js [hover]
  (.-range ^js hover))

(defn set-range!
  "The range to which this hover applies. When missing, the
   editor will use the range at the current position or the
   current position itself."
  ^js [hover value]
  (set! (.-range ^js hover) value))
