(ns dots.vscode.definition-provider
  "The definition provider interface defines the contract between extensions and
   the [go to definition](https://code.visualstudio.com/docs/editor/editingevolved#_go-to-definition)
   and peek definition features.")

(defn provide-definition
  "Provide the definition of the symbol at the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Definition | LocationLink[]>` - A definition or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [definition-provider document position token]
  (.provideDefinition ^js definition-provider document position token))
