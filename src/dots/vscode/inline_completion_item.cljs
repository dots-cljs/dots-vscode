(ns dots.vscode.inline-completion-item
  "An inline completion item represents a text snippet that is proposed inline to complete text that is being typed."
  (:refer-clojure :exclude [range]))

(defn insert-text
  "The text to replace the range with. Must be set.
   Is used both for the preview and the accept operation.
   
   **Returns:** `string | SnippetString`"
  ^js [inline-completion-item]
  (.-insertText ^js inline-completion-item))

(defn set-insert-text!
  "The text to replace the range with. Must be set.
   Is used both for the preview and the accept operation."
  ^js [inline-completion-item value]
  (set! (.-insertText ^js inline-completion-item) value))

(defn filter-text
  "A text that is used to decide if this inline completion should be shown. When `falsy`
   the {@link InlineCompletionItem.insertText } is used.
   
   An inline completion is shown if the text to replace is a prefix of the filter text.
   
   **Returns:** `string | undefined`"
  ^js [inline-completion-item]
  (.-filterText ^js inline-completion-item))

(defn set-filter-text!
  "A text that is used to decide if this inline completion should be shown. When `falsy`
   the {@link InlineCompletionItem.insertText } is used.
   
   An inline completion is shown if the text to replace is a prefix of the filter text."
  ^js [inline-completion-item value]
  (set! (.-filterText ^js inline-completion-item) value))

(defn range
  "The range to replace.
   Must begin and end on the same line.
   
   Prefer replacements over insertions to provide a better experience when the user deletes typed text.
   
   **Returns:** `Range | undefined`"
  ^js [inline-completion-item]
  (.-range ^js inline-completion-item))

(defn set-range!
  "The range to replace.
   Must begin and end on the same line.
   
   Prefer replacements over insertions to provide a better experience when the user deletes typed text."
  ^js [inline-completion-item value]
  (set! (.-range ^js inline-completion-item) value))

(defn command
  "An optional {@link Command } that is executed *after* inserting this completion.
   
   **Returns:** `Command | undefined`"
  ^js [inline-completion-item]
  (.-command ^js inline-completion-item))

(defn set-command!
  "An optional {@link Command } that is executed *after* inserting this completion."
  ^js [inline-completion-item value]
  (set! (.-command ^js inline-completion-item) value))
