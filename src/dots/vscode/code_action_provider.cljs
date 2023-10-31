(ns dots.vscode.code-action-provider
  "The code action interface defines the contract between extensions and
   the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) feature.
   
   A code action can be any command that is {@link commands.getCommands known} to the system.")

(defn provide-code-actions
  "Provide commands for the given document and range."
  ^js [code-action-provider document range context token]
  (.provideCodeActions ^js code-action-provider document range context token))

(defn resolve-code-action
  "Given a code action fill in its {@linkcode CodeAction.edit edit}-property. Changes to
   all other properties, like title, are ignored. A code action that has an edit
   will not be resolved.
   
   *Note* that a code action provider that returns commands, not code actions, cannot successfully
   implement this function. Returning commands is deprecated and instead code actions should be
   returned."
  ^js [code-action-provider code-action token]
  (.resolveCodeAction ^js code-action-provider code-action token))
