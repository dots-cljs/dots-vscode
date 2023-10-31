(ns dots.vscode.authentication-session-account-information
  "The information of an account associated with an {@link AuthenticationSession }.")

(defn id
  "The unique identifier of the account."
  ^js [authentication-session-account-information]
  (.-id ^js authentication-session-account-information))

(defn label
  "The human-readable name of the account."
  ^js [authentication-session-account-information]
  (.-label ^js authentication-session-account-information))
