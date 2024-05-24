(ns dots.vscode.environment-variable-scope
  "The scope object to which the environment variable collection applies.")

(defn workspace-folder
  "Any specific workspace folder to get collection for."
  ^js [environment-variable-scope]
  (.-workspaceFolder ^js environment-variable-scope))

(defn set-workspace-folder!
  "Any specific workspace folder to get collection for."
  ^js [environment-variable-scope value]
  (set! (.-workspaceFolder ^js environment-variable-scope) value))
