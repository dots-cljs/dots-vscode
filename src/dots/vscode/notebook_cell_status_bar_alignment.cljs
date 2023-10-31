(ns dots.vscode.notebook-cell-status-bar-alignment
  "Represents the alignment of status bar items."
  (:require ["vscode" :as vscode]))

(def left
  "Aligned to the left side."
  (.-Left vscode/NotebookCellStatusBarAlignment))

(def right
  "Aligned to the right side."
  (.-Right vscode/NotebookCellStatusBarAlignment))
