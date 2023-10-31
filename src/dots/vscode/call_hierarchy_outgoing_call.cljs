(ns dots.vscode.call-hierarchy-outgoing-call
  "Represents an outgoing call, e.g. calling a getter from a method or a method from a constructor etc.")

(defn to
  "The item that is called."
  ^js [call-hierarchy-outgoing-call]
  (.-to ^js call-hierarchy-outgoing-call))

(defn set-to!
  "The item that is called."
  ^js [call-hierarchy-outgoing-call value]
  (set! (.-to ^js call-hierarchy-outgoing-call) value))

(defn from-ranges
  "The range at which this item is called. This is the range relative to the caller, e.g the item
   passed to {@linkcode CallHierarchyProvider.provideCallHierarchyOutgoingCalls provideCallHierarchyOutgoingCalls}
   and not {@linkcode CallHierarchyOutgoingCall.to this.to}."
  ^js [call-hierarchy-outgoing-call]
  (.-fromRanges ^js call-hierarchy-outgoing-call))

(defn set-from-ranges!
  "The range at which this item is called. This is the range relative to the caller, e.g the item
   passed to {@linkcode CallHierarchyProvider.provideCallHierarchyOutgoingCalls provideCallHierarchyOutgoingCalls}
   and not {@linkcode CallHierarchyOutgoingCall.to this.to}."
  ^js [call-hierarchy-outgoing-call value]
  (set! (.-fromRanges ^js call-hierarchy-outgoing-call) value))
