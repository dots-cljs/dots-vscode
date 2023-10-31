(ns dots.vscode.document-highlight
  "A document highlight is a range inside a text document which deserves
   special attention. Usually a document highlight is visualized by changing
   the background color of its range."
  (:refer-clojure :exclude [range]))

(defn range
  "The range this highlight applies to."
  ^js [document-highlight]
  (.-range ^js document-highlight))

(defn set-range!
  "The range this highlight applies to."
  ^js [document-highlight value]
  (set! (.-range ^js document-highlight) value))

(defn kind
  "The highlight kind, default is {@link DocumentHighlightKind.Text text}."
  ^js [document-highlight]
  (.-kind ^js document-highlight))

(defn set-kind!
  "The highlight kind, default is {@link DocumentHighlightKind.Text text}."
  ^js [document-highlight value]
  (set! (.-kind ^js document-highlight) value))
