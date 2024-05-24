(ns dots.vscode.code-lens
  "A code lens represents a {@link Command } that should be shown along with
   source text, like the number of references, a way to run tests, etc.
   
   A code lens is _unresolved_ when no command is associated to it. For performance
   reasons the creation of a code lens and resolving should be done to two stages."
  (:refer-clojure :exclude [range]))

(defn range
  "The range in which this code lens is valid. Should only span a single line.
   
   **Returns:** `Range`"
  ^js [code-lens]
  (.-range ^js code-lens))

(defn set-range!
  "The range in which this code lens is valid. Should only span a single line."
  ^js [code-lens value]
  (set! (.-range ^js code-lens) value))

(defn command
  "The command this code lens represents.
   
   **Returns:** `Command | undefined`"
  ^js [code-lens]
  (.-command ^js code-lens))

(defn set-command!
  "The command this code lens represents."
  ^js [code-lens value]
  (set! (.-command ^js code-lens) value))

(defn resolved?
  "`true` when there is a command associated.
   
   **Returns:** `boolean`"
  ^js [code-lens]
  (.-isResolved ^js code-lens))
