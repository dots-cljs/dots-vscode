(ns dots.vscode.test-run
  "A TestRun represents an in-progress or completed test run and
   provides methods to report the state of individual tests in the run."
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
  "Indicates a test is queued for later execution.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   
   **Returns:** `void`"
  ^js [test-run test]
  (.enqueued ^js test-run test))

(defn started
  "Indicates a test has started running.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   
   **Returns:** `void`"
  ^js [test-run test]
  (.started ^js test-run test))

(defn skipped
  "Indicates a test has been skipped.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   
   **Returns:** `void`"
  ^js [test-run test]
  (.skipped ^js test-run test))

(defn failed
  "Indicates a test has failed. You should pass one or more
   {@link TestMessage TestMessages} to describe the failure.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   - `message`: `TestMessage | readonly TestMessage[]` - Messages associated with the test failure.
   - `duration`: `number | undefined` - How long the test took to execute, in milliseconds.
   
   **Returns:** `void`"
  (^js [test-run test message]
   (.failed ^js test-run test message))
  (^js [test-run test message duration]
   (.failed ^js test-run test message duration)))

(defn errored
  "Indicates a test has errored. You should pass one or more
   {@link TestMessage TestMessages} to describe the failure. This differs
   from the \"failed\" state in that it indicates a test that couldn't be
   executed at all, from a compilation error for example.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   - `message`: `TestMessage | readonly TestMessage[]` - Messages associated with the test failure.
   - `duration`: `number | undefined` - How long the test took to execute, in milliseconds.
   
   **Returns:** `void`"
  (^js [test-run test message]
   (.errored ^js test-run test message))
  (^js [test-run test message duration]
   (.errored ^js test-run test message duration)))

(defn passed
  "Indicates a test has passed.
   
   **Parameters:**
   - `test`: `TestItem` - Test item to update.
   - `duration`: `number | undefined` - How long the test took to execute, in milliseconds.
   
   **Returns:** `void`"
  (^js [test-run test]
   (.passed ^js test-run test))
  (^js [test-run test duration]
   (.passed ^js test-run test duration)))

(defn append-output
  "Appends raw output from the test runner. On the user's request, the
   output will be displayed in a terminal. ANSI escape sequences,
   such as colors and text styles, are supported. New lines must be given
   as CRLF (`\\r\\n`) rather than LF (`\\n`).
   
   **Parameters:**
   - `output`: `string` - Output text to append.
   - `location`: `Location | undefined` - Indicate that the output was logged at the given
   location.
   - `test`: `TestItem | undefined` - Test item to associate the output with.
   
   **Returns:** `void`"
  (^js [test-run output]
   (.appendOutput ^js test-run output))
  (^js [test-run output location]
   (.appendOutput ^js test-run output location))
  (^js [test-run output location test]
   (.appendOutput ^js test-run output location test)))

(defn add-coverage
  "Adds coverage for a file in the run.
   
   **Parameters:**
   - `file-coverage`: `FileCoverage`
   
   **Returns:** `void`"
  ^js [test-run file-coverage]
  (.addCoverage ^js test-run file-coverage))

(defn end
  "Signals the end of the test run. Any tests included in the run whose
   states have not been updated will have their state reset.
   
   **Returns:** `void`"
  ^js [test-run]
  (.end ^js test-run))

(defn on-did-dispose
  "An event fired when the editor is no longer interested in data
   associated with the test run.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [test-run]
   (.-onDidDispose ^js test-run))
  (^js [test-run listener]
   (.onDidDispose ^js test-run listener))
  (^js [test-run listener this-args]
   (.onDidDispose ^js test-run listener this-args))
  (^js [test-run listener this-args disposables]
   (.onDidDispose ^js test-run listener this-args disposables)))

(defn set-on-did-dispose!
  "An event fired when the editor is no longer interested in data
   associated with the test run."
  ^js [test-run value]
  (set! (.-onDidDispose ^js test-run) value))
