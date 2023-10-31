(ns dots.vscode.workspace-folder-pick-options
  "Options to configure the behaviour of the {@link WorkspaceFolder workspace folder} pick UI.")

(defn place-holder
  "An optional string to show as placeholder in the input box to guide the user what to pick on."
  ^js [workspace-folder-pick-options]
  (.-placeHolder ^js workspace-folder-pick-options))

(defn set-place-holder!
  "An optional string to show as placeholder in the input box to guide the user what to pick on."
  ^js [workspace-folder-pick-options value]
  (set! (.-placeHolder ^js workspace-folder-pick-options) value))

(defn ignore-focus-out?
  "Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [workspace-folder-pick-options]
  (.-ignoreFocusOut ^js workspace-folder-pick-options))

(defn set-ignore-focus-out!
  "Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
   This setting is ignored on iPad and is always false."
  ^js [workspace-folder-pick-options value]
  (set! (.-ignoreFocusOut ^js workspace-folder-pick-options) value))
