(ns dots.vscode.tab
  "Represents a tab within a {@link TabGroup group of tabs}.
   Tabs are merely the graphical representation within the editor area.
   A backing editor is not a guarantee.")

(defn label
  "The text displayed on the tab.
   
   **Returns:** `string`"
  ^js [tab]
  (.-label ^js tab))

(defn group
  "The group which the tab belongs to.
   
   **Returns:** `TabGroup`"
  ^js [tab]
  (.-group ^js tab))

(defn input
  "Defines the structure of the tab i.e. text, notebook, custom, etc.
   Resource and other useful properties are defined on the tab kind.
   
   **Returns:** `unknown`"
  ^js [tab]
  (.-input ^js tab))

(defn active?
  "Whether or not the tab is currently active.
   This is dictated by being the selected tab in the group.
   
   **Returns:** `boolean`"
  ^js [tab]
  (.-isActive ^js tab))

(defn dirty?
  "Whether or not the dirty indicator is present on the tab.
   
   **Returns:** `boolean`"
  ^js [tab]
  (.-isDirty ^js tab))

(defn pinned?
  "Whether or not the tab is pinned (pin icon is present).
   
   **Returns:** `boolean`"
  ^js [tab]
  (.-isPinned ^js tab))

(defn preview?
  "Whether or not the tab is in preview mode.
   
   **Returns:** `boolean`"
  ^js [tab]
  (.-isPreview ^js tab))
