(ns dots.vscode.extension-terminal-options
  "Value-object describing what options a virtual process terminal should use."
  (:refer-clojure :exclude [name]))

(defn name
  "A human-readable string which will be used to represent the terminal in the UI.
   
   **Returns:** `string`"
  ^js [extension-terminal-options]
  (.-name ^js extension-terminal-options))

(defn set-name!
  "A human-readable string which will be used to represent the terminal in the UI."
  ^js [extension-terminal-options value]
  (set! (.-name ^js extension-terminal-options) value))

(defn pty
  "An implementation of {@link Pseudoterminal } that allows an extension to
   control a terminal.
   
   **Returns:** `Pseudoterminal`"
  ^js [extension-terminal-options]
  (.-pty ^js extension-terminal-options))

(defn set-pty!
  "An implementation of {@link Pseudoterminal } that allows an extension to
   control a terminal."
  ^js [extension-terminal-options value]
  (set! (.-pty ^js extension-terminal-options) value))

(defn icon-path
  "The icon path or {@link ThemeIcon } for the terminal.
   
   **Returns:** `Uri | ThemeIcon | { light: Uri; dark: Uri; } | undefined`"
  ^js [extension-terminal-options]
  (.-iconPath ^js extension-terminal-options))

(defn set-icon-path!
  "The icon path or {@link ThemeIcon } for the terminal."
  ^js [extension-terminal-options value]
  (set! (.-iconPath ^js extension-terminal-options) value))

(defn color
  "The icon {@link ThemeColor } for the terminal.
   The standard `terminal.ansi*` theme keys are
   recommended for the best contrast and consistency across themes.
   
   **Returns:** `ThemeColor | undefined`"
  ^js [extension-terminal-options]
  (.-color ^js extension-terminal-options))

(defn set-color!
  "The icon {@link ThemeColor } for the terminal.
   The standard `terminal.ansi*` theme keys are
   recommended for the best contrast and consistency across themes."
  ^js [extension-terminal-options value]
  (set! (.-color ^js extension-terminal-options) value))

(defn location
  "The {@link TerminalLocation } or {@link TerminalEditorLocationOptions } or {@link TerminalSplitLocationOptions } for the terminal.
   
   **Returns:** `TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions | undefined`"
  ^js [extension-terminal-options]
  (.-location ^js extension-terminal-options))

(defn set-location!
  "The {@link TerminalLocation } or {@link TerminalEditorLocationOptions } or {@link TerminalSplitLocationOptions } for the terminal."
  ^js [extension-terminal-options value]
  (set! (.-location ^js extension-terminal-options) value))

(defn transient?
  "Opt-out of the default terminal persistence on restart and reload.
   This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
   
   **Returns:** `boolean | undefined`"
  ^js [extension-terminal-options]
  (.-isTransient ^js extension-terminal-options))

(defn set-is-transient!
  "Opt-out of the default terminal persistence on restart and reload.
   This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled."
  ^js [extension-terminal-options value]
  (set! (.-isTransient ^js extension-terminal-options) value))
