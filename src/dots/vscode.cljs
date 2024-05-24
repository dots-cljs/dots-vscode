(ns dots.vscode
  "Type Definition for Visual Studio Code 1.89 Extension API
   See https://code.visualstudio.com/api for more information"
  (:require ["vscode" :as vscode]))

(defn version
  "The version of the editor.
   
   **Returns:** `string`"
  ^js []
  vscode/version)
