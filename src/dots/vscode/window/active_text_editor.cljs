(ns dots.vscode.window.active-text-editor
  "The currently active editor or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  (:require ["vscode" :as vscode]))

(defn document
  "The document associated with this text editor. The document will be the same for the entire lifetime of this text editor."
  ^js []
  (.. vscode/window -activeTextEditor -document))

(defn selection
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`."
  ^js []
  (.. vscode/window -activeTextEditor -selection))

(defn set-selection!
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`."
  ^js [value]
  (set! (.. vscode/window -activeTextEditor -selection) value))

(defn selections
  "The selections in this text editor. The primary selection is always at index 0."
  ^js []
  (.. vscode/window -activeTextEditor -selections))

(defn set-selections!
  "The selections in this text editor. The primary selection is always at index 0."
  ^js [value]
  (set! (.. vscode/window -activeTextEditor -selections) value))

(defn visible-ranges
  "The current visible ranges in the editor (vertically).
   This accounts only for vertical scrolling, and not for horizontal scrolling."
  ^js []
  (.. vscode/window -activeTextEditor -visibleRanges))

(defn options
  "Text editor options."
  ^js []
  (.. vscode/window -activeTextEditor -options))

(defn set-options!
  "Text editor options."
  ^js [value]
  (set! (.. vscode/window -activeTextEditor -options) value))

(defn view-column
  "The column in which this editor shows. Will be `undefined` in case this
   isn't one of the main editors, e.g. an embedded editor, or when the editor
   column is larger than three."
  ^js []
  (.. vscode/window -activeTextEditor -viewColumn))

(defn edit
  "Perform an edit on the document associated with this text editor.
   
   The given callback-function is invoked with an {@link TextEditorEdit edit-builder} which must
   be used to make edits. Note that the edit-builder is only valid while the
   callback executes."
  (^js [callback]
   (.. vscode/window -activeTextEditor (edit callback)))
  (^js [callback options]
   (.. vscode/window -activeTextEditor (edit callback options))))

(defn insert-snippet
  "Insert a {@link SnippetString snippet} and put the editor into snippet mode. \"Snippet mode\"
   means the editor adds placeholders and additional cursors so that the user can complete
   or accept the snippet."
  (^js [snippet]
   (.. vscode/window -activeTextEditor (insertSnippet snippet)))
  (^js [snippet location]
   (.. vscode/window -activeTextEditor (insertSnippet snippet location)))
  (^js [snippet location options]
   (.. vscode/window -activeTextEditor (insertSnippet snippet location options))))

(defn set-decorations
  "Adds a set of decorations to the text editor. If a set of decorations already exists with
   the given {@link TextEditorDecorationType decoration type}, they will be replaced. If
   `rangesOrOptions` is empty, the existing decorations with the given {@link TextEditorDecorationType decoration type}
   will be removed."
  ^js [decoration-type ranges-or-options]
  (.. vscode/window -activeTextEditor (setDecorations decoration-type ranges-or-options)))

(defn reveal-range
  "Scroll as indicated by `revealType` in order to reveal the given range."
  (^js [range]
   (.. vscode/window -activeTextEditor (revealRange range)))
  (^js [range reveal-type]
   (.. vscode/window -activeTextEditor (revealRange range reveal-type))))

(defn show
  "Show the text editor."
  (^js []
   (.. vscode/window -activeTextEditor (show)))
  (^js [column]
   (.. vscode/window -activeTextEditor (show column))))

(defn hide
  "Hide the text editor."
  ^js []
  (.. vscode/window -activeTextEditor (hide)))
