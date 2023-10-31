(ns dots.vscode.notebooks
  "Namespace for notebooks.
   
   The notebooks functionality is composed of three loosely coupled components:
   
   1. {@link NotebookSerializer } enable the editor to open, show, and save notebooks
   2. {@link NotebookController } own the execution of notebooks, e.g they create output from code cells.
   3. NotebookRenderer present notebook output in the editor. They run in a separate context."
  (:require ["vscode" :as vscode]))

(defn create-notebook-controller
  "Creates a new notebook controller."
  (^js [id notebook-type label]
   (.createNotebookController vscode/notebooks id notebook-type label))
  (^js [id notebook-type label handler]
   (.createNotebookController vscode/notebooks id notebook-type label handler)))

(defn register-notebook-cell-status-bar-item-provider
  "Register a {@link NotebookCellStatusBarItemProvider cell statusbar item provider} for the given notebook type."
  ^js [notebook-type provider]
  (.registerNotebookCellStatusBarItemProvider vscode/notebooks notebook-type provider))

(defn create-renderer-messaging
  "Creates a new messaging instance used to communicate with a specific renderer.
   
   * *Note 1:* Extensions can only create renderer that they have defined in their `package.json`-file
   * *Note 2:* A renderer only has access to messaging if `requiresMessaging` is set to `always` or `optional` in
   its `notebookRenderer` contribution."
  ^js [renderer-id]
  (.createRendererMessaging vscode/notebooks renderer-id))
