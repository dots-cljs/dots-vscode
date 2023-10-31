(ns dots.vscode.event-emitter
  "An event emitter can be used to create and manage an {@link Event } for others
   to subscribe to. One emitter always owns one event.
   
   Use this class if you want to provide event from within your extension, for instance
   inside a {@link TextDocumentContentProvider } or when providing
   API to other extensions.")

(defn event
  "The event listeners can subscribe to."
  (^js [event-emitter]
   (.-event ^js event-emitter))
  (^js [event-emitter listener]
   (.event ^js event-emitter listener))
  (^js [event-emitter listener this-args]
   (.event ^js event-emitter listener this-args))
  (^js [event-emitter listener this-args disposables]
   (.event ^js event-emitter listener this-args disposables)))

(defn set-event!
  "The event listeners can subscribe to."
  ^js [event-emitter value]
  (set! (.-event ^js event-emitter) value))

(defn fire
  "Notify all subscribers of the {@link EventEmitter.event event}. Failure
   of one or more listener will not fail this function call."
  ^js [event-emitter data]
  (.fire ^js event-emitter data))

(defn dispose
  "Dispose this object and free resources."
  ^js [event-emitter]
  (.dispose ^js event-emitter))
