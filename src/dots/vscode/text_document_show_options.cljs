(ns dots.vscode.text-document-show-options
  "Represents options to configure the behavior of showing a {@link TextDocument document} in an {@link TextEditor editor}.")

(defn view-column
  "An optional view column in which the {@link TextEditor editor} should be shown.
   The default is the {@link ViewColumn.Active active}. Columns that do not exist
   will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }.
   Use {@linkcode ViewColumn.Beside } to open the editor to the side of the currently
   active one."
  ^js [text-document-show-options]
  (.-viewColumn ^js text-document-show-options))

(defn set-view-column!
  "An optional view column in which the {@link TextEditor editor} should be shown.
   The default is the {@link ViewColumn.Active active}. Columns that do not exist
   will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }.
   Use {@linkcode ViewColumn.Beside } to open the editor to the side of the currently
   active one."
  ^js [text-document-show-options value]
  (set! (.-viewColumn ^js text-document-show-options) value))

(defn preserve-focus?
  "An optional flag that when `true` will stop the {@link TextEditor editor} from taking focus."
  ^js [text-document-show-options]
  (.-preserveFocus ^js text-document-show-options))

(defn set-preserve-focus!
  "An optional flag that when `true` will stop the {@link TextEditor editor} from taking focus."
  ^js [text-document-show-options value]
  (set! (.-preserveFocus ^js text-document-show-options) value))

(defn preview?
  "An optional flag that controls if an {@link TextEditor editor}-tab shows as preview. Preview tabs will
   be replaced and reused until set to stay - either explicitly or through editing.
   
   *Note* that the flag is ignored if a user has disabled preview editors in settings."
  ^js [text-document-show-options]
  (.-preview ^js text-document-show-options))

(defn set-preview!
  "An optional flag that controls if an {@link TextEditor editor}-tab shows as preview. Preview tabs will
   be replaced and reused until set to stay - either explicitly or through editing.
   
   *Note* that the flag is ignored if a user has disabled preview editors in settings."
  ^js [text-document-show-options value]
  (set! (.-preview ^js text-document-show-options) value))

(defn selection
  "An optional selection to apply for the document in the {@link TextEditor editor}."
  ^js [text-document-show-options]
  (.-selection ^js text-document-show-options))

(defn set-selection!
  "An optional selection to apply for the document in the {@link TextEditor editor}."
  ^js [text-document-show-options value]
  (set! (.-selection ^js text-document-show-options) value))
