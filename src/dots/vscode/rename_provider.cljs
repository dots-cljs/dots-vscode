(ns dots.vscode.rename-provider
  "The rename provider interface defines the contract between extensions and
   the [rename](https://code.visualstudio.com/docs/editor/editingevolved#_rename-symbol)-feature.")

(defn provide-rename-edits
  "Provide an edit that describes changes that have to be made to one
   or many resources to rename a symbol to a different name."
  ^js [rename-provider document position new-name token]
  (.provideRenameEdits ^js rename-provider document position new-name token))

(defn prepare-rename
  "Optional function for resolving and validating a position *before* running rename. The result can
   be a range or a range and a placeholder text. The placeholder text should be the identifier of the symbol
   which is being renamed - when omitted the text in the returned range is used.
   
   *Note:* This function should throw an error or return a rejected thenable when the provided location
   doesn't allow for a rename."
  ^js [rename-provider document position token]
  (.prepareRename ^js rename-provider document position token))
