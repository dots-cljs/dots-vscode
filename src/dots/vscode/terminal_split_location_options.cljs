(ns dots.vscode.terminal-split-location-options
  "Uses the parent {@link Terminal }'s location for the terminal")

(defn parent-terminal
  "The parent terminal to split this terminal beside. This works whether the parent terminal
   is in the panel or the editor area.
   
   **Returns:** `Terminal`"
  ^js [terminal-split-location-options]
  (.-parentTerminal ^js terminal-split-location-options))

(defn set-parent-terminal!
  "The parent terminal to split this terminal beside. This works whether the parent terminal
   is in the panel or the editor area."
  ^js [terminal-split-location-options value]
  (set! (.-parentTerminal ^js terminal-split-location-options) value))
