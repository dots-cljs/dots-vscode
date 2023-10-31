(ns dots.vscode.extension-mode
  "The ExtensionMode is provided on the `ExtensionContext` and indicates the
   mode the specific extension is running in."
  (:refer-clojure :exclude [test])
  (:require ["vscode" :as vscode]))

(def production
  "The extension is installed normally (for example, from the marketplace
   or VSIX) in the editor."
  (.-Production vscode/ExtensionMode))

(def development
  "The extension is running from an `--extensionDevelopmentPath` provided
   when launching the editor."
  (.-Development vscode/ExtensionMode))

(def test
  "The extension is running from an `--extensionTestsPath` and
   the extension host is running unit tests."
  (.-Test vscode/ExtensionMode))
