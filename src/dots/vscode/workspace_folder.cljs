(ns dots.vscode.workspace-folder
  "A workspace folder is one of potentially many roots opened by the editor. All workspace folders
   are equal which means there is no notion of an active or primary workspace folder."
  (:refer-clojure :exclude [name]))

(defn uri
  "The associated uri for this workspace folder.
   
   *Note:* The {@link Uri }-type was intentionally chosen such that future releases of the editor can support
   workspace folders that are not stored on the local disk, e.g. `ftp://server/workspaces/foo`."
  ^js [workspace-folder]
  (.-uri ^js workspace-folder))

(defn name
  "The name of this workspace folder. Defaults to
   the basename of its {@link Uri.path uri-path}"
  ^js [workspace-folder]
  (.-name ^js workspace-folder))

(defn index
  "The ordinal number of this workspace folder."
  ^js [workspace-folder]
  (.-index ^js workspace-folder))
