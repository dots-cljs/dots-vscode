(ns dots.vscode.text-editor-edit
  "A complex edit that will be applied in one transaction on a TextEditor.
   This holds a description of the edits and if the edits are valid (i.e. no overlapping regions, document was not changed in the meantime, etc.)
   they can be applied on a {@link TextDocument document} associated with a {@link TextEditor text editor}."
  (:refer-clojure :exclude [replace]))

(defn replace
  "Replace a certain text region with a new value.
   You can use \\r\\n or \\n in `value` and they will be normalized to the current {@link TextDocument document}."
  ^js [text-editor-edit location value]
  (.replace ^js text-editor-edit location value))

(defn insert
  "Insert text at a location.
   You can use \\r\\n or \\n in `value` and they will be normalized to the current {@link TextDocument document}.
   Although the equivalent text edit can be made with {@link TextEditorEdit.replace replace}, `insert` will produce a different resulting selection (it will get moved)."
  ^js [text-editor-edit location value]
  (.insert ^js text-editor-edit location value))

(defn delete
  "Delete a certain text region."
  ^js [text-editor-edit location]
  (.delete ^js text-editor-edit location))

(defn set-end-of-line
  "Set the end of line sequence."
  ^js [text-editor-edit end-of-line]
  (.setEndOfLine ^js text-editor-edit end-of-line))
