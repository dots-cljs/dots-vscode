(ns dots.vscode.diagnostic-collection
  "A diagnostics collection is a container that manages a set of
   {@link Diagnostic diagnostics}. Diagnostics are always scopes to a
   diagnostics collection and a resource.
   
   To get an instance of a `DiagnosticCollection` use
   {@link languages.createDiagnosticCollection createDiagnosticCollection}."
  (:refer-clojure :exclude [get name set]))

(defn name
  "The name of this diagnostic collection, for instance `typescript`. Every diagnostic
   from this collection will be associated with this name. Also, the task framework uses this
   name when defining [problem matchers](https://code.visualstudio.com/docs/editor/tasks#_defining-a-problem-matcher)."
  ^js [diagnostic-collection]
  (.-name ^js diagnostic-collection))

(defn set
  "Assign diagnostics for given resource. Will replace
   existing diagnostics for that resource.
   Replace diagnostics for multiple resources in this collection.
   
    _Note_ that multiple tuples of the same uri will be merged, e.g
   `[[file1, [d1]], [file1, [d2]]]` is equivalent to `[[file1, [d1, d2]]]`.
   If a diagnostics item is `undefined` as in `[file1, undefined]`
   all previous but not subsequent diagnostics are removed."
  {:arglists '([diagnostic-collection entries]
               [diagnostic-collection uri]
               [diagnostic-collection uri diagnostics])}
  (^js [a b]
   (.set ^js a b))
  (^js [diagnostic-collection uri diagnostics]
   (.set ^js diagnostic-collection uri diagnostics)))

(defn delete
  "Remove all diagnostics from this collection that belong
   to the provided `uri`. The same as `#set(uri, undefined)`."
  ^js [diagnostic-collection uri]
  (.delete ^js diagnostic-collection uri))

(defn clear
  "Remove all diagnostics from this collection. The same
   as calling `#set(undefined)`;"
  ^js [diagnostic-collection]
  (.clear ^js diagnostic-collection))

(defn for-each
  "Iterate over each entry in this collection."
  (^js [diagnostic-collection callback]
   (.forEach ^js diagnostic-collection callback))
  (^js [diagnostic-collection callback this-arg]
   (.forEach ^js diagnostic-collection callback this-arg)))

(defn get
  "Get the diagnostics for a given resource. *Note* that you cannot
   modify the diagnostics-array returned from this call."
  ^js [diagnostic-collection uri]
  (.get ^js diagnostic-collection uri))

(defn has?
  "Check if this collection contains diagnostics for a
   given resource."
  ^js [diagnostic-collection uri]
  (.has ^js diagnostic-collection uri))

(defn dispose
  "Dispose and free associated resources. Calls
   {@link DiagnosticCollection.clear clear}."
  ^js [diagnostic-collection]
  (.dispose ^js diagnostic-collection))
