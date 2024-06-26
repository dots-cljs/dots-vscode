(ns dots.vscode.themable-decoration-instance-render-options
  "Represents themable render options for decoration instances.")

(defn before
  "Defines the rendering options of the attachment that is inserted before the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [themable-decoration-instance-render-options]
  (.-before ^js themable-decoration-instance-render-options))

(defn set-before!
  "Defines the rendering options of the attachment that is inserted before the decorated text."
  ^js [themable-decoration-instance-render-options value]
  (set! (.-before ^js themable-decoration-instance-render-options) value))

(defn after
  "Defines the rendering options of the attachment that is inserted after the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [themable-decoration-instance-render-options]
  (.-after ^js themable-decoration-instance-render-options))

(defn set-after!
  "Defines the rendering options of the attachment that is inserted after the decorated text."
  ^js [themable-decoration-instance-render-options value]
  (set! (.-after ^js themable-decoration-instance-render-options) value))
