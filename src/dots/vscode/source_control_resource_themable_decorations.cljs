(ns dots.vscode.source-control-resource-themable-decorations
  "The theme-aware decorations for a
   {@link SourceControlResourceState source control resource state}.")

(defn icon-path
  "The icon path for a specific
   {@link SourceControlResourceState source control resource state}.
   
   **Returns:** `string | Uri | ThemeIcon | undefined`"
  ^js [source-control-resource-themable-decorations]
  (.-iconPath ^js source-control-resource-themable-decorations))
