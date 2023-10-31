(ns dots.vscode.overview-ruler-lane
  "Represents different positions for rendering a decoration in an {@link DecorationRenderOptions.overviewRulerLane overview ruler}.
   The overview ruler supports three lanes."
  (:require ["vscode" :as vscode]))

(def left (.-Left vscode/OverviewRulerLane))

(def center (.-Center vscode/OverviewRulerLane))

(def right (.-Right vscode/OverviewRulerLane))

(def full (.-Full vscode/OverviewRulerLane))
