(ns dots.vscode.test-controller
  "Entry point to discover and execute tests. It contains {@link TestController.items } which
   are used to populate the editor UI, and is associated with
   {@link TestController.createRunProfile run profiles} to allow
   for tests to be executed.")

(defn id
  "The id of the controller passed in {@link vscode.tests.createTestController }.
   This must be globally unique."
  ^js [test-controller]
  (.-id ^js test-controller))

(defn label
  "Human-readable label for the test controller."
  ^js [test-controller]
  (.-label ^js test-controller))

(defn set-label!
  "Human-readable label for the test controller."
  ^js [test-controller value]
  (set! (.-label ^js test-controller) value))

(defn items
  "A collection of \"top-level\" {@link TestItem } instances, which can in
   turn have their own {@link TestItem.children children} to form the
   \"test tree.\"
   
   The extension controls when to add tests. For example, extensions should
   add tests for a file when {@link vscode.workspace.onDidOpenTextDocument }
   fires in order for decorations for tests within a file to be visible.
   
   However, the editor may sometimes explicitly request children using the
   {@link resolveHandler } See the documentation on that method for more details."
  ^js [test-controller]
  (.-items ^js test-controller))

(defn create-run-profile
  "Creates a profile used for running tests. Extensions must create
   at least one profile in order for tests to be run."
  (^js [test-controller label kind run-handler]
   (.createRunProfile ^js test-controller label kind run-handler))
  (^js [test-controller label kind run-handler default?]
   (.createRunProfile ^js test-controller label kind run-handler default?))
  (^js [test-controller label kind run-handler default? tag]
   (.createRunProfile ^js test-controller label kind run-handler default? tag)))

(defn resolve-handler
  "A function provided by the extension that the editor may call to request
   children of a test item, if the {@link TestItem.canResolveChildren } is
   `true`. When called, the item should discover children and call
   {@link vscode.tests.createTestItem } as children are discovered.
   
   Generally the extension manages the lifecycle of test items, but under
   certain conditions the editor may request the children of a specific
   item to be loaded. For example, if the user requests to re-run tests
   after reloading the editor, the editor may need to call this method
   to resolve the previously-run tests.
   
   The item in the explorer will automatically be marked as \"busy\" until
   the function returns or the returned thenable resolves."
  ^js [test-controller]
  (.-resolveHandler ^js test-controller))

(defn set-resolve-handler!
  "A function provided by the extension that the editor may call to request
   children of a test item, if the {@link TestItem.canResolveChildren } is
   `true`. When called, the item should discover children and call
   {@link vscode.tests.createTestItem } as children are discovered.
   
   Generally the extension manages the lifecycle of test items, but under
   certain conditions the editor may request the children of a specific
   item to be loaded. For example, if the user requests to re-run tests
   after reloading the editor, the editor may need to call this method
   to resolve the previously-run tests.
   
   The item in the explorer will automatically be marked as \"busy\" until
   the function returns or the returned thenable resolves."
  ^js [test-controller value]
  (set! (.-resolveHandler ^js test-controller) value))

(defn refresh-handler
  "If this method is present, a refresh button will be present in the
   UI, and this method will be invoked when it's clicked. When called,
   the extension should scan the workspace for any new, changed, or
   removed tests.
   
   It's recommended that extensions try to update tests in realtime, using
   a {@link FileSystemWatcher } for example, and use this method as a fallback."
  ^js [test-controller]
  (.-refreshHandler ^js test-controller))

(defn set-refresh-handler!
  "If this method is present, a refresh button will be present in the
   UI, and this method will be invoked when it's clicked. When called,
   the extension should scan the workspace for any new, changed, or
   removed tests.
   
   It's recommended that extensions try to update tests in realtime, using
   a {@link FileSystemWatcher } for example, and use this method as a fallback."
  ^js [test-controller value]
  (set! (.-refreshHandler ^js test-controller) value))

(defn create-test-run
  "Creates a {@link TestRun }. This should be called by the
   {@link TestRunProfile } when a request is made to execute tests, and may
   also be called if a test run is detected externally. Once created, tests
   that are included in the request will be moved into the queued state.
   
   All runs created using the same `request` instance will be grouped
   together. This is useful if, for example, a single suite of tests is
   run on multiple platforms."
  (^js [test-controller request]
   (.createTestRun ^js test-controller request))
  (^js [test-controller request name]
   (.createTestRun ^js test-controller request name))
  (^js [test-controller request name persist?]
   (.createTestRun ^js test-controller request name persist?)))

(defn create-test-item
  "Creates a new managed {@link TestItem } instance. It can be added into
   the {@link TestItem.children } of an existing item, or into the
   {@link TestController.items }."
  (^js [test-controller id label]
   (.createTestItem ^js test-controller id label))
  (^js [test-controller id label uri]
   (.createTestItem ^js test-controller id label uri)))

(defn dispose
  "Unregisters the test controller, disposing of its associated tests
   and unpersisted results."
  ^js [test-controller]
  (.dispose ^js test-controller))
