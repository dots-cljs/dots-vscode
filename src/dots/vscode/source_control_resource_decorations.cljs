(ns dots.vscode.source-control-resource-decorations
  "The decorations for a {@link SourceControlResourceState source control resource state}.
   Can be independently specified for light and dark themes.")

(defn strike-through?
  "Whether the {@link SourceControlResourceState source control resource state} should
   be striked-through in the UI.
   
   **Returns:** `boolean | undefined`"
  ^js [source-control-resource-decorations]
  (.-strikeThrough ^js source-control-resource-decorations))

(defn faded?
  "Whether the {@link SourceControlResourceState source control resource state} should
   be faded in the UI.
   
   **Returns:** `boolean | undefined`"
  ^js [source-control-resource-decorations]
  (.-faded ^js source-control-resource-decorations))

(defn tooltip
  "The title for a specific
   {@link SourceControlResourceState source control resource state}.
   
   **Returns:** `string | undefined`"
  ^js [source-control-resource-decorations]
  (.-tooltip ^js source-control-resource-decorations))

(defn light
  "The light theme decorations.
   
   **Returns:** `SourceControlResourceThemableDecorations | undefined`"
  ^js [source-control-resource-decorations]
  (.-light ^js source-control-resource-decorations))

(defn dark
  "The dark theme decorations.
   
   **Returns:** `SourceControlResourceThemableDecorations | undefined`"
  ^js [source-control-resource-decorations]
  (.-dark ^js source-control-resource-decorations))

(defn icon-path
  "The icon path for a specific
   {@link SourceControlResourceState source control resource state}.
   
   **Returns:** `string | Uri | ThemeIcon | undefined`"
  ^js [source-control-resource-decorations]
  (.-iconPath ^js source-control-resource-decorations))
