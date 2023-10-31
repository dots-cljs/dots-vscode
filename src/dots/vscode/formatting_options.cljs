(ns dots.vscode.formatting-options
  "Value-object describing what options formatting should use.")

(defn tab-size
  "Size of a tab in spaces."
  ^js [formatting-options]
  (.-tabSize ^js formatting-options))

(defn set-tab-size!
  "Size of a tab in spaces."
  ^js [formatting-options value]
  (set! (.-tabSize ^js formatting-options) value))

(defn insert-spaces?
  "Prefer spaces over tabs."
  ^js [formatting-options]
  (.-insertSpaces ^js formatting-options))

(defn set-insert-spaces!
  "Prefer spaces over tabs."
  ^js [formatting-options value]
  (set! (.-insertSpaces ^js formatting-options) value))
