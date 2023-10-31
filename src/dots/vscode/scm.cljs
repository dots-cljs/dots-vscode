(ns dots.vscode.scm
  (:require ["vscode" :as vscode]))

(defn create-source-control
  "Creates a new {@link SourceControl source control} instance."
  (^js [id label]
   (.createSourceControl vscode/scm id label))
  (^js [id label root-uri]
   (.createSourceControl vscode/scm id label root-uri)))

(defn input-box
  "The {@link SourceControlInputBox input box} for the last source control
   created by the extension."
  ^js []
  (.-inputBox vscode/scm))
