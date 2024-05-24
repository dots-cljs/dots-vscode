(ns dots.vscode.test-run-request
  "A TestRunRequest is a precursor to a {@link TestRun }, which in turn is
   created by passing a request to {@link TestController.createTestRun }. The
   TestRunRequest contains information about which tests should be run, which
   should not be run, and how they are run (via the {@link TestRunRequest.profile profile}).
   
   In general, TestRunRequests are created by the editor and pass to
   {@link TestRunProfile.runHandler }, however you can also create test
   requests and runs outside of the `runHandler`.")

(defn include
  "A filter for specific tests to run. If given, the extension should run
   all of the included tests and all their children, excluding any tests
   that appear in {@link TestRunRequest.exclude }. If this property is
   undefined, then the extension should simply run all tests.
   
   The process of running tests should resolve the children of any test
   items who have not yet been resolved.
   
   **Returns:** `readonly TestItem[] | undefined`"
  ^js [test-run-request]
  (.-include ^js test-run-request))

(defn exclude
  "An array of tests the user has marked as excluded from the test included
   in this run; exclusions should apply after inclusions.
   
   May be omitted if no exclusions were requested. Test controllers should
   not run excluded tests or any children of excluded tests.
   
   **Returns:** `readonly TestItem[] | undefined`"
  ^js [test-run-request]
  (.-exclude ^js test-run-request))

(defn profile
  "The profile used for this request. This will always be defined
   for requests issued from the editor UI, though extensions may
   programmatically create requests not associated with any profile.
   
   **Returns:** `TestRunProfile | undefined`"
  ^js [test-run-request]
  (.-profile ^js test-run-request))

(defn continuous?
  "Whether the profile should run continuously as source code changes. Only
   relevant for profiles that set {@link TestRunProfile.supportsContinuousRun }.
   
   **Returns:** `boolean | undefined`"
  ^js [test-run-request]
  (.-continuous ^js test-run-request))
