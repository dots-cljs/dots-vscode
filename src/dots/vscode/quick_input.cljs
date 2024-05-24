(ns dots.vscode.quick-input
  "A light-weight user input UI that is initially not visible. After
   configuring it through its properties the extension can make it
   visible by calling {@link QuickInput.show }.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)
   
   A user pressing Enter or some other gesture implying acceptance
   of the current state does not automatically hide this UI component.
   It is up to the extension to decide whether to accept the user's input
   and if the UI should indeed be hidden through a call to {@link QuickInput.hide }.
   
   When the extension no longer needs this input UI, it should
   {@link QuickInput.dispose } it to allow for freeing up
   any resources associated with it.
   
   See {@link QuickPick } and {@link InputBox } for concrete UIs.")

(defn title
  "An optional title.
   
   **Returns:** `string | undefined`"
  ^js [quick-input]
  (.-title ^js quick-input))

(defn set-title!
  "An optional title."
  ^js [quick-input value]
  (set! (.-title ^js quick-input) value))

(defn step
  "An optional current step count.
   
   **Returns:** `number | undefined`"
  ^js [quick-input]
  (.-step ^js quick-input))

(defn set-step!
  "An optional current step count."
  ^js [quick-input value]
  (set! (.-step ^js quick-input) value))

(defn total-steps
  "An optional total step count.
   
   **Returns:** `number | undefined`"
  ^js [quick-input]
  (.-totalSteps ^js quick-input))

(defn set-total-steps!
  "An optional total step count."
  ^js [quick-input value]
  (set! (.-totalSteps ^js quick-input) value))

(defn enabled?
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input.
   
   **Returns:** `boolean`"
  ^js [quick-input]
  (.-enabled ^js quick-input))

(defn set-enabled!
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input."
  ^js [quick-input value]
  (set! (.-enabled ^js quick-input) value))

(defn busy?
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input.
   
   **Returns:** `boolean`"
  ^js [quick-input]
  (.-busy ^js quick-input))

(defn set-busy!
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input."
  ^js [quick-input value]
  (set! (.-busy ^js quick-input) value))

(defn ignore-focus-out?
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false.
   
   **Returns:** `boolean`"
  ^js [quick-input]
  (.-ignoreFocusOut ^js quick-input))

(defn set-ignore-focus-out!
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false."
  ^js [quick-input value]
  (set! (.-ignoreFocusOut ^js quick-input) value))

(defn show
  "Makes the input UI visible in its current configuration. Any other input
   UI will first fire an {@link QuickInput.onDidHide } event.
   
   **Returns:** `void`"
  ^js [quick-input]
  (.show ^js quick-input))

(defn hide
  "Hides this input UI. This will also fire an {@link QuickInput.onDidHide }
   event.
   
   **Returns:** `void`"
  ^js [quick-input]
  (.hide ^js quick-input))

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
  (^js [quick-input]
   (.-onDidHide ^js quick-input))
  (^js [quick-input listener]
   (.onDidHide ^js quick-input listener))
  (^js [quick-input listener this-args]
   (.onDidHide ^js quick-input listener this-args))
  (^js [quick-input listener this-args disposables]
   (.onDidHide ^js quick-input listener this-args disposables)))

(defn set-on-did-hide!
  "An event signaling when this input UI is hidden.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)"
  ^js [quick-input value]
  (set! (.-onDidHide ^js quick-input) value))

(defn dispose
  "Dispose of this input UI and any associated resources. If it is still
   visible, it is first hidden. After this call the input UI is no longer
   functional and no additional methods or properties on it should be
   accessed. Instead a new input UI should be created.
   
   **Returns:** `void`"
  ^js [quick-input]
  (.dispose ^js quick-input))
