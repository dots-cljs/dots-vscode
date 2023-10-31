(ns dots.vscode.custom-text-editor-provider
  "Provider for text based custom editors.
   
   Text based custom editors use a {@linkcode TextDocument } as their data model. This considerably simplifies
   implementing a custom editor as it allows the editor to handle many common operations such as
   undo and backup. The provider is responsible for synchronizing text changes between the webview and the `TextDocument`.")

(defn resolve-custom-text-editor
  "Resolve a custom editor for a given text resource.
   
   This is called when a user first opens a resource for a `CustomTextEditorProvider`, or if they reopen an
   existing editor using this `CustomTextEditorProvider`."
  ^js [custom-text-editor-provider document webview-panel token]
  (.resolveCustomTextEditor ^js custom-text-editor-provider document webview-panel token))
