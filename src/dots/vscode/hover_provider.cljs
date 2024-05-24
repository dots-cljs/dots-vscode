(ns dots.vscode.hover-provider
  "The hover provider interface defines the contract between extensions and
   the [hover](https://code.visualstudio.com/docs/editor/intellisense)-feature.")

(defn provide-hover
  "Provide a hover for the given position and document. Multiple hovers at the same
   position will be merged by the editor. A hover can have a range which defaults
   to the word range at the position when omitted.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Hover>` - A hover or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [hover-provider document position token]
  (.provideHover ^js hover-provider document position token))
