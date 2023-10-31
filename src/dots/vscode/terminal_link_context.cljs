(ns dots.vscode.terminal-link-context
  "Provides information on a line in a terminal in order to provide links for it.")

(defn line
  "This is the text from the unwrapped line in the terminal."
  ^js [terminal-link-context]
  (.-line ^js terminal-link-context))

(defn set-line!
  "This is the text from the unwrapped line in the terminal."
  ^js [terminal-link-context value]
  (set! (.-line ^js terminal-link-context) value))

(defn terminal
  "The terminal the link belongs to."
  ^js [terminal-link-context]
  (.-terminal ^js terminal-link-context))

(defn set-terminal!
  "The terminal the link belongs to."
  ^js [terminal-link-context value]
  (set! (.-terminal ^js terminal-link-context) value))
