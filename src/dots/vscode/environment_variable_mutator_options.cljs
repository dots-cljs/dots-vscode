(ns dots.vscode.environment-variable-mutator-options
  "Options applied to the mutator.")

(defn apply-at-process-creation?
  "Apply to the environment just before the process is created. Defaults to false.
   
   **Returns:** `boolean | undefined`"
  ^js [environment-variable-mutator-options]
  (.-applyAtProcessCreation ^js environment-variable-mutator-options))

(defn set-apply-at-process-creation!
  "Apply to the environment just before the process is created. Defaults to false."
  ^js [environment-variable-mutator-options value]
  (set! (.-applyAtProcessCreation ^js environment-variable-mutator-options) value))

(defn apply-at-shell-integration?
  "Apply to the environment in the shell integration script. Note that this _will not_ apply
   the mutator if shell integration is disabled or not working for some reason. Defaults to
   false.
   
   **Returns:** `boolean | undefined`"
  ^js [environment-variable-mutator-options]
  (.-applyAtShellIntegration ^js environment-variable-mutator-options))

(defn set-apply-at-shell-integration!
  "Apply to the environment in the shell integration script. Note that this _will not_ apply
   the mutator if shell integration is disabled or not working for some reason. Defaults to
   false."
  ^js [environment-variable-mutator-options value]
  (set! (.-applyAtShellIntegration ^js environment-variable-mutator-options) value))
