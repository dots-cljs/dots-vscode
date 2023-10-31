(ns dots.vscode.debug-adapter-executable
  "Represents a debug adapter executable and optional arguments and runtime options passed to it.")

(defn command
  "The command or path of the debug adapter executable.
   A command must be either an absolute path of an executable or the name of an command to be looked up via the PATH environment variable.
   The special value 'node' will be mapped to the editor's built-in Node.js runtime."
  ^js [debug-adapter-executable]
  (.-command ^js debug-adapter-executable))

(defn args
  "The arguments passed to the debug adapter executable. Defaults to an empty array."
  ^js [debug-adapter-executable]
  (.-args ^js debug-adapter-executable))

(defn options
  "Optional options to be used when the debug adapter is started.
   Defaults to undefined."
  ^js [debug-adapter-executable]
  (.-options ^js debug-adapter-executable))
