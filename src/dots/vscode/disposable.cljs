(ns dots.vscode.disposable
  "Represents a type which can release resources, such
   as event listening or a timer."
  (:require ["vscode" :as vscode]))

(defn dispose
  "Dispose this object."
  ^js [disposable]
  (.dispose ^js disposable))

(defn from
  "Combine many disposable-likes into one. You can use this method when having objects with
   a dispose function which aren't instances of `Disposable`."
  ^js [& disposable-likes]
  (.. vscode/Disposable -from (apply vscode/Disposable (to-array disposable-likes))))
