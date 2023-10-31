(ns dots.vscode.authentication-sessions-change-event
  "An {@link Event } which fires when an {@link AuthenticationSession } is added, removed, or changed.")

(defn provider
  "The {@link AuthenticationProvider } that has had its sessions change."
  ^js [authentication-sessions-change-event]
  (.-provider ^js authentication-sessions-change-event))
