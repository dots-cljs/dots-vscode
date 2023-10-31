(ns dots.vscode.debug-adapter-server
  "Represents a debug adapter running as a socket based server.")

(defn port
  "The port."
  ^js [debug-adapter-server]
  (.-port ^js debug-adapter-server))

(defn host
  "The host."
  ^js [debug-adapter-server]
  (.-host ^js debug-adapter-server))
