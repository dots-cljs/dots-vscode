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
  "Replace the given range with given text for the given resource."
  (^js [workspace-edit uri range new-text]
   (.replace ^js workspace-edit uri range new-text))
  (^js [workspace-edit uri range new-text metadata]
   (.replace ^js workspace-edit uri range new-text metadata)))

(defn insert
  "Insert the given text at the given position."
  (^js [workspace-edit uri position new-text]
   (.insert ^js workspace-edit uri position new-text))
  (^js [workspace-edit uri position new-text metadata]
   (.insert ^js workspace-edit uri position new-text metadata)))

(defn delete
  "Delete the text at the given range."
  (^js [workspace-edit uri range]
   (.delete ^js workspace-edit uri range))
  (^js [workspace-edit uri range metadata]
   (.delete ^js workspace-edit uri range metadata)))

(defn has?
  "Check if a text edit for a resource exists."
  ^js [workspace-edit uri]
  (.has ^js workspace-edit uri))

(defn set
  "Set (and replace) notebook edits for a resource.
   Set (and replace) notebook edits with metadata for a resource.
   Set (and replace) text edits or snippet edits for a resource.
   Set (and replace) text edits or snippet edits with metadata for a resource."
  ^js [workspace-edit uri edits]
  (.set ^js workspace-edit uri edits))

(defn get
  "Get the text edits for a resource."
  ^js [workspace-edit uri]
  (.get ^js workspace-edit uri))

(defn create-file
  "Create a regular file."
  (^js [workspace-edit uri]
   (.createFile ^js workspace-edit uri))
  (^js [workspace-edit uri options]
   (.createFile ^js workspace-edit uri options))
  (^js [workspace-edit uri options metadata]
   (.createFile ^js workspace-edit uri options metadata)))

(defn delete-file
  "Delete a file or folder."
  (^js [workspace-edit uri]
   (.deleteFile ^js workspace-edit uri))
  (^js [workspace-edit uri options]
   (.deleteFile ^js workspace-edit uri options))
  (^js [workspace-edit uri options metadata]
   (.deleteFile ^js workspace-edit uri options metadata)))

(defn rename-file
  "Rename a file or folder."
  (^js [workspace-edit old-uri new-uri]
   (.renameFile ^js workspace-edit old-uri new-uri))
  (^js [workspace-edit old-uri new-uri options]
   (.renameFile ^js workspace-edit old-uri new-uri options))
  (^js [workspace-edit old-uri new-uri options metadata]
   (.renameFile ^js workspace-edit old-uri new-uri options metadata)))

(defn entries
  "Get all text edits grouped by resource."
  ^js [workspace-edit]
  (.entries ^js workspace-edit))
