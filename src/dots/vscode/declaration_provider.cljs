(ns dots.vscode.declaration-provider
  "The declaration provider interface defines the contract between extensions and
   the go to declaration feature.")

(defn provide-declaration
  "Provide the declaration of the symbol at the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Declaration>` - A declaration or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [declaration-provider document position token]
  (.provideDeclaration ^js declaration-provider document position token))
