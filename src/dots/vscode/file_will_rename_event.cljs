(ns dots.vscode.file-will-rename-event
  "An event that is fired when files are going to be renamed.
   
   To make modifications to the workspace before the files are renamed,
   call the {@link FileWillCreateEvent.waitUntil `waitUntil`}-function with a
   thenable that resolves to a {@link WorkspaceEdit workspace edit}.")

(defn token
  "A cancellation token.
   
   **Returns:** `CancellationToken`"
  ^js [file-will-rename-event]
  (.-token ^js file-will-rename-event))

(defn files
  "The files that are going to be renamed.
   
   **Returns:** `readonly { readonly oldUri: Uri; readonly newUri: Uri; }[]`"
  ^js [file-will-rename-event]
  (.-files ^js file-will-rename-event))

(defn wait-until
  "Allows to pause the event and to apply a {@link WorkspaceEdit workspace edit}.
   
   *Note:* This function can only be called during event dispatch and not
   in an asynchronous manner:
   
   ```ts
   workspace.onWillCreateFiles(event => {
   	// async, will *throw* an error
   	setTimeout(() => event.waitUntil(promise));
   
   	// sync, OK
   	event.waitUntil(promise);
   })
   ```
   Allows to pause the event until the provided thenable resolves.
   
   *Note:* This function can only be called during event dispatch.
   
   **Parameters:**
   - `thenable`: `Thenable<any>` - A thenable that delays saving.
   
   **Returns:** `void`"
  ^js [file-will-rename-event thenable]
  (.waitUntil ^js file-will-rename-event thenable))
