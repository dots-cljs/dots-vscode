(ns dots.vscode.scm
  "Namespace for source control mangement."
  (:require ["vscode" :as vscode]))

(defn create-source-control
  "Creates a new {@link SourceControl source control} instance.
   
   **Parameters:**
   - `id`: `string` - An `id` for the source control. Something short, e.g.: `git`.
   - `label`: `string` - A human-readable string for the source control. E.g.: `Git`.
   - `root-uri`: `Uri | undefined` - An optional Uri of the root of the source control. E.g.: `Uri.parse(workspaceRoot)`.
   
   **Returns:** `SourceControl` - An instance of {@link SourceControlsource control}."
  (^js [id label]
   (.createSourceControl vscode/scm id label))
  (^js [id label root-uri]
   (.createSourceControl vscode/scm id label root-uri)))

(defn input-box
  "The {@link SourceControlInputBox input box} for the last source control
   created by the extension."
  ^js []
  (.-inputBox vscode/scm))
