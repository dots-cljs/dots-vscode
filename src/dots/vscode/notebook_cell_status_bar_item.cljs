(ns dots.vscode.notebook-cell-status-bar-item
  "A contribution to a cell's status bar")

(defn text
  "The text to show for the item.
   
   **Returns:** `string`"
  ^js [notebook-cell-status-bar-item]
  (.-text ^js notebook-cell-status-bar-item))

(defn set-text!
  "The text to show for the item."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-text ^js notebook-cell-status-bar-item) value))

(defn alignment
  "Whether the item is aligned to the left or right.
   
   **Returns:** `NotebookCellStatusBarAlignment`"
  ^js [notebook-cell-status-bar-item]
  (.-alignment ^js notebook-cell-status-bar-item))

(defn set-alignment!
  "Whether the item is aligned to the left or right."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-alignment ^js notebook-cell-status-bar-item) value))

(defn command
  "An optional {@linkcode Command } or identifier of a command to run on click.
   
   The command must be {@link commands.getCommands known}.
   
   Note that if this is a {@linkcode Command } object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
   are used by the editor.
   
   **Returns:** `string | Command | undefined`"
  ^js [notebook-cell-status-bar-item]
  (.-command ^js notebook-cell-status-bar-item))

(defn set-command!
  "An optional {@linkcode Command } or identifier of a command to run on click.
   
   The command must be {@link commands.getCommands known}.
   
   Note that if this is a {@linkcode Command } object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
   are used by the editor."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-command ^js notebook-cell-status-bar-item) value))

(defn tooltip
  "A tooltip to show when the item is hovered.
   
   **Returns:** `string | undefined`"
  ^js [notebook-cell-status-bar-item]
  (.-tooltip ^js notebook-cell-status-bar-item))

(defn set-tooltip!
  "A tooltip to show when the item is hovered."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-tooltip ^js notebook-cell-status-bar-item) value))

(defn priority
  "The priority of the item. A higher value item will be shown more to the left.
   
   **Returns:** `number | undefined`"
  ^js [notebook-cell-status-bar-item]
  (.-priority ^js notebook-cell-status-bar-item))

(defn set-priority!
  "The priority of the item. A higher value item will be shown more to the left."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-priority ^js notebook-cell-status-bar-item) value))

(defn accessibility-information
  "Accessibility information used when a screen reader interacts with this item.
   
   **Returns:** `AccessibilityInformation | undefined`"
  ^js [notebook-cell-status-bar-item]
  (.-accessibilityInformation ^js notebook-cell-status-bar-item))

(defn set-accessibility-information!
  "Accessibility information used when a screen reader interacts with this item."
  ^js [notebook-cell-status-bar-item value]
  (set! (.-accessibilityInformation ^js notebook-cell-status-bar-item) value))
