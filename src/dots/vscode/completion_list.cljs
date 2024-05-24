(ns dots.vscode.completion-list
  "Represents a collection of {@link CompletionItem completion items} to be presented
   in the editor.")

(defn incomplete?
  "This list is not complete. Further typing should result in recomputing
   this list.
   
   **Returns:** `boolean | undefined`"
  ^js [completion-list]
  (.-isIncomplete ^js completion-list))

(defn set-is-incomplete!
  "This list is not complete. Further typing should result in recomputing
   this list."
  ^js [completion-list value]
  (set! (.-isIncomplete ^js completion-list) value))

(defn items
  "The completion items.
   
   **Returns:** `T[]`"
  ^js [completion-list]
  (.-items ^js completion-list))

(defn set-items!
  "The completion items."
  ^js [completion-list value]
  (set! (.-items ^js completion-list) value))
