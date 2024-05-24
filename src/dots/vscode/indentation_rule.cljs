(ns dots.vscode.indentation-rule
  "Describes indentation rules for a language.")

(defn decrease-indent-pattern
  "If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
   
   **Returns:** `RegExp`"
  ^js [indentation-rule]
  (.-decreaseIndentPattern ^js indentation-rule))

(defn set-decrease-indent-pattern!
  "If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches)."
  ^js [indentation-rule value]
  (set! (.-decreaseIndentPattern ^js indentation-rule) value))

(defn increase-indent-pattern
  "If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
   
   **Returns:** `RegExp`"
  ^js [indentation-rule]
  (.-increaseIndentPattern ^js indentation-rule))

(defn set-increase-indent-pattern!
  "If a line matches this pattern, then all the lines after it should be indented once (until another rule matches)."
  ^js [indentation-rule value]
  (set! (.-increaseIndentPattern ^js indentation-rule) value))

(defn indent-next-line-pattern
  "If a line matches this pattern, then **only the next line** after it should be indented once.
   
   **Returns:** `RegExp | undefined`"
  ^js [indentation-rule]
  (.-indentNextLinePattern ^js indentation-rule))

(defn set-indent-next-line-pattern!
  "If a line matches this pattern, then **only the next line** after it should be indented once."
  ^js [indentation-rule value]
  (set! (.-indentNextLinePattern ^js indentation-rule) value))

(defn un-indented-line-pattern
  "If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
   
   **Returns:** `RegExp | undefined`"
  ^js [indentation-rule]
  (.-unIndentedLinePattern ^js indentation-rule))

(defn set-un-indented-line-pattern!
  "If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules."
  ^js [indentation-rule value]
  (set! (.-unIndentedLinePattern ^js indentation-rule) value))
