(ns dots.vscode.window.active-color-theme
  "The currently active color theme as configured in the settings. The active
   theme can be changed via the `workbench.colorTheme` setting."
  (:require ["vscode" :as vscode]))

(defn kind
  "The kind of this color theme: light, dark, high contrast dark and high contrast light.
   
   **Returns:** `ColorThemeKind`"
  ^js []
  (.. vscode/window -activeColorTheme -kind))
