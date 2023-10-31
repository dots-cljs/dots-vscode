(ns dots.vscode.process-execution-options
  "Options for a process execution")

(defn cwd
  "The current working directory of the executed program or shell.
   If omitted the tools current workspace root is used."
  ^js [process-execution-options]
  (.-cwd ^js process-execution-options))

(defn set-cwd!
  "The current working directory of the executed program or shell.
   If omitted the tools current workspace root is used."
  ^js [process-execution-options value]
  (set! (.-cwd ^js process-execution-options) value))

(defn env
  "The additional environment of the executed program or shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [process-execution-options]
  (.-env ^js process-execution-options))

(defn set-env!
  "The additional environment of the executed program or shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [process-execution-options value]
  (set! (.-env ^js process-execution-options) value))
