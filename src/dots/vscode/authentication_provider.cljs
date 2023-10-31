(ns dots.vscode.authentication-provider
  "A provider for performing authentication to a service.")

(defn on-did-change-sessions
  "An {@link Event } which fires when the array of sessions has changed, or data
   within a session has changed."
  (^js [authentication-provider]
   (.-onDidChangeSessions ^js authentication-provider))
  (^js [authentication-provider listener]
   (.onDidChangeSessions ^js authentication-provider listener))
  (^js [authentication-provider listener this-args]
   (.onDidChangeSessions ^js authentication-provider listener this-args))
  (^js [authentication-provider listener this-args disposables]
   (.onDidChangeSessions ^js authentication-provider listener this-args disposables)))

(defn sessions
  "Get a list of sessions."
  (^js [authentication-provider]
   (.getSessions ^js authentication-provider))
  (^js [authentication-provider scopes]
   (.getSessions ^js authentication-provider scopes)))

(defn create-session
  "Prompts a user to login.
   
   If login is successful, the onDidChangeSessions event should be fired.
   
   If login fails, a rejected promise should be returned.
   
   If the provider has specified that it does not support multiple accounts,
   then this should never be called if there is already an existing session matching these
   scopes."
  ^js [authentication-provider scopes]
  (.createSession ^js authentication-provider scopes))

(defn remove-session
  "Removes the session corresponding to session id.
   
   If the removal is successful, the onDidChangeSessions event should be fired.
   
   If a session cannot be removed, the provider should reject with an error message."
  ^js [authentication-provider session-id]
  (.removeSession ^js authentication-provider session-id))
