(ns dots.vscode.terminal
  "An individual terminal instance within the integrated terminal."
  (:refer-clojure :exclude [name]))

(defn name
  "The name of the terminal.
   
   **Returns:** `string`"
  ^js [terminal]
  (.-name ^js terminal))

(defn process-id
  "The process ID of the shell process.
   
   **Returns:** `Thenable<number | undefined>`"
  ^js [terminal]
  (.-processId ^js terminal))

(defn creation-options
  "The object used to initialize the terminal, this is useful for example to detecting the
   shell type of when the terminal was not launched by this extension or for detecting what
   folder the shell was launched in.
   
   **Returns:** `Readonly<TerminalOptions | ExtensionTerminalOptions>`"
  ^js [terminal]
  (.-creationOptions ^js terminal))

(defn exit-status
  "The exit status of the terminal, this will be undefined while the terminal is active.
   
   **Example:** Show a notification with the exit code when the terminal exits with a
   non-zero exit code.
   ```typescript
   window.onDidCloseTerminal(t => {
     if (t.exitStatus && t.exitStatus.code) {
     	vscode.window.showInformationMessage(`Exit code: ${t.exitStatus.code}`);
     }
   });
   ```
   
   **Returns:** `TerminalExitStatus | undefined`"
  ^js [terminal]
  (.-exitStatus ^js terminal))

(defn state
  "The current state of the {@link Terminal }.
   
   **Returns:** `TerminalState`"
  ^js [terminal]
  (.-state ^js terminal))

(defn send-text
  "Send text to the terminal. The text is written to the stdin of the underlying pty process
   (shell) of the terminal.
   
   **Parameters:**
   - `text`: `string` - The text to send.
   - `should-execute?`: `boolean | undefined` - Indicates that the text being sent should be executed rather than just inserted in the terminal.
   The character(s) added are `\\n` or `\\r\\n`, depending on the platform. This defaults to `true`.
   
   **Returns:** `void`"
  (^js [terminal text]
   (.sendText ^js terminal text))
  (^js [terminal text should-execute?]
   (.sendText ^js terminal text should-execute?)))

(defn show
  "Show the terminal panel and reveal this terminal in the UI.
   
   **Parameters:**
   - `preserve-focus?`: `boolean | undefined` - When `true` the terminal will not take focus.
   
   **Returns:** `void`"
  (^js [terminal]
   (.show ^js terminal))
  (^js [terminal preserve-focus?]
   (.show ^js terminal preserve-focus?)))

(defn hide
  "Hide the terminal panel if this terminal is currently showing.
   
   **Returns:** `void`"
  ^js [terminal]
  (.hide ^js terminal))

(defn dispose
  "Dispose and free associated resources.
   
   **Returns:** `void`"
  ^js [terminal]
  (.dispose ^js terminal))
