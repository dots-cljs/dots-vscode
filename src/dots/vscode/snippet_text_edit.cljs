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
  "The range this edit applies to."
  ^js [snippet-text-edit]
  (.-range ^js snippet-text-edit))

(defn set-range!
  "The range this edit applies to."
  ^js [snippet-text-edit value]
  (set! (.-range ^js snippet-text-edit) value))

(defn snippet
  "The {@link SnippetString snippet} this edit will perform."
  ^js [snippet-text-edit]
  (.-snippet ^js snippet-text-edit))

(defn set-snippet!
  "The {@link SnippetString snippet} this edit will perform."
  ^js [snippet-text-edit value]
  (set! (.-snippet ^js snippet-text-edit) value))

(defn replace
  "Utility to create a replace snippet edit."
  ^js [range snippet]
  (.replace vscode/SnippetTextEdit range snippet))

(defn insert
  "Utility to create an insert snippet edit."
  ^js [position snippet]
  (.insert vscode/SnippetTextEdit position snippet))
