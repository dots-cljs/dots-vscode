(ns dots.vscode.scm.input-box
  "The {@link SourceControlInputBox input box} for the last source control
   created by the extension."
  (:require ["vscode" :as vscode]))

(defn value
  "Setter and getter for the contents of the input box.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/scm -inputBox -value))

(defn set-value!
  "Setter and getter for the contents of the input box."
  ^js [value]
  (set! (.. vscode/scm -inputBox -value) value))

(defn placeholder
  "A string to show as placeholder in the input box to guide the user.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/scm -inputBox -placeholder))

(defn set-placeholder!
  "A string to show as placeholder in the input box to guide the user."
  ^js [value]
  (set! (.. vscode/scm -inputBox -placeholder) value))

(defn enabled?
  "Controls whether the input box is enabled (default is `true`).
   
   **Returns:** `boolean`"
  ^js []
  (.. vscode/scm -inputBox -enabled))

(defn set-enabled!
  "Controls whether the input box is enabled (default is `true`)."
  ^js [value]
  (set! (.. vscode/scm -inputBox -enabled) value))

(defn visible?
  "Controls whether the input box is visible (default is `true`).
   
   **Returns:** `boolean`"
  ^js []
  (.. vscode/scm -inputBox -visible))

(defn set-visible!
  "Controls whether the input box is visible (default is `true`)."
  ^js [value]
  (set! (.. vscode/scm -inputBox -visible) value))
