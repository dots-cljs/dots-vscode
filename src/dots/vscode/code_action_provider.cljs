(ns dots.vscode.code-action-provider
  "Provides contextual actions for code. Code actions typically either fix problems or beautify/refactor code.
   
   Code actions are surfaced to users in a few different ways:
   
   - The [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) feature, which shows
     a list of code actions at the current cursor position. The lightbulb's list of actions includes both quick fixes
     and refactorings.
   - As commands that users can run, such as `Refactor`. Users can run these from the command palette or with keybindings.
   - As source actions, such `Organize Imports`.
   - {@link CodeActionKind.QuickFix Quick fixes} are shown in the problems view.
   - Change applied on save by the `editor.codeActionsOnSave` setting.")

(defn provide-code-actions
  "Get code actions for a given range in a document.
   
   Only return code actions that are relevant to user for the requested range. Also keep in mind how the
   returned code actions will appear in the UI. The lightbulb widget and `Refactor` commands for instance show
   returned code actions as a list, so do not return a large number of code actions that will overwhelm the user.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `range`: `Range | Selection` - The selector or range for which the command was invoked. This will always be a
   {@link Selection selection} if the actions are being requested in the currently active editor.
   - `context`: `CodeActionContext` - Provides additional information about what code actions are being requested. You can use this
   to see what specific type of code actions are being requested by the editor in order to return more relevant
   actions and avoid returning irrelevant code actions that the editor will discard.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<(Command | T)[]>` - An array of code actions, such as quick fixes or refactorings. The lack of a result can be signaled
   by returning `undefined`, `null`, or an empty array.
   
   We also support returning `Command` for legacy reasons, however all new extensions should return
   `CodeAction` object instead."
  ^js [code-action-provider document range context token]
  (.provideCodeActions ^js code-action-provider document range context token))

(defn resolve-code-action
  "Given a code action fill in its {@linkcode CodeAction.edit edit}-property. Changes to
   all other properties, like title, are ignored. A code action that has an edit
   will not be resolved.
   
   *Note* that a code action provider that returns commands, not code actions, cannot successfully
   implement this function. Returning commands is deprecated and instead code actions should be
   returned.
   
   **Parameters:**
   - `code-action`: `T` - A code action.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T>` - The resolved code action or a thenable that resolves to such. It is OK to return the given
   `item`. When no result is returned, the given `item` will be used."
  ^js [code-action-provider code-action token]
  (.resolveCodeAction ^js code-action-provider code-action token))
