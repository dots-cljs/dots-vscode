(ns dots.vscode.authentication-session
  "Represents a session of a currently logged in user.")

(defn id
  "The identifier of the authentication session."
  ^js [authentication-session]
  (.-id ^js authentication-session))

(defn access-token
  "The access token."
  ^js [authentication-session]
  (.-accessToken ^js authentication-session))

(defn account
  "The account associated with the session."
  ^js [authentication-session]
  (.-account ^js authentication-session))

(defn scopes
  "The permissions granted by the session's access token. Available scopes
   are defined by the {@link AuthenticationProvider }."
  ^js [authentication-session]
  (.-scopes ^js authentication-session))
