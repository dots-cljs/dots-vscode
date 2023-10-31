(ns dots.vscode.debug-adapter-executable-options
  "Options for a debug adapter executable.")

(defn env
  "The additional environment of the executed program or shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [debug-adapter-executable-options]
  (.-env ^js debug-adapter-executable-options))

(defn set-env!
  "The additional environment of the executed program or shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [debug-adapter-executable-options value]
  (set! (.-env ^js debug-adapter-executable-options) value))

(defn cwd
  "The current working directory for the executed debug adapter."
  ^js [debug-adapter-executable-options]
  (.-cwd ^js debug-adapter-executable-options))

(defn set-cwd!
  "The current working directory for the executed debug adapter."
  ^js [debug-adapter-executable-options value]
  (set! (.-cwd ^js debug-adapter-executable-options) value))
