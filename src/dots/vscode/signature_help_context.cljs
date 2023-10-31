(ns dots.vscode.signature-help-context
  "Additional information about the context in which a
   {@linkcode SignatureHelpProvider.provideSignatureHelp SignatureHelpProvider} was triggered.")

(defn trigger-kind
  "Action that caused signature help to be triggered."
  ^js [signature-help-context]
  (.-triggerKind ^js signature-help-context))

(defn trigger-character
  "Character that caused signature help to be triggered.
   
   This is `undefined` when signature help is not triggered by typing, such as when manually invoking
   signature help or when moving the cursor."
  ^js [signature-help-context]
  (.-triggerCharacter ^js signature-help-context))

(defn retrigger?
  "`true` if signature help was already showing when it was triggered.
   
   Retriggers occur when the signature help is already active and can be caused by actions such as
   typing a trigger character, a cursor move, or document content changes."
  ^js [signature-help-context]
  (.-isRetrigger ^js signature-help-context))

(defn active-signature-help
  "The currently active {@linkcode SignatureHelp }.
   
   The `activeSignatureHelp` has its [`SignatureHelp.activeSignature`] field updated based on
   the user arrowing through available signatures."
  ^js [signature-help-context]
  (.-activeSignatureHelp ^js signature-help-context))
