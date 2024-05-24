(ns dots.vscode.uri-handler
  "A uri handler is responsible for handling system-wide {@link Uri uris}.")

(defn handle-uri
  "Handle the provided system-wide {@link Uri }.
   
   **Parameters:**
   - `uri`: `Uri`
   
   **Returns:** `ProviderResult<void>`"
  ^js [uri-handler uri]
  (.handleUri ^js uri-handler uri))
