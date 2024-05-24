(ns dots.vscode.call-hierarchy-provider
  "The call hierarchy provider interface describes the contract between extensions
   and the call hierarchy feature which allows to browse calls and caller of function,
   methods, constructor etc.")

(defn prepare-call-hierarchy
  "Bootstraps call hierarchy by returning the item that is denoted by the given document
   and position. This item will be used as entry into the call graph. Providers should
   return `undefined` or `null` when there is no item at the given location.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<CallHierarchyItem | CallHierarchyItem[]>` - One or multiple call hierarchy items or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [call-hierarchy-provider document position token]
  (.prepareCallHierarchy ^js call-hierarchy-provider document position token))

(defn provide-call-hierarchy-incoming-calls
  "Provide all incoming calls for an item, e.g all callers for a method. In graph terms this describes directed
   and annotated edges inside the call graph, e.g the given item is the starting node and the result is the nodes
   that can be reached.
   
   **Parameters:**
   - `item`: `CallHierarchyItem` - The hierarchy item for which incoming calls should be computed.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<CallHierarchyIncomingCall[]>` - A set of incoming calls or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [call-hierarchy-provider item token]
  (.provideCallHierarchyIncomingCalls ^js call-hierarchy-provider item token))

(defn provide-call-hierarchy-outgoing-calls
  "Provide all outgoing calls for an item, e.g call calls to functions, methods, or constructors from the given item. In
   graph terms this describes directed and annotated edges inside the call graph, e.g the given item is the starting
   node and the result is the nodes that can be reached.
   
   **Parameters:**
   - `item`: `CallHierarchyItem` - The hierarchy item for which outgoing calls should be computed.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<CallHierarchyOutgoingCall[]>` - A set of outgoing calls or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [call-hierarchy-provider item token]
  (.provideCallHierarchyOutgoingCalls ^js call-hierarchy-provider item token))
