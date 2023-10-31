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
   user can configure this."
  ^js [test-run-profile]
  (.-isDefault ^js test-run-profile))

(defn set-is-default!
  "Controls whether this profile is the default action that will
   be taken when its kind is actioned. For example, if the user clicks
   the generic \"run all\" button, then the default profile for
   {@link TestRunProfileKind.Run } will be executed, although the
   user can configure this."
  ^js [test-run-profile value]
  (set! (.-isDefault ^js test-run-profile) value))

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
   or the returned promise is resolved."
  ^js [test-run-profile]
  (.-runHandler ^js test-run-profile))

(defn set-run-handler!
  "Handler called to start a test run. When invoked, the function should call
   {@link TestController.createTestRun } at least once, and all test runs
   associated with the request should be created before the function returns
   or the returned promise is resolved."
  ^js [test-run-profile value]
  (set! (.-runHandler ^js test-run-profile) value))

(defn dispose
  "Deletes the run profile."
  ^js [test-run-profile]
  (.dispose ^js test-run-profile))
