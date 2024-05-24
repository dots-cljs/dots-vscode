(ns dots.vscode.language-status-severity
  "Represents the severity level of a language status."
  (:require ["vscode" :as vscode]))

(def information
  "Informational severity level."
  (.-Information vscode/LanguageStatusSeverity))

(def warning
  "Warning severity level."
  (.-Warning vscode/LanguageStatusSeverity))

(def error
  "Error severity level."
  (.-Error vscode/LanguageStatusSeverity))
