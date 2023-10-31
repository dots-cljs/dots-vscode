(ns dots.vscode.terminal-options
  "Value-object describing what options a terminal should use."
  (:refer-clojure :exclude [name]))

(defn name
  "A human-readable string which will be used to represent the terminal in the UI."
  ^js [terminal-options]
  (.-name ^js terminal-options))

(defn set-name!
  "A human-readable string which will be used to represent the terminal in the UI."
  ^js [terminal-options value]
  (set! (.-name ^js terminal-options) value))

(defn shell-path
  "A path to a custom shell executable to be used in the terminal."
  ^js [terminal-options]
  (.-shellPath ^js terminal-options))

(defn set-shell-path!
  "A path to a custom shell executable to be used in the terminal."
  ^js [terminal-options value]
  (set! (.-shellPath ^js terminal-options) value))

(defn shell-args
  "Args for the custom shell executable. A string can be used on Windows only which allows
   specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6)."
  ^js [terminal-options]
  (.-shellArgs ^js terminal-options))

(defn set-shell-args!
  "Args for the custom shell executable. A string can be used on Windows only which allows
   specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6)."
  ^js [terminal-options value]
  (set! (.-shellArgs ^js terminal-options) value))

(defn cwd
  "A path or Uri for the current working directory to be used for the terminal."
  ^js [terminal-options]
  (.-cwd ^js terminal-options))

(defn set-cwd!
  "A path or Uri for the current working directory to be used for the terminal."
  ^js [terminal-options value]
  (set! (.-cwd ^js terminal-options) value))

(defn env
  "Object with environment variables that will be added to the editor process."
  ^js [terminal-options]
  (.-env ^js terminal-options))

(defn set-env!
  "Object with environment variables that will be added to the editor process."
  ^js [terminal-options value]
  (set! (.-env ^js terminal-options) value))

(defn strict-env?
  "Whether the terminal process environment should be exactly as provided in
   `TerminalOptions.env`. When this is false (default), the environment will be based on the
   window's environment and also apply configured platform settings like
   `terminal.integrated.windows.env` on top. When this is true, the complete environment
   must be provided as nothing will be inherited from the process or any configuration."
  ^js [terminal-options]
  (.-strictEnv ^js terminal-options))

(defn set-strict-env!
  "Whether the terminal process environment should be exactly as provided in
   `TerminalOptions.env`. When this is false (default), the environment will be based on the
   window's environment and also apply configured platform settings like
   `terminal.integrated.windows.env` on top. When this is true, the complete environment
   must be provided as nothing will be inherited from the process or any configuration."
  ^js [terminal-options value]
  (set! (.-strictEnv ^js terminal-options) value))

(defn hide-from-user?
  "When enabled the terminal will run the process as normal but not be surfaced to the user
   until `Terminal.show` is called. The typical usage for this is when you need to run
   something that may need interactivity but only want to tell the user about it when
   interaction is needed. Note that the terminals will still be exposed to all extensions
   as normal."
  ^js [terminal-options]
  (.-hideFromUser ^js terminal-options))

(defn set-hide-from-user!
  "When enabled the terminal will run the process as normal but not be surfaced to the user
   until `Terminal.show` is called. The typical usage for this is when you need to run
   something that may need interactivity but only want to tell the user about it when
   interaction is needed. Note that the terminals will still be exposed to all extensions
   as normal."
  ^js [terminal-options value]
  (set! (.-hideFromUser ^js terminal-options) value))

(defn message
  "A message to write to the terminal on first launch, note that this is not sent to the
   process but, rather written directly to the terminal. This supports escape sequences such
   a setting text style."
  ^js [terminal-options]
  (.-message ^js terminal-options))

(defn set-message!
  "A message to write to the terminal on first launch, note that this is not sent to the
   process but, rather written directly to the terminal. This supports escape sequences such
   a setting text style."
  ^js [terminal-options value]
  (set! (.-message ^js terminal-options) value))

(defn icon-path
  "The icon path or {@link ThemeIcon } for the terminal."
  ^js [terminal-options]
  (.-iconPath ^js terminal-options))

(defn set-icon-path!
  "The icon path or {@link ThemeIcon } for the terminal."
  ^js [terminal-options value]
  (set! (.-iconPath ^js terminal-options) value))

(defn color
  "The icon {@link ThemeColor } for the terminal.
   The `terminal.ansi*` theme keys are
   recommended for the best contrast and consistency across themes."
  ^js [terminal-options]
  (.-color ^js terminal-options))

(defn set-color!
  "The icon {@link ThemeColor } for the terminal.
   The `terminal.ansi*` theme keys are
   recommended for the best contrast and consistency across themes."
  ^js [terminal-options value]
  (set! (.-color ^js terminal-options) value))

(defn location
  "The {@link TerminalLocation } or {@link TerminalEditorLocationOptions } or {@link TerminalSplitLocationOptions } for the terminal."
  ^js [terminal-options]
  (.-location ^js terminal-options))

(defn set-location!
  "The {@link TerminalLocation } or {@link TerminalEditorLocationOptions } or {@link TerminalSplitLocationOptions } for the terminal."
  ^js [terminal-options value]
  (set! (.-location ^js terminal-options) value))

(defn transient?
  "Opt-out of the default terminal persistence on restart and reload.
   This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled."
  ^js [terminal-options]
  (.-isTransient ^js terminal-options))

(defn set-is-transient!
  "Opt-out of the default terminal persistence on restart and reload.
   This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled."
  ^js [terminal-options value]
  (set! (.-isTransient ^js terminal-options) value))
