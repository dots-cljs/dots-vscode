(ns dots.vscode.shell-quoting-options
  "The shell quoting options.")

(defn escape
  "The character used to do character escaping. If a string is provided only spaces
   are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
   in `charsToEscape` are escaped using the `escapeChar`."
  ^js [shell-quoting-options]
  (.-escape ^js shell-quoting-options))

(defn set-escape!
  "The character used to do character escaping. If a string is provided only spaces
   are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
   in `charsToEscape` are escaped using the `escapeChar`."
  ^js [shell-quoting-options value]
  (set! (.-escape ^js shell-quoting-options) value))

(defn strong
  "The character used for strong quoting. The string's length must be 1."
  ^js [shell-quoting-options]
  (.-strong ^js shell-quoting-options))

(defn set-strong!
  "The character used for strong quoting. The string's length must be 1."
  ^js [shell-quoting-options value]
  (set! (.-strong ^js shell-quoting-options) value))

(defn weak
  "The character used for weak quoting. The string's length must be 1."
  ^js [shell-quoting-options]
  (.-weak ^js shell-quoting-options))

(defn set-weak!
  "The character used for weak quoting. The string's length must be 1."
  ^js [shell-quoting-options value]
  (set! (.-weak ^js shell-quoting-options) value))
