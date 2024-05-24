(ns dots.vscode.shell-execution
  "Represents a task execution that happens inside a shell.")

(defn command-line
  "The shell command line. Is `undefined` if created with a command and arguments."
  ^js [shell-execution]
  (.-commandLine ^js shell-execution))

(defn set-command-line!
  "The shell command line. Is `undefined` if created with a command and arguments."
  ^js [shell-execution value]
  (set! (.-commandLine ^js shell-execution) value))

(defn command
  "The shell command. Is `undefined` if created with a full command line."
  ^js [shell-execution]
  (.-command ^js shell-execution))

(defn set-command!
  "The shell command. Is `undefined` if created with a full command line."
  ^js [shell-execution value]
  (set! (.-command ^js shell-execution) value))

(defn args
  "The shell args. Is `undefined` if created with a full command line."
  ^js [shell-execution]
  (.-args ^js shell-execution))

(defn set-args!
  "The shell args. Is `undefined` if created with a full command line."
  ^js [shell-execution value]
  (set! (.-args ^js shell-execution) value))

(defn options
  "The shell options used when the command line is executed in a shell.
   Defaults to undefined."
  ^js [shell-execution]
  (.-options ^js shell-execution))

(defn set-options!
  "The shell options used when the command line is executed in a shell.
   Defaults to undefined."
  ^js [shell-execution value]
  (set! (.-options ^js shell-execution) value))
