(ns dots.vscode.end-of-line
  "Represents an end of line character sequence in a {@link TextDocument document}."
  (:require ["vscode" :as vscode]))

(def lf
  "The line feed `\\n` character."
  (.-LF vscode/EndOfLine))

(def crlf
  "The carriage return line feed `\\r\\n` sequence."
  (.-CRLF vscode/EndOfLine))
