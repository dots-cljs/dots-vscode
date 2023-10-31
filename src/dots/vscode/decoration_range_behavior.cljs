(ns dots.vscode.decoration-range-behavior
  "Describes the behavior of decorations when typing/editing at their edges."
  (:require ["vscode" :as vscode]))

(def open-open
  "The decoration's range will widen when edits occur at the start or end."
  (.-OpenOpen vscode/DecorationRangeBehavior))

(def closed-closed
  "The decoration's range will not widen when edits occur at the start of end."
  (.-ClosedClosed vscode/DecorationRangeBehavior))

(def open-closed
  "The decoration's range will widen when edits occur at the start, but not at the end."
  (.-OpenClosed vscode/DecorationRangeBehavior))

(def closed-open
  "The decoration's range will widen when edits occur at the end, but not at the start."
  (.-ClosedOpen vscode/DecorationRangeBehavior))
