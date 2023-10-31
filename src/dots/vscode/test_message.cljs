(ns dots.vscode.test-message
  "Message associated with the test state. Can be linked to a specific
   source range -- useful for assertion failures, for example."
  (:require ["vscode" :as vscode]))

(defn message
  "Human-readable message text to display."
  ^js [test-message]
  (.-message ^js test-message))

(defn set-message!
  "Human-readable message text to display."
  ^js [test-message value]
  (set! (.-message ^js test-message) value))

(defn expected-output
  "Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown."
  ^js [test-message]
  (.-expectedOutput ^js test-message))

(defn set-expected-output!
  "Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown."
  ^js [test-message value]
  (set! (.-expectedOutput ^js test-message) value))

(defn actual-output
  "Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown."
  ^js [test-message]
  (.-actualOutput ^js test-message))

(defn set-actual-output!
  "Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown."
  ^js [test-message value]
  (set! (.-actualOutput ^js test-message) value))

(defn location
  "Associated file location."
  ^js [test-message]
  (.-location ^js test-message))

(defn set-location!
  "Associated file location."
  ^js [test-message value]
  (set! (.-location ^js test-message) value))

(defn diff
  "Creates a new TestMessage that will present as a diff in the editor."
  ^js [message expected actual]
  (.diff vscode/TestMessage message expected actual))
