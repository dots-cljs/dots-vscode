(ns dots.vscode.snippet-string
  "A snippet string is a template which allows to insert text
   and to control the editor cursor when insertion happens.
   
   A snippet can define tab stops and placeholders with `$1`, `$2`
   and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   the end of the snippet. Variables are defined with `$name` and
   `${name:default value}`. Also see
   [the full snippet syntax](https://code.visualstudio.com/docs/editor/userdefinedsnippets#_create-your-own-snippets).")

(defn value
  "The snippet string.
   
   **Returns:** `string`"
  ^js [snippet-string]
  (.-value ^js snippet-string))

(defn set-value!
  "The snippet string."
  ^js [snippet-string value]
  (set! (.-value ^js snippet-string) value))

(defn append-text
  "Builder-function that appends the given string to
   the {@linkcode SnippetString.value value} of this snippet string.
   
   **Parameters:**
   - `string`: `string` - A value to append 'as given'. The string will be escaped.
   
   **Returns:** `SnippetString` - This snippet string."
  ^js [snippet-string string]
  (.appendText ^js snippet-string string))

(defn append-tabstop
  "Builder-function that appends a tabstop (`$1`, `$2` etc) to
   the {@linkcode SnippetString.value value} of this snippet string.
   
   **Parameters:**
   - `number`: `number | undefined` - The number of this tabstop, defaults to an auto-increment
   value starting at 1.
   
   **Returns:** `SnippetString` - This snippet string."
  (^js [snippet-string]
   (.appendTabstop ^js snippet-string))
  (^js [snippet-string number]
   (.appendTabstop ^js snippet-string number)))

(defn append-placeholder
  "Builder-function that appends a placeholder (`${1:value}`) to
   the {@linkcode SnippetString.value value} of this snippet string.
   
   **Parameters:**
   - `value`: `string | ((snippet: SnippetString) => any)` - The value of this placeholder - either a string or a function
   with which a nested snippet can be created.
   - `number`: `number | undefined` - The number of this tabstop, defaults to an auto-increment
   value starting at 1.
   
   **Returns:** `SnippetString` - This snippet string."
  (^js [snippet-string value]
   (.appendPlaceholder ^js snippet-string value))
  (^js [snippet-string value number]
   (.appendPlaceholder ^js snippet-string value number)))

(defn append-choice
  "Builder-function that appends a choice (`${1|a,b,c|}`) to
   the {@linkcode SnippetString.value value} of this snippet string.
   
   **Parameters:**
   - `values`: `readonly string[]` - The values for choices - the array of strings
   - `number`: `number | undefined` - The number of this tabstop, defaults to an auto-increment
   value starting at 1.
   
   **Returns:** `SnippetString` - This snippet string."
  (^js [snippet-string values]
   (.appendChoice ^js snippet-string values))
  (^js [snippet-string values number]
   (.appendChoice ^js snippet-string values number)))

(defn append-variable
  "Builder-function that appends a variable (`${VAR}`) to
   the {@linkcode SnippetString.value value} of this snippet string.
   
   **Parameters:**
   - `name`: `string` - The name of the variable - excluding the `$`.
   - `default-value`: `string | ((snippet: SnippetString) => any)` - The default value which is used when the variable name cannot
   be resolved - either a string or a function with which a nested snippet can be created.
   
   **Returns:** `SnippetString` - This snippet string."
  ^js [snippet-string name default-value]
  (.appendVariable ^js snippet-string name default-value))
