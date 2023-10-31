(ns dots.vscode.code-action
  "A code action represents a change that can be performed in code, e.g. to fix a problem or
   to refactor code.
   
   A CodeAction must set either {@linkcode CodeAction.edit edit} and/or a {@linkcode CodeAction.command command}. If both are supplied, the `edit` is applied first, then the command is executed.")

(defn title
  "A short, human-readable, title for this code action."
  ^js [code-action]
  (.-title ^js code-action))

(defn set-title!
  "A short, human-readable, title for this code action."
  ^js [code-action value]
  (set! (.-title ^js code-action) value))

(defn edit
  "A {@link WorkspaceEdit workspace edit} this code action performs."
  ^js [code-action]
  (.-edit ^js code-action))

(defn set-edit!
  "A {@link WorkspaceEdit workspace edit} this code action performs."
  ^js [code-action value]
  (set! (.-edit ^js code-action) value))

(defn diagnostics
  "{@link Diagnostic Diagnostics} that this code action resolves."
  ^js [code-action]
  (.-diagnostics ^js code-action))

(defn set-diagnostics!
  "{@link Diagnostic Diagnostics} that this code action resolves."
  ^js [code-action value]
  (set! (.-diagnostics ^js code-action) value))

(defn command
  "A {@link Command } this code action executes.
   
   If this command throws an exception, the editor displays the exception message to users in the editor at the
   current cursor position."
  ^js [code-action]
  (.-command ^js code-action))

(defn set-command!
  "A {@link Command } this code action executes.
   
   If this command throws an exception, the editor displays the exception message to users in the editor at the
   current cursor position."
  ^js [code-action value]
  (set! (.-command ^js code-action) value))

(defn kind
  "{@link CodeActionKind Kind} of the code action.
   
   Used to filter code actions."
  ^js [code-action]
  (.-kind ^js code-action))

(defn set-kind!
  "{@link CodeActionKind Kind} of the code action.
   
   Used to filter code actions."
  ^js [code-action value]
  (set! (.-kind ^js code-action) value))

(defn preferred?
  "Marks this as a preferred action. Preferred actions are used by the `auto fix` command and can be targeted
   by keybindings.
   
   A quick fix should be marked preferred if it properly addresses the underlying error.
   A refactoring should be marked preferred if it is the most reasonable choice of actions to take."
  ^js [code-action]
  (.-isPreferred ^js code-action))

(defn set-is-preferred!
  "Marks this as a preferred action. Preferred actions are used by the `auto fix` command and can be targeted
   by keybindings.
   
   A quick fix should be marked preferred if it properly addresses the underlying error.
   A refactoring should be marked preferred if it is the most reasonable choice of actions to take."
  ^js [code-action value]
  (set! (.-isPreferred ^js code-action) value))

(defn disabled
  "Marks that the code action cannot currently be applied.
   
   - Disabled code actions are not shown in automatic [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action)
   code action menu.
   
   - Disabled actions are shown as faded out in the code action menu when the user request a more specific type
   of code action, such as refactorings.
   
   - If the user has a [keybinding](https://code.visualstudio.com/docs/editor/refactoring#_keybindings-for-code-actions)
   that auto applies a code action and only a disabled code actions are returned, the editor will show the user an
   error message with `reason` in the editor."
  ^js [code-action]
  (.-disabled ^js code-action))

(defn set-disabled!
  "Marks that the code action cannot currently be applied.
   
   - Disabled code actions are not shown in automatic [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action)
   code action menu.
   
   - Disabled actions are shown as faded out in the code action menu when the user request a more specific type
   of code action, such as refactorings.
   
   - If the user has a [keybinding](https://code.visualstudio.com/docs/editor/refactoring#_keybindings-for-code-actions)
   that auto applies a code action and only a disabled code actions are returned, the editor will show the user an
   error message with `reason` in the editor."
  ^js [code-action value]
  (set! (.-disabled ^js code-action) value))
