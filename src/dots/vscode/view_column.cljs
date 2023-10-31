(ns dots.vscode.view-column
  "Denotes a location of an editor in the window. Editors can be arranged in a grid
   and each column represents one editor location in that grid by counting the editors
   in order of their appearance."
  (:require ["vscode" :as vscode]))

(def active
  "A *symbolic* editor column representing the currently active column. This value
   can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
   of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`."
  (.-Active vscode/ViewColumn))

(def beside
  "A *symbolic* editor column representing the column to the side of the active one. This value
   can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
   of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`."
  (.-Beside vscode/ViewColumn))

(def one
  "The first editor column."
  (.-One vscode/ViewColumn))

(def two
  "The second editor column."
  (.-Two vscode/ViewColumn))

(def three
  "The third editor column."
  (.-Three vscode/ViewColumn))

(def four
  "The fourth editor column."
  (.-Four vscode/ViewColumn))

(def five
  "The fifth editor column."
  (.-Five vscode/ViewColumn))

(def six
  "The sixth editor column."
  (.-Six vscode/ViewColumn))

(def seven
  "The seventh editor column."
  (.-Seven vscode/ViewColumn))

(def eight
  "The eighth editor column."
  (.-Eight vscode/ViewColumn))

(def nine
  "The ninth editor column."
  (.-Nine vscode/ViewColumn))
