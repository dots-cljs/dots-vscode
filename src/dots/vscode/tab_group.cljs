(ns dots.vscode.tab-group
  "Represents a group of tabs. A tab group itself consists of multiple tabs.")

(defn active?
  "Whether or not the group is currently active.
   
   *Note* that only one tab group is active at a time, but that multiple tab
   groups can have an {@link TabGroup.aciveTab active tab}."
  ^js [tab-group]
  (.-isActive ^js tab-group))

(defn view-column
  "The view column of the group."
  ^js [tab-group]
  (.-viewColumn ^js tab-group))

(defn active-tab
  "The active {@link Tab tab} in the group. This is the tab whose contents are currently
   being rendered.
   
   *Note* that there can be one active tab per group but there can only be one {@link TabGroups.activeTabGroup active group}."
  ^js [tab-group]
  (.-activeTab ^js tab-group))

(defn tabs
  "The list of tabs contained within the group.
   This can be empty if the group has no tabs open."
  ^js [tab-group]
  (.-tabs ^js tab-group))
