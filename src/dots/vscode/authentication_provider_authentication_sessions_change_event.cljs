(ns dots.vscode.authentication-provider-authentication-sessions-change-event
  "An {@link Event } which fires when an {@link AuthenticationSession } is added, removed, or changed.")

(defn added
  "The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider } that have been added."
  ^js [authentication-provider-authentication-sessions-change-event]
  (.-added ^js authentication-provider-authentication-sessions-change-event))

(defn removed
  "The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider } that have been removed."
  ^js [authentication-provider-authentication-sessions-change-event]
  (.-removed ^js authentication-provider-authentication-sessions-change-event))

(defn changed
  "The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider } that have been changed.
   A session changes when its data excluding the id are updated. An example of this is a session refresh that results in a new
   access token being set for the session."
  ^js [authentication-provider-authentication-sessions-change-event]
  (.-changed ^js authentication-provider-authentication-sessions-change-event))
