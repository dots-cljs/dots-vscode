(ns dots.vscode.secret-storage
  "Represents a storage utility for secrets, information that is
   sensitive."
  (:refer-clojure :exclude [get]))

(defn get
  "Retrieve a secret that was stored with key. Returns undefined if there
   is no password matching that key."
  ^js [secret-storage key]
  (.get ^js secret-storage key))

(defn store
  "Store a secret under a given key."
  ^js [secret-storage key value]
  (.store ^js secret-storage key value))

(defn delete
  "Remove a secret from storage."
  ^js [secret-storage key]
  (.delete ^js secret-storage key))

(defn on-did-change
  "Fires when a secret is stored or deleted."
  (^js [secret-storage]
   (.-onDidChange ^js secret-storage))
  (^js [secret-storage listener]
   (.onDidChange ^js secret-storage listener))
  (^js [secret-storage listener this-args]
   (.onDidChange ^js secret-storage listener this-args))
  (^js [secret-storage listener this-args disposables]
   (.onDidChange ^js secret-storage listener this-args disposables)))

(defn set-on-did-change!
  "Fires when a secret is stored or deleted."
  ^js [secret-storage value]
  (set! (.-onDidChange ^js secret-storage) value))
