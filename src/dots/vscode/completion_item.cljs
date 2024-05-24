(ns dots.vscode.completion-item
  "A completion item represents a text snippet that is proposed to complete text that is being typed.
   
   It is sufficient to create a completion item from just a {@link CompletionItem.label label}. In that
   case the completion item will replace the {@link TextDocument.getWordRangeAtPosition word}
   until the cursor with the given label or {@link CompletionItem.insertText insertText}. Otherwise the
   given {@link CompletionItem.textEdit edit} is used.
   
   When selecting a completion item in the editor its defined or synthesized text edit will be applied
   to *all* cursors/selections whereas {@link CompletionItem.additionalTextEdits additionalTextEdits} will be
   applied as provided."
  (:refer-clojure :exclude [range]))

(defn label
  "The label of this completion item. By default
   this is also the text that is inserted when selecting
   this completion.
   
   **Returns:** `string | CompletionItemLabel`"
  ^js [completion-item]
  (.-label ^js completion-item))

(defn set-label!
  "The label of this completion item. By default
   this is also the text that is inserted when selecting
   this completion."
  ^js [completion-item value]
  (set! (.-label ^js completion-item) value))

(defn kind
  "The kind of this completion item. Based on the kind
   an icon is chosen by the editor.
   
   **Returns:** `CompletionItemKind | undefined`"
  ^js [completion-item]
  (.-kind ^js completion-item))

(defn set-kind!
  "The kind of this completion item. Based on the kind
   an icon is chosen by the editor."
  ^js [completion-item value]
  (set! (.-kind ^js completion-item) value))

(defn tags
  "Tags for this completion item.
   
   **Returns:** `readonly CompletionItemTag[] | undefined`"
  ^js [completion-item]
  (.-tags ^js completion-item))

(defn set-tags!
  "Tags for this completion item."
  ^js [completion-item value]
  (set! (.-tags ^js completion-item) value))

(defn detail
  "A human-readable string with additional information
   about this item, like type or symbol information.
   
   **Returns:** `string | undefined`"
  ^js [completion-item]
  (.-detail ^js completion-item))

(defn set-detail!
  "A human-readable string with additional information
   about this item, like type or symbol information."
  ^js [completion-item value]
  (set! (.-detail ^js completion-item) value))

(defn documentation
  "A human-readable string that represents a doc-comment.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [completion-item]
  (.-documentation ^js completion-item))

(defn set-documentation!
  "A human-readable string that represents a doc-comment."
  ^js [completion-item value]
  (set! (.-documentation ^js completion-item) value))

(defn sort-text
  "A string that should be used when comparing this item
   with other items. When `falsy` the {@link CompletionItem.label label}
   is used.
   
   Note that `sortText` is only used for the initial ordering of completion
   items. When having a leading word (prefix) ordering is based on how
   well completions match that prefix and the initial ordering is only used
   when completions match equally well. The prefix is defined by the
   {@linkcode CompletionItem.range range}-property and can therefore be different
   for each completion.
   
   **Returns:** `string | undefined`"
  ^js [completion-item]
  (.-sortText ^js completion-item))

(defn set-sort-text!
  "A string that should be used when comparing this item
   with other items. When `falsy` the {@link CompletionItem.label label}
   is used.
   
   Note that `sortText` is only used for the initial ordering of completion
   items. When having a leading word (prefix) ordering is based on how
   well completions match that prefix and the initial ordering is only used
   when completions match equally well. The prefix is defined by the
   {@linkcode CompletionItem.range range}-property and can therefore be different
   for each completion."
  ^js [completion-item value]
  (set! (.-sortText ^js completion-item) value))

(defn filter-text
  "A string that should be used when filtering a set of
   completion items. When `falsy` the {@link CompletionItem.label label}
   is used.
   
   Note that the filter text is matched against the leading word (prefix) which is defined
   by the {@linkcode CompletionItem.range range}-property.
   
   **Returns:** `string | undefined`"
  ^js [completion-item]
  (.-filterText ^js completion-item))

(defn set-filter-text!
  "A string that should be used when filtering a set of
   completion items. When `falsy` the {@link CompletionItem.label label}
   is used.
   
   Note that the filter text is matched against the leading word (prefix) which is defined
   by the {@linkcode CompletionItem.range range}-property."
  ^js [completion-item value]
  (set! (.-filterText ^js completion-item) value))

(defn preselect?
  "Select this item when showing. *Note* that only one completion item can be selected and
   that the editor decides which item that is. The rule is that the *first* item of those
   that match best is selected.
   
   **Returns:** `boolean | undefined`"
  ^js [completion-item]
  (.-preselect ^js completion-item))

(defn set-preselect!
  "Select this item when showing. *Note* that only one completion item can be selected and
   that the editor decides which item that is. The rule is that the *first* item of those
   that match best is selected."
  ^js [completion-item value]
  (set! (.-preselect ^js completion-item) value))

(defn insert-text
  "A string or snippet that should be inserted in a document when selecting
   this completion. When `falsy` the {@link CompletionItem.label label}
   is used.
   
   **Returns:** `string | SnippetString | undefined`"
  ^js [completion-item]
  (.-insertText ^js completion-item))

(defn set-insert-text!
  "A string or snippet that should be inserted in a document when selecting
   this completion. When `falsy` the {@link CompletionItem.label label}
   is used."
  ^js [completion-item value]
  (set! (.-insertText ^js completion-item) value))

(defn range
  "A range or a insert and replace range selecting the text that should be replaced by this completion item.
   
   When omitted, the range of the {@link TextDocument.getWordRangeAtPosition current word} is used as replace-range
   and as insert-range the start of the {@link TextDocument.getWordRangeAtPosition current word} to the
   current position is used.
   
   *Note 1:* A range must be a {@link Range.isSingleLine single line} and it must
   {@link Range.contains contain} the position at which completion has been {@link CompletionItemProvider.provideCompletionItems requested}.
   *Note 2:* A insert range must be a prefix of a replace range, that means it must be contained and starting at the same position.
   
   **Returns:** `Range | { inserting: Range; replacing: Range; } | undefined`"
  ^js [completion-item]
  (.-range ^js completion-item))

(defn set-range!
  "A range or a insert and replace range selecting the text that should be replaced by this completion item.
   
   When omitted, the range of the {@link TextDocument.getWordRangeAtPosition current word} is used as replace-range
   and as insert-range the start of the {@link TextDocument.getWordRangeAtPosition current word} to the
   current position is used.
   
   *Note 1:* A range must be a {@link Range.isSingleLine single line} and it must
   {@link Range.contains contain} the position at which completion has been {@link CompletionItemProvider.provideCompletionItems requested}.
   *Note 2:* A insert range must be a prefix of a replace range, that means it must be contained and starting at the same position."
  ^js [completion-item value]
  (set! (.-range ^js completion-item) value))

(defn commit-characters
  "An optional set of characters that when pressed while this completion is active will accept it first and
   then type that character. *Note* that all commit characters should have `length=1` and that superfluous
   characters will be ignored.
   
   **Returns:** `string[] | undefined`"
  ^js [completion-item]
  (.-commitCharacters ^js completion-item))

(defn set-commit-characters!
  "An optional set of characters that when pressed while this completion is active will accept it first and
   then type that character. *Note* that all commit characters should have `length=1` and that superfluous
   characters will be ignored."
  ^js [completion-item value]
  (set! (.-commitCharacters ^js completion-item) value))

(defn keep-whitespace?
  "Keep whitespace of the {@link CompletionItem.insertText insertText} as is. By default, the editor adjusts leading
   whitespace of new lines so that they match the indentation of the line for which the item is accepted - setting
   this to `true` will prevent that.
   
   **Returns:** `boolean | undefined`"
  ^js [completion-item]
  (.-keepWhitespace ^js completion-item))

(defn set-keep-whitespace!
  "Keep whitespace of the {@link CompletionItem.insertText insertText} as is. By default, the editor adjusts leading
   whitespace of new lines so that they match the indentation of the line for which the item is accepted - setting
   this to `true` will prevent that."
  ^js [completion-item value]
  (set! (.-keepWhitespace ^js completion-item) value))

(defn text-edit
  "**Returns:** `TextEdit | undefined`"
  ^js [completion-item]
  (.-textEdit ^js completion-item))

(defn set-text-edit!
  ^js [completion-item value]
  (set! (.-textEdit ^js completion-item) value))

(defn additional-text-edits
  "An optional array of additional {@link TextEdit text edits} that are applied when
   selecting this completion. Edits must not overlap with the main {@link CompletionItem.textEdit edit}
   nor with themselves.
   
   **Returns:** `TextEdit[] | undefined`"
  ^js [completion-item]
  (.-additionalTextEdits ^js completion-item))

(defn set-additional-text-edits!
  "An optional array of additional {@link TextEdit text edits} that are applied when
   selecting this completion. Edits must not overlap with the main {@link CompletionItem.textEdit edit}
   nor with themselves."
  ^js [completion-item value]
  (set! (.-additionalTextEdits ^js completion-item) value))

(defn command
  "An optional {@link Command } that is executed *after* inserting this completion. *Note* that
   additional modifications to the current document should be described with the
   {@link CompletionItem.additionalTextEdits additionalTextEdits}-property.
   
   **Returns:** `Command | undefined`"
  ^js [completion-item]
  (.-command ^js completion-item))

(defn set-command!
  "An optional {@link Command } that is executed *after* inserting this completion. *Note* that
   additional modifications to the current document should be described with the
   {@link CompletionItem.additionalTextEdits additionalTextEdits}-property."
  ^js [completion-item value]
  (set! (.-command ^js completion-item) value))
