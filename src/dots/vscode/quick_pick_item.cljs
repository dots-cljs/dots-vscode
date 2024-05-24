(ns dots.vscode.quick-pick-item
  "Represents an item that can be selected from
   a list of items.")

(defn label
  "A human-readable string which is rendered prominent. Supports rendering of {@link ThemeIcon theme icons} via
   the `$(<name>)`-syntax."
  ^js [quick-pick-item]
  (.-label ^js quick-pick-item))

(defn set-label!
  "A human-readable string which is rendered prominent. Supports rendering of {@link ThemeIcon theme icons} via
   the `$(<name>)`-syntax."
  ^js [quick-pick-item value]
  (set! (.-label ^js quick-pick-item) value))

(defn kind
  "The kind of QuickPickItem that will determine how this item is rendered in the quick pick. When not specified,
   the default is {@link QuickPickItemKind.Default }."
  ^js [quick-pick-item]
  (.-kind ^js quick-pick-item))

(defn set-kind!
  "The kind of QuickPickItem that will determine how this item is rendered in the quick pick. When not specified,
   the default is {@link QuickPickItemKind.Default }."
  ^js [quick-pick-item value]
  (set! (.-kind ^js quick-pick-item) value))

(defn icon-path
  "The icon path or {@link ThemeIcon } for the QuickPickItem."
  ^js [quick-pick-item]
  (.-iconPath ^js quick-pick-item))

(defn set-icon-path!
  "The icon path or {@link ThemeIcon } for the QuickPickItem."
  ^js [quick-pick-item value]
  (set! (.-iconPath ^js quick-pick-item) value))

(defn description
  "A human-readable string which is rendered less prominent in the same line. Supports rendering of
   {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item]
  (.-description ^js quick-pick-item))

(defn set-description!
  "A human-readable string which is rendered less prominent in the same line. Supports rendering of
   {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item value]
  (set! (.-description ^js quick-pick-item) value))

(defn detail
  "A human-readable string which is rendered less prominent in a separate line. Supports rendering of
   {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item]
  (.-detail ^js quick-pick-item))

(defn set-detail!
  "A human-readable string which is rendered less prominent in a separate line. Supports rendering of
   {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item value]
  (set! (.-detail ^js quick-pick-item) value))

(defn picked?
  "Optional flag indicating if this item is picked initially. This is only honored when using
   the {@link window.showQuickPick showQuickPick()} API. To do the same thing with
   the {@link window.createQuickPick createQuickPick()} API, simply set the {@link QuickPick.selectedItems }
   to the items you want picked initially.
   (*Note:* This is only honored when the picker allows multiple selections.)"
  ^js [quick-pick-item]
  (.-picked ^js quick-pick-item))

(defn set-picked!
  "Optional flag indicating if this item is picked initially. This is only honored when using
   the {@link window.showQuickPick showQuickPick()} API. To do the same thing with
   the {@link window.createQuickPick createQuickPick()} API, simply set the {@link QuickPick.selectedItems }
   to the items you want picked initially.
   (*Note:* This is only honored when the picker allows multiple selections.)"
  ^js [quick-pick-item value]
  (set! (.-picked ^js quick-pick-item) value))

(defn always-show?
  "Always show this item.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item]
  (.-alwaysShow ^js quick-pick-item))

(defn set-always-show!
  "Always show this item.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item value]
  (set! (.-alwaysShow ^js quick-pick-item) value))

(defn buttons
  "Optional buttons that will be rendered on this particular item. These buttons will trigger
   an {@link QuickPickItemButtonEvent } when clicked. Buttons are only rendered when using a quickpick
   created by the {@link window.createQuickPick createQuickPick()} API. Buttons are not rendered when using
   the {@link window.showQuickPick showQuickPick()} API.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item]
  (.-buttons ^js quick-pick-item))

(defn set-buttons!
  "Optional buttons that will be rendered on this particular item. These buttons will trigger
   an {@link QuickPickItemButtonEvent } when clicked. Buttons are only rendered when using a quickpick
   created by the {@link window.createQuickPick createQuickPick()} API. Buttons are not rendered when using
   the {@link window.showQuickPick showQuickPick()} API.
   
   Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator }"
  ^js [quick-pick-item value]
  (set! (.-buttons ^js quick-pick-item) value))
