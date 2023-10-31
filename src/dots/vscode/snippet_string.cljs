(ns dots.vscode.snippet-string
  "A snippet string is a template which allows to insert text
   and to control the editor cursor when insertion happens.
   
   A snippet can define tab stops and placeholders with `$1`, `$2`
   and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   the end of the snippet. Variables are defined with `$name` and
   `${name:default value}`. Also see
   [the full snippet syntax](https://code.visualstudio.com/docs/editor/userdefinedsnippets#_creating-your-own-snippets).")

(defn value
  "The snippet string."
  ^js [snippet-string]
  (.-value ^js snippet-string))

(defn set-value!
  "The snippet string."
  ^js [snippet-string value]
  (set! (.-value ^js snippet-string) value))

(defn append-text
  "Builder-function that appends the given string to
   the {@linkcode SnippetString.value value} of this snippet string."
  ^js [snippet-string string]
  (.appendText ^js snippet-string string))

(defn append-tabstop
  "Builder-function that appends a tabstop (`$1`, `$2` etc) to
   the {@linkcode SnippetString.value value} of this snippet string."
  (^js [snippet-string]
   (.appendTabstop ^js snippet-string))
  (^js [snippet-string number]
   (.appendTabstop ^js snippet-string number)))

(defn append-placeholder
  "Builder-function that appends a placeholder (`${1:value}`) to
   the {@linkcode SnippetString.value value} of this snippet string."
  (^js [snippet-string value]
   (.appendPlaceholder ^js snippet-string value))
  (^js [snippet-string value number]
   (.appendPlaceholder ^js snippet-string value number)))

(defn append-choice
  "Builder-function that appends a choice (`${1|a,b,c|}`) to
   the {@linkcode SnippetString.value value} of this snippet string."
  (^js [snippet-string values]
   (.appendChoice ^js snippet-string values))
  (^js [snippet-string values number]
   (.appendChoice ^js snippet-string values number)))

(defn append-variable
  "Builder-function that appends a variable (`${VAR}`) to
   the {@linkcode SnippetString.value value} of this snippet string."
  ^js [snippet-string name default-value]
  (.appendVariable ^js snippet-string name default-value))
