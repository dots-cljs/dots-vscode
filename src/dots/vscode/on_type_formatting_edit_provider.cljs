(ns dots.vscode.on-type-formatting-edit-provider
  "The document formatting provider interface defines the contract between extensions and
   the formatting-feature.")

(defn provide-on-type-formatting-edits
  "Provide formatting edits after a character has been typed.
   
   The given position and character should hint to the provider
   what range the position to expand to, like find the matching `{`
   when `}` has been entered."
  ^js [on-type-formatting-edit-provider document position ch options token]
  (.provideOnTypeFormattingEdits ^js on-type-formatting-edit-provider document position ch options token))
