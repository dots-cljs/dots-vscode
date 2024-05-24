(ns dots.vscode.task-filter
  "A task filter denotes tasks by their version and types"
  (:refer-clojure :exclude [type]))

(defn version
  "The task version as used in the tasks.json file.
   The string support the package.json semver notation."
  ^js [task-filter]
  (.-version ^js task-filter))

(defn set-version!
  "The task version as used in the tasks.json file.
   The string support the package.json semver notation."
  ^js [task-filter value]
  (set! (.-version ^js task-filter) value))

(defn type
  "The task type to return;"
  ^js [task-filter]
  (.-type ^js task-filter))

(defn set-type!
  "The task type to return;"
  ^js [task-filter value]
  (set! (.-type ^js task-filter) value))
