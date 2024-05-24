(ns dots.vscode.implementation-provider
  "The implementation provider interface defines the contract between extensions and
   the go to implementation feature.")

(defn provide-implementation
  "Provide the implementations of the symbol at the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Definition | LocationLink[]>` - A definition or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [implementation-provider document position token]
  (.provideImplementation ^js implementation-provider document position token))
