(ns dots.vscode.text-editor-reveal-type
  "Represents different {@link TextEditor.revealRange reveal} strategies in a text editor."
  (:require ["vscode" :as vscode]))

(def default
  "The range will be revealed with as little scrolling as possible."
  (.-Default vscode/TextEditorRevealType))

(def in-center
  "The range will always be revealed in the center of the viewport."
  (.-InCenter vscode/TextEditorRevealType))

(def in-center-if-outside-viewport
  "If the range is outside the viewport, it will be revealed in the center of the viewport.
   Otherwise, it will be revealed with as little scrolling as possible."
  (.-InCenterIfOutsideViewport vscode/TextEditorRevealType))

(def at-top
  "The range will always be revealed at the top of the viewport."
  (.-AtTop vscode/TextEditorRevealType))
