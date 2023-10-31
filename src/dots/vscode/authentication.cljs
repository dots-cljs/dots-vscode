(ns dots.vscode.authentication
  "Namespace for authentication."
  (:require ["vscode" :as vscode]))

(defn session
  "Get an authentication session matching the desired scopes. Rejects if a provider with providerId is not
   registered, or if the user does not consent to sharing authentication information with
   the extension. If there are multiple sessions with the same scopes, the user will be shown a
   quickpick to select which account they would like to use.
   
   Currently, there are only two authentication providers that are contributed from built in extensions
   to the editor that implement GitHub and Microsoft authentication: their providerId's are 'github' and 'microsoft'."
  (^js [provider-id scopes]
   (.getSession vscode/authentication provider-id scopes))
  (^js [provider-id scopes options]
   (.getSession vscode/authentication provider-id scopes options)))

(defn register-authentication-provider
  "Register an authentication provider.
   
   There can only be one provider per id and an error is being thrown when an id
   has already been used by another provider. Ids are case-sensitive."
  (^js [id label provider]
   (.registerAuthenticationProvider vscode/authentication id label provider))
  (^js [id label provider options]
   (.registerAuthenticationProvider vscode/authentication id label provider options)))

(defn on-did-change-sessions
  "An {@link Event } which fires when the authentication sessions of an authentication provider have
   been added, removed, or changed."
  (^js []
   (.-onDidChangeSessions vscode/authentication))
  (^js [listener]
   (.onDidChangeSessions vscode/authentication listener))
  (^js [listener this-args]
   (.onDidChangeSessions vscode/authentication listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeSessions vscode/authentication listener this-args disposables)))
