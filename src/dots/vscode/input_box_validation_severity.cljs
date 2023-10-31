(ns dots.vscode.input-box-validation-severity
  "Impacts the behavior and appearance of the validation message."
  (:require ["vscode" :as vscode]))

(def info (.-Info vscode/InputBoxValidationSeverity))

(def warning (.-Warning vscode/InputBoxValidationSeverity))

(def error (.-Error vscode/InputBoxValidationSeverity))
