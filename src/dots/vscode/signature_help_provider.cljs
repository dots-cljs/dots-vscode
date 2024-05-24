(ns dots.vscode.signature-help-provider
  "The signature help provider interface defines the contract between extensions and
   the [parameter hints](https://code.visualstudio.com/docs/editor/intellisense)-feature.")

(defn provide-signature-help
  "Provide help for the signature at the given position and document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `position`: `Position` - The position at which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   - `context`: `SignatureHelpContext` - Information about how signature help was triggered.
   
   **Returns:** `ProviderResult<SignatureHelp>` - Signature help or a thenable that resolves to such. The lack of a result can be
   signaled by returning `undefined` or `null`."
  ^js [signature-help-provider document position token context]
  (.provideSignatureHelp ^js signature-help-provider document position token context))
