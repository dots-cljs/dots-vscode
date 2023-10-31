(ns dots.vscode.text-editor
  "Represents an editor that is attached to a {@link TextDocument document}.")

(defn document
  "The document associated with this text editor. The document will be the same for the entire lifetime of this text editor."
  ^js [text-editor]
  (.-document ^js text-editor))

(defn selection
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`."
  ^js [text-editor]
  (.-selection ^js text-editor))

(defn set-selection!
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`."
  ^js [text-editor value]
  (set! (.-selection ^js text-editor) value))

(defn selections
  "The selections in this text editor. The primary selection is always at index 0."
  ^js [text-editor]
  (.-selections ^js text-editor))

(defn set-selections!
  "The selections in this text editor. The primary selection is always at index 0."
  ^js [text-editor value]
  (set! (.-selections ^js text-editor) value))

(defn visible-ranges
  "The current visible ranges in the editor (vertically).
   This accounts only for vertical scrolling, and not for horizontal scrolling."
  ^js [text-editor]
  (.-visibleRanges ^js text-editor))

(defn options
  "Text editor options."
  ^js [text-editor]
  (.-options ^js text-editor))

(defn set-options!
  "Text editor options."
  ^js [text-editor value]
  (set! (.-options ^js text-editor) value))

(defn view-column
  "The column in which this editor shows. Will be `undefined` in case this
   isn't one of the main editors, e.g. an embedded editor, or when the editor
   column is larger than three."
  ^js [text-editor]
  (.-viewColumn ^js text-editor))

(defn edit
  "Perform an edit on the document associated with this text editor.
   
   The given callback-function is invoked with an {@link TextEditorEdit edit-builder} which must
   be used to make edits. Note that the edit-builder is only valid while the
   callback executes."
  (^js [text-editor callback]
   (.edit ^js text-editor callback))
  (^js [text-editor callback options]
   (.edit ^js text-editor callback options)))

(defn insert-snippet
  "Insert a {@link SnippetString snippet} and put the editor into snippet mode. \"Snippet mode\"
   means the editor adds placeholders and additional cursors so that the user can complete
   or accept the snippet."
  (^js [text-editor snippet]
   (.insertSnippet ^js text-editor snippet))
  (^js [text-editor snippet location]
   (.insertSnippet ^js text-editor snippet location))
  (^js [text-editor snippet location options]
   (.insertSnippet ^js text-editor snippet location options)))

(defn set-decorations
  "Adds a set of decorations to the text editor. If a set of decorations already exists with
   the given {@link TextEditorDecorationType decoration type}, they will be replaced. If
   `rangesOrOptions` is empty, the existing decorations with the given {@link TextEditorDecorationType decoration type}
   will be removed."
  ^js [text-editor decoration-type ranges-or-options]
  (.setDecorations ^js text-editor decoration-type ranges-or-options))

(defn reveal-range
  "Scroll as indicated by `revealType` in order to reveal the given range."
  (^js [text-editor range]
   (.revealRange ^js text-editor range))
  (^js [text-editor range reveal-type]
   (.revealRange ^js text-editor range reveal-type)))

(defn show
  "Show the text editor."
  (^js [text-editor]
   (.show ^js text-editor))
  (^js [text-editor column]
   (.show ^js text-editor column)))

(defn hide
  "Hide the text editor."
  ^js [text-editor]
  (.hide ^js text-editor))
