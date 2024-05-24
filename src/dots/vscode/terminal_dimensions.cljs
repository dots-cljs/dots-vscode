(ns dots.vscode.terminal-dimensions
  "Represents the dimensions of a terminal.")

(defn columns
  "The number of columns in the terminal.
   
   **Returns:** `number`"
  ^js [terminal-dimensions]
  (.-columns ^js terminal-dimensions))

(defn rows
  "The number of rows in the terminal.
   
   **Returns:** `number`"
  ^js [terminal-dimensions]
  (.-rows ^js terminal-dimensions))
