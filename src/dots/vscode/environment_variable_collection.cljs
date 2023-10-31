(ns dots.vscode.environment-variable-collection
  "A collection of mutations that an extension can apply to a process environment."
  (:refer-clojure :exclude [get replace]))

(defn persistent?
  "Whether the collection should be cached for the workspace and applied to the terminal
   across window reloads. When true the collection will be active immediately such when the
   window reloads. Additionally, this API will return the cached version if it exists. The
   collection will be invalidated when the extension is uninstalled or when the collection
   is cleared. Defaults to true."
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

(defn replace
  "Replace an environment variable with a value.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend."
  ^js [environment-variable-collection variable value]
  (.replace ^js environment-variable-collection variable value))

(defn append
  "Append a value to an environment variable.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend."
  ^js [environment-variable-collection variable value]
  (.append ^js environment-variable-collection variable value))

(defn prepend
  "Prepend a value to an environment variable.
   
   Note that an extension can only make a single change to any one variable, so this will
   overwrite any previous calls to replace, append or prepend."
  ^js [environment-variable-collection variable value]
  (.prepend ^js environment-variable-collection variable value))

(defn get
  "Gets the mutator that this collection applies to a variable, if any."
  ^js [environment-variable-collection variable]
  (.get ^js environment-variable-collection variable))

(defn for-each
  "Iterate over each mutator in this collection."
  (^js [environment-variable-collection callback]
   (.forEach ^js environment-variable-collection callback))
  (^js [environment-variable-collection callback this-arg]
   (.forEach ^js environment-variable-collection callback this-arg)))

(defn delete
  "Deletes this collection's mutator for a variable."
  ^js [environment-variable-collection variable]
  (.delete ^js environment-variable-collection variable))

(defn clear
  "Clears all mutators from this collection."
  ^js [environment-variable-collection]
  (.clear ^js environment-variable-collection))
