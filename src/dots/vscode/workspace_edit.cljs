(ns dots.vscode.workspace-edit
  "A workspace edit is a collection of textual and files changes for
   multiple resources and documents.
   
   Use the {@link workspace.applyEdit applyEdit}-function to apply a workspace edit."
  (:refer-clojure :exclude [get replace set]))

(defn size
  "The number of affected resources of textual or resource changes."
  ^js [workspace-edit]
  (.-size ^js workspace-edit))

(defn replace
  "Replace the given range with given text for the given resource.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   - `range`: `Range` - A range.
   - `new-text`: `string` - A string.
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit uri range new-text]
   (.replace ^js workspace-edit uri range new-text))
  (^js [workspace-edit uri range new-text metadata]
   (.replace ^js workspace-edit uri range new-text metadata)))

(defn insert
  "Insert the given text at the given position.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   - `position`: `Position` - A position.
   - `new-text`: `string` - A string.
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit uri position new-text]
   (.insert ^js workspace-edit uri position new-text))
  (^js [workspace-edit uri position new-text metadata]
   (.insert ^js workspace-edit uri position new-text metadata)))

(defn delete
  "Delete the text at the given range.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   - `range`: `Range` - A range.
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit uri range]
   (.delete ^js workspace-edit uri range))
  (^js [workspace-edit uri range metadata]
   (.delete ^js workspace-edit uri range metadata)))

(defn has?
  "Check if a text edit for a resource exists.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   
   **Returns:** `boolean` - `true` if the given resource will be touched by this edit."
  ^js [workspace-edit uri]
  (.has ^js workspace-edit uri))

(defn set
  "Set (and replace) text edits or snippet edits for a resource.
   Set (and replace) text edits or snippet edits with metadata for a resource.
   Set (and replace) notebook edits for a resource.
   Set (and replace) notebook edits with metadata for a resource.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   - `edits`: `readonly [NotebookEdit, WorkspaceEditEntryMetadata | undefined][]` - An array of edits.
   
   **Returns:** `void`"
  ^js [workspace-edit uri edits]
  (.set ^js workspace-edit uri edits))

(defn get
  "Get the text edits for a resource.
   
   **Parameters:**
   - `uri`: `Uri` - A resource identifier.
   
   **Returns:** `TextEdit[]` - An array of text edits."
  ^js [workspace-edit uri]
  (.get ^js workspace-edit uri))

(defn create-file
  "Create a regular file.
   
   **Parameters:**
   - `uri`: `Uri` - Uri of the new file.
   - `options`: `{ readonly overwrite?: boolean | undefined; readonly ignoreIfExists?: boolean | undefined; readonly contents?: Uint8Array | DataTransferFile | undefined; } | undefined` - Defines if an existing file should be overwritten or be
   ignored. When `overwrite` and `ignoreIfExists` are both set `overwrite` wins.
   When both are unset and when the file already exists then the edit cannot
   be applied successfully. The `content`-property allows to set the initial contents
   the file is being created with.
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit uri]
   (.createFile ^js workspace-edit uri))
  (^js [workspace-edit uri options]
   (.createFile ^js workspace-edit uri options))
  (^js [workspace-edit uri options metadata]
   (.createFile ^js workspace-edit uri options metadata)))

(defn delete-file
  "Delete a file or folder.
   
   **Parameters:**
   - `uri`: `Uri` - The uri of the file that is to be deleted.
   - `options`: `{ readonly recursive?: boolean | undefined; readonly ignoreIfNotExists?: boolean | undefined; } | undefined`
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit uri]
   (.deleteFile ^js workspace-edit uri))
  (^js [workspace-edit uri options]
   (.deleteFile ^js workspace-edit uri options))
  (^js [workspace-edit uri options metadata]
   (.deleteFile ^js workspace-edit uri options metadata)))

(defn rename-file
  "Rename a file or folder.
   
   **Parameters:**
   - `old-uri`: `Uri` - The existing file.
   - `new-uri`: `Uri` - The new location.
   - `options`: `{ readonly overwrite?: boolean | undefined; readonly ignoreIfExists?: boolean | undefined; } | undefined` - Defines if existing files should be overwritten or be
   ignored. When overwrite and ignoreIfExists are both set overwrite wins.
   - `metadata`: `WorkspaceEditEntryMetadata | undefined` - Optional metadata for the entry.
   
   **Returns:** `void`"
  (^js [workspace-edit old-uri new-uri]
   (.renameFile ^js workspace-edit old-uri new-uri))
  (^js [workspace-edit old-uri new-uri options]
   (.renameFile ^js workspace-edit old-uri new-uri options))
  (^js [workspace-edit old-uri new-uri options metadata]
   (.renameFile ^js workspace-edit old-uri new-uri options metadata)))

(defn entries
  "Get all text edits grouped by resource.
   
   **Returns:** `[Uri, TextEdit[]][]` - A shallow copy of `[Uri, TextEdit[]]`-tuples."
  ^js [workspace-edit]
  (.entries ^js workspace-edit))
