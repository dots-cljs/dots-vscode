(ns dots.vscode.command
  "Represents a reference to a command. Provides a title which
   will be used to represent a command in the UI and, optionally,
   an array of arguments which will be passed to the command handler
   function when invoked.")

(defn title
  "Title of the command, like `save`.
   
   **Returns:** `string`"
  ^js [command]
  (.-title ^js command))

(defn set-title!
  "Title of the command, like `save`."
  ^js [command value]
  (set! (.-title ^js command) value))

(defn command
  "The identifier of the actual command handler.
   
   **Returns:** `string`"
  ^js [command]
  (.-command ^js command))

(defn set-command!
  "The identifier of the actual command handler."
  ^js [command value]
  (set! (.-command ^js command) value))

(defn tooltip
  "A tooltip for the command, when represented in the UI.
   
   **Returns:** `string | undefined`"
  ^js [command]
  (.-tooltip ^js command))

(defn set-tooltip!
  "A tooltip for the command, when represented in the UI."
  ^js [command value]
  (set! (.-tooltip ^js command) value))

(defn arguments
  "Arguments that the command handler should be
   invoked with.
   
   **Returns:** `any[] | undefined`"
  ^js [command]
  (.-arguments ^js command))

(defn set-arguments!
  "Arguments that the command handler should be
   invoked with."
  ^js [command value]
  (set! (.-arguments ^js command) value))
