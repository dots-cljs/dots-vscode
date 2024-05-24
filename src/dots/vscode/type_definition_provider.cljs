(ns dots.vscode.type-definition-provider
  "The type definition provider defines the contract between extensions and
   the go to type definition feature.")

(defn provide-type-definition
  "Provide the type definition of the symbol at the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Definition | LocationLink[]>` - A definition or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [type-definition-provider document position token]
  (.provideTypeDefinition ^js type-definition-provider document position token))
