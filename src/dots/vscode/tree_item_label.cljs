(ns dots.vscode.tree-item-label
  "Label describing the {@link TreeItem Tree item}")

(defn label
  "A human-readable string describing the {@link TreeItem Tree item}."
  ^js [tree-item-label]
  (.-label ^js tree-item-label))

(defn set-label!
  "A human-readable string describing the {@link TreeItem Tree item}."
  ^js [tree-item-label value]
  (set! (.-label ^js tree-item-label) value))

(defn highlights
  "Ranges in the label to highlight. A range is defined as a tuple of two number where the
   first is the inclusive start index and the second the exclusive end index"
  ^js [tree-item-label]
  (.-highlights ^js tree-item-label))

(defn set-highlights!
  "Ranges in the label to highlight. A range is defined as a tuple of two number where the
   first is the inclusive start index and the second the exclusive end index"
  ^js [tree-item-label value]
  (set! (.-highlights ^js tree-item-label) value))
