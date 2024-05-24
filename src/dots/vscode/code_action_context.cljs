(ns dots.vscode.code-action-context
  "Contains additional diagnostic information about the context in which
   a {@link CodeActionProvider.provideCodeActions code action} is run.")

(defn trigger-kind
  "The reason why code actions were requested.
   
   **Returns:** `CodeActionTriggerKind`"
  ^js [code-action-context]
  (.-triggerKind ^js code-action-context))

(defn diagnostics
  "An array of diagnostics.
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [code-action-context]
  (.-diagnostics ^js code-action-context))

(defn only
  "Requested kind of actions to return.
   
   Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
   
   **Returns:** `CodeActionKind | undefined`"
  ^js [code-action-context]
  (.-only ^js code-action-context))
