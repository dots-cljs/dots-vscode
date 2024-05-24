(ns dots.vscode.file-will-create-event
  "An event that is fired when files are going to be created.
   
   To make modifications to the workspace before the files are created,
   call the {@linkcode FileWillCreateEvent.waitUntil waitUntil}-function with a
   thenable that resolves to a {@link WorkspaceEdit workspace edit}.")

(defn token
  "A cancellation token.
   
   **Returns:** `CancellationToken`"
  ^js [file-will-create-event]
  (.-token ^js file-will-create-event))

(defn files
  "The files that are going to be created.
   
   **Returns:** `readonly Uri[]`"
  ^js [file-will-create-event]
  (.-files ^js file-will-create-event))

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
  ^js [file-will-create-event thenable]
  (.waitUntil ^js file-will-create-event thenable))
