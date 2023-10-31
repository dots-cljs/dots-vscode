(ns dots.vscode.window
  "Namespace for dealing with the current window of the editor. That is visible
   and active editors, as well as, UI elements to show messages, selections, and
   asking for user input."
  (:require ["vscode" :as vscode]))

(defn show-text-document
  "Show the given document in a text editor. A {@link ViewColumn column} can be provided
   to control where the editor is being shown. Might change the {@link window.activeTextEditor active editor}.
   Show the given document in a text editor. {@link TextDocumentShowOptions Options} can be provided
   to control options of the editor is being shown. Might change the {@link window.activeTextEditor active editor}.
   A short-hand for `openTextDocument(uri).then(document => showTextDocument(document, options))`."
  {:arglists '([document]
               [document column]
               [document column preserve-focus?]
               [document options]
               [uri]
               [uri options])}
  (^js [a]
   (.showTextDocument vscode/window a))
  (^js [a b]
   (.showTextDocument vscode/window a b))
  (^js [document column preserve-focus?]
   (.showTextDocument vscode/window document column preserve-focus?)))

(defn show-notebook-document
  "Show the given {@link NotebookDocument } in a {@link NotebookEditor notebook editor}."
  (^js [document]
   (.showNotebookDocument vscode/window document))
  (^js [document options]
   (.showNotebookDocument vscode/window document options)))

(defn create-text-editor-decoration-type
  "Create a TextEditorDecorationType that can be used to add decorations to text editors."
  ^js [options]
  (.createTextEditorDecorationType vscode/window options))

(defn show-information-message
  "Show an information message to users. Optionally provide an array of items which will be presented as
   clickable buttons.
   Show an information message."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showInformationMessage (apply vscode/window (to-array (cons a more)))))

(defn show-warning-message
  "Show a warning message."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showWarningMessage (apply vscode/window (to-array (cons a more)))))

(defn show-error-message
  "Show an error message."
  {:arglists '([message & items]
               [message options & items])}
  ^js [a & more]
  (.. vscode/window -showErrorMessage (apply vscode/window (to-array (cons a more)))))

(defn show-quick-pick
  "Shows a selection list allowing multiple selections.
   Shows a selection list."
  (^js [items]
   (.showQuickPick vscode/window items))
  (^js [items options]
   (.showQuickPick vscode/window items options))
  (^js [items options token]
   (.showQuickPick vscode/window items options token)))

(defn show-workspace-folder-pick
  "Shows a selection list of {@link workspace.workspaceFolders workspace folders} to pick from.
   Returns `undefined` if no folder is open."
  (^js []
   (.showWorkspaceFolderPick vscode/window))
  (^js [options]
   (.showWorkspaceFolderPick vscode/window options)))

(defn show-open-dialog
  "Shows a file open dialog to the user which allows to select a file
   for opening-purposes."
  (^js []
   (.showOpenDialog vscode/window))
  (^js [options]
   (.showOpenDialog vscode/window options)))

(defn show-save-dialog
  "Shows a file save dialog to the user which allows to select a file
   for saving-purposes."
  (^js []
   (.showSaveDialog vscode/window))
  (^js [options]
   (.showSaveDialog vscode/window options)))

(defn show-input-box
  "Opens an input box to ask the user for input.
   
   The returned value will be `undefined` if the input box was canceled (e.g. pressing ESC). Otherwise the
   returned value will be the string typed by the user or an empty string if the user did not type
   anything but dismissed the input box with OK."
  (^js []
   (.showInputBox vscode/window))
  (^js [options]
   (.showInputBox vscode/window options))
  (^js [options token]
   (.showInputBox vscode/window options token)))

(defn create-quick-pick
  "Creates a {@link QuickPick } to let the user pick an item from a list
   of items of type T.
   
   Note that in many cases the more convenient {@link window.showQuickPick }
   is easier to use. {@link window.createQuickPick } should be used
   when {@link window.showQuickPick } does not offer the required flexibility."
  ^js []
  (.createQuickPick vscode/window))

(defn create-input-box
  "Creates a {@link InputBox } to let the user enter some text input.
   
   Note that in many cases the more convenient {@link window.showInputBox }
   is easier to use. {@link window.createInputBox } should be used
   when {@link window.showInputBox } does not offer the required flexibility."
  ^js []
  (.createInputBox vscode/window))

(defn create-output-channel
  "Creates a new {@link OutputChannel output channel} with the given name and language id
   If language id is not provided, then **Log** is used as default language id.
   
   You can access the visible or active output channel as a {@link TextDocument text document} from {@link window.visibleTextEditors visible editors} or {@link window.activeTextEditor active editor}
   and use the language id to contribute language features like syntax coloring, code lens etc.,"
  (^js [name]
   (.createOutputChannel vscode/window name))
  (^js [name language-id]
   (.createOutputChannel vscode/window name language-id)))

(defn create-webview-panel
  "Create and show a new webview panel."
  (^js [view-type title show-options]
   (.createWebviewPanel vscode/window view-type title show-options))
  (^js [view-type title show-options options]
   (.createWebviewPanel vscode/window view-type title show-options options)))

(defn set-status-bar-message
  "Set a message to the status bar. This is a short hand for the more powerful
   status bar {@link window.createStatusBarItem items}.
   Set a message to the status bar. This is a short hand for the more powerful
   status bar {@link window.createStatusBarItem items}.
   
   *Note* that status bar messages stack and that they must be disposed when no
   longer used."
  {:arglists '([text]
               [text hide-after-timeout]
               [text hide-when-done])}
  (^js [text]
   (.setStatusBarMessage vscode/window text))
  (^js [a b]
   (.setStatusBarMessage vscode/window a b)))

(defn with-scm-progress
  "Show progress in the Source Control viewlet while running the given callback and while
   its returned promise isn't resolve or rejected."
  ^js [task]
  (.withScmProgress vscode/window task))

(defn with-progress
  "Show progress in the editor. Progress is shown while running the given callback
   and while the promise it returned isn't resolved nor rejected. The location at which
   progress should show (and other details) is defined via the passed {@linkcode ProgressOptions }."
  ^js [options task]
  (.withProgress vscode/window options task))

(defn create-status-bar-item
  "Creates a status bar {@link StatusBarItem item}."
  {:arglists '([]
               [alignment]
               [alignment priority]
               [id]
               [id alignment]
               [id alignment priority])}
  (^js []
   (.createStatusBarItem vscode/window))
  (^js [a]
   (.createStatusBarItem vscode/window a))
  (^js [a b]
   (.createStatusBarItem vscode/window a b))
  (^js [id alignment priority]
   (.createStatusBarItem vscode/window id alignment priority)))

(defn create-terminal
  "Creates a {@link Terminal } with a backing shell process. The cwd of the terminal will be the workspace
   directory if it exists.
   Creates a {@link Terminal } with a backing shell process.
   Creates a {@link Terminal } where an extension controls its input and output."
  {:arglists '([]
               [name]
               [name shell-path]
               [name shell-path shell-args]
               [options])}
  (^js []
   (.createTerminal vscode/window))
  (^js [a]
   (.createTerminal vscode/window a))
  (^js [name shell-path]
   (.createTerminal vscode/window name shell-path))
  (^js [name shell-path shell-args]
   (.createTerminal vscode/window name shell-path shell-args)))

(defn register-tree-data-provider
  "Register a {@link TreeDataProvider } for the view contributed using the extension point `views`.
   This will allow you to contribute data to the {@link TreeView } and update if the data changes.
   
   **Note:** To get access to the {@link TreeView } and perform operations on it, use {@link window.createTreeView createTreeView}."
  ^js [view-id tree-data-provider]
  (.registerTreeDataProvider vscode/window view-id tree-data-provider))

(defn create-tree-view
  "Create a {@link TreeView } for the view contributed using the extension point `views`."
  ^js [view-id options]
  (.createTreeView vscode/window view-id options))

(defn register-uri-handler
  "Registers a {@link UriHandler uri handler} capable of handling system-wide {@link Uri uris}.
   In case there are multiple windows open, the topmost window will handle the uri.
   A uri handler is scoped to the extension it is contributed from; it will only
   be able to handle uris which are directed to the extension itself. A uri must respect
   the following rules:
   
   - The uri-scheme must be `vscode.env.uriScheme`;
   - The uri-authority must be the extension id (e.g. `my.extension`);
   - The uri-path, -query and -fragment parts are arbitrary.
   
   For example, if the `my.extension` extension registers a uri handler, it will only
   be allowed to handle uris with the prefix `product-name://my.extension`.
   
   An extension can only register a single uri handler in its entire activation lifetime.
   
   * *Note:* There is an activation event `onUri` that fires when a uri directed for
   the current extension is about to be handled."
  ^js [handler]
  (.registerUriHandler vscode/window handler))

(defn register-webview-panel-serializer
  "Registers a webview panel serializer.
   
   Extensions that support reviving should have an `\"onWebviewPanel:viewType\"` activation event and
   make sure that `registerWebviewPanelSerializer` is called during activation.
   
   Only a single serializer may be registered at a time for a given `viewType`."
  ^js [view-type serializer]
  (.registerWebviewPanelSerializer vscode/window view-type serializer))

(defn register-webview-view-provider
  "Register a new provider for webview views."
  (^js [view-id provider]
   (.registerWebviewViewProvider vscode/window view-id provider))
  (^js [view-id provider options]
   (.registerWebviewViewProvider vscode/window view-id provider options)))

(defn register-custom-editor-provider
  "Register a provider for custom editors for the `viewType` contributed by the `customEditors` extension point.
   
   When a custom editor is opened, an `onCustomEditor:viewType` activation event is fired. Your extension
   must register a {@linkcode CustomTextEditorProvider }, {@linkcode CustomReadonlyEditorProvider },
   {@linkcode CustomEditorProvider }for `viewType` as part of activation."
  (^js [view-type provider]
   (.registerCustomEditorProvider vscode/window view-type provider))
  (^js [view-type provider options]
   (.registerCustomEditorProvider vscode/window view-type provider options)))

(defn register-terminal-link-provider
  "Register provider that enables the detection and handling of links within the terminal."
  ^js [provider]
  (.registerTerminalLinkProvider vscode/window provider))

(defn register-terminal-profile-provider
  "Registers a provider for a contributed terminal profile."
  ^js [id provider]
  (.registerTerminalProfileProvider vscode/window id provider))

(defn register-file-decoration-provider
  "Register a file decoration provider."
  ^js [provider]
  (.registerFileDecorationProvider vscode/window provider))

(defn tab-groups
  "Represents the grid widget within the main editor area"
  ^js []
  (.-tabGroups vscode/window))

(defn active-text-editor
  "The currently active editor or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  ^js []
  (.-activeTextEditor vscode/window))

(defn visible-text-editors
  "The currently visible editors or an empty array."
  ^js []
  (.-visibleTextEditors vscode/window))

(defn on-did-change-active-text-editor
  "An {@link Event } which fires when the {@link window.activeTextEditor active editor}
   has changed. *Note* that the event also fires when the active editor changes
   to `undefined`."
  (^js []
   (.-onDidChangeActiveTextEditor vscode/window))
  (^js [listener]
   (.onDidChangeActiveTextEditor vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveTextEditor vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveTextEditor vscode/window listener this-args disposables)))

(defn on-did-change-visible-text-editors
  "An {@link Event } which fires when the array of {@link window.visibleTextEditors visible editors}
   has changed."
  (^js []
   (.-onDidChangeVisibleTextEditors vscode/window))
  (^js [listener]
   (.onDidChangeVisibleTextEditors vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeVisibleTextEditors vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeVisibleTextEditors vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-selection
  "An {@link Event } which fires when the selection in an editor has changed."
  (^js []
   (.-onDidChangeTextEditorSelection vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorSelection vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorSelection vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorSelection vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-visible-ranges
  "An {@link Event } which fires when the visible ranges of an editor has changed."
  (^js []
   (.-onDidChangeTextEditorVisibleRanges vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorVisibleRanges vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-options
  "An {@link Event } which fires when the options of an editor have changed."
  (^js []
   (.-onDidChangeTextEditorOptions vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorOptions vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorOptions vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorOptions vscode/window listener this-args disposables)))

(defn on-did-change-text-editor-view-column
  "An {@link Event } which fires when the view column of an editor has changed."
  (^js []
   (.-onDidChangeTextEditorViewColumn vscode/window))
  (^js [listener]
   (.onDidChangeTextEditorViewColumn vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTextEditorViewColumn vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTextEditorViewColumn vscode/window listener this-args disposables)))

(defn visible-notebook-editors
  "The currently visible {@link NotebookEditor notebook editors} or an empty array."
  ^js []
  (.-visibleNotebookEditors vscode/window))

(defn on-did-change-visible-notebook-editors
  "An {@link Event } which fires when the {@link window.visibleNotebookEditors visible notebook editors}
   has changed."
  (^js []
   (.-onDidChangeVisibleNotebookEditors vscode/window))
  (^js [listener]
   (.onDidChangeVisibleNotebookEditors vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeVisibleNotebookEditors vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeVisibleNotebookEditors vscode/window listener this-args disposables)))

(defn active-notebook-editor
  "The currently active {@link NotebookEditor notebook editor} or `undefined`. The active editor is the one
   that currently has focus or, when none has focus, the one that has changed
   input most recently."
  ^js []
  (.-activeNotebookEditor vscode/window))

(defn on-did-change-active-notebook-editor
  "An {@link Event } which fires when the {@link window.activeNotebookEditor active notebook editor}
   has changed. *Note* that the event also fires when the active editor changes
   to `undefined`."
  (^js []
   (.-onDidChangeActiveNotebookEditor vscode/window))
  (^js [listener]
   (.onDidChangeActiveNotebookEditor vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveNotebookEditor vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveNotebookEditor vscode/window listener this-args disposables)))

(defn on-did-change-notebook-editor-selection
  "An {@link Event } which fires when the {@link NotebookEditor.selections notebook editor selections}
   have changed."
  (^js []
   (.-onDidChangeNotebookEditorSelection vscode/window))
  (^js [listener]
   (.onDidChangeNotebookEditorSelection vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeNotebookEditorSelection vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeNotebookEditorSelection vscode/window listener this-args disposables)))

(defn on-did-change-notebook-editor-visible-ranges
  "An {@link Event } which fires when the {@link NotebookEditor.visibleRanges notebook editor visible ranges}
   have changed."
  (^js []
   (.-onDidChangeNotebookEditorVisibleRanges vscode/window))
  (^js [listener]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeNotebookEditorVisibleRanges vscode/window listener this-args disposables)))

(defn terminals
  "The currently opened terminals or an empty array."
  ^js []
  (.-terminals vscode/window))

(defn active-terminal
  "The currently active terminal or `undefined`. The active terminal is the one that
   currently has focus or most recently had focus."
  ^js []
  (.-activeTerminal vscode/window))

(defn on-did-change-active-terminal
  "An {@link Event } which fires when the {@link window.activeTerminal active terminal}
   has changed. *Note* that the event also fires when the active terminal changes
   to `undefined`."
  (^js []
   (.-onDidChangeActiveTerminal vscode/window))
  (^js [listener]
   (.onDidChangeActiveTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveTerminal vscode/window listener this-args disposables)))

(defn on-did-open-terminal
  "An {@link Event } which fires when a terminal has been created, either through the
   {@link window.createTerminal createTerminal} API or commands."
  (^js []
   (.-onDidOpenTerminal vscode/window))
  (^js [listener]
   (.onDidOpenTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidOpenTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidOpenTerminal vscode/window listener this-args disposables)))

(defn on-did-close-terminal
  "An {@link Event } which fires when a terminal is disposed."
  (^js []
   (.-onDidCloseTerminal vscode/window))
  (^js [listener]
   (.onDidCloseTerminal vscode/window listener))
  (^js [listener this-args]
   (.onDidCloseTerminal vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidCloseTerminal vscode/window listener this-args disposables)))

(defn on-did-change-terminal-state
  "An {@link Event } which fires when a {@link Terminal.state terminal's state} has changed."
  (^js []
   (.-onDidChangeTerminalState vscode/window))
  (^js [listener]
   (.onDidChangeTerminalState vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeTerminalState vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTerminalState vscode/window listener this-args disposables)))

(defn state
  "Represents the current window's state."
  ^js []
  (.-state vscode/window))

(defn on-did-change-window-state
  "An {@link Event } which fires when the focus state of the current window
   changes. The value of the event represents whether the window is focused."
  (^js []
   (.-onDidChangeWindowState vscode/window))
  (^js [listener]
   (.onDidChangeWindowState vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeWindowState vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeWindowState vscode/window listener this-args disposables)))

(defn active-color-theme
  "The currently active color theme as configured in the settings. The active
   theme can be changed via the `workbench.colorTheme` setting."
  ^js []
  (.-activeColorTheme vscode/window))

(defn on-did-change-active-color-theme
  "An {@link Event } which fires when the active color theme is changed or has changes."
  (^js []
   (.-onDidChangeActiveColorTheme vscode/window))
  (^js [listener]
   (.onDidChangeActiveColorTheme vscode/window listener))
  (^js [listener this-args]
   (.onDidChangeActiveColorTheme vscode/window listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeActiveColorTheme vscode/window listener this-args disposables)))
