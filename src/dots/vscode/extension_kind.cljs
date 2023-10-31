(ns dots.vscode.extension-kind
  "In a remote window the extension kind describes if an extension
   runs where the UI (window) runs or if an extension runs remotely."
  (:require ["vscode" :as vscode]))

(def ui
  "Extension runs where the UI runs."
  (.-UI vscode/ExtensionKind))

(def workspace
  "Extension runs where the remote extension host runs."
  (.-Workspace vscode/ExtensionKind))
