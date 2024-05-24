(ns dots.vscode.input-box-options
  "Options to configure the behavior of the input box UI.")

(defn title
  "An optional string that represents the title of the input box."
  ^js [input-box-options]
  (.-title ^js input-box-options))

(defn set-title!
  "An optional string that represents the title of the input box."
  ^js [input-box-options value]
  (set! (.-title ^js input-box-options) value))

(defn value
  "The value to pre-fill in the input box."
  ^js [input-box-options]
  (.-value ^js input-box-options))

(defn set-value!
  "The value to pre-fill in the input box."
  ^js [input-box-options value]
  (set! (.-value ^js input-box-options) value))

(defn value-selection
  "Selection of the pre-filled {@linkcode InputBoxOptions.value value}. Defined as tuple of two number where the
   first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
   pre-filled value will be selected, when empty (start equals end) only the cursor will be set,
   otherwise the defined range will be selected."
  ^js [input-box-options]
  (.-valueSelection ^js input-box-options))

(defn set-value-selection!
  "Selection of the pre-filled {@linkcode InputBoxOptions.value value}. Defined as tuple of two number where the
   first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
   pre-filled value will be selected, when empty (start equals end) only the cursor will be set,
   otherwise the defined range will be selected."
  ^js [input-box-options value]
  (set! (.-valueSelection ^js input-box-options) value))

(defn prompt
  "The text to display underneath the input box."
  ^js [input-box-options]
  (.-prompt ^js input-box-options))

(defn set-prompt!
  "The text to display underneath the input box."
  ^js [input-box-options value]
  (set! (.-prompt ^js input-box-options) value))

(defn place-holder
  "An optional string to show as placeholder in the input box to guide the user what to type."
  ^js [input-box-options]
  (.-placeHolder ^js input-box-options))

(defn set-place-holder!
  "An optional string to show as placeholder in the input box to guide the user what to type."
  ^js [input-box-options value]
  (set! (.-placeHolder ^js input-box-options) value))

(defn password?
  "Controls if a password input is shown. Password input hides the typed text."
  ^js [input-box-options]
  (.-password ^js input-box-options))

(defn set-password!
  "Controls if a password input is shown. Password input hides the typed text."
  ^js [input-box-options value]
  (set! (.-password ^js input-box-options) value))

(defn ignore-focus-out?
  "Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [input-box-options]
  (.-ignoreFocusOut ^js input-box-options))

(defn set-ignore-focus-out!
  "Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [input-box-options value]
  (set! (.-ignoreFocusOut ^js input-box-options) value))

(defn validate-input
  "An optional function that will be called to validate input and to give a hint
   to the user.
   
   **Parameters:**
   - `value`: `string` - The current value of the input box.
   
   **Returns:** `string | InputBoxValidationMessage | Thenable<string | InputBoxValidationMessage | null | undefined> | null | undefined` - Either a human-readable string which is presented as an error message or an {@link InputBoxValidationMessage}which can provide a specific message severity. Return `undefined`, `null`, or the empty string when 'value' is valid."
  ^js [input-box-options value]
  (.validateInput ^js input-box-options value))
