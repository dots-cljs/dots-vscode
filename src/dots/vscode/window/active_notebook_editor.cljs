(ns dots.vscode.window.active-notebook-editor
  "The currently active {@link NotebookEditor notebook editor} or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  (:require ["vscode" :as vscode]))

(defn notebook
  "The {@link NotebookDocument notebook document} associated with this notebook editor."
  ^js []
  (.. vscode/window -activeNotebookEditor -notebook))

(defn selection
  "The primary selection in this notebook editor."
  ^js []
  (.. vscode/window -activeNotebookEditor -selection))

(defn set-selection!
  "The primary selection in this notebook editor."
  ^js [value]
  (set! (.. vscode/window -activeNotebookEditor -selection) value))

(defn selections
  "All selections in this notebook editor.
   
   The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;"
  ^js []
  (.. vscode/window -activeNotebookEditor -selections))

(defn set-selections!
  "All selections in this notebook editor.
   
   The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;"
  ^js [value]
  (set! (.. vscode/window -activeNotebookEditor -selections) value))

(defn visible-ranges
  "The current visible ranges in the editor (vertically)."
  ^js []
  (.. vscode/window -activeNotebookEditor -visibleRanges))

(defn view-column
  "The column in which this editor shows."
  ^js []
  (.. vscode/window -activeNotebookEditor -viewColumn))

(defn reveal-range
  "Scroll as indicated by `revealType` in order to reveal the given range."
  (^js [range]
   (.. vscode/window -activeNotebookEditor (revealRange range)))
  (^js [range reveal-type]
   (.. vscode/window -activeNotebookEditor (revealRange range reveal-type))))
