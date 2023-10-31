(ns dots.vscode.decoration-instance-render-options)

(defn light
  "Overwrite options for light themes."
  ^js [decoration-instance-render-options]
  (.-light ^js decoration-instance-render-options))

(defn set-light!
  "Overwrite options for light themes."
  ^js [decoration-instance-render-options value]
  (set! (.-light ^js decoration-instance-render-options) value))

(defn dark
  "Overwrite options for dark themes."
  ^js [decoration-instance-render-options]
  (.-dark ^js decoration-instance-render-options))

(defn set-dark!
  "Overwrite options for dark themes."
  ^js [decoration-instance-render-options value]
  (set! (.-dark ^js decoration-instance-render-options) value))

(defn before
  "Defines the rendering options of the attachment that is inserted before the decorated text."
  ^js [decoration-instance-render-options]
  (.-before ^js decoration-instance-render-options))

(defn set-before!
  "Defines the rendering options of the attachment that is inserted before the decorated text."
  ^js [decoration-instance-render-options value]
  (set! (.-before ^js decoration-instance-render-options) value))

(defn after
  "Defines the rendering options of the attachment that is inserted after the decorated text."
  ^js [decoration-instance-render-options]
  (.-after ^js decoration-instance-render-options))

(defn set-after!
  "Defines the rendering options of the attachment that is inserted after the decorated text."
  ^js [decoration-instance-render-options value]
  (set! (.-after ^js decoration-instance-render-options) value))
