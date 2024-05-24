(ns dots.vscode.input-box-validation-severity
  "The severity level for input box validation."
  (:require ["vscode" :as vscode]))

(def info
  "Informational severity level."
  (.-Info vscode/InputBoxValidationSeverity))

(def warning
  "Warning severity level."
  (.-Warning vscode/InputBoxValidationSeverity))

(def error
  "Error severity level."
  (.-Error vscode/InputBoxValidationSeverity))
