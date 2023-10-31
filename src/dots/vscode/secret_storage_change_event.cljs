(ns dots.vscode.secret-storage-change-event
  "The event data that is fired when a secret is added or removed."
  (:refer-clojure :exclude [key]))

(defn key
  "The key of the secret that has changed."
  ^js [secret-storage-change-event]
  (.-key ^js secret-storage-change-event))
