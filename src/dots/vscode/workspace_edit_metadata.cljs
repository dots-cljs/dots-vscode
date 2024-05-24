(ns dots.vscode.workspace-edit-metadata
  "Additional data about a workspace edit.")

(defn refactoring?
  "Signal to the editor that this edit is a refactoring.
   
   **Returns:** `boolean | undefined`"
  ^js [workspace-edit-metadata]
  (.-isRefactoring ^js workspace-edit-metadata))

(defn set-is-refactoring!
  "Signal to the editor that this edit is a refactoring."
  ^js [workspace-edit-metadata value]
  (set! (.-isRefactoring ^js workspace-edit-metadata) value))
