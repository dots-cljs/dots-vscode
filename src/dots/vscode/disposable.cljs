(ns dots.vscode.disposable
  "Represents a type which can release resources, such
   as event listening or a timer."
  (:require ["vscode" :as vscode]))

(defn dispose
  "Dispose this object.
   
   **Returns:** `any`"
  ^js [disposable]
  (.dispose ^js disposable))

(defn from
  "Combine many disposable-likes into one. You can use this method when having objects with
   a dispose function which aren't instances of `Disposable`.
   
   **Parameters:**
   - `disposable-likes`: `{ dispose: () => any; }[]` - Objects that have at least a `dispose`-function member. Note that asynchronous
   dispose-functions aren't awaited.
   
   **Returns:** `Disposable` - Returns a new disposable which, upon dispose, will
   dispose all provided disposables."
  ^js [& disposable-likes]
  (.. vscode/Disposable -from (apply vscode/Disposable (to-array disposable-likes))))
