(ns dots.vscode.test-run
  "Options given to {@link TestController.runTests }"
  (:refer-clojure :exclude [name]))

(defn name
  "The human-readable name of the run. This can be used to
   disambiguate multiple sets of results in a test run. It is useful if
   tests are run across multiple platforms, for example."
  ^js [test-run]
  (.-name ^js test-run))

(defn token
  "A cancellation token which will be triggered when the test run is
   canceled from the UI."
  ^js [test-run]
  (.-token ^js test-run))

(defn persisted?
  "Whether the test run will be persisted across reloads by the editor."
  ^js [test-run]
  (.-isPersisted ^js test-run))

(defn enqueued
  "Indicates a test is queued for later execution."
  ^js [test-run test]
  (.enqueued ^js test-run test))

(defn started
  "Indicates a test has started running."
  ^js [test-run test]
  (.started ^js test-run test))

(defn skipped
  "Indicates a test has been skipped."
  ^js [test-run test]
  (.skipped ^js test-run test))

(defn failed
  "Indicates a test has failed. You should pass one or more
   {@link TestMessage TestMessages} to describe the failure."
  (^js [test-run test message]
   (.failed ^js test-run test message))
  (^js [test-run test message duration]
   (.failed ^js test-run test message duration)))

(defn errored
  "Indicates a test has errored. You should pass one or more
   {@link TestMessage TestMessages} to describe the failure. This differs
   from the \"failed\" state in that it indicates a test that couldn't be
   executed at all, from a compilation error for example."
  (^js [test-run test message]
   (.errored ^js test-run test message))
  (^js [test-run test message duration]
   (.errored ^js test-run test message duration)))

(defn passed
  "Indicates a test has passed."
  (^js [test-run test]
   (.passed ^js test-run test))
  (^js [test-run test duration]
   (.passed ^js test-run test duration)))

(defn append-output
  "Appends raw output from the test runner. On the user's request, the
   output will be displayed in a terminal. ANSI escape sequences,
   such as colors and text styles, are supported."
  (^js [test-run output]
   (.appendOutput ^js test-run output))
  (^js [test-run output location]
   (.appendOutput ^js test-run output location))
  (^js [test-run output location test]
   (.appendOutput ^js test-run output location test)))

(defn end
  "Signals that the end of the test run. Any tests included in the run whose
   states have not been updated will have their state reset."
  ^js [test-run]
  (.end ^js test-run))
