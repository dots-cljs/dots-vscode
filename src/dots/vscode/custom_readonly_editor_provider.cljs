(ns dots.vscode.custom-readonly-editor-provider
  "Provider for readonly custom editors that use a custom document model.
   
   Custom editors use {@linkcode CustomDocument } as their document model instead of a {@linkcode TextDocument }.
   
   You should use this type of custom editor when dealing with binary files or more complex scenarios. For simple
   text based documents, use {@linkcode CustomTextEditorProvider } instead.")

(defn open-custom-document
  "Create a new document for a given resource.
   
   `openCustomDocument` is called when the first time an editor for a given resource is opened. The opened
   document is then passed to `resolveCustomEditor` so that the editor can be shown to the user.
   
   Already opened `CustomDocument` are re-used if the user opened additional editors. When all editors for a
   given resource are closed, the `CustomDocument` is disposed of. Opening an editor at this point will
   trigger another call to `openCustomDocument`.
   
   **Parameters:**
   - `uri`: `Uri` - Uri of the document to open.
   - `open-context`: `CustomDocumentOpenContext` - Additional information about the opening custom document.
   - `token`: `CancellationToken` - A cancellation token that indicates the result is no longer needed.
   
   **Returns:** `T | Thenable<T>` - The custom document."
  ^js [custom-readonly-editor-provider uri open-context token]
  (.openCustomDocument ^js custom-readonly-editor-provider uri open-context token))

(defn resolve-custom-editor
  "Resolve a custom editor for a given resource.
   
   This is called whenever the user opens a new editor for this `CustomEditorProvider`.
   
   **Parameters:**
   - `document`: `T` - Document for the resource being resolved.
   - `webview-panel`: `WebviewPanel` - The webview panel used to display the editor UI for this resource.
   
   During resolve, the provider must fill in the initial html for the content webview panel and hook up all
   the event listeners on it that it is interested in. The provider can also hold onto the `WebviewPanel` to
   use later for example in a command. See {@linkcode WebviewPanel } for additional details.
   - `token`: `CancellationToken` - A cancellation token that indicates the result is no longer needed.
   
   **Returns:** `void | Thenable<void>` - Optional thenable indicating that the custom editor has been resolved."
  ^js [custom-readonly-editor-provider document webview-panel token]
  (.resolveCustomEditor ^js custom-readonly-editor-provider document webview-panel token))
