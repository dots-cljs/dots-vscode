(ns dots.vscode.debug-configuration
  "Configuration for a debug session."
  (:refer-clojure :exclude [name type]))

(defn type
  "The type of the debug session."
  ^js [debug-configuration]
  (.-type ^js debug-configuration))

(defn set-type!
  "The type of the debug session."
  ^js [debug-configuration value]
  (set! (.-type ^js debug-configuration) value))

(defn name
  "The name of the debug session."
  ^js [debug-configuration]
  (.-name ^js debug-configuration))

(defn set-name!
  "The name of the debug session."
  ^js [debug-configuration value]
  (set! (.-name ^js debug-configuration) value))

(defn request
  "The request type of the debug session."
  ^js [debug-configuration]
  (.-request ^js debug-configuration))

(defn set-request!
  "The request type of the debug session."
  ^js [debug-configuration value]
  (set! (.-request ^js debug-configuration) value))
