(ns dots.vscode.terminal-editor-location-options
  "Assumes a {@link TerminalLocation } of editor and allows specifying a {@link ViewColumn } and
   {@link TerminalEditorLocationOptions.preserveFocus preserveFocus } property")

(defn view-column
  "A view column in which the {@link Terminal terminal} should be shown in the editor area.
   The default is the {@link ViewColumn.Active active}. Columns that do not exist
   will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }.
   Use {@linkcode ViewColumn.Beside } to open the editor to the side of the currently
   active one."
  ^js [terminal-editor-location-options]
  (.-viewColumn ^js terminal-editor-location-options))

(defn set-view-column!
  "A view column in which the {@link Terminal terminal} should be shown in the editor area.
   The default is the {@link ViewColumn.Active active}. Columns that do not exist
   will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }.
   Use {@linkcode ViewColumn.Beside } to open the editor to the side of the currently
   active one."
  ^js [terminal-editor-location-options value]
  (set! (.-viewColumn ^js terminal-editor-location-options) value))

(defn preserve-focus?
  "An optional flag that when `true` will stop the {@link Terminal } from taking focus."
  ^js [terminal-editor-location-options]
  (.-preserveFocus ^js terminal-editor-location-options))

(defn set-preserve-focus!
  "An optional flag that when `true` will stop the {@link Terminal } from taking focus."
  ^js [terminal-editor-location-options value]
  (set! (.-preserveFocus ^js terminal-editor-location-options) value))
