(ns dots.vscode.workspace-edit-entry-metadata
  "Additional data for entries of a workspace edit. Supports to label entries and marks entries
   as needing confirmation by the user. The editor groups edits with equal labels into tree nodes,
   for instance all edits labelled with \"Changes in Strings\" would be a tree node.")

(defn needs-confirmation?
  "A flag which indicates that user confirmation is needed.
   
   **Returns:** `boolean`"
  ^js [workspace-edit-entry-metadata]
  (.-needsConfirmation ^js workspace-edit-entry-metadata))

(defn set-needs-confirmation!
  "A flag which indicates that user confirmation is needed."
  ^js [workspace-edit-entry-metadata value]
  (set! (.-needsConfirmation ^js workspace-edit-entry-metadata) value))

(defn label
  "A human-readable string which is rendered prominent.
   
   **Returns:** `string`"
  ^js [workspace-edit-entry-metadata]
  (.-label ^js workspace-edit-entry-metadata))

(defn set-label!
  "A human-readable string which is rendered prominent."
  ^js [workspace-edit-entry-metadata value]
  (set! (.-label ^js workspace-edit-entry-metadata) value))

(defn description
  "A human-readable string which is rendered less prominent on the same line.
   
   **Returns:** `string | undefined`"
  ^js [workspace-edit-entry-metadata]
  (.-description ^js workspace-edit-entry-metadata))

(defn set-description!
  "A human-readable string which is rendered less prominent on the same line."
  ^js [workspace-edit-entry-metadata value]
  (set! (.-description ^js workspace-edit-entry-metadata) value))

(defn icon-path
  "The icon path or {@link ThemeIcon } for the edit.
   
   **Returns:** `Uri | ThemeIcon | { light: Uri; dark: Uri; } | undefined`"
  ^js [workspace-edit-entry-metadata]
  (.-iconPath ^js workspace-edit-entry-metadata))

(defn set-icon-path!
  "The icon path or {@link ThemeIcon } for the edit."
  ^js [workspace-edit-entry-metadata value]
  (set! (.-iconPath ^js workspace-edit-entry-metadata) value))
