(ns dots.vscode.workspace-configuration
  "Represents the configuration. It is a merged view of
   
   - *Default Settings*
   - *Global (User) Settings*
   - *Workspace settings*
   - *Workspace Folder settings* - From one of the {@link workspace.workspaceFolders Workspace Folders} under which requested resource belongs to.
   - *Language settings* - Settings defined under requested language.
   
   The *effective* value (returned by {@linkcode WorkspaceConfiguration.get get}) is computed by overriding or merging the values in the following order:
   
   1. `defaultValue` (if defined in `package.json` otherwise derived from the value's type)
   1. `globalValue` (if defined)
   1. `workspaceValue` (if defined)
   1. `workspaceFolderValue` (if defined)
   1. `defaultLanguageValue` (if defined)
   1. `globalLanguageValue` (if defined)
   1. `workspaceLanguageValue` (if defined)
   1. `workspaceFolderLanguageValue` (if defined)
   
   **Note:** Only `object` value types are merged and all other value types are overridden.
   
   Example 1: Overriding
   
   ```ts
   defaultValue = 'on';
   globalValue = 'relative'
   workspaceFolderValue = 'off'
   value = 'off'
   ```
   
   Example 2: Language Values
   
   ```ts
   defaultValue = 'on';
   globalValue = 'relative'
   workspaceFolderValue = 'off'
   globalLanguageValue = 'on'
   value = 'on'
   ```
   
   Example 3: Object Values
   
   ```ts
   defaultValue = { \"a\": 1, \"b\": 2 };
   globalValue = { \"b\": 3, \"c\": 4 };
   value = { \"a\": 1, \"b\": 3, \"c\": 4 };
   ```
   
   *Note:* Workspace and Workspace Folder configurations contains `launch` and `tasks` settings. Their basename will be
   part of the section identifier. The following snippets shows how to retrieve all configurations
   from `launch.json`:
   
   ```ts
   // launch.json configuration
   const config = workspace.getConfiguration('launch', vscode.workspace.workspaceFolders[0].uri);
   
   // retrieve values
   const values = config.get('configurations');
   ```
   
   Refer to [Settings](https://code.visualstudio.com/docs/getstarted/settings) for more information."
  (:refer-clojure :exclude [get update]))

(defn get
  "Return a value from this configuration.
   
   **Parameters:**
   - `section`: `string` - Configuration name, supports _dotted_ names.
   - `default-value`: `T` - A value should be returned when no value could be found, is `undefined`.
   
   **Returns:** `T` - The value `section` denotes or the default."
  (^js [workspace-configuration section]
   (.get ^js workspace-configuration section))
  (^js [workspace-configuration section default-value]
   (.get ^js workspace-configuration section default-value)))

(defn has?
  "Check if this configuration has a certain value.
   
   **Parameters:**
   - `section`: `string` - Configuration name, supports _dotted_ names.
   
   **Returns:** `boolean` - `true` if the section doesn't resolve to `undefined`."
  ^js [workspace-configuration section]
  (.has ^js workspace-configuration section))

(defn inspect
  "Retrieve all information about a configuration setting. A configuration value
   often consists of a *default* value, a global or installation-wide value,
   a workspace-specific value, folder-specific value
   and language-specific values (if {@link WorkspaceConfiguration } is scoped to a language).
   
   Also provides all language ids under which the given configuration setting is defined.
   
   *Note:* The configuration name must denote a leaf in the configuration tree
   (`editor.fontSize` vs `editor`) otherwise no result is returned.
   
   **Parameters:**
   - `section`: `string` - Configuration name, supports _dotted_ names.
   
   **Returns:** `{ key: string; defaultValue?: T | undefined; globalValue?: T | undefined; workspaceValue?: T | undefined; workspaceFolderValue?: T | undefined; defaultLanguageValue?: T | undefined; globalLanguageValue?: T | undefined; workspaceLanguageValue?: T | undefined; workspaceFolderLanguageValue?: T | undefined; languageIds?...` - Information about a configuration setting or `undefined`."
  ^js [workspace-configuration section]
  (.inspect ^js workspace-configuration section))

(defn update
  "Update a configuration value. The updated configuration values are persisted.
   
   A value can be changed in
   
   - {@link ConfigurationTarget.Global Global settings}: Changes the value for all instances of the editor.
   - {@link ConfigurationTarget.Workspace Workspace settings}: Changes the value for current workspace, if available.
   - {@link ConfigurationTarget.WorkspaceFolder Workspace folder settings}: Changes the value for settings from one of the {@link workspace.workspaceFolders Workspace Folders} under which the requested resource belongs to.
   - Language settings: Changes the value for the requested languageId.
   
   *Note:* To remove a configuration value use `undefined`, like so: `config.update('somekey', undefined)`
   
   **Parameters:**
   - `section`: `string` - Configuration name, supports _dotted_ names.
   - `value`: `any` - The new value.
   - `configuration-target?`: `boolean | ConfigurationTarget | null | undefined` - The {@link ConfigurationTarget configuration target} or a boolean value.
   - If `true` updates {@link ConfigurationTarget.Global Global settings}.
   - If `false` updates {@link ConfigurationTarget.Workspace Workspace settings}.
   - If `undefined` or `null` updates to {@link ConfigurationTarget.WorkspaceFolder Workspace folder settings} if configuration is resource specific,
   otherwise to {@link ConfigurationTarget.Workspace Workspace settings}.
   - `override-in-language?`: `boolean | undefined` - Whether to update the value in the scope of requested languageId or not.
   - If `true` updates the value under the requested languageId.
   - If `undefined` updates the value under the requested languageId only if the configuration is defined for the language.
   
   **Returns:** `Thenable<void>`"
  (^js [workspace-configuration section value]
   (.update ^js workspace-configuration section value))
  (^js [workspace-configuration section value configuration-target?]
   (.update ^js workspace-configuration section value configuration-target?))
  (^js [workspace-configuration section value configuration-target? override-in-language?]
   (.update ^js workspace-configuration section value configuration-target? override-in-language?)))
