(ns dots.vscode.environment-variable-mutator
  "A type of mutation and its value to be applied to an environment variable."
  (:refer-clojure :exclude [type]))

(defn type
  "The type of mutation that will occur to the variable."
  ^js [environment-variable-mutator]
  (.-type ^js environment-variable-mutator))

(defn value
  "The value to use for the variable."
  ^js [environment-variable-mutator]
  (.-value ^js environment-variable-mutator))

(defn options
  "Options applied to the mutator."
  ^js [environment-variable-mutator]
  (.-options ^js environment-variable-mutator))
