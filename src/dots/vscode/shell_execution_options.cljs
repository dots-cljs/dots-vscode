(ns dots.vscode.shell-execution-options
  "Options for a shell execution")

(defn executable
  "The shell executable."
  ^js [shell-execution-options]
  (.-executable ^js shell-execution-options))

(defn set-executable!
  "The shell executable."
  ^js [shell-execution-options value]
  (set! (.-executable ^js shell-execution-options) value))

(defn shell-args
  "The arguments to be passed to the shell executable used to run the task. Most shells
   require special arguments to execute a command. For  example `bash` requires the `-c`
   argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
   `/d` and `/c`."
  ^js [shell-execution-options]
  (.-shellArgs ^js shell-execution-options))

(defn set-shell-args!
  "The arguments to be passed to the shell executable used to run the task. Most shells
   require special arguments to execute a command. For  example `bash` requires the `-c`
   argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
   `/d` and `/c`."
  ^js [shell-execution-options value]
  (set! (.-shellArgs ^js shell-execution-options) value))

(defn shell-quoting
  "The shell quotes supported by this shell."
  ^js [shell-execution-options]
  (.-shellQuoting ^js shell-execution-options))

(defn set-shell-quoting!
  "The shell quotes supported by this shell."
  ^js [shell-execution-options value]
  (set! (.-shellQuoting ^js shell-execution-options) value))

(defn cwd
  "The current working directory of the executed shell.
   If omitted the tools current workspace root is used."
  ^js [shell-execution-options]
  (.-cwd ^js shell-execution-options))

(defn set-cwd!
  "The current working directory of the executed shell.
   If omitted the tools current workspace root is used."
  ^js [shell-execution-options value]
  (set! (.-cwd ^js shell-execution-options) value))

(defn env
  "The additional environment of the executed shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [shell-execution-options]
  (.-env ^js shell-execution-options))

(defn set-env!
  "The additional environment of the executed shell. If omitted
   the parent process' environment is used. If provided it is merged with
   the parent process' environment."
  ^js [shell-execution-options value]
  (set! (.-env ^js shell-execution-options) value))
