(ns dots.vscode.code-action-provider-metadata
  "Metadata about the type of code actions that a {@link CodeActionProvider } provides.")

(defn provided-code-action-kinds
  "List of {@link CodeActionKind CodeActionKinds} that a {@link CodeActionProvider } may return.
   
   This list is used to determine if a given `CodeActionProvider` should be invoked or not.
   To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
   list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
   such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
   
   **Returns:** `readonly CodeActionKind[] | undefined`"
  ^js [code-action-provider-metadata]
  (.-providedCodeActionKinds ^js code-action-provider-metadata))

(defn documentation
  "Static documentation for a class of code actions.
   
   Documentation from the provider is shown in the code actions menu if either:
   
   - Code actions of `kind` are requested by the editor. In this case, the editor will show the documentation that
     most closely matches the requested code action kind. For example, if a provider has documentation for
     both `Refactor` and `RefactorExtract`, when the user requests code actions for `RefactorExtract`,
     the editor will use the documentation for `RefactorExtract` instead of the documentation for `Refactor`.
   
   - Any code actions of `kind` are returned by the provider.
   
   At most one documentation entry will be shown per provider.
   
   **Returns:** `readonly { readonly kind: CodeActionKind; readonly command: Command; }[] | undefined`"
  ^js [code-action-provider-metadata]
  (.-documentation ^js code-action-provider-metadata))
