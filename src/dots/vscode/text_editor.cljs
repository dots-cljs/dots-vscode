(ns dots.vscode.text-editor
  "Represents an editor that is attached to a {@link TextDocument document}.")

(defn document
  "The document associated with this text editor. The document will be the same for the entire lifetime of this text editor.
   
   **Returns:** `TextDocument`"
  ^js [text-editor]
  (.-document ^js text-editor))

(defn selection
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`.
   
   **Returns:** `Selection`"
  ^js [text-editor]
  (.-selection ^js text-editor))

(defn set-selection!
  "The primary selection on this text editor. Shorthand for `TextEditor.selections[0]`."
  ^js [text-editor value]
  (set! (.-selection ^js text-editor) value))

(defn selections
  "The selections in this text editor. The primary selection is always at index 0.
   
   **Returns:** `readonly Selection[]`"
  ^js [text-editor]
  (.-selections ^js text-editor))

(defn set-selections!
  "The selections in this text editor. The primary selection is always at index 0."
  ^js [text-editor value]
  (set! (.-selections ^js text-editor) value))

(defn visible-ranges
  "The current visible ranges in the editor (vertically).
   This accounts only for vertical scrolling, and not for horizontal scrolling.
   
   **Returns:** `readonly Range[]`"
  ^js [text-editor]
  (.-visibleRanges ^js text-editor))

(defn options
  "Text editor options.
   
   **Returns:** `TextEditorOptions`"
  ^js [text-editor]
  (.-options ^js text-editor))

(defn set-options!
  "Text editor options."
  ^js [text-editor value]
  (set! (.-options ^js text-editor) value))

(defn view-column
  "The column in which this editor shows. Will be `undefined` in case this
   isn't one of the main editors, e.g. an embedded editor, or when the editor
   column is larger than three.
   
   **Returns:** `ViewColumn | undefined`"
  ^js [text-editor]
  (.-viewColumn ^js text-editor))

(defn edit
  "Perform an edit on the document associated with this text editor.
   
   The given callback-function is invoked with an {@link TextEditorEdit edit-builder} which must
   be used to make edits. Note that the edit-builder is only valid while the
   callback executes.
   
   **Parameters:**
   - `callback`: `(editBuilder: TextEditorEdit) => void` - A function which can create edits using an {@link TextEditorEdit edit-builder}.
   - `options`: `{ readonly undoStopBefore: boolean; readonly undoStopAfter: boolean; } | undefined` - The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
   
   **Returns:** `Thenable<boolean>` - A promise that resolves with a value indicating if the edits could be applied."
  (^js [text-editor callback]
   (.edit ^js text-editor callback))
  (^js [text-editor callback options]
   (.edit ^js text-editor callback options)))

(defn insert-snippet
  "Insert a {@link SnippetString snippet} and put the editor into snippet mode. \"Snippet mode\"
   means the editor adds placeholders and additional cursors so that the user can complete
   or accept the snippet.
   
   **Parameters:**
   - `snippet`: `SnippetString` - The snippet to insert in this edit.
   - `location`: `Range | Position | readonly Range[] | readonly Position[] | undefined` - Position or range at which to insert the snippet, defaults to the current editor selection or selections.
   - `options`: `{ readonly undoStopBefore: boolean; readonly undoStopAfter: boolean; } | undefined` - The undo/redo behavior around this edit. By default, undo stops will be created before and after this edit.
   
   **Returns:** `Thenable<boolean>` - A promise that resolves with a value indicating if the snippet could be inserted. Note that the promise does not signal
   that the snippet is completely filled-in or accepted."
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
   will be removed.
   
   **Parameters:**
   - `decoration-type`: `TextEditorDecorationType` - A decoration type.
   - `ranges-or-options`: `readonly Range[] | readonly DecorationOptions[]` - Either {@link Range ranges} or more detailed {@link DecorationOptions options}.
   
   **Returns:** `void`"
  ^js [text-editor decoration-type ranges-or-options]
  (.setDecorations ^js text-editor decoration-type ranges-or-options))

(defn reveal-range
  "Scroll as indicated by `revealType` in order to reveal the given range.
   
   **Parameters:**
   - `range`: `Range` - A range.
   - `reveal-type`: `TextEditorRevealType | undefined` - The scrolling strategy for revealing `range`.
   
   **Returns:** `void`"
  (^js [text-editor range]
   (.revealRange ^js text-editor range))
  (^js [text-editor range reveal-type]
   (.revealRange ^js text-editor range reveal-type)))

(defn show
  "Show the text editor.
   
   **Parameters:**
   - `column`: `ViewColumn | undefined` - The {@link ViewColumn column} in which to show this editor.
   This method shows unexpected behavior and will be removed in the next major update.
   
   **Returns:** `void`"
  (^js [text-editor]
   (.show ^js text-editor))
  (^js [text-editor column]
   (.show ^js text-editor column)))

(defn hide
  "Hide the text editor.
   
   **Returns:** `void`"
  ^js [text-editor]
  (.hide ^js text-editor))
