(ns dots.vscode.file-will-delete-event
  "An event that is fired when files are going to be deleted.
   
   To make modifications to the workspace before the files are deleted,
   call the {@link FileWillCreateEvent.waitUntil `waitUntil}-function with a
        * thenable that resolves to a {@link WorkspaceEdit workspace edit}.
        }")

(defn token
  "A cancellation token."
  ^js [file-will-delete-event]
  (.-token ^js file-will-delete-event))

(defn files
  "The files that are going to be deleted."
  ^js [file-will-delete-event]
  (.-files ^js file-will-delete-event))

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
   
   *Note:* This function can only be called during event dispatch."
  ^js [file-will-delete-event thenable]
  (.waitUntil ^js file-will-delete-event thenable))
