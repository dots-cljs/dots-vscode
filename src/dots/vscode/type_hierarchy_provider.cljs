(ns dots.vscode.type-hierarchy-provider
  "The type hierarchy provider interface describes the contract between extensions
   and the type hierarchy feature.")

(defn prepare-type-hierarchy
  "Bootstraps type hierarchy by returning the item that is denoted by the given document
   and position. This item will be used as entry into the type graph. Providers should
   return `undefined` or `null` when there is no item at the given location.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TypeHierarchyItem | TypeHierarchyItem[]>` - One or multiple type hierarchy items or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [type-hierarchy-provider document position token]
  (.prepareTypeHierarchy ^js type-hierarchy-provider document position token))

(defn provide-type-hierarchy-supertypes
  "Provide all supertypes for an item, e.g all types from which a type is derived/inherited. In graph terms this describes directed
   and annotated edges inside the type graph, e.g the given item is the starting node and the result is the nodes
   that can be reached.
   
   **Parameters:**
   - `item`: `TypeHierarchyItem` - The hierarchy item for which super types should be computed.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TypeHierarchyItem[]>` - A set of direct supertypes or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [type-hierarchy-provider item token]
  (.provideTypeHierarchySupertypes ^js type-hierarchy-provider item token))

(defn provide-type-hierarchy-subtypes
  "Provide all subtypes for an item, e.g all types which are derived/inherited from the given item. In
   graph terms this describes directed and annotated edges inside the type graph, e.g the given item is the starting
   node and the result is the nodes that can be reached.
   
   **Parameters:**
   - `item`: `TypeHierarchyItem` - The hierarchy item for which subtypes should be computed.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TypeHierarchyItem[]>` - A set of direct subtypes or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [type-hierarchy-provider item token]
  (.provideTypeHierarchySubtypes ^js type-hierarchy-provider item token))
