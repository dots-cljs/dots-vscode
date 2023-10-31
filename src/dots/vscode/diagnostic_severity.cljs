(ns dots.vscode.diagnostic-severity
  "Represents the severity of diagnostics."
  (:require ["vscode" :as vscode]))

(def error
  "Something not allowed by the rules of a language or other means."
  (.-Error vscode/DiagnosticSeverity))

(def warning
  "Something suspicious but allowed."
  (.-Warning vscode/DiagnosticSeverity))

(def information
  "Something to inform about but not a problem."
  (.-Information vscode/DiagnosticSeverity))

(def hint
  "Something to hint to a better way of doing it, like proposing
   a refactoring."
  (.-Hint vscode/DiagnosticSeverity))
