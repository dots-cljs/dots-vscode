(ns dots.vscode.signature-help-provider
  "The signature help provider interface defines the contract between extensions and
   the [parameter hints](https://code.visualstudio.com/docs/editor/intellisense)-feature.")

(defn provide-signature-help
  "Provide help for the signature at the given position and document."
  ^js [signature-help-provider document position token context]
  (.provideSignatureHelp ^js signature-help-provider document position token context))
