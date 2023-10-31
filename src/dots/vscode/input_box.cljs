(ns dots.vscode.input-box
  "A concrete {@link QuickInput } to let the user input a text value.
   
   Note that in many cases the more convenient {@link window.showInputBox }
   is easier to use. {@link window.createInputBox } should be used
   when {@link window.showInputBox } does not offer the required flexibility.")

(defn value
  "Current input value."
  ^js [input-box]
  (.-value ^js input-box))

(defn set-value!
  "Current input value."
  ^js [input-box value]
  (set! (.-value ^js input-box) value))

(defn placeholder
  "Optional placeholder in the filter text."
  ^js [input-box]
  (.-placeholder ^js input-box))

(defn set-placeholder!
  "Optional placeholder in the filter text."
  ^js [input-box value]
  (set! (.-placeholder ^js input-box) value))

(defn password?
  "If the input value should be hidden. Defaults to false."
  ^js [input-box]
  (.-password ^js input-box))

(defn set-password!
  "If the input value should be hidden. Defaults to false."
  ^js [input-box value]
  (set! (.-password ^js input-box) value))

(defn on-did-change-value
  "An event signaling when the value has changed."
  (^js [input-box]
   (.-onDidChangeValue ^js input-box))
  (^js [input-box listener]
   (.onDidChangeValue ^js input-box listener))
  (^js [input-box listener this-args]
   (.onDidChangeValue ^js input-box listener this-args))
  (^js [input-box listener this-args disposables]
   (.onDidChangeValue ^js input-box listener this-args disposables)))

(defn on-did-accept
  "An event signaling when the user indicated acceptance of the input value."
  (^js [input-box]
   (.-onDidAccept ^js input-box))
  (^js [input-box listener]
   (.onDidAccept ^js input-box listener))
  (^js [input-box listener this-args]
   (.onDidAccept ^js input-box listener this-args))
  (^js [input-box listener this-args disposables]
   (.onDidAccept ^js input-box listener this-args disposables)))

(defn buttons
  "Buttons for actions in the UI."
  ^js [input-box]
  (.-buttons ^js input-box))

(defn set-buttons!
  "Buttons for actions in the UI."
  ^js [input-box value]
  (set! (.-buttons ^js input-box) value))

(defn on-did-trigger-button
  "An event signaling when a button was triggered."
  (^js [input-box]
   (.-onDidTriggerButton ^js input-box))
  (^js [input-box listener]
   (.onDidTriggerButton ^js input-box listener))
  (^js [input-box listener this-args]
   (.onDidTriggerButton ^js input-box listener this-args))
  (^js [input-box listener this-args disposables]
   (.onDidTriggerButton ^js input-box listener this-args disposables)))

(defn prompt
  "An optional prompt text providing some ask or explanation to the user."
  ^js [input-box]
  (.-prompt ^js input-box))

(defn set-prompt!
  "An optional prompt text providing some ask or explanation to the user."
  ^js [input-box value]
  (set! (.-prompt ^js input-box) value))

(defn validation-message
  "An optional validation message indicating a problem with the current input value.
   By returning a string, the InputBox will use a default {@link InputBoxValidationSeverity } of Error.
   Returning undefined clears the validation message."
  ^js [input-box]
  (.-validationMessage ^js input-box))

(defn set-validation-message!
  "An optional validation message indicating a problem with the current input value.
   By returning a string, the InputBox will use a default {@link InputBoxValidationSeverity } of Error.
   Returning undefined clears the validation message."
  ^js [input-box value]
  (set! (.-validationMessage ^js input-box) value))

(defn title
  "An optional title."
  ^js [input-box]
  (.-title ^js input-box))

(defn set-title!
  "An optional title."
  ^js [input-box value]
  (set! (.-title ^js input-box) value))

(defn step
  "An optional current step count."
  ^js [input-box]
  (.-step ^js input-box))

(defn set-step!
  "An optional current step count."
  ^js [input-box value]
  (set! (.-step ^js input-box) value))

(defn total-steps
  "An optional total step count."
  ^js [input-box]
  (.-totalSteps ^js input-box))

(defn set-total-steps!
  "An optional total step count."
  ^js [input-box value]
  (set! (.-totalSteps ^js input-box) value))

(defn enabled?
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input."
  ^js [input-box]
  (.-enabled ^js input-box))

(defn set-enabled!
  "If the UI should allow for user input. Defaults to true.
   
   Change this to false, e.g., while validating user input or
   loading data for the next step in user input."
  ^js [input-box value]
  (set! (.-enabled ^js input-box) value))

(defn busy?
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input."
  ^js [input-box]
  (.-busy ^js input-box))

(defn set-busy!
  "If the UI should show a progress indicator. Defaults to false.
   
   Change this to true, e.g., while loading more data or validating
   user input."
  ^js [input-box value]
  (set! (.-busy ^js input-box) value))

(defn ignore-focus-out?
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false."
  ^js [input-box]
  (.-ignoreFocusOut ^js input-box))

(defn set-ignore-focus-out!
  "If the UI should stay open even when loosing UI focus. Defaults to false.
   This setting is ignored on iPad and is always false."
  ^js [input-box value]
  (set! (.-ignoreFocusOut ^js input-box) value))

(defn show
  "Makes the input UI visible in its current configuration. Any other input
   UI will first fire an {@link QuickInput.onDidHide } event."
  ^js [input-box]
  (.show ^js input-box))

(defn hide
  "Hides this input UI. This will also fire an {@link QuickInput.onDidHide }
   event."
  ^js [input-box]
  (.hide ^js input-box))

(defn on-did-hide
  "An event signaling when this input UI is hidden.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)"
  (^js [input-box]
   (.-onDidHide ^js input-box))
  (^js [input-box listener]
   (.onDidHide ^js input-box listener))
  (^js [input-box listener this-args]
   (.onDidHide ^js input-box listener this-args))
  (^js [input-box listener this-args disposables]
   (.onDidHide ^js input-box listener this-args disposables)))

(defn set-on-did-hide!
  "An event signaling when this input UI is hidden.
   
   There are several reasons why this UI might have to be hidden and
   the extension will be notified through {@link QuickInput.onDidHide }.
   (Examples include: an explicit call to {@link QuickInput.hide },
   the user pressing Esc, some other input UI opening, etc.)"
  ^js [input-box value]
  (set! (.-onDidHide ^js input-box) value))

(defn dispose
  "Dispose of this input UI and any associated resources. If it is still
   visible, it is first hidden. After this call the input UI is no longer
   functional and no additional methods or properties on it should be
   accessed. Instead a new input UI should be created."
  ^js [input-box]
  (.dispose ^js input-box))
