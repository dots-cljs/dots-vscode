(ns dots.vscode.input-box-validation-message
  "Object to configure the behavior of the validation message.")

(defn message
  "The validation message to display.
   
   **Returns:** `string`"
  ^js [input-box-validation-message]
  (.-message ^js input-box-validation-message))

(defn severity
  "The severity of the validation message.
   NOTE: When using `InputBoxValidationSeverity.Error`, the user will not be allowed to accept (hit ENTER) the input.
   `Info` and `Warning` will still allow the InputBox to accept the input.
   
   **Returns:** `InputBoxValidationSeverity`"
  ^js [input-box-validation-message]
  (.-severity ^js input-box-validation-message))
