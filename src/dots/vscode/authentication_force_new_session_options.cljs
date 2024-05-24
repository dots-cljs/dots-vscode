(ns dots.vscode.authentication-force-new-session-options
  "Optional options to be used when calling {@link authentication.getSession } with the flag `forceNewSession`.")

(defn detail
  "An optional message that will be displayed to the user when we ask to re-authenticate. Providing additional context
   as to why you are asking a user to re-authenticate can help increase the odds that they will accept."
  ^js [authentication-force-new-session-options]
  (.-detail ^js authentication-force-new-session-options))

(defn set-detail!
  "An optional message that will be displayed to the user when we ask to re-authenticate. Providing additional context
   as to why you are asking a user to re-authenticate can help increase the odds that they will accept."
  ^js [authentication-force-new-session-options value]
  (set! (.-detail ^js authentication-force-new-session-options) value))
