(ns dots.vscode.text-editor-decoration-type
  "Represents a handle to a set of decorations
   sharing the same {@link DecorationRenderOptions styling options} in a {@link TextEditor text editor}.
   
   To get an instance of a `TextEditorDecorationType` use
   {@link window.createTextEditorDecorationType createTextEditorDecorationType}."
  (:refer-clojure :exclude [key]))

(defn key
  "Internal representation of the handle.
   
   **Returns:** `string`"
  ^js [text-editor-decoration-type]
  (.-key ^js text-editor-decoration-type))

(defn dispose
  "Remove this decoration type and all decorations on all text editors using it.
   
   **Returns:** `void`"
  ^js [text-editor-decoration-type]
  (.dispose ^js text-editor-decoration-type))
