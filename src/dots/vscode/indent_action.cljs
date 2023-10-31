(ns dots.vscode.indent-action
  "Describes what to do with the indentation when pressing Enter."
  (:require ["vscode" :as vscode]))

(def none
  "Insert new line and copy the previous line's indentation."
  (.-None vscode/IndentAction))

(def indent
  "Insert new line and indent once (relative to the previous line's indentation)."
  (.-Indent vscode/IndentAction))

(def indent-outdent
  "Insert two new lines:
    - the first one indented which will hold the cursor
    - the second one at the same indentation level"
  (.-IndentOutdent vscode/IndentAction))

(def outdent
  "Insert new line and outdent once (relative to the previous line's indentation)."
  (.-Outdent vscode/IndentAction))
