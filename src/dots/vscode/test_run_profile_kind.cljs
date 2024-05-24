(ns dots.vscode.test-run-profile-kind
  "The kind of executions that {@link TestRunProfile TestRunProfiles} control."
  (:require ["vscode" :as vscode]))

(def run
  "The `Run` test profile kind."
  (.-Run vscode/TestRunProfileKind))

(def debug
  "The `Debug` test profile kind."
  (.-Debug vscode/TestRunProfileKind))

(def coverage
  "The `Coverage` test profile kind."
  (.-Coverage vscode/TestRunProfileKind))
