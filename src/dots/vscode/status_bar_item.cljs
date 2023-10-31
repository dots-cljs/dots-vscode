(ns dots.vscode.status-bar-item
  "A status bar item is a status bar contribution that can
   show text and icons and run a command on click."
  (:refer-clojure :exclude [name]))

(defn id
  "The identifier of this item.
   
   *Note*: if no identifier was provided by the {@linkcode window.createStatusBarItem }
   method, the identifier will match the {@link Extension.id extension identifier}."
  ^js [status-bar-item]
  (.-id ^js status-bar-item))

(defn alignment
  "The alignment of this item."
  ^js [status-bar-item]
  (.-alignment ^js status-bar-item))

(defn priority
  "The priority of this item. Higher value means the item should
   be shown more to the left."
  ^js [status-bar-item]
  (.-priority ^js status-bar-item))

(defn name
  "The name of the entry, like 'Python Language Indicator', 'Git Status' etc.
   Try to keep the length of the name short, yet descriptive enough that
   users can understand what the status bar item is about."
  ^js [status-bar-item]
  (.-name ^js status-bar-item))

(defn set-name!
  "The name of the entry, like 'Python Language Indicator', 'Git Status' etc.
   Try to keep the length of the name short, yet descriptive enough that
   users can understand what the status bar item is about."
  ^js [status-bar-item value]
  (set! (.-name ^js status-bar-item) value))

(defn text
  "The text to show for the entry. You can embed icons in the text by leveraging the syntax:
   
   `My text $(icon-name) contains icons like $(icon-name) this one.`
   
   Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
   `light-bulb`, `thumbsup`, `zap` etc."
  ^js [status-bar-item]
  (.-text ^js status-bar-item))

(defn set-text!
  "The text to show for the entry. You can embed icons in the text by leveraging the syntax:
   
   `My text $(icon-name) contains icons like $(icon-name) this one.`
   
   Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
   `light-bulb`, `thumbsup`, `zap` etc."
  ^js [status-bar-item value]
  (set! (.-text ^js status-bar-item) value))

(defn tooltip
  "The tooltip text when you hover over this entry."
  ^js [status-bar-item]
  (.-tooltip ^js status-bar-item))

(defn set-tooltip!
  "The tooltip text when you hover over this entry."
  ^js [status-bar-item value]
  (set! (.-tooltip ^js status-bar-item) value))

(defn color
  "The foreground color for this entry."
  ^js [status-bar-item]
  (.-color ^js status-bar-item))

(defn set-color!
  "The foreground color for this entry."
  ^js [status-bar-item value]
  (set! (.-color ^js status-bar-item) value))

(defn background-color
  "The background color for this entry.
   
   *Note*: only the following colors are supported:
   * `new ThemeColor('statusBarItem.errorBackground')`
   * `new ThemeColor('statusBarItem.warningBackground')`
   
   More background colors may be supported in the future.
   
   *Note*: when a background color is set, the statusbar may override
   the `color` choice to ensure the entry is readable in all themes."
  ^js [status-bar-item]
  (.-backgroundColor ^js status-bar-item))

(defn set-background-color!
  "The background color for this entry.
   
   *Note*: only the following colors are supported:
   * `new ThemeColor('statusBarItem.errorBackground')`
   * `new ThemeColor('statusBarItem.warningBackground')`
   
   More background colors may be supported in the future.
   
   *Note*: when a background color is set, the statusbar may override
   the `color` choice to ensure the entry is readable in all themes."
  ^js [status-bar-item value]
  (set! (.-backgroundColor ^js status-bar-item) value))

(defn command
  "{@linkcode Command } or identifier of a command to run on click.
   
   The command must be {@link commands.getCommands known}.
   
   Note that if this is a {@linkcode Command } object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
   are used by the editor."
  ^js [status-bar-item]
  (.-command ^js status-bar-item))

(defn set-command!
  "{@linkcode Command } or identifier of a command to run on click.
   
   The command must be {@link commands.getCommands known}.
   
   Note that if this is a {@linkcode Command } object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
   are used by the editor."
  ^js [status-bar-item value]
  (set! (.-command ^js status-bar-item) value))

(defn accessibility-information
  "Accessibility information used when a screen reader interacts with this StatusBar item"
  ^js [status-bar-item]
  (.-accessibilityInformation ^js status-bar-item))

(defn set-accessibility-information!
  "Accessibility information used when a screen reader interacts with this StatusBar item"
  ^js [status-bar-item value]
  (set! (.-accessibilityInformation ^js status-bar-item) value))

(defn show
  "Shows the entry in the status bar."
  ^js [status-bar-item]
  (.show ^js status-bar-item))

(defn hide
  "Hide the entry in the status bar."
  ^js [status-bar-item]
  (.hide ^js status-bar-item))

(defn dispose
  "Dispose and free associated resources. Call
   {@link StatusBarItem.hide hide}."
  ^js [status-bar-item]
  (.dispose ^js status-bar-item))
