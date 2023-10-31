(ns dots.vscode.test-run-profile-kind
  "The kind of executions that {@link TestRunProfile TestRunProfiles} control."
  (:require ["vscode" :as vscode]))

(def run (.-Run vscode/TestRunProfileKind))

(def debug (.-Debug vscode/TestRunProfileKind))

(def coverage (.-Coverage vscode/TestRunProfileKind))
