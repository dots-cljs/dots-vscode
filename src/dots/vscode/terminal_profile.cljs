(ns dots.vscode.terminal-profile
  "A terminal profile defines how a terminal will be launched.")

(defn options
  "The options that the terminal will launch with."
  ^js [terminal-profile]
  (.-options ^js terminal-profile))

(defn set-options!
  "The options that the terminal will launch with."
  ^js [terminal-profile value]
  (set! (.-options ^js terminal-profile) value))
