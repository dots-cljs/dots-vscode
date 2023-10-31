(ns dots.vscode.commands
  "Namespace for dealing with commands. In short, a command is a function with a
   unique identifier. The function is sometimes also called _command handler_.
   
   Commands can be added to the editor using the {@link commands.registerCommand registerCommand}
   and {@link commands.registerTextEditorCommand registerTextEditorCommand} functions. Commands
   can be executed {@link commands.executeCommand manually} or from a UI gesture. Those are:
   
   * palette - Use the `commands`-section in `package.json` to make a command show in
   the [command palette](https://code.visualstudio.com/docs/getstarted/userinterface#_command-palette).
   * keybinding - Use the `keybindings`-section in `package.json` to enable
   [keybindings](https://code.visualstudio.com/docs/getstarted/keybindings#_customizing-shortcuts)
   for your extension.
   
   Commands from other extensions and from the editor itself are accessible to an extension. However,
   when invoking an editor command not all argument types are supported.
   
   This is a sample that registers a command handler and adds an entry for that command to the palette. First
   register a command handler with the identifier `extension.sayHello`.
   ```javascript
   commands.registerCommand('extension.sayHello', () => {
   	window.showInformationMessage('Hello World!');
   });
   ```
   Second, bind the command identifier to a title under which it will show in the palette (`package.json`).
   ```json
   {
   	\"contributes\": {
   		\"commands\": [{
   			\"command\": \"extension.sayHello\",
   			\"title\": \"Hello World\"
   		}]
   	}
   }
   ```"
  (:require ["vscode" :as vscode]))

(defn register-command
  "Registers a command that can be invoked via a keyboard shortcut,
   a menu item, an action, or directly.
   
   Registering a command with an existing command identifier twice
   will cause an error."
  (^js [command callback]
   (.registerCommand vscode/commands command callback))
  (^js [command callback this-arg]
   (.registerCommand vscode/commands command callback this-arg)))

(defn register-text-editor-command
  "Registers a text editor command that can be invoked via a keyboard shortcut,
   a menu item, an action, or directly.
   
   Text editor commands are different from ordinary {@link commands.registerCommand commands} as
   they only execute when there is an active editor when the command is called. Also, the
   command handler of an editor command has access to the active editor and to an
   {@link TextEditorEdit edit}-builder. Note that the edit-builder is only valid while the
   callback executes."
  (^js [command callback]
   (.registerTextEditorCommand vscode/commands command callback))
  (^js [command callback this-arg]
   (.registerTextEditorCommand vscode/commands command callback this-arg)))

(defn execute-command
  "Executes the command denoted by the given command identifier.
   
   * *Note 1:* When executing an editor command not all types are allowed to
   be passed as arguments. Allowed are the primitive types `string`, `boolean`,
   `number`, `undefined`, and `null`, as well as {@linkcode Position }, {@linkcode Range }, {@linkcode Uri } and {@linkcode Location }.
   * *Note 2:* There are no restrictions when executing commands that have been contributed
   by extensions."
  ^js [command & rest]
  (.. vscode/commands -executeCommand (apply vscode/commands (to-array (cons command rest)))))

(defn commands
  "Retrieve the list of all available commands. Commands starting with an underscore are
   treated as internal commands."
  (^js []
   (.getCommands vscode/commands))
  (^js [filter-internal?]
   (.getCommands vscode/commands filter-internal?)))
