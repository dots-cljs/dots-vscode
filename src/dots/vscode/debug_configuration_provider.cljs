(ns dots.vscode.debug-configuration-provider
  "A debug configuration provider allows to add debug configurations to the debug service
   and to resolve launch configurations before they are used to start a debug session.
   A debug configuration provider is registered via {@link debug.registerDebugConfigurationProvider }.")

(defn provide-debug-configurations
  "Provides {@link DebugConfiguration debug configuration} to the debug service. If more than one debug configuration provider is
   registered for the same type, debug configurations are concatenated in arbitrary order.
   
   **Parameters:**
   - `folder`: `WorkspaceFolder | undefined` - The workspace folder for which the configurations are used or `undefined` for a folderless setup.
   - `token`: `CancellationToken | undefined` - A cancellation token.
   
   **Returns:** `ProviderResult<DebugConfiguration[]>` - An array of {@link DebugConfigurationdebug configurations}."
  (^js [debug-configuration-provider]
   (.provideDebugConfigurations ^js debug-configuration-provider))
  (^js [debug-configuration-provider folder]
   (.provideDebugConfigurations ^js debug-configuration-provider folder))
  (^js [debug-configuration-provider folder token]
   (.provideDebugConfigurations ^js debug-configuration-provider folder token)))

(defn resolve-debug-configuration
  "Resolves a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
   If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
   in arbitrary order and the initial debug configuration is piped through the chain.
   Returning the value 'undefined' prevents the debug session from starting.
   Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
   
   **Parameters:**
   - `folder`: `WorkspaceFolder | undefined` - The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
   - `debug-configuration`: `DebugConfiguration` - The {@link DebugConfiguration debug configuration} to resolve.
   - `token`: `CancellationToken | undefined` - A cancellation token.
   
   **Returns:** `ProviderResult<DebugConfiguration>` - The resolved debug configuration or undefined or null."
  (^js [debug-configuration-provider]
   (.resolveDebugConfiguration ^js debug-configuration-provider))
  (^js [debug-configuration-provider folder]
   (.resolveDebugConfiguration ^js debug-configuration-provider folder))
  (^js [debug-configuration-provider folder debug-configuration]
   (.resolveDebugConfiguration ^js debug-configuration-provider folder debug-configuration))
  (^js [debug-configuration-provider folder debug-configuration token]
   (.resolveDebugConfiguration ^js debug-configuration-provider folder debug-configuration token)))

(defn resolve-debug-configuration-with-substituted-variables
  "This hook is directly called after 'resolveDebugConfiguration' but with all variables substituted.
   It can be used to resolve or verify a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
   If more than one debug configuration provider is registered for the same type, the 'resolveDebugConfigurationWithSubstitutedVariables' calls are chained
   in arbitrary order and the initial debug configuration is piped through the chain.
   Returning the value 'undefined' prevents the debug session from starting.
   Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
   
   **Parameters:**
   - `folder`: `WorkspaceFolder | undefined` - The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
   - `debug-configuration`: `DebugConfiguration` - The {@link DebugConfiguration debug configuration} to resolve.
   - `token`: `CancellationToken | undefined` - A cancellation token.
   
   **Returns:** `ProviderResult<DebugConfiguration>` - The resolved debug configuration or undefined or null."
  (^js [debug-configuration-provider]
   (.resolveDebugConfigurationWithSubstitutedVariables ^js debug-configuration-provider))
  (^js [debug-configuration-provider folder]
   (.resolveDebugConfigurationWithSubstitutedVariables ^js debug-configuration-provider folder))
  (^js [debug-configuration-provider folder debug-configuration]
   (.resolveDebugConfigurationWithSubstitutedVariables ^js debug-configuration-provider folder debug-configuration))
  (^js [debug-configuration-provider folder debug-configuration token]
   (.resolveDebugConfigurationWithSubstitutedVariables ^js debug-configuration-provider folder debug-configuration token)))
