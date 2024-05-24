(ns dots.vscode.on-enter-rule
  "Describes a rule to be evaluated when pressing Enter.")

(defn before-text
  "This rule will only execute if the text before the cursor matches this regular expression.
   
   **Returns:** `RegExp`"
  ^js [on-enter-rule]
  (.-beforeText ^js on-enter-rule))

(defn set-before-text!
  "This rule will only execute if the text before the cursor matches this regular expression."
  ^js [on-enter-rule value]
  (set! (.-beforeText ^js on-enter-rule) value))

(defn after-text
  "This rule will only execute if the text after the cursor matches this regular expression.
   
   **Returns:** `RegExp | undefined`"
  ^js [on-enter-rule]
  (.-afterText ^js on-enter-rule))

(defn set-after-text!
  "This rule will only execute if the text after the cursor matches this regular expression."
  ^js [on-enter-rule value]
  (set! (.-afterText ^js on-enter-rule) value))

(defn previous-line-text
  "This rule will only execute if the text above the current line matches this regular expression.
   
   **Returns:** `RegExp | undefined`"
  ^js [on-enter-rule]
  (.-previousLineText ^js on-enter-rule))

(defn set-previous-line-text!
  "This rule will only execute if the text above the current line matches this regular expression."
  ^js [on-enter-rule value]
  (set! (.-previousLineText ^js on-enter-rule) value))

(defn action
  "The action to execute.
   
   **Returns:** `EnterAction`"
  ^js [on-enter-rule]
  (.-action ^js on-enter-rule))

(defn set-action!
  "The action to execute."
  ^js [on-enter-rule value]
  (set! (.-action ^js on-enter-rule) value))
