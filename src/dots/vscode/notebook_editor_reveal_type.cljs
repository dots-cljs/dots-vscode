(ns dots.vscode.notebook-editor-reveal-type
  "Represents a notebook editor that is attached to a {@link NotebookDocument notebook}."
  (:require ["vscode" :as vscode]))

(def default
  "The range will be revealed with as little scrolling as possible."
  (.-Default vscode/NotebookEditorRevealType))

(def in-center
  "The range will always be revealed in the center of the viewport."
  (.-InCenter vscode/NotebookEditorRevealType))

(def in-center-if-outside-viewport
  "If the range is outside the viewport, it will be revealed in the center of the viewport.
   Otherwise, it will be revealed with as little scrolling as possible."
  (.-InCenterIfOutsideViewport vscode/NotebookEditorRevealType))

(def at-top
  "The range will always be revealed at the top of the viewport."
  (.-AtTop vscode/NotebookEditorRevealType))
