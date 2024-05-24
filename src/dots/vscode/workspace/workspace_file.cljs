(ns dots.vscode.workspace.workspace-file
  "The location of the workspace file, for example:
   
   `file:///Users/name/Development/myProject.code-workspace`
   
   or
   
   `untitled:1555503116870`
   
   for a workspace that is untitled and not yet saved.
   
   Depending on the workspace that is opened, the value will be:
    * `undefined` when no workspace is opened
    * the path of the workspace file as `Uri` otherwise. if the workspace
   is untitled, the returned URI will use the `untitled:` scheme
   
   The location can e.g. be used with the `vscode.openFolder` command to
   open the workspace again after it has been closed.
   
   **Example:**
   ```typescript
   vscode.commands.executeCommand('vscode.openFolder', uriOfWorkspace);
   ```
   
   Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
   the concept of workspaces.
   
   **Note:** it is not advised to use `workspace.workspaceFile` to write
   configuration data into the file. You can use `workspace.getConfiguration().update()`
   for that purpose which will work both when a single folder is opened as
   well as an untitled or saved workspace."
  (:require ["vscode" :as vscode]))

(defn scheme
  "Scheme is the `http` part of `http://www.example.com/some/path?query#fragment`.
   The part before the first colon.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -scheme))

(defn authority
  "Authority is the `www.example.com` part of `http://www.example.com/some/path?query#fragment`.
   The part between the first double slashes and the next slash.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -authority))

(defn path
  "Path is the `/some/path` part of `http://www.example.com/some/path?query#fragment`.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -path))

(defn query
  "Query is the `query` part of `http://www.example.com/some/path?query#fragment`.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -query))

(defn fragment
  "Fragment is the `fragment` part of `http://www.example.com/some/path?query#fragment`.
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -fragment))

(defn fs-path
  "The string representing the corresponding file system path of this Uri.
   
   Will handle UNC paths and normalize windows drive letters to lower-case. Also
   uses the platform specific path separator.
   
   * Will *not* validate the path for invalid characters and semantics.
   * Will *not* look at the scheme of this Uri.
   * The resulting string shall *not* be used for display purposes but
   for disk operations, like `readFile` et al.
   
   The *difference* to the {@linkcode Uri.path path}-property is the use of the platform specific
   path separator and the handling of UNC paths. The sample below outlines the difference:
   ```ts
   const u = URI.parse('file://server/c$/folder/file.txt')
   u.authority === 'server'
   u.path === '/c$/folder/file.txt'
   u.fsPath === '\\\\server\\c$\\folder\\file.txt'
   ```
   
   **Returns:** `string`"
  ^js []
  (.. vscode/workspace -workspaceFile -fsPath))

(defn with
  "Derive a new Uri from this Uri.
   
   ```ts
   let file = Uri.parse('before:some/file/path');
   let other = file.with({ scheme: 'after' });
   assert.ok(other.toString() === 'after:some/file/path');
   ```
   
   **Parameters:**
   - `change`: `{ scheme?: string | undefined; authority?: string | undefined; path?: string | undefined; query?: string | undefined; fragment?: string | undefined; }` - An object that describes a change to this Uri. To unset components use `null` or
   the empty string.
   
   **Returns:** `Uri` - A new Uri that reflects the given change. Will return `this` Uri if the change
   is not changing anything."
  ^js [change]
  (.. vscode/workspace -workspaceFile (with change)))

(defn to-string
  "Returns a string representation of this Uri. The representation and normalization
   of a URI depends on the scheme.
   
   * The resulting string can be safely used with {@link Uri.parse }.
   * The resulting string shall *not* be used for display purposes.
   
   *Note* that the implementation will encode _aggressive_ which often leads to unexpected,
   but not incorrect, results. For instance, colons are encoded to `%3A` which might be unexpected
   in file-uri. Also `&` and `=` will be encoded which might be unexpected for http-uris. For stability
   reasons this cannot be changed anymore. If you suffer from too aggressive encoding you should use
   the `skipEncoding`-argument: `uri.toString(true)`.
   
   **Parameters:**
   - `skip-encoding?`: `boolean | undefined` - Do not percentage-encode the result, defaults to `false`. Note that
   the `#` and `?` characters occurring in the path will always be encoded.
   
   **Returns:** `string` - A string representation of this Uri."
  (^js []
   (.. vscode/workspace -workspaceFile (toString)))
  (^js [skip-encoding?]
   (.. vscode/workspace -workspaceFile (toString skip-encoding?))))

(defn to-json
  "Returns a JSON representation of this Uri.
   
   **Returns:** `any` - An object."
  ^js []
  (.. vscode/workspace -workspaceFile (toJSON)))
