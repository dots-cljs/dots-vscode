(ns dots.vscode.task-group
  "A grouping for tasks. The editor by default supports the
   'Clean', 'Build', 'RebuildAll' and 'Test' group."
  (:refer-clojure :exclude [test]))

(defn default?
  "Whether the task that is part of this group is the default for the group.
   This property cannot be set through API, and is controlled by a user's task configurations.
   
   **Returns:** `boolean | undefined`"
  ^js [task-group]
  (.-isDefault ^js task-group))

(defn id
  "The ID of the task group. Is one of TaskGroup.Clean.id, TaskGroup.Build.id, TaskGroup.Rebuild.id, or TaskGroup.Test.id.
   
   **Returns:** `string`"
  ^js [task-group]
  (.-id ^js task-group))

(defn clean
  "The clean task group;
   
   **Returns:** `TaskGroup`"
  ^js [task-group]
  (.-Clean ^js task-group))

(defn set-clean!
  "The clean task group;"
  ^js [task-group value]
  (set! (.-Clean ^js task-group) value))

(defn build
  "The build task group;
   
   **Returns:** `TaskGroup`"
  ^js [task-group]
  (.-Build ^js task-group))

(defn set-build!
  "The build task group;"
  ^js [task-group value]
  (set! (.-Build ^js task-group) value))

(defn rebuild
  "The rebuild all task group;
   
   **Returns:** `TaskGroup`"
  ^js [task-group]
  (.-Rebuild ^js task-group))

(defn set-rebuild!
  "The rebuild all task group;"
  ^js [task-group value]
  (set! (.-Rebuild ^js task-group) value))

(defn test
  "The test all task group;
   
   **Returns:** `TaskGroup`"
  ^js [task-group]
  (.-Test ^js task-group))

(defn set-test!
  "The test all task group;"
  ^js [task-group value]
  (set! (.-Test ^js task-group) value))
