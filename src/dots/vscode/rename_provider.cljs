(ns dots.vscode.rename-provider
  "The rename provider interface defines the contract between extensions and
   the [rename](https://code.visualstudio.com/docs/editor/editingevolved#_rename-symbol)-feature.")

(defn provide-rename-edits
  "Provide an edit that describes changes that have to be made to one
   or many resources to rename a symbol to a different name.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `new-name`: `string` - The new name of the symbol. If the given name is not valid, the provider must return a rejected promise.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<WorkspaceEdit>` - A workspace edit or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [rename-provider document position new-name token]
  (.provideRenameEdits ^js rename-provider document position new-name token))

(defn prepare-rename
  "Optional function for resolving and validating a position *before* running rename. The result can
   be a range or a range and a placeholder text. The placeholder text should be the identifier of the symbol
   which is being renamed - when omitted the text in the returned range is used.
   
   *Note:* This function should throw an error or return a rejected thenable when the provided location
   doesn't allow for a rename.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which rename will be invoked.
   - `position`: `Position` - The position at which rename will be invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<Range | { range: Range; placeholder: string; }>` - The range or range and placeholder text of the identifier that is to be renamed. The lack of a result can signaled by returning `undefined` or `null`."
  ^js [rename-provider document position token]
  (.prepareRename ^js rename-provider document position token))
