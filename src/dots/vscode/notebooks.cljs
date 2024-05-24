(ns dots.vscode.notebooks
  "Namespace for notebooks.
   
   The notebooks functionality is composed of three loosely coupled components:
   
   1. {@link NotebookSerializer } enable the editor to open, show, and save notebooks
   2. {@link NotebookController } own the execution of notebooks, e.g they create output from code cells.
   3. NotebookRenderer present notebook output in the editor. They run in a separate context."
  (:require ["vscode" :as vscode]))

(defn create-notebook-controller
  "Creates a new notebook controller.
   
   **Parameters:**
   - `id`: `string` - Identifier of the controller. Must be unique per extension.
   - `notebook-type`: `string` - A notebook type for which this controller is for.
   - `label`: `string` - The label of the controller.
   - `handler`: `((cells: NotebookCell[], notebook: NotebookDocument, controller: NotebookController) => void | Thenable<void>) | undefined` - The execute-handler of the controller.
   
   **Returns:** `NotebookController` - A new notebook controller."
  (^js [id notebook-type label]
   (.createNotebookController vscode/notebooks id notebook-type label))
  (^js [id notebook-type label handler]
   (.createNotebookController vscode/notebooks id notebook-type label handler)))

(defn register-notebook-cell-status-bar-item-provider
  "Register a {@link NotebookCellStatusBarItemProvider cell statusbar item provider} for the given notebook type.
   
   **Parameters:**
   - `notebook-type`: `string` - The notebook type to register for.
   - `provider`: `NotebookCellStatusBarItemProvider` - A cell status bar provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [notebook-type provider]
  (.registerNotebookCellStatusBarItemProvider vscode/notebooks notebook-type provider))

(defn create-renderer-messaging
  "Creates a new messaging instance used to communicate with a specific renderer.
   
   * *Note 1:* Extensions can only create renderer that they have defined in their `package.json`-file
   * *Note 2:* A renderer only has access to messaging if `requiresMessaging` is set to `always` or `optional` in
   its `notebookRenderer` contribution.
   
   **Parameters:**
   - `renderer-id`: `string` - The renderer ID to communicate with
   
   **Returns:** `NotebookRendererMessaging` - A new notebook renderer messaging object."
  ^js [renderer-id]
  (.createRendererMessaging vscode/notebooks renderer-id))
