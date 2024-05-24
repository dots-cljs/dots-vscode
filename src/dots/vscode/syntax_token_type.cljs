(ns dots.vscode.syntax-token-type
  "Enumeration of commonly encountered syntax token types."
  (:refer-clojure :exclude [comment])
  (:require ["vscode" :as vscode]))

(def other
  "Everything except tokens that are part of comments, string literals and regular expressions."
  (.-Other vscode/SyntaxTokenType))

(def comment
  "A comment."
  (.-Comment vscode/SyntaxTokenType))

(def string
  "A string literal."
  (.-String vscode/SyntaxTokenType))

(def reg-ex
  "A regular expression."
  (.-RegEx vscode/SyntaxTokenType))
