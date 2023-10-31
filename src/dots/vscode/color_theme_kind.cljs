(ns dots.vscode.color-theme-kind
  "Represents a color theme kind."
  (:require ["vscode" :as vscode]))

(def light (.-Light vscode/ColorThemeKind))

(def dark (.-Dark vscode/ColorThemeKind))

(def high-contrast (.-HighContrast vscode/ColorThemeKind))

(def high-contrast-light (.-HighContrastLight vscode/ColorThemeKind))
