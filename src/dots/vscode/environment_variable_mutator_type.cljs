(ns dots.vscode.environment-variable-mutator-type
  "A type of mutation that can be applied to an environment variable."
  (:refer-clojure :exclude [replace])
  (:require ["vscode" :as vscode]))

(def replace
  "Replace the variable's existing value."
  (.-Replace vscode/EnvironmentVariableMutatorType))

(def append
  "Append to the end of the variable's existing value."
  (.-Append vscode/EnvironmentVariableMutatorType))

(def prepend
  "Prepend to the start of the variable's existing value."
  (.-Prepend vscode/EnvironmentVariableMutatorType))
