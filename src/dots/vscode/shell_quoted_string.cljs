(ns dots.vscode.shell-quoted-string
  "A string that will be quoted depending on the used shell.")

(defn value
  "The actual string value.
   
   **Returns:** `string`"
  ^js [shell-quoted-string]
  (.-value ^js shell-quoted-string))

(defn set-value!
  "The actual string value."
  ^js [shell-quoted-string value]
  (set! (.-value ^js shell-quoted-string) value))

(defn quoting
  "The quoting style to use.
   
   **Returns:** `ShellQuoting`"
  ^js [shell-quoted-string]
  (.-quoting ^js shell-quoted-string))

(defn set-quoting!
  "The quoting style to use."
  ^js [shell-quoted-string value]
  (set! (.-quoting ^js shell-quoted-string) value))
