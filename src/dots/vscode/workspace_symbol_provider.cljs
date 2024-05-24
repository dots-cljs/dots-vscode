(ns dots.vscode.workspace-symbol-provider
  "The workspace symbol provider interface defines the contract between extensions and
   the [symbol search](https://code.visualstudio.com/docs/editor/editingevolved#_open-symbol-by-name)-feature.")

(defn provide-workspace-symbols
  "Project-wide search for a symbol matching the given query string.
   
   The `query`-parameter should be interpreted in a *relaxed way* as the editor will apply its own highlighting
   and scoring on the results. A good rule of thumb is to match case-insensitive and to simply check that the
   characters of *query* appear in their order in a candidate symbol. Don't use prefix, substring, or similar
   strict matching.
   
   To improve performance implementors can implement `resolveWorkspaceSymbol` and then provide symbols with partial
   {@link SymbolInformation.location location}-objects, without a `range` defined. The editor will then call
   `resolveWorkspaceSymbol` for selected symbols only, e.g. when opening a workspace symbol.
   
   **Parameters:**
   - `query`: `string` - A query string, can be the empty string in which case all symbols should be returned.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T[]>` - An array of document highlights or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [workspace-symbol-provider query token]
  (.provideWorkspaceSymbols ^js workspace-symbol-provider query token))

(defn resolve-workspace-symbol
  "Given a symbol fill in its {@link SymbolInformation.location location}. This method is called whenever a symbol
   is selected in the UI. Providers can implement this method and return incomplete symbols from
   {@linkcode WorkspaceSymbolProvider.provideWorkspaceSymbols provideWorkspaceSymbols} which often helps to improve
   performance.
   
   **Parameters:**
   - `symbol`: `T` - The symbol that is to be resolved. Guaranteed to be an instance of an object returned from an
   earlier call to `provideWorkspaceSymbols`.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<T>` - The resolved symbol or a thenable that resolves to that. When no result is returned,
   the given `symbol` is used."
  ^js [workspace-symbol-provider symbol token]
  (.resolveWorkspaceSymbol ^js workspace-symbol-provider symbol token))
