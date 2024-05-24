(ns dots.vscode.source-control-resource-state
  "An source control resource state represents the state of an underlying workspace
   resource within a certain {@link SourceControlResourceGroup source control group}.")

(defn resource-uri
  "The {@link Uri } of the underlying resource inside the workspace.
   
   **Returns:** `Uri`"
  ^js [source-control-resource-state]
  (.-resourceUri ^js source-control-resource-state))

(defn command
  "The {@link Command } which should be run when the resource
   state is open in the Source Control viewlet.
   
   **Returns:** `Command | undefined`"
  ^js [source-control-resource-state]
  (.-command ^js source-control-resource-state))

(defn decorations
  "The {@link SourceControlResourceDecorations decorations} for this source control
   resource state.
   
   **Returns:** `SourceControlResourceDecorations | undefined`"
  ^js [source-control-resource-state]
  (.-decorations ^js source-control-resource-state))

(defn context-value
  "Context value of the resource state. This can be used to contribute resource specific actions.
   For example, if a resource is given a context value as `diffable`. When contributing actions to `scm/resourceState/context`
   using `menus` extension point, you can specify context value for key `scmResourceState` in `when` expressions, like `scmResourceState == diffable`.
   ```json
   \"contributes\": {
     \"menus\": {
       \"scm/resourceState/context\": [
         {
           \"command\": \"extension.diff\",
           \"when\": \"scmResourceState == diffable\"
         }
       ]
     }
   }
   ```
   This will show action `extension.diff` only for resources with `contextValue` is `diffable`.
   
   **Returns:** `string | undefined`"
  ^js [source-control-resource-state]
  (.-contextValue ^js source-control-resource-state))
