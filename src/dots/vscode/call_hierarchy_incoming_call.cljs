(ns dots.vscode.call-hierarchy-incoming-call
  "Represents an incoming call, e.g. a caller of a method or constructor.")

(defn from
  "The item that makes the call."
  ^js [call-hierarchy-incoming-call]
  (.-from ^js call-hierarchy-incoming-call))

(defn set-from!
  "The item that makes the call."
  ^js [call-hierarchy-incoming-call value]
  (set! (.-from ^js call-hierarchy-incoming-call) value))

(defn from-ranges
  "The range at which at which the calls appears. This is relative to the caller
   denoted by {@linkcode CallHierarchyIncomingCall.from this.from}."
  ^js [call-hierarchy-incoming-call]
  (.-fromRanges ^js call-hierarchy-incoming-call))

(defn set-from-ranges!
  "The range at which at which the calls appears. This is relative to the caller
   denoted by {@linkcode CallHierarchyIncomingCall.from this.from}."
  ^js [call-hierarchy-incoming-call value]
  (set! (.-fromRanges ^js call-hierarchy-incoming-call) value))
