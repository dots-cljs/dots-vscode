(ns dots.vscode.overview-ruler-lane
  "Represents different positions for rendering a decoration in an {@link DecorationRenderOptions.overviewRulerLane overview ruler}.
   The overview ruler supports three lanes."
  (:require ["vscode" :as vscode]))

(def left
  "The left lane of the overview ruler."
  (.-Left vscode/OverviewRulerLane))

(def center
  "The center lane of the overview ruler."
  (.-Center vscode/OverviewRulerLane))

(def right
  "The right lane of the overview ruler."
  (.-Right vscode/OverviewRulerLane))

(def full
  "All lanes of the overview ruler."
  (.-Full vscode/OverviewRulerLane))
