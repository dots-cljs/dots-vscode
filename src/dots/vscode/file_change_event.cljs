(ns dots.vscode.file-change-event
  "The event filesystem providers must use to signal a file change."
  (:refer-clojure :exclude [type]))

(defn type
  "The type of change."
  ^js [file-change-event]
  (.-type ^js file-change-event))

(defn uri
  "The uri of the file that has changed."
  ^js [file-change-event]
  (.-uri ^js file-change-event))
