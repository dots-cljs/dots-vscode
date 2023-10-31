(ns dots.vscode.language-status-severity
  "Represents the severity of a language status item."
  (:require ["vscode" :as vscode]))

(def information (.-Information vscode/LanguageStatusSeverity))

(def warning (.-Warning vscode/LanguageStatusSeverity))

(def error (.-Error vscode/LanguageStatusSeverity))
