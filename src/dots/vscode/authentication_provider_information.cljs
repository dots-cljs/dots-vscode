(ns dots.vscode.authentication-provider-information
  "Basic information about an {@link AuthenticationProvider }")

(defn id
  "The unique identifier of the authentication provider.
   
   **Returns:** `string`"
  ^js [authentication-provider-information]
  (.-id ^js authentication-provider-information))

(defn label
  "The human-readable name of the authentication provider.
   
   **Returns:** `string`"
  ^js [authentication-provider-information]
  (.-label ^js authentication-provider-information))
