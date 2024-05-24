(ns dots.vscode.terminal-profile-provider
  "Provides a terminal profile for the contributed terminal profile when launched via the UI or
   command.")

(defn provide-terminal-profile
  "Provide the terminal profile.
   
   **Parameters:**
   - `token`: `CancellationToken` - A cancellation token that indicates the result is no longer needed.
   
   **Returns:** `ProviderResult<TerminalProfile>` - The terminal profile."
  ^js [terminal-profile-provider token]
  (.provideTerminalProfile ^js terminal-profile-provider token))
