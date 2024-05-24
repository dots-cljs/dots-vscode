(ns dots.vscode.env
  "Namespace describing the environment the editor runs in."
  (:require ["vscode" :as vscode]))

(defn create-telemetry-logger
  "Creates a new {@link TelemetryLogger telemetry logger}.
   
   **Parameters:**
   - `sender`: `TelemetrySender` - The telemetry sender that is used by the telemetry logger.
   - `options`: `TelemetryLoggerOptions | undefined` - Options for the telemetry logger.
   
   **Returns:** `TelemetryLogger` - A new telemetry logger"
  (^js [sender]
   (.createTelemetryLogger vscode/env sender))
  (^js [sender options]
   (.createTelemetryLogger vscode/env sender options)))

(defn open-external
  "Opens a link externally using the default application. Depending on the
   used scheme this can be:
   * a browser (`http:`, `https:`)
   * a mail client (`mailto:`)
   * VSCode itself (`vscode:` from `vscode.env.uriScheme`)
   
   *Note* that {@linkcode window.showTextDocument showTextDocument} is the right
   way to open a text document inside the editor, not this function.
   
   **Parameters:**
   - `target`: `Uri` - The uri that should be opened.
   
   **Returns:** `Thenable<boolean>` - A promise indicating if open was successful."
  ^js [target]
  (.openExternal vscode/env target))

(defn as-external-uri
  "Resolves a uri to a form that is accessible externally.
   
   #### `http:` or `https:` scheme
   
   Resolves an *external* uri, such as a `http:` or `https:` link, from where the extension is running to a
   uri to the same resource on the client machine.
   
   This is a no-op if the extension is running on the client machine.
   
   If the extension is running remotely, this function automatically establishes a port forwarding tunnel
   from the local machine to `target` on the remote and returns a local uri to the tunnel. The lifetime of
   the port forwarding tunnel is managed by the editor and the tunnel can be closed by the user.
   
   *Note* that uris passed through `openExternal` are automatically resolved and you should not call `asExternalUri` on them.
   
   #### `vscode.env.uriScheme`
   
   Creates a uri that - if opened in a browser (e.g. via `openExternal`) - will result in a registered {@link UriHandler }
   to trigger.
   
   Extensions should not make any assumptions about the resulting uri and should not alter it in any way.
   Rather, extensions can e.g. use this uri in an authentication flow, by adding the uri as callback query
   argument to the server to authenticate to.
   
   *Note* that if the server decides to add additional query parameters to the uri (e.g. a token or secret), it
   will appear in the uri that is passed to the {@link UriHandler }.
   
   **Example** of an authentication flow:
   ```typescript
   vscode.window.registerUriHandler({
     handleUri(uri: vscode.Uri): vscode.ProviderResult<void> {
       if (uri.path === '/did-authenticate') {
         console.log(uri.toString());
       }
     }
   });
   
   const callableUri = await vscode.env.asExternalUri(vscode.Uri.parse(vscode.env.uriScheme + '://my.extension/did-authenticate'));
   await vscode.env.openExternal(callableUri);
   ```
   
   *Note* that extensions should not cache the result of `asExternalUri` as the resolved uri may become invalid due to
   a system or user action — for example, in remote cases, a user may close a port forwarding tunnel that was opened by
   `asExternalUri`.
   
   #### Any other scheme
   
   Any other scheme will be handled as if the provided URI is a workspace URI. In that case, the method will return
   a URI which, when handled, will make the editor open the workspace.
   
   **Parameters:**
   - `target`: `Uri`
   
   **Returns:** `Thenable<Uri>` - A uri that can be used on the client machine."
  ^js [target]
  (.asExternalUri vscode/env target))

(defn app-name
  "The application name of the editor, like 'VS Code'."
  ^js []
  (.-appName vscode/env))

(defn app-root
  "The application root folder from which the editor is running.
   
   *Note* that the value is the empty string when running in an
   environment that has no representation of an application root folder."
  ^js []
  (.-appRoot vscode/env))

(defn app-host
  "The hosted location of the application
   On desktop this is 'desktop'
   In the web this is the specified embedder i.e. 'github.dev', 'codespaces', or 'web' if the embedder
   does not provide that information"
  ^js []
  (.-appHost vscode/env))

(defn uri-scheme
  "The custom uri scheme the editor registers to in the operating system."
  ^js []
  (.-uriScheme vscode/env))

(defn language
  "Represents the preferred user-language, like `de-CH`, `fr`, or `en-US`."
  ^js []
  (.-language vscode/env))

(defn clipboard
  "The system clipboard."
  ^js []
  (.-clipboard vscode/env))

(defn machine-id
  "A unique identifier for the computer."
  ^js []
  (.-machineId vscode/env))

(defn session-id
  "A unique identifier for the current session.
   Changes each time the editor is started."
  ^js []
  (.-sessionId vscode/env))

(defn new-app-install?
  "Indicates that this is a fresh install of the application.
   `true` if within the first day of installation otherwise `false`."
  ^js []
  (.-isNewAppInstall vscode/env))

(defn telemetry-enabled?
  "Indicates whether the users has telemetry enabled.
   Can be observed to determine if the extension should send telemetry."
  ^js []
  (.-isTelemetryEnabled vscode/env))

(defn on-did-change-telemetry-enabled
  "An {@link Event } which fires when the user enabled or disables telemetry.
   `true` if the user has enabled telemetry or `false` if the user has disabled telemetry.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeTelemetryEnabled vscode/env))
  (^js [listener]
   (.onDidChangeTelemetryEnabled vscode/env listener))
  (^js [listener this-args]
   (.onDidChangeTelemetryEnabled vscode/env listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeTelemetryEnabled vscode/env listener this-args disposables)))

(defn on-did-change-shell
  "An {@link Event } which fires when the default shell changes. This fires with the new
   shell path.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeShell vscode/env))
  (^js [listener]
   (.onDidChangeShell vscode/env listener))
  (^js [listener this-args]
   (.onDidChangeShell vscode/env listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeShell vscode/env listener this-args disposables)))

(defn remote-name
  "The name of a remote. Defined by extensions, popular samples are `wsl` for the Windows
   Subsystem for Linux or `ssh-remote` for remotes using a secure shell.
   
   *Note* that the value is `undefined` when there is no remote extension host but that the
   value is defined in all extension hosts (local and remote) in case a remote extension host
   exists. Use {@link Extension.extensionKind } to know if
   a specific extension runs remote or not."
  ^js []
  (.-remoteName vscode/env))

(defn shell
  "The detected default shell for the extension host, this is overridden by the
   `terminal.integrated.defaultProfile` setting for the extension host's platform. Note that in
   environments that do not support a shell the value is the empty string."
  ^js []
  (.-shell vscode/env))

(defn ui-kind
  "The UI kind property indicates from which UI extensions
   are accessed from. For example, extensions could be accessed
   from a desktop application or a web browser."
  ^js []
  (.-uiKind vscode/env))

(defn log-level
  "The current log level of the editor."
  ^js []
  (.-logLevel vscode/env))

(defn on-did-change-log-level
  "An {@link Event } which fires when the log level of the editor changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeLogLevel vscode/env))
  (^js [listener]
   (.onDidChangeLogLevel vscode/env listener))
  (^js [listener this-args]
   (.onDidChangeLogLevel vscode/env listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeLogLevel vscode/env listener this-args disposables)))
