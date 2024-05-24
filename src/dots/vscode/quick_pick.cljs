(ns dots.vscode.quick-pick
  "A concrete {@link QuickInput } to let the user pick an item from a
   list of items of type T. The items can be filtered through a filter text field and
   there is an option {@link QuickPick.canSelectMany canSelectMany} to allow for
   selecting multiple items.
   
   Note that in many cases the more convenient {@link window.showQuickPick }
   is easier to use. {@link window.createQuickPick } should be used
   when {@link window.showQuickPick } does not offer the required flexibility.")

(defn value
  "Current value of the filter text.
   
   **Returns:** `string`"
  ^js [quick-pick]
  (.-value ^js quick-pick))

(defn set-value!
  "Current value of the filter text."
  ^js [quick-pick value]
  (set! (.-value ^js quick-pick) value))

(defn placeholder
  "Optional placeholder shown in the filter textbox when no filter has been entered.
   
   **Returns:** `string | undefined`"
  ^js [quick-pick]
  (.-placeholder ^js quick-pick))

(defn set-placeholder!
  "Optional placeholder shown in the filter textbox when no filter has been entered."
  ^js [quick-pick value]
  (set! (.-placeholder ^js quick-pick) value))

(defn on-did-change-value
  "An event signaling when the value of the filter text has changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidChangeValue ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidChangeValue ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidChangeValue ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidChangeValue ^js quick-pick listener this-args disposables)))

(defn on-did-accept
  "An event signaling when the user indicated acceptance of the selected item(s).
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidAccept ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidAccept ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidAccept ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidAccept ^js quick-pick listener this-args disposables)))

(defn buttons
  "Buttons for actions in the UI.
   
   **Returns:** `readonly QuickInputButton[]`"
  ^js [quick-pick]
  (.-buttons ^js quick-pick))

(defn set-buttons!
  "Buttons for actions in the UI."
  ^js [quick-pick value]
  (set! (.-buttons ^js quick-pick) value))

(defn on-did-trigger-button
  "An event signaling when a button in the title bar was triggered.
   This event does not fire for buttons on a {@link QuickPickItem }.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidTriggerButton ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidTriggerButton ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidTriggerButton ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidTriggerButton ^js quick-pick listener this-args disposables)))

(defn on-did-trigger-item-button
  "An event signaling when a button in a particular {@link QuickPickItem } was triggered.
   This event does not fire for buttons in the title bar.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidTriggerItemButton ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidTriggerItemButton ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidTriggerItemButton ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidTriggerItemButton ^js quick-pick listener this-args disposables)))

(defn items
  "Items to pick from. This can be read and updated by the extension.
   
   **Returns:** `readonly T[]`"
  ^js [quick-pick]
  (.-items ^js quick-pick))

(defn set-items!
  "Items to pick from. This can be read and updated by the extension."
  ^js [quick-pick value]
  (set! (.-items ^js quick-pick) value))

(defn can-select-many?
  "If multiple items can be selected at the same time. Defaults to false.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-canSelectMany ^js quick-pick))

(defn set-can-select-many!
  "If multiple items can be selected at the same time. Defaults to false."
  ^js [quick-pick value]
  (set! (.-canSelectMany ^js quick-pick) value))

(defn match-on-description?
  "If the filter text should also be matched against the description of the items. Defaults to false.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-matchOnDescription ^js quick-pick))

(defn set-match-on-description!
  "If the filter text should also be matched against the description of the items. Defaults to false."
  ^js [quick-pick value]
  (set! (.-matchOnDescription ^js quick-pick) value))

(defn match-on-detail?
  "If the filter text should also be matched against the detail of the items. Defaults to false.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-matchOnDetail ^js quick-pick))

(defn set-match-on-detail!
  "If the filter text should also be matched against the detail of the items. Defaults to false."
  ^js [quick-pick value]
  (set! (.-matchOnDetail ^js quick-pick) value))

(defn keep-scroll-position?
  "An optional flag to maintain the scroll position of the quick pick when the quick pick items are updated. Defaults to false.
   
   **Returns:** `boolean | undefined`"
  ^js [quick-pick]
  (.-keepScrollPosition ^js quick-pick))

(defn set-keep-scroll-position!
  "An optional flag to maintain the scroll position of the quick pick when the quick pick items are updated. Defaults to false."
  ^js [quick-pick value]
  (set! (.-keepScrollPosition ^js quick-pick) value))

(defn active-items
  "Active items. This can be read and updated by the extension.
   
   **Returns:** `readonly T[]`"
  ^js [quick-pick]
  (.-activeItems ^js quick-pick))

(defn set-active-items!
  "Active items. This can be read and updated by the extension."
  ^js [quick-pick value]
  (set! (.-activeItems ^js quick-pick) value))

(defn on-did-change-active
  "An event signaling when the active items have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidChangeActive ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidChangeActive ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidChangeActive ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidChangeActive ^js quick-pick listener this-args disposables)))

(defn selected-items
  "Selected items. This can be read and updated by the extension.
   
   **Returns:** `readonly T[]`"
  ^js [quick-pick]
  (.-selectedItems ^js quick-pick))

(defn set-selected-items!
  "Selected items. This can be read and updated by the extension."
  ^js [quick-pick value]
  (set! (.-selectedItems ^js quick-pick) value))

(defn on-did-change-selection
  "An event signaling when the selected items have changed.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidChangeSelection ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidChangeSelection ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidChangeSelection ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidChangeSelection ^js quick-pick listener this-args disposables)))

(defn title
  "An optional title.
   
   **Returns:** `string | undefined`"
  ^js [quick-pick]
  (.-title ^js quick-pick))

(defn set-title!
  "An optional title."
  ^js [quick-pick value]
  (set! (.-title ^js quick-pick) value))

(defn step
  "An optional current step count.
   
   **Returns:** `number | undefined`"
  ^js [quick-pick]
  (.-step ^js quick-pick))

(defn set-step!
  "An optional current step count."
  ^js [quick-pick value]
  (set! (.-step ^js quick-pick) value))

(defn total-steps
  "An optional total step count.
   
   **Returns:** `number | undefined`"
  ^js [quick-pick]
  (.-totalSteps ^js quick-pick))

(defn set-total-steps!
  "An optional total step count."
  ^js [quick-pick value]
  (set! (.-totalSteps ^js quick-pick) value))

(defn enabled?
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-enabled ^js quick-pick))

(defn set-enabled!
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input."
  ^js [quick-pick value]
  (set! (.-enabled ^js quick-pick) value))

(defn busy?
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-busy ^js quick-pick))

(defn set-busy!
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input."
  ^js [quick-pick value]
  (set! (.-busy ^js quick-pick) value))

(defn ignore-focus-out?
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false.
   
   **Returns:** `boolean`"
  ^js [quick-pick]
  (.-ignoreFocusOut ^js quick-pick))

(defn set-ignore-focus-out!
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false."
  ^js [quick-pick value]
  (set! (.-ignoreFocusOut ^js quick-pick) value))

(defn show
  "Makes the input UI visible in its current configuration. Any other input
   UI will first fire an {@link QuickInput.onDidHide } event.
   
   **Returns:** `void`"
  ^js [quick-pick]
  (.show ^js quick-pick))

(defn hide
  "Hides this input UI. This will also fire an {@link QuickInput.onDidHide }
   event.
   
   **Returns:** `void`"
  ^js [quick-pick]
  (.hide ^js quick-pick))

(defn on-did-hide
  "An event signaling when this input UI is hidden.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [quick-pick]
   (.-onDidHide ^js quick-pick))
  (^js [quick-pick listener]
   (.onDidHide ^js quick-pick listener))
  (^js [quick-pick listener this-args]
   (.onDidHide ^js quick-pick listener this-args))
  (^js [quick-pick listener this-args disposables]
   (.onDidHide ^js quick-pick listener this-args disposables)))

(defn set-on-did-hide!
  "An event signaling when this input UI is hidden.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)"
  ^js [quick-pick value]
  (set! (.-onDidHide ^js quick-pick) value))

(defn dispose
  "Dispose of this input UI and any associated resources. If it is still
   visible, it is first hidden. After this call the input UI is no longer
   functional and no additional methods or properties on it should be
   accessed. Instead a new input UI should be created.
   
   **Returns:** `void`"
  ^js [quick-pick]
  (.dispose ^js quick-pick))
