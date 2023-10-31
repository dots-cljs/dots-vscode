(ns dots.vscode.window.active-terminal
  "The currently active terminal or `undefined`. The active terminal is the one that
   currently has focus or most recently had focus."
  (:refer-clojure :exclude [name])
  (:require ["vscode" :as vscode]))

(defn name
  "The name of the terminal."
  ^js []
  (.. vscode/window -activeTerminal -name))

(defn process-id
  "The process ID of the shell process."
  ^js []
  (.. vscode/window -activeTerminal -processId))

(defn creation-options
  "The object used to initialize the terminal, this is useful for example to detecting the
   shell type of when the terminal was not launched by this extension or for detecting what
   folder the shell was launched in."
  ^js []
  (.. vscode/window -activeTerminal -creationOptions))

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
   ```"
  ^js []
  (.. vscode/window -activeTerminal -exitStatus))

(defn state
  "The current state of the {@link Terminal }."
  ^js []
  (.. vscode/window -activeTerminal -state))

(defn send-text
  "Send text to the terminal. The text is written to the stdin of the underlying pty process
   (shell) of the terminal."
  (^js [text]
   (.. vscode/window -activeTerminal (sendText text)))
  (^js [text add-new-line?]
   (.. vscode/window -activeTerminal (sendText text add-new-line?))))

(defn show
  "Show the terminal panel and reveal this terminal in the UI."
  (^js []
   (.. vscode/window -activeTerminal (show)))
  (^js [preserve-focus?]
   (.. vscode/window -activeTerminal (show preserve-focus?))))

(defn hide
  "Hide the terminal panel if this terminal is currently showing."
  ^js []
  (.. vscode/window -activeTerminal (hide)))

(defn dispose
  "Dispose and free associated resources."
  ^js []
  (.. vscode/window -activeTerminal (dispose)))
