(ns dots.vscode.text-editor-options
  "Represents a {@link TextEditor text editor}'s {@link TextEditor.options options}.")

(defn tab-size
  "The size in spaces a tab takes. This is used for two purposes:
    - the rendering width of a tab character;
    - the number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true
      and `indentSize` is set to `\"tabSize\"`.
   
   When getting a text editor's options, this property will always be a number (resolved).
   When setting a text editor's options, this property is optional and it can be a number or `\"auto\"`.
   
   **Returns:** `string | number | undefined`"
  ^js [text-editor-options]
  (.-tabSize ^js text-editor-options))

(defn set-tab-size!
  "The size in spaces a tab takes. This is used for two purposes:
    - the rendering width of a tab character;
    - the number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true
      and `indentSize` is set to `\"tabSize\"`.
   
   When getting a text editor's options, this property will always be a number (resolved).
   When setting a text editor's options, this property is optional and it can be a number or `\"auto\"`."
  ^js [text-editor-options value]
  (set! (.-tabSize ^js text-editor-options) value))

(defn indent-size
  "The number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true.
   
   When getting a text editor's options, this property will always be a number (resolved).
   When setting a text editor's options, this property is optional and it can be a number or `\"tabSize\"`.
   
   **Returns:** `string | number | undefined`"
  ^js [text-editor-options]
  (.-indentSize ^js text-editor-options))

(defn set-indent-size!
  "The number of spaces to insert when {@link TextEditorOptions.insertSpaces insertSpaces} is true.
   
   When getting a text editor's options, this property will always be a number (resolved).
   When setting a text editor's options, this property is optional and it can be a number or `\"tabSize\"`."
  ^js [text-editor-options value]
  (set! (.-indentSize ^js text-editor-options) value))

(defn insert-spaces?
  "When pressing Tab insert {@link TextEditorOptions.tabSize n} spaces.
   When getting a text editor's options, this property will always be a boolean (resolved).
   When setting a text editor's options, this property is optional and it can be a boolean or `\"auto\"`.
   
   **Returns:** `string | boolean | undefined`"
  ^js [text-editor-options]
  (.-insertSpaces ^js text-editor-options))

(defn set-insert-spaces!
  "When pressing Tab insert {@link TextEditorOptions.tabSize n} spaces.
   When getting a text editor's options, this property will always be a boolean (resolved).
   When setting a text editor's options, this property is optional and it can be a boolean or `\"auto\"`."
  ^js [text-editor-options value]
  (set! (.-insertSpaces ^js text-editor-options) value))

(defn cursor-style
  "The rendering style of the cursor in this editor.
   When getting a text editor's options, this property will always be present.
   When setting a text editor's options, this property is optional.
   
   **Returns:** `TextEditorCursorStyle | undefined`"
  ^js [text-editor-options]
  (.-cursorStyle ^js text-editor-options))

(defn set-cursor-style!
  "The rendering style of the cursor in this editor.
   When getting a text editor's options, this property will always be present.
   When setting a text editor's options, this property is optional."
  ^js [text-editor-options value]
  (set! (.-cursorStyle ^js text-editor-options) value))

(defn line-numbers
  "Render relative line numbers w.r.t. the current line number.
   When getting a text editor's options, this property will always be present.
   When setting a text editor's options, this property is optional.
   
   **Returns:** `TextEditorLineNumbersStyle | undefined`"
  ^js [text-editor-options]
  (.-lineNumbers ^js text-editor-options))

(defn set-line-numbers!
  "Render relative line numbers w.r.t. the current line number.
   When getting a text editor's options, this property will always be present.
   When setting a text editor's options, this property is optional."
  ^js [text-editor-options value]
  (set! (.-lineNumbers ^js text-editor-options) value))
