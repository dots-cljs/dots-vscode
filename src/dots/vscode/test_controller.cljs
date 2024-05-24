(ns dots.vscode.test-controller
  "Entry point to discover and execute tests. It contains {@link TestController.items } which
   are used to populate the editor UI, and is associated with
   {@link TestController.createRunProfile run profiles} to allow
   for tests to be executed.")

(defn id
  "The id of the controller passed in {@link tests.createTestController }.
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
   add tests for a file when {@link workspace.onDidOpenTextDocument }
   fires in order for decorations for tests within a file to be visible.
   
   However, the editor may sometimes explicitly request children using the
   {@link resolveHandler } See the documentation on that method for more details."
  ^js [test-controller]
  (.-items ^js test-controller))

(defn create-run-profile
  "Creates a profile used for running tests. Extensions must create
   at least one profile in order for tests to be run.
   
   **Parameters:**
   - `label`: `string` - A human-readable label for this profile.
   - `kind`: `TestRunProfileKind` - Configures what kind of execution this profile manages.
   - `run-handler`: `(request: TestRunRequest, token: CancellationToken) => void | Thenable<void>` - Function called to start a test run.
   - `default?`: `boolean | undefined` - Whether this is the default action for its kind.
   - `tag`: `TestTag | undefined` - Profile test tag.
   - `supports-continuous-run?`: `boolean | undefined` - Whether the profile supports continuous running.
   
   **Returns:** `TestRunProfile` - An instance of a {@link TestRunProfile}, which is automatically
   associated with this controller."
  (^js [test-controller label kind run-handler]
   (.createRunProfile ^js test-controller label kind run-handler))
  (^js [test-controller label kind run-handler default?]
   (.createRunProfile ^js test-controller label kind run-handler default?))
  (^js [test-controller label kind run-handler default? tag]
   (.createRunProfile ^js test-controller label kind run-handler default? tag))
  (^js [test-controller label kind run-handler default? tag supports-continuous-run?]
   (.createRunProfile ^js test-controller label kind run-handler default? tag supports-continuous-run?)))

(defn resolve-handler
  "A function provided by the extension that the editor may call to request
   children of a test item, if the {@link TestItem.canResolveChildren } is
   `true`. When called, the item should discover children and call
   {@link TestController.createTestItem } as children are discovered.
   
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
   {@link TestController.createTestItem } as children are discovered.
   
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
   run on multiple platforms.
   
   **Parameters:**
   - `request`: `TestRunRequest` - Test run request. Only tests inside the `include` may be
   modified, and tests in its `exclude` are ignored.
   - `name`: `string | undefined` - The human-readable name of the run. This can be used to
   disambiguate multiple sets of results in a test run. It is useful if
   tests are run across multiple platforms, for example.
   - `persist?`: `boolean | undefined` - Whether the results created by the run should be
   persisted in the editor. This may be false if the results are coming from
   a file already saved externally, such as a coverage information file.
   
   **Returns:** `TestRun` - An instance of the {@link TestRun}. It will be considered \"running\"
   from the moment this method is invoked until {@link TestRun.end} is called."
  (^js [test-controller request]
   (.createTestRun ^js test-controller request))
  (^js [test-controller request name]
   (.createTestRun ^js test-controller request name))
  (^js [test-controller request name persist?]
   (.createTestRun ^js test-controller request name persist?)))

(defn create-test-item
  "Creates a new managed {@link TestItem } instance. It can be added into
   the {@link TestItem.children } of an existing item, or into the
   {@link TestController.items }.
   
   **Parameters:**
   - `id`: `string` - Identifier for the TestItem. The test item's ID must be unique
   in the {@link TestItemCollection } it's added to.
   - `label`: `string` - Human-readable label of the test item.
   - `uri`: `Uri | undefined` - URI this TestItem is associated with. May be a file or directory.
   
   **Returns:** `TestItem`"
  (^js [test-controller id label]
   (.createTestItem ^js test-controller id label))
  (^js [test-controller id label uri]
   (.createTestItem ^js test-controller id label uri)))

(defn invalidate-test-results
  "Marks an item's results as being outdated. This is commonly called when
   code or configuration changes and previous results should no longer
   be considered relevant. The same logic used to mark results as outdated
   may be used to drive {@link TestRunRequest.continuous continuous test runs}.
   
   If an item is passed to this method, test results for the item and all of
   its children will be marked as outdated. If no item is passed, then all
   test owned by the TestController will be marked as outdated.
   
   Any test runs started before the moment this method is called, including
   runs which may still be ongoing, will be marked as outdated and deprioritized
   in the editor's UI.
   
   **Parameters:**
   - `items`: `TestItem | readonly TestItem[] | undefined`
   
   **Returns:** `void`"
  (^js [test-controller]
   (.invalidateTestResults ^js test-controller))
  (^js [test-controller items]
   (.invalidateTestResults ^js test-controller items)))

(defn dispose
  "Unregisters the test controller, disposing of its associated tests
   and unpersisted results.
   
   **Returns:** `void`"
  ^js [test-controller]
  (.dispose ^js test-controller))
