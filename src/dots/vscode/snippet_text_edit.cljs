(ns dots.vscode.snippet-text-edit
  "A snippet edit represents an interactive edit that is performed by
   the editor.
   
   *Note* that a snippet edit can always be performed as a normal {@link TextEdit text edit}.
   This will happen when no matching editor is open or when a {@link WorkspaceEdit workspace edit}
   contains snippet edits for multiple files. In that case only those that match the active editor
   will be performed as snippet edits and the others as normal text edits."
  (:refer-clojure :exclude [range replace])
  (:require ["vscode" :as vscode]))

(defn range
  "The range this edit applies to.
   
   **Returns:** `Range`"
  ^js [snippet-text-edit]
  (.-range ^js snippet-text-edit))

(defn set-range!
  "The range this edit applies to."
  ^js [snippet-text-edit value]
  (set! (.-range ^js snippet-text-edit) value))

(defn snippet
  "The {@link SnippetString snippet} this edit will perform.
   
   **Returns:** `SnippetString`"
  ^js [snippet-text-edit]
  (.-snippet ^js snippet-text-edit))

(defn set-snippet!
  "The {@link SnippetString snippet} this edit will perform."
  ^js [snippet-text-edit value]
  (set! (.-snippet ^js snippet-text-edit) value))

(defn replace
  "Utility to create a replace snippet edit.
   
   **Parameters:**
   - `range`: `Range` - A range.
   - `snippet`: `SnippetString` - A snippet string.
   
   **Returns:** `SnippetTextEdit` - A new snippet edit object."
  ^js [range snippet]
  (.replace vscode/SnippetTextEdit range snippet))

(defn insert
  "Utility to create an insert snippet edit.
   
   **Parameters:**
   - `position`: `Position` - A position, will become an empty range.
   - `snippet`: `SnippetString` - A snippet string.
   
   **Returns:** `SnippetTextEdit` - A new snippet edit object."
  ^js [position snippet]
  (.insert vscode/SnippetTextEdit position snippet))
