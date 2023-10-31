(ns dots.vscode.notebook-cell-kind
  "A notebook cell kind."
  (:require ["vscode" :as vscode]))

(def markup
  "A markup-cell is formatted source that is used for display."
  (.-Markup vscode/NotebookCellKind))

(def code
  "A code-cell is source that can be {@link NotebookController executed} and that
   produces {@link NotebookCellOutput output}."
  (.-Code vscode/NotebookCellKind))
