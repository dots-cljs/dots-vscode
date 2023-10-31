(ns dots.vscode.tree-item)

(defn label
  "A human-readable string describing this item. When `falsy`, it is derived from {@link TreeItem.resourceUri resourceUri}."
  ^js [tree-item]
  (.-label ^js tree-item))

(defn set-label!
  "A human-readable string describing this item. When `falsy`, it is derived from {@link TreeItem.resourceUri resourceUri}."
  ^js [tree-item value]
  (set! (.-label ^js tree-item) value))

(defn id
  "Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
   
   If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore."
  ^js [tree-item]
  (.-id ^js tree-item))

(defn set-id!
  "Optional id for the tree item that has to be unique across tree. The id is used to preserve the selection and expansion state of the tree item.
   
   If not provided, an id is generated using the tree item's label. **Note** that when labels change, ids will change and that selection and expansion state cannot be kept stable anymore."
  ^js [tree-item value]
  (set! (.-id ^js tree-item) value))

(defn icon-path
  "The icon path or {@link ThemeIcon } for the tree item.
   When `falsy`, {@link ThemeIcon.Folder Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon}.
   When a file or folder {@link ThemeIcon } is specified, icon is derived from the current file icon theme for the specified theme icon using {@link TreeItem.resourceUri resourceUri} (if provided)."
  ^js [tree-item]
  (.-iconPath ^js tree-item))

(defn set-icon-path!
  "The icon path or {@link ThemeIcon } for the tree item.
   When `falsy`, {@link ThemeIcon.Folder Folder Theme Icon} is assigned, if item is collapsible otherwise {@link ThemeIcon.File File Theme Icon}.
   When a file or folder {@link ThemeIcon } is specified, icon is derived from the current file icon theme for the specified theme icon using {@link TreeItem.resourceUri resourceUri} (if provided)."
  ^js [tree-item value]
  (set! (.-iconPath ^js tree-item) value))

(defn description?
  "A human-readable string which is rendered less prominent.
   When `true`, it is derived from {@link TreeItem.resourceUri resourceUri} and when `falsy`, it is not shown."
  ^js [tree-item]
  (.-description ^js tree-item))

(defn set-description!
  "A human-readable string which is rendered less prominent.
   When `true`, it is derived from {@link TreeItem.resourceUri resourceUri} and when `falsy`, it is not shown."
  ^js [tree-item value]
  (set! (.-description ^js tree-item) value))

(defn resource-uri
  "The {@link Uri } of the resource representing this item.
   
   Will be used to derive the {@link TreeItem.label label}, when it is not provided.
   Will be used to derive the icon from current file icon theme, when {@link TreeItem.iconPath iconPath} has {@link ThemeIcon } value."
  ^js [tree-item]
  (.-resourceUri ^js tree-item))

(defn set-resource-uri!
  "The {@link Uri } of the resource representing this item.
   
   Will be used to derive the {@link TreeItem.label label}, when it is not provided.
   Will be used to derive the icon from current file icon theme, when {@link TreeItem.iconPath iconPath} has {@link ThemeIcon } value."
  ^js [tree-item value]
  (set! (.-resourceUri ^js tree-item) value))

(defn tooltip
  "The tooltip text when you hover over this item."
  ^js [tree-item]
  (.-tooltip ^js tree-item))

(defn set-tooltip!
  "The tooltip text when you hover over this item."
  ^js [tree-item value]
  (set! (.-tooltip ^js tree-item) value))

(defn command
  "The {@link Command } that should be executed when the tree item is selected.
   
   Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
   something in the editor. Using these commands ensures that the resulting editor will
   appear consistent with how other built-in trees open editors."
  ^js [tree-item]
  (.-command ^js tree-item))

(defn set-command!
  "The {@link Command } that should be executed when the tree item is selected.
   
   Please use `vscode.open` or `vscode.diff` as command IDs when the tree item is opening
   something in the editor. Using these commands ensures that the resulting editor will
   appear consistent with how other built-in trees open editors."
  ^js [tree-item value]
  (set! (.-command ^js tree-item) value))

(defn collapsible-state
  "{@link TreeItemCollapsibleState } of the tree item."
  ^js [tree-item]
  (.-collapsibleState ^js tree-item))

(defn set-collapsible-state!
  "{@link TreeItemCollapsibleState } of the tree item."
  ^js [tree-item value]
  (set! (.-collapsibleState ^js tree-item) value))

(defn context-value
  "Context value of the tree item. This can be used to contribute item specific actions in the tree.
   For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
   using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
   ```json
   \"contributes\": {
     \"menus\": {
       \"view/item/context\": [
         {
           \"command\": \"extension.deleteFolder\",
           \"when\": \"viewItem == folder\"
         }
       ]
     }
   }
   ```
   This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`."
  ^js [tree-item]
  (.-contextValue ^js tree-item))

(defn set-context-value!
  "Context value of the tree item. This can be used to contribute item specific actions in the tree.
   For example, a tree item is given a context value as `folder`. When contributing actions to `view/item/context`
   using `menus` extension point, you can specify context value for key `viewItem` in `when` expression like `viewItem == folder`.
   ```json
   \"contributes\": {
     \"menus\": {
       \"view/item/context\": [
         {
           \"command\": \"extension.deleteFolder\",
           \"when\": \"viewItem == folder\"
         }
       ]
     }
   }
   ```
   This will show action `extension.deleteFolder` only for items with `contextValue` is `folder`."
  ^js [tree-item value]
  (set! (.-contextValue ^js tree-item) value))

(defn accessibility-information
  "Accessibility information used when screen reader interacts with this tree item.
   Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
   however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense."
  ^js [tree-item]
  (.-accessibilityInformation ^js tree-item))

(defn set-accessibility-information!
  "Accessibility information used when screen reader interacts with this tree item.
   Generally, a TreeItem has no need to set the `role` of the accessibilityInformation;
   however, there are cases where a TreeItem is not displayed in a tree-like way where setting the `role` may make sense."
  ^js [tree-item value]
  (set! (.-accessibilityInformation ^js tree-item) value))
