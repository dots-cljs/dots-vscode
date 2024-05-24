(ns dots.vscode.reference-provider
  "The reference provider interface defines the contract between extensions and
   the [find references](https://code.visualstudio.com/docs/editor/editingevolved#_peek)-feature.")

(defn provide-references
  "Provide a set of project-wide references for the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `context`: `ReferenceContext`
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Location[]>` - An array of locations or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [reference-provider document position context token]
  (.provideReferences ^js reference-provider document position context token))
