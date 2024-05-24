(ns dots.vscode.themable-decoration-render-options
  "Represents theme specific rendering styles for a {@link TextEditorDecorationType text editor decoration}.")

(defn background-color
  "Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
   Alternatively a color from the color registry can be {@link ThemeColor referenced}.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [themable-decoration-render-options]
  (.-backgroundColor ^js themable-decoration-render-options))

(defn set-background-color!
  "Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
   Alternatively a color from the color registry can be {@link ThemeColor referenced}."
  ^js [themable-decoration-render-options value]
  (set! (.-backgroundColor ^js themable-decoration-render-options) value))

(defn outline
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-outline ^js themable-decoration-render-options))

(defn set-outline!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-outline ^js themable-decoration-render-options) value))

(defn outline-color
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [themable-decoration-render-options]
  (.-outlineColor ^js themable-decoration-render-options))

(defn set-outline-color!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [themable-decoration-render-options value]
  (set! (.-outlineColor ^js themable-decoration-render-options) value))

(defn outline-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-outlineStyle ^js themable-decoration-render-options))

(defn set-outline-style!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [themable-decoration-render-options value]
  (set! (.-outlineStyle ^js themable-decoration-render-options) value))

(defn outline-width
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-outlineWidth ^js themable-decoration-render-options))

(defn set-outline-width!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [themable-decoration-render-options value]
  (set! (.-outlineWidth ^js themable-decoration-render-options) value))

(defn border
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-border ^js themable-decoration-render-options))

(defn set-border!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-border ^js themable-decoration-render-options) value))

(defn border-color
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [themable-decoration-render-options]
  (.-borderColor ^js themable-decoration-render-options))

(defn set-border-color!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [themable-decoration-render-options value]
  (set! (.-borderColor ^js themable-decoration-render-options) value))

(defn border-radius
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-borderRadius ^js themable-decoration-render-options))

(defn set-border-radius!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [themable-decoration-render-options value]
  (set! (.-borderRadius ^js themable-decoration-render-options) value))

(defn border-spacing
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-borderSpacing ^js themable-decoration-render-options))

(defn set-border-spacing!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [themable-decoration-render-options value]
  (set! (.-borderSpacing ^js themable-decoration-render-options) value))

(defn border-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-borderStyle ^js themable-decoration-render-options))

(defn set-border-style!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [themable-decoration-render-options value]
  (set! (.-borderStyle ^js themable-decoration-render-options) value))

(defn border-width
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-borderWidth ^js themable-decoration-render-options))

(defn set-border-width!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [themable-decoration-render-options value]
  (set! (.-borderWidth ^js themable-decoration-render-options) value))

(defn font-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-fontStyle ^js themable-decoration-render-options))

(defn set-font-style!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-fontStyle ^js themable-decoration-render-options) value))

(defn font-weight
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-fontWeight ^js themable-decoration-render-options))

(defn set-font-weight!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-fontWeight ^js themable-decoration-render-options) value))

(defn text-decoration
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-textDecoration ^js themable-decoration-render-options))

(defn set-text-decoration!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-textDecoration ^js themable-decoration-render-options) value))

(defn cursor
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-cursor ^js themable-decoration-render-options))

(defn set-cursor!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-cursor ^js themable-decoration-render-options) value))

(defn color
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [themable-decoration-render-options]
  (.-color ^js themable-decoration-render-options))

(defn set-color!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-color ^js themable-decoration-render-options) value))

(defn opacity
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-opacity ^js themable-decoration-render-options))

(defn set-opacity!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-opacity ^js themable-decoration-render-options) value))

(defn letter-spacing
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-letterSpacing ^js themable-decoration-render-options))

(defn set-letter-spacing!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [themable-decoration-render-options value]
  (set! (.-letterSpacing ^js themable-decoration-render-options) value))

(defn gutter-icon-path
  "An **absolute path** or an URI to an image to be rendered in the gutter.
   
   **Returns:** `string | Uri | undefined`"
  ^js [themable-decoration-render-options]
  (.-gutterIconPath ^js themable-decoration-render-options))

(defn set-gutter-icon-path!
  "An **absolute path** or an URI to an image to be rendered in the gutter."
  ^js [themable-decoration-render-options value]
  (set! (.-gutterIconPath ^js themable-decoration-render-options) value))

(defn gutter-icon-size
  "Specifies the size of the gutter icon.
   Available values are 'auto', 'contain', 'cover' and any percentage value.
   For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
   
   **Returns:** `string | undefined`"
  ^js [themable-decoration-render-options]
  (.-gutterIconSize ^js themable-decoration-render-options))

(defn set-gutter-icon-size!
  "Specifies the size of the gutter icon.
   Available values are 'auto', 'contain', 'cover' and any percentage value.
   For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx"
  ^js [themable-decoration-render-options value]
  (set! (.-gutterIconSize ^js themable-decoration-render-options) value))

(defn overview-ruler-color
  "The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [themable-decoration-render-options]
  (.-overviewRulerColor ^js themable-decoration-render-options))

(defn set-overview-ruler-color!
  "The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations."
  ^js [themable-decoration-render-options value]
  (set! (.-overviewRulerColor ^js themable-decoration-render-options) value))

(defn before
  "Defines the rendering options of the attachment that is inserted before the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [themable-decoration-render-options]
  (.-before ^js themable-decoration-render-options))

(defn set-before!
  "Defines the rendering options of the attachment that is inserted before the decorated text."
  ^js [themable-decoration-render-options value]
  (set! (.-before ^js themable-decoration-render-options) value))

(defn after
  "Defines the rendering options of the attachment that is inserted after the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [themable-decoration-render-options]
  (.-after ^js themable-decoration-render-options))

(defn set-after!
  "Defines the rendering options of the attachment that is inserted after the decorated text."
  ^js [themable-decoration-render-options value]
  (set! (.-after ^js themable-decoration-render-options) value))
