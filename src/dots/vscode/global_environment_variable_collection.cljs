(ns dots.vscode.global-environment-variable-collection
  "A collection of mutations that an extension can apply to a process environment. Applies to all scopes."
  (:refer-clojure :exclude [get replace]))

(defn scoped
  "Gets scope-specific environment variable collection for the extension. This enables alterations to
   terminal environment variables solely within the designated scope, and is applied in addition to (and
   after) the global collection.
   
   Each object obtained through this method is isolated and does not impact objects for other scopes,
   including the global collection.
   
   **Parameters:**
   - `scope`: `EnvironmentVariableScope` - The scope to which the environment variable collection applies to.
   
   If a scope parameter is omitted, collection applicable to all relevant scopes for that parameter is
   returned. For instance, if the 'workspaceFolder' parameter is not specified, the collection that applies
   across all workspace folders will be returned.
   
   **Returns:** `EnvironmentVariableCollection` - Environment variable collection for the passed in scope."
  ^js [global-environment-variable-collection scope]
  (.getScoped ^js global-environment-variable-collection scope))

(defn persistent?
  "Whether the collection should be cached for the workspace and applied to the terminal
   across window reloads. When true the collection will be active immediately such when the
   window reloads. Additionally, this API will return the cached version if it exists. The
   collection will be invalidated when the extension is uninstalled or when the collection
   is cleared. Defaults to true.
   
   **Returns:** `boolean`"
  ^js [global-environment-variable-collection]
  (.-persistent ^js global-environment-variable-collection))

(defn set-persistent!
  "Whether the collection should be cached for the workspace and applied to the terminal
   across window reloads. When true the collection will be active immediately such when the
   window reloads. Additionally, this API will return the cached version if it exists. The
   collection will be invalidated when the extension is uninstalled or when the collection
   is cleared. Defaults to true."
  ^js [global-environment-variable-collection value]
  (set! (.-persistent ^js global-environment-variable-collection) value))

(defn description
  "A description for the environment variable collection, this will be used to describe the
   changes in the UI.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [global-environment-variable-collection]
  (.-description ^js global-environment-variable-collection))

(defn set-description!
  "A description for the environment variable collection, this will be used to describe the
   changes in the UI."
  ^js [global-environment-variable-collection value]
  (set! (.-description ^js global-environment-variable-collection) value))

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
  (^js [global-environment-variable-collection variable value]
   (.replace ^js global-environment-variable-collection variable value))
  (^js [global-environment-variable-collection variable value options]
   (.replace ^js global-environment-variable-collection variable value options)))

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
  (^js [global-environment-variable-collection variable value]
   (.append ^js global-environment-variable-collection variable value))
  (^js [global-environment-variable-collection variable value options]
   (.append ^js global-environment-variable-collection variable value options)))

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
  (^js [global-environment-variable-collection variable value]
   (.prepend ^js global-environment-variable-collection variable value))
  (^js [global-environment-variable-collection variable value options]
   (.prepend ^js global-environment-variable-collection variable value options)))

(defn get
  "Gets the mutator that this collection applies to a variable, if any.
   
   **Parameters:**
   - `variable`: `string` - The variable to get the mutator for.
   
   **Returns:** `EnvironmentVariableMutator | undefined`"
  ^js [global-environment-variable-collection variable]
  (.get ^js global-environment-variable-collection variable))

(defn for-each
  "Iterate over each mutator in this collection.
   
   **Parameters:**
   - `callback`: `(variable: string, mutator: EnvironmentVariableMutator, collection: EnvironmentVariableCollection) => any` - Function to execute for each entry.
   - `this-arg`: `any` - The `this` context used when invoking the handler function.
   
   **Returns:** `void`"
  (^js [global-environment-variable-collection callback]
   (.forEach ^js global-environment-variable-collection callback))
  (^js [global-environment-variable-collection callback this-arg]
   (.forEach ^js global-environment-variable-collection callback this-arg)))

(defn delete
  "Deletes this collection's mutator for a variable.
   
   **Parameters:**
   - `variable`: `string` - The variable to delete the mutator for.
   
   **Returns:** `void`"
  ^js [global-environment-variable-collection variable]
  (.delete ^js global-environment-variable-collection variable))

(defn clear
  "Clears all mutators from this collection.
   
   **Returns:** `void`"
  ^js [global-environment-variable-collection]
  (.clear ^js global-environment-variable-collection))
