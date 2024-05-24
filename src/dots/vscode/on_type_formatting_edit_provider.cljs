(ns dots.vscode.on-type-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-on-type-formatting-edits
  "Provide formatting edits after a character has been typed.
   
   The given position and character should hint to the provider
   what range the position to expand to, like find the matching `{`
   when `}` has been entered.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `ch`: `string` - The character that has been typed.
   - `options`: `FormattingOptions` - Options controlling formatting.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<TextEdit[]>` - A set of text edits or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined`, `null`, or an empty array."
  ^js [on-type-formatting-edit-provider document position ch options token]
  (.provideOnTypeFormattingEdits ^js on-type-formatting-edit-provider document position ch options token))
