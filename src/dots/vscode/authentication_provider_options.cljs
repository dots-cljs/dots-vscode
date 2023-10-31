(ns dots.vscode.authentication-provider-options
  "Options for creating an {@link AuthenticationProvider }.")

(defn supports-multiple-accounts?
  "Whether it is possible to be signed into multiple accounts at once with this provider.
   If not specified, will default to false."
  ^js [authentication-provider-options]
  (.-supportsMultipleAccounts ^js authentication-provider-options))
