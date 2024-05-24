(ns dots.vscode.inline-completion-list
  "Represents a collection of {@link InlineCompletionItem inline completion items} to be presented
   in the editor.")

(defn items
  "The inline completion items.
   
   **Returns:** `InlineCompletionItem[]`"
  ^js [inline-completion-list]
  (.-items ^js inline-completion-list))

(defn set-items!
  "The inline completion items."
  ^js [inline-completion-list value]
  (set! (.-items ^js inline-completion-list) value))
