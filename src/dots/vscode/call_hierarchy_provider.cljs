(ns dots.vscode.call-hierarchy-provider
  "The call hierarchy provider interface describes the contract between extensions
   and the call hierarchy feature which allows to browse calls and caller of function,
   methods, constructor etc.")

(defn prepare-call-hierarchy
  "Bootstraps call hierarchy by returning the item that is denoted by the given document
   and position. This item will be used as entry into the call graph. Providers should
   return `undefined` or `null` when there is no item at the given location."
  ^js [call-hierarchy-provider document position token]
  (.prepareCallHierarchy ^js call-hierarchy-provider document position token))

(defn provide-call-hierarchy-incoming-calls
  "Provide all incoming calls for an item, e.g all callers for a method. In graph terms this describes directed
   and annotated edges inside the call graph, e.g the given item is the starting node and the result is the nodes
   that can be reached."
  ^js [call-hierarchy-provider item token]
  (.provideCallHierarchyIncomingCalls ^js call-hierarchy-provider item token))

(defn provide-call-hierarchy-outgoing-calls
  "Provide all outgoing calls for an item, e.g call calls to functions, methods, or constructors from the given item. In
   graph terms this describes directed and annotated edges inside the call graph, e.g the given item is the starting
   node and the result is the nodes that can be reached."
  ^js [call-hierarchy-provider item token]
  (.provideCallHierarchyOutgoingCalls ^js call-hierarchy-provider item token))
