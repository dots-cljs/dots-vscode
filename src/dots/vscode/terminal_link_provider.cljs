(ns dots.vscode.terminal-link-provider
  "A provider that enables detection and handling of links within terminals.")

(defn provide-terminal-links
  "Provide terminal links for the given context. Note that this can be called multiple times
   even before previous calls resolve, make sure to not share global objects (eg. `RegExp`)
   that could have problems when asynchronous usage may overlap."
  ^js [terminal-link-provider context token]
  (.provideTerminalLinks ^js terminal-link-provider context token))

(defn handle-terminal-link
  "Handle an activated terminal link."
  ^js [terminal-link-provider link]
  (.handleTerminalLink ^js terminal-link-provider link))
