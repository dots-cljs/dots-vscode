(ns dots.vscode.decoration-options
  "Represents options for a specific decoration in a {@link TextEditorDecorationType decoration set}."
  (:refer-clojure :exclude [range]))

(defn range
  "Range to which this decoration is applied. The range must not be empty."
  ^js [decoration-options]
  (.-range ^js decoration-options))

(defn set-range!
  "Range to which this decoration is applied. The range must not be empty."
  ^js [decoration-options value]
  (set! (.-range ^js decoration-options) value))

(defn hover-message
  "A message that should be rendered when hovering over the decoration."
  ^js [decoration-options]
  (.-hoverMessage ^js decoration-options))

(defn set-hover-message!
  "A message that should be rendered when hovering over the decoration."
  ^js [decoration-options value]
  (set! (.-hoverMessage ^js decoration-options) value))

(defn render-options
  "Render options applied to the current decoration. For performance reasons, keep the
   number of decoration specific options small, and use decoration types wherever possible."
  ^js [decoration-options]
  (.-renderOptions ^js decoration-options))

(defn set-render-options!
  "Render options applied to the current decoration. For performance reasons, keep the
   number of decoration specific options small, and use decoration types wherever possible."
  ^js [decoration-options value]
  (set! (.-renderOptions ^js decoration-options) value))
