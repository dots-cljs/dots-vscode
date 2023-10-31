(ns dots.vscode.message-item
  "Represents an action that is shown with an information, warning, or
   error message.")

(defn title
  "A short title like 'Retry', 'Open Log' etc."
  ^js [message-item]
  (.-title ^js message-item))

(defn set-title!
  "A short title like 'Retry', 'Open Log' etc."
  ^js [message-item value]
  (set! (.-title ^js message-item) value))

(defn close-affordance?
  "A hint for modal dialogs that the item should be triggered
   when the user cancels the dialog (e.g. by pressing the ESC
   key).
   
   Note: this option is ignored for non-modal messages."
  ^js [message-item]
  (.-isCloseAffordance ^js message-item))

(defn set-is-close-affordance!
  "A hint for modal dialogs that the item should be triggered
   when the user cancels the dialog (e.g. by pressing the ESC
   key).
   
   Note: this option is ignored for non-modal messages."
  ^js [message-item value]
  (set! (.-isCloseAffordance ^js message-item) value))
