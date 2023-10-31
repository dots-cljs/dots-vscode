(ns dots.vscode.terminal-profile-provider
  "Provides a terminal profile for the contributed terminal profile when launched via the UI or
   command.")

(defn provide-terminal-profile
  "Provide the terminal profile."
  ^js [terminal-profile-provider token]
  (.provideTerminalProfile ^js terminal-profile-provider token))
