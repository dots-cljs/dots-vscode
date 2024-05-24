(ns dots.vscode.test-run-profile
  "A TestRunProfile describes one way to execute tests in a {@link TestController }.")

(defn label
  "Label shown to the user in the UI.
   
   Note that the label has some significance if the user requests that
   tests be re-run in a certain way. For example, if tests were run
   normally and the user requests to re-run them in debug mode, the editor
   will attempt use a configuration with the same label of the `Debug`
   kind. If there is no such configuration, the default will be used."
  ^js [test-run-profile]
  (.-label ^js test-run-profile))

(defn set-label!
  "Label shown to the user in the UI.
   
   Note that the label has some significance if the user requests that
   tests be re-run in a certain way. For example, if tests were run
   normally and the user requests to re-run them in debug mode, the editor
   will attempt use a configuration with the same label of the `Debug`
   kind. If there is no such configuration, the default will be used."
  ^js [test-run-profile value]
  (set! (.-label ^js test-run-profile) value))

(defn kind
  "Configures what kind of execution this profile controls. If there
   are no profiles for a kind, it will not be available in the UI."
  ^js [test-run-profile]
  (.-kind ^js test-run-profile))

(defn default?
  "Controls whether this profile is the default action that will
   be taken when its kind is actioned. For example, if the user clicks
   the generic \"run all\" button, then the default profile for
   {@link TestRunProfileKind.Run } will be executed, although the
   user can configure this.
   
   Changes the user makes in their default profiles will be reflected
   in this property after a {@link onDidChangeDefault } event."
  ^js [test-run-profile]
  (.-isDefault ^js test-run-profile))

(defn set-is-default!
  "Controls whether this profile is the default action that will
   be taken when its kind is actioned. For example, if the user clicks
   the generic \"run all\" button, then the default profile for
   {@link TestRunProfileKind.Run } will be executed, although the
   user can configure this.
   
   Changes the user makes in their default profiles will be reflected
   in this property after a {@link onDidChangeDefault } event."
  ^js [test-run-profile value]
  (set! (.-isDefault ^js test-run-profile) value))

(defn on-did-change-default
  "Fired when a user has changed whether this is a default profile. The
   event contains the new value of {@link isDefault }
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [test-run-profile]
   (.-onDidChangeDefault ^js test-run-profile))
  (^js [test-run-profile listener]
   (.onDidChangeDefault ^js test-run-profile listener))
  (^js [test-run-profile listener this-args]
   (.onDidChangeDefault ^js test-run-profile listener this-args))
  (^js [test-run-profile listener this-args disposables]
   (.onDidChangeDefault ^js test-run-profile listener this-args disposables)))

(defn set-on-did-change-default!
  "Fired when a user has changed whether this is a default profile. The
   event contains the new value of {@link isDefault }"
  ^js [test-run-profile value]
  (set! (.-onDidChangeDefault ^js test-run-profile) value))

(defn supports-continuous-run?
  "Whether this profile supports continuous running of requests. If so,
   then {@link TestRunRequest.continuous } may be set to `true`. Defaults
   to false."
  ^js [test-run-profile]
  (.-supportsContinuousRun ^js test-run-profile))

(defn set-supports-continuous-run!
  "Whether this profile supports continuous running of requests. If so,
   then {@link TestRunRequest.continuous } may be set to `true`. Defaults
   to false."
  ^js [test-run-profile value]
  (set! (.-supportsContinuousRun ^js test-run-profile) value))

(defn tag
  "Associated tag for the profile. If this is set, only {@link TestItem }
   instances with the same tag will be eligible to execute in this profile."
  ^js [test-run-profile]
  (.-tag ^js test-run-profile))

(defn set-tag!
  "Associated tag for the profile. If this is set, only {@link TestItem }
   instances with the same tag will be eligible to execute in this profile."
  ^js [test-run-profile value]
  (set! (.-tag ^js test-run-profile) value))

(defn configure-handler
  "If this method is present, a configuration gear will be present in the
   UI, and this method will be invoked when it's clicked. When called,
   you can take other editor actions, such as showing a quick pick or
   opening a configuration file."
  ^js [test-run-profile]
  (.-configureHandler ^js test-run-profile))

(defn set-configure-handler!
  "If this method is present, a configuration gear will be present in the
   UI, and this method will be invoked when it's clicked. When called,
   you can take other editor actions, such as showing a quick pick or
   opening a configuration file."
  ^js [test-run-profile value]
  (set! (.-configureHandler ^js test-run-profile) value))

(defn run-handler
  "Handler called to start a test run. When invoked, the function should call
   {@link TestController.createTestRun } at least once, and all test runs
   associated with the request should be created before the function returns
   or the returned promise is resolved.
   
   If {@link supportsContinuousRun } is set, then {@link TestRunRequest.continuous }
   may be `true`. In this case, the profile should observe changes to
   source code and create new test runs by calling {@link TestController.createTestRun },
   until the cancellation is requested on the `token`."
  ^js [test-run-profile]
  (.-runHandler ^js test-run-profile))

(defn set-run-handler!
  "Handler called to start a test run. When invoked, the function should call
   {@link TestController.createTestRun } at least once, and all test runs
   associated with the request should be created before the function returns
   or the returned promise is resolved.
   
   If {@link supportsContinuousRun } is set, then {@link TestRunRequest.continuous }
   may be `true`. In this case, the profile should observe changes to
   source code and create new test runs by calling {@link TestController.createTestRun },
   until the cancellation is requested on the `token`."
  ^js [test-run-profile value]
  (set! (.-runHandler ^js test-run-profile) value))

(defn load-detailed-coverage
  "An extension-provided function that provides detailed statement and
   function-level coverage for a file. The editor will call this when more
   detail is needed for a file, such as when it's opened in an editor or
   expanded in the **Test Coverage** view.
   
   The {@link FileCoverage } object passed to this function is the same instance
   emitted on {@link TestRun.addCoverage } calls associated with this profile."
  ^js [test-run-profile]
  (.-loadDetailedCoverage ^js test-run-profile))

(defn set-load-detailed-coverage!
  "An extension-provided function that provides detailed statement and
   function-level coverage for a file. The editor will call this when more
   detail is needed for a file, such as when it's opened in an editor or
   expanded in the **Test Coverage** view.
   
   The {@link FileCoverage } object passed to this function is the same instance
   emitted on {@link TestRun.addCoverage } calls associated with this profile."
  ^js [test-run-profile value]
  (set! (.-loadDetailedCoverage ^js test-run-profile) value))

(defn dispose
  "Deletes the run profile.
   
   **Returns:** `void`"
  ^js [test-run-profile]
  (.dispose ^js test-run-profile))
