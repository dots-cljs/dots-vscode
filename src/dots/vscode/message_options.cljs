(ns dots.vscode.message-options
  "Options to configure the behavior of the message.")

(defn modal?
  "Indicates that this message should be modal.
   
   **Returns:** `boolean | undefined`"
  ^js [message-options]
  (.-modal ^js message-options))

(defn set-modal!
  "Indicates that this message should be modal."
  ^js [message-options value]
  (set! (.-modal ^js message-options) value))

(defn detail
  "Human-readable detail message that is rendered less prominent. _Note_ that detail
   is only shown for {@link MessageOptions.modal modal} messages.
   
   **Returns:** `string | undefined`"
  ^js [message-options]
  (.-detail ^js message-options))

(defn set-detail!
  "Human-readable detail message that is rendered less prominent. _Note_ that detail
   is only shown for {@link MessageOptions.modal modal} messages."
  ^js [message-options value]
  (set! (.-detail ^js message-options) value))
