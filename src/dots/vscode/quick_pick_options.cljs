(ns dots.vscode.quick-pick-options
  "Options to configure the behavior of the quick pick UI.")

(defn title
  "An optional string that represents the title of the quick pick."
  ^js [quick-pick-options]
  (.-title ^js quick-pick-options))

(defn set-title!
  "An optional string that represents the title of the quick pick."
  ^js [quick-pick-options value]
  (set! (.-title ^js quick-pick-options) value))

(defn match-on-description?
  "An optional flag to include the description when filtering the picks."
  ^js [quick-pick-options]
  (.-matchOnDescription ^js quick-pick-options))

(defn set-match-on-description!
  "An optional flag to include the description when filtering the picks."
  ^js [quick-pick-options value]
  (set! (.-matchOnDescription ^js quick-pick-options) value))

(defn match-on-detail?
  "An optional flag to include the detail when filtering the picks."
  ^js [quick-pick-options]
  (.-matchOnDetail ^js quick-pick-options))

(defn set-match-on-detail!
  "An optional flag to include the detail when filtering the picks."
  ^js [quick-pick-options value]
  (set! (.-matchOnDetail ^js quick-pick-options) value))

(defn place-holder
  "An optional string to show as placeholder in the input box to guide the user what to pick on."
  ^js [quick-pick-options]
  (.-placeHolder ^js quick-pick-options))

(defn set-place-holder!
  "An optional string to show as placeholder in the input box to guide the user what to pick on."
  ^js [quick-pick-options value]
  (set! (.-placeHolder ^js quick-pick-options) value))

(defn ignore-focus-out?
  "Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [quick-pick-options]
  (.-ignoreFocusOut ^js quick-pick-options))

(defn set-ignore-focus-out!
  "Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [quick-pick-options value]
  (set! (.-ignoreFocusOut ^js quick-pick-options) value))

(defn can-pick-many?
  "An optional flag to make the picker accept multiple selections, if true the result is an array of picks."
  ^js [quick-pick-options]
  (.-canPickMany ^js quick-pick-options))

(defn set-can-pick-many!
  "An optional flag to make the picker accept multiple selections, if true the result is an array of picks."
  ^js [quick-pick-options value]
  (set! (.-canPickMany ^js quick-pick-options) value))

(defn on-did-select-item
  "An optional function that is invoked whenever an item is selected."
  ^js [quick-pick-options item]
  (.onDidSelectItem ^js quick-pick-options item))
