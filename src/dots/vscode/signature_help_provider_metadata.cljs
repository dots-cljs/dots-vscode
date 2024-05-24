(ns dots.vscode.signature-help-provider-metadata
  "Metadata about a registered {@linkcode SignatureHelpProvider }.")

(defn trigger-characters
  "List of characters that trigger signature help.
   
   **Returns:** `readonly string[]`"
  ^js [signature-help-provider-metadata]
  (.-triggerCharacters ^js signature-help-provider-metadata))

(defn retrigger-characters
  "List of characters that re-trigger signature help.
   
   These trigger characters are only active when signature help is already showing. All trigger characters
   are also counted as re-trigger characters.
   
   **Returns:** `readonly string[]`"
  ^js [signature-help-provider-metadata]
  (.-retriggerCharacters ^js signature-help-provider-metadata))
