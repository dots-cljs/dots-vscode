(ns dots.vscode.debug-adapter-named-pipe-server
  "Represents a debug adapter running as a Named Pipe (on Windows)/UNIX Domain Socket (on non-Windows) based server.")

(defn path
  "The path to the NamedPipe/UNIX Domain Socket."
  ^js [debug-adapter-named-pipe-server]
  (.-path ^js debug-adapter-named-pipe-server))
