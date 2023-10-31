(ns dots.vscode.completion-item-label
  "A structured label for a {@link CompletionItem completion item}.")

(defn label
  "The label of this completion item.
   
   By default this is also the text that is inserted when this completion is selected."
  ^js [completion-item-label]
  (.-label ^js completion-item-label))

(defn set-label!
  "The label of this completion item.
   
   By default this is also the text that is inserted when this completion is selected."
  ^js [completion-item-label value]
  (set! (.-label ^js completion-item-label) value))

(defn detail
  "An optional string which is rendered less prominently directly after {@link CompletionItemLabel.label label},
   without any spacing. Should be used for function signatures or type annotations."
  ^js [completion-item-label]
  (.-detail ^js completion-item-label))

(defn set-detail!
  "An optional string which is rendered less prominently directly after {@link CompletionItemLabel.label label},
   without any spacing. Should be used for function signatures or type annotations."
  ^js [completion-item-label value]
  (set! (.-detail ^js completion-item-label) value))

(defn description
  "An optional string which is rendered less prominently after {@link CompletionItemLabel.detail }. Should be used
   for fully qualified names or file path."
  ^js [completion-item-label]
  (.-description ^js completion-item-label))

(defn set-description!
  "An optional string which is rendered less prominently after {@link CompletionItemLabel.detail }. Should be used
   for fully qualified names or file path."
  ^js [completion-item-label value]
  (set! (.-description ^js completion-item-label) value))
