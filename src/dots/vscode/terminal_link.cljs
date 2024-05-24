(ns dots.vscode.terminal-link
  "A link on a terminal line.")

(defn start-index
  "The start index of the link on {@link TerminalLinkContext.line }.
   
   **Returns:** `number`"
  ^js [terminal-link]
  (.-startIndex ^js terminal-link))

(defn set-start-index!
  "The start index of the link on {@link TerminalLinkContext.line }."
  ^js [terminal-link value]
  (set! (.-startIndex ^js terminal-link) value))

(defn length
  "The length of the link on {@link TerminalLinkContext.line }.
   
   **Returns:** `number`"
  ^js [terminal-link]
  (.-length ^js terminal-link))

(defn set-length!
  "The length of the link on {@link TerminalLinkContext.line }."
  ^js [terminal-link value]
  (set! (.-length ^js terminal-link) value))

(defn tooltip
  "The tooltip text when you hover over this link.
   
   If a tooltip is provided, is will be displayed in a string that includes instructions on
   how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
   depending on OS, user settings, and localization.
   
   **Returns:** `string | undefined`"
  ^js [terminal-link]
  (.-tooltip ^js terminal-link))

(defn set-tooltip!
  "The tooltip text when you hover over this link.
   
   If a tooltip is provided, is will be displayed in a string that includes instructions on
   how to trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary
   depending on OS, user settings, and localization."
  ^js [terminal-link value]
  (set! (.-tooltip ^js terminal-link) value))
