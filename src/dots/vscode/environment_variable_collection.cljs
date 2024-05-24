(ns dots.vscode.environment-variable-collection
  "A collection of mutations that an extension can apply to a process environment."
  (:refer-clojure :exclude [get replace]))

(defn persistent?
  "Whether the collection should be cached for the workspace and applied to the terminal
   across window reloads. When true the collection will be active immediately such when the
   window reloads. Additionally, this API will return the cached version if it exists. The
   collection will be invalidated when the extension is uninstalled or when the collection
   is cleared. Defaults to true.
   
   **Returns:** `boolean`"
  ^js [environment-variable-collection]
  (.-persistent ^js environment-variable-collection))

(defn set-persistent!
  "Whether the collection should be cached for the workspace and applied to the terminal
   across window reloads. When true the collection will be active immediately such when the
   window reloads. Additionally, this API will return the cached version if it exists. The
   collection will be invalidated when the extension is uninstalled or when the collection
   is cleared. Defaults to true."
  ^js [environment-variable-collection value]
  (set! (.-persistent ^js environment-variable-collection) value))

(defn description
  "A description for the environment variable collection, this will be used to describe the
   changes in the UI.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [environment-variable-collection]
  (.-description ^js environment-variable-collection))

(defn set-description!
  "A description for the environment variable collection, this will be used to describe the
   changes in the UI."
  ^js [environment-variable-collection value]
  (set! (.-description ^js environment-variable-collection) value))

(defn replace
  "Replace an environment variable with a value.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend.
   
   **Parameters:**
   - `variable`: `string` - The variable to replace.
   - `value`: `string` - The value to replace the variable with.
   - `options`: `EnvironmentVariableMutatorOptions | undefined` - Options applied to the mutator, when no options are provided this will
   default to `{ applyAtProcessCreation: true }`.
   
   **Returns:** `void`"
  (^js [environment-variable-collection variable value]
   (.replace ^js environment-variable-collection variable value))
  (^js [environment-variable-collection variable value options]
   (.replace ^js environment-variable-collection variable value options)))

(defn append
  "Append a value to an environment variable.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend.
   
   **Parameters:**
   - `variable`: `string` - The variable to append to.
   - `value`: `string` - The value to append to the variable.
   - `options`: `EnvironmentVariableMutatorOptions | undefined` - Options applied to the mutator, when no options are provided this will
   default to `{ applyAtProcessCreation: true }`.
   
   **Returns:** `void`"
  (^js [environment-variable-collection variable value]
   (.append ^js environment-variable-collection variable value))
  (^js [environment-variable-collection variable value options]
   (.append ^js environment-variable-collection variable value options)))

(defn prepend
  "Prepend a value to an environment variable.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend.
   
   **Parameters:**
   - `variable`: `string` - The variable to prepend.
   - `value`: `string` - The value to prepend to the variable.
   - `options`: `EnvironmentVariableMutatorOptions | undefined` - Options applied to the mutator, when no options are provided this will
   default to `{ applyAtProcessCreation: true }`.
   
   **Returns:** `void`"
  (^js [environment-variable-collection variable value]
   (.prepend ^js environment-variable-collection variable value))
  (^js [environment-variable-collection variable value options]
   (.prepend ^js environment-variable-collection variable value options)))

(defn get
  "Gets the mutator that this collection applies to a variable, if any.
   
   **Parameters:**
   - `variable`: `string` - The variable to get the mutator for.
   
   **Returns:** `EnvironmentVariableMutator | undefined`"
  ^js [environment-variable-collection variable]
  (.get ^js environment-variable-collection variable))

(defn for-each
  "Iterate over each mutator in this collection.
   
   **Parameters:**
   - `callback`: `(variable: string, mutator: EnvironmentVariableMutator, collection: EnvironmentVariableCollection) => any` - Function to execute for each entry.
   - `this-arg`: `any` - The `this` context used when invoking the handler function.
   
   **Returns:** `void`"
  (^js [environment-variable-collection callback]
   (.forEach ^js environment-variable-collection callback))
  (^js [environment-variable-collection callback this-arg]
   (.forEach ^js environment-variable-collection callback this-arg)))

(defn delete
  "Deletes this collection's mutator for a variable.
   
   **Parameters:**
   - `variable`: `string` - The variable to delete the mutator for.
   
   **Returns:** `void`"
  ^js [environment-variable-collection variable]
  (.delete ^js environment-variable-collection variable))

(defn clear
  "Clears all mutators from this collection.
   
   **Returns:** `void`"
  ^js [environment-variable-collection]
  (.clear ^js environment-variable-collection))
