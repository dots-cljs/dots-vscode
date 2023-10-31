(ns dots.vscode.type-hierarchy-provider
  "The type hierarchy provider interface describes the contract between extensions
   and the type hierarchy feature.")

(defn prepare-type-hierarchy
  "Bootstraps type hierarchy by returning the item that is denoted by the given document
   and position. This item will be used as entry into the type graph. Providers should
   return `undefined` or `null` when there is no item at the given location."
  ^js [type-hierarchy-provider document position token]
  (.prepareTypeHierarchy ^js type-hierarchy-provider document position token))

(defn provide-type-hierarchy-supertypes
  "Provide all supertypes for an item, e.g all types from which a type is derived/inherited. In graph terms this describes directed
   and annotated edges inside the type graph, e.g the given item is the starting node and the result is the nodes
   that can be reached."
  ^js [type-hierarchy-provider item token]
  (.provideTypeHierarchySupertypes ^js type-hierarchy-provider item token))

(defn provide-type-hierarchy-subtypes
  "Provide all subtypes for an item, e.g all types which are derived/inherited from the given item. In
   graph terms this describes directed and annotated edges inside the type graph, e.g the given item is the starting
   node and the result is the nodes that can be reached."
  ^js [type-hierarchy-provider item token]
  (.provideTypeHierarchySubtypes ^js type-hierarchy-provider item token))
