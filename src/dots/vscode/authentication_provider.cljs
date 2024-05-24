(ns dots.vscode.authentication-provider
  "A provider for performing authentication to a service.")

(defn on-did-change-sessions
  "An {@link Event } which fires when the array of sessions has changed, or data
   within a session has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [authentication-provider]
   (.-onDidChangeSessions ^js authentication-provider))
  (^js [authentication-provider listener]
   (.onDidChangeSessions ^js authentication-provider listener))
  (^js [authentication-provider listener this-args]
   (.onDidChangeSessions ^js authentication-provider listener this-args))
  (^js [authentication-provider listener this-args disposables]
   (.onDidChangeSessions ^js authentication-provider listener this-args disposables)))

(defn sessions
  "Get a list of sessions.
   
   **Parameters:**
   - `scopes`: `readonly string[] | undefined` - An optional list of scopes. If provided, the sessions returned should match
   these permissions, otherwise all sessions should be returned.
   
   **Returns:** `Thenable<readonly AuthenticationSession[]>` - A promise that resolves to an array of authentication sessions."
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
   scopes.
   
   **Parameters:**
   - `scopes`: `readonly string[]` - A list of scopes, permissions, that the new session should be created with.
   
   **Returns:** `Thenable<AuthenticationSession>` - A promise that resolves to an authentication session."
  ^js [authentication-provider scopes]
  (.createSession ^js authentication-provider scopes))

(defn remove-session
  "Removes the session corresponding to session id.
   
   If the removal is successful, the onDidChangeSessions event should be fired.
   
   If a session cannot be removed, the provider should reject with an error message.
   
   **Parameters:**
   - `session-id`: `string` - The id of the session to remove.
   
   **Returns:** `Thenable<void>`"
  ^js [authentication-provider session-id]
  (.removeSession ^js authentication-provider session-id))
