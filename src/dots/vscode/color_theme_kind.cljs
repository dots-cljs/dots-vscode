(ns dots.vscode.color-theme-kind
  "Represents a color theme kind."
  (:require ["vscode" :as vscode]))

(def light
  "A light color theme."
  (.-Light vscode/ColorThemeKind))

(def dark
  "A dark color theme."
  (.-Dark vscode/ColorThemeKind))

(def high-contrast
  "A dark high contrast color theme."
  (.-HighContrast vscode/ColorThemeKind))

(def high-contrast-light
  "A light high contrast color theme."
  (.-HighContrastLight vscode/ColorThemeKind))
