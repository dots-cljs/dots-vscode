(ns dots.vscode.workspace-folders-change-event
  "An event describing a change to the set of {@link workspace.workspaceFolders workspace folders}.")

(defn added
  "Added workspace folders."
  ^js [workspace-folders-change-event]
  (.-added ^js workspace-folders-change-event))

(defn removed
  "Removed workspace folders."
  ^js [workspace-folders-change-event]
  (.-removed ^js workspace-folders-change-event))
