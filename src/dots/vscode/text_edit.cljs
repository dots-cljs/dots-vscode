(ns dots.vscode.text-edit
  "A text edit represents edits that should be applied
   to a document."
  (:refer-clojure :exclude [range replace])
  (:require ["vscode" :as vscode]))

(defn range
  "The range this edit applies to."
  ^js [text-edit]
  (.-range ^js text-edit))

(defn set-range!
  "The range this edit applies to."
  ^js [text-edit value]
  (set! (.-range ^js text-edit) value))

(defn new-text
  "The string this edit will insert."
  ^js [text-edit]
  (.-newText ^js text-edit))

(defn set-new-text!
  "The string this edit will insert."
  ^js [text-edit value]
  (set! (.-newText ^js text-edit) value))

(defn new-eol
  "The eol-sequence used in the document.
   
   *Note* that the eol-sequence will be applied to the
   whole document."
  ^js [text-edit]
  (.-newEol ^js text-edit))

(defn set-new-eol!
  "The eol-sequence used in the document.
   
   *Note* that the eol-sequence will be applied to the
   whole document."
  ^js [text-edit value]
  (set! (.-newEol ^js text-edit) value))

(defn replace
  "Utility to create a replace edit.
   
   **Parameters:**
   - `range`: `Range` - A range.
   - `new-text`: `string` - A string.
   
   **Returns:** `TextEdit` - A new text edit object."
  ^js [range new-text]
  (.replace vscode/TextEdit range new-text))

(defn insert
  "Utility to create an insert edit.
   
   **Parameters:**
   - `position`: `Position` - A position, will become an empty range.
   - `new-text`: `string` - A string.
   
   **Returns:** `TextEdit` - A new text edit object."
  ^js [position new-text]
  (.insert vscode/TextEdit position new-text))

(defn delete
  "Utility to create a delete edit.
   
   **Parameters:**
   - `range`: `Range` - A range.
   
   **Returns:** `TextEdit` - A new text edit object."
  ^js [range]
  (.delete vscode/TextEdit range))

(defn set-end-of-line
  "Utility to create an eol-edit.
   
   **Parameters:**
   - `eol`: `EndOfLine` - An eol-sequence
   
   **Returns:** `TextEdit` - A new text edit object."
  ^js [eol]
  (.setEndOfLine vscode/TextEdit eol))
