(ns dots.vscode.decoration-render-options
  "Represents rendering styles for a {@link TextEditorDecorationType text editor decoration}.")

(defn whole-line?
  "Should the decoration be rendered also on the whitespace after the line text.
   Defaults to `false`.
   
   **Returns:** `boolean | undefined`"
  ^js [decoration-render-options]
  (.-isWholeLine ^js decoration-render-options))

(defn set-is-whole-line!
  "Should the decoration be rendered also on the whitespace after the line text.
   Defaults to `false`."
  ^js [decoration-render-options value]
  (set! (.-isWholeLine ^js decoration-render-options) value))

(defn range-behavior
  "Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
   Defaults to `DecorationRangeBehavior.OpenOpen`.
   
   **Returns:** `DecorationRangeBehavior | undefined`"
  ^js [decoration-render-options]
  (.-rangeBehavior ^js decoration-render-options))

(defn set-range-behavior!
  "Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
   Defaults to `DecorationRangeBehavior.OpenOpen`."
  ^js [decoration-render-options value]
  (set! (.-rangeBehavior ^js decoration-render-options) value))

(defn overview-ruler-lane
  "The position in the overview ruler where the decoration should be rendered.
   
   **Returns:** `OverviewRulerLane | undefined`"
  ^js [decoration-render-options]
  (.-overviewRulerLane ^js decoration-render-options))

(defn set-overview-ruler-lane!
  "The position in the overview ruler where the decoration should be rendered."
  ^js [decoration-render-options value]
  (set! (.-overviewRulerLane ^js decoration-render-options) value))

(defn light
  "Overwrite options for light themes.
   
   **Returns:** `ThemableDecorationRenderOptions | undefined`"
  ^js [decoration-render-options]
  (.-light ^js decoration-render-options))

(defn set-light!
  "Overwrite options for light themes."
  ^js [decoration-render-options value]
  (set! (.-light ^js decoration-render-options) value))

(defn dark
  "Overwrite options for dark themes.
   
   **Returns:** `ThemableDecorationRenderOptions | undefined`"
  ^js [decoration-render-options]
  (.-dark ^js decoration-render-options))

(defn set-dark!
  "Overwrite options for dark themes."
  ^js [decoration-render-options value]
  (set! (.-dark ^js decoration-render-options) value))

(defn background-color
  "Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
   Alternatively a color from the color registry can be {@link ThemeColor referenced}.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [decoration-render-options]
  (.-backgroundColor ^js decoration-render-options))

(defn set-background-color!
  "Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
   Alternatively a color from the color registry can be {@link ThemeColor referenced}."
  ^js [decoration-render-options value]
  (set! (.-backgroundColor ^js decoration-render-options) value))

(defn outline
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-outline ^js decoration-render-options))

(defn set-outline!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-outline ^js decoration-render-options) value))

(defn outline-color
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [decoration-render-options]
  (.-outlineColor ^js decoration-render-options))

(defn set-outline-color!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [decoration-render-options value]
  (set! (.-outlineColor ^js decoration-render-options) value))

(defn outline-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-outlineStyle ^js decoration-render-options))

(defn set-outline-style!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [decoration-render-options value]
  (set! (.-outlineStyle ^js decoration-render-options) value))

(defn outline-width
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-outlineWidth ^js decoration-render-options))

(defn set-outline-width!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'outline' for setting one or more of the individual outline properties."
  ^js [decoration-render-options value]
  (set! (.-outlineWidth ^js decoration-render-options) value))

(defn border
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-border ^js decoration-render-options))

(defn set-border!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-border ^js decoration-render-options) value))

(defn border-color
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [decoration-render-options]
  (.-borderColor ^js decoration-render-options))

(defn set-border-color!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [decoration-render-options value]
  (set! (.-borderColor ^js decoration-render-options) value))

(defn border-radius
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-borderRadius ^js decoration-render-options))

(defn set-border-radius!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [decoration-render-options value]
  (set! (.-borderRadius ^js decoration-render-options) value))

(defn border-spacing
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-borderSpacing ^js decoration-render-options))

(defn set-border-spacing!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [decoration-render-options value]
  (set! (.-borderSpacing ^js decoration-render-options) value))

(defn border-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-borderStyle ^js decoration-render-options))

(defn set-border-style!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [decoration-render-options value]
  (set! (.-borderStyle ^js decoration-render-options) value))

(defn border-width
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-borderWidth ^js decoration-render-options))

(defn set-border-width!
  "CSS styling property that will be applied to text enclosed by a decoration.
   Better use 'border' for setting one or more of the individual border properties."
  ^js [decoration-render-options value]
  (set! (.-borderWidth ^js decoration-render-options) value))

(defn font-style
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-fontStyle ^js decoration-render-options))

(defn set-font-style!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-fontStyle ^js decoration-render-options) value))

(defn font-weight
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-fontWeight ^js decoration-render-options))

(defn set-font-weight!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-fontWeight ^js decoration-render-options) value))

(defn text-decoration
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-textDecoration ^js decoration-render-options))

(defn set-text-decoration!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-textDecoration ^js decoration-render-options) value))

(defn cursor
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-cursor ^js decoration-render-options))

(defn set-cursor!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-cursor ^js decoration-render-options) value))

(defn color
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [decoration-render-options]
  (.-color ^js decoration-render-options))

(defn set-color!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-color ^js decoration-render-options) value))

(defn opacity
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-opacity ^js decoration-render-options))

(defn set-opacity!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-opacity ^js decoration-render-options) value))

(defn letter-spacing
  "CSS styling property that will be applied to text enclosed by a decoration.
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-letterSpacing ^js decoration-render-options))

(defn set-letter-spacing!
  "CSS styling property that will be applied to text enclosed by a decoration."
  ^js [decoration-render-options value]
  (set! (.-letterSpacing ^js decoration-render-options) value))

(defn gutter-icon-path
  "An **absolute path** or an URI to an image to be rendered in the gutter.
   
   **Returns:** `string | Uri | undefined`"
  ^js [decoration-render-options]
  (.-gutterIconPath ^js decoration-render-options))

(defn set-gutter-icon-path!
  "An **absolute path** or an URI to an image to be rendered in the gutter."
  ^js [decoration-render-options value]
  (set! (.-gutterIconPath ^js decoration-render-options) value))

(defn gutter-icon-size
  "Specifies the size of the gutter icon.
   Available values are 'auto', 'contain', 'cover' and any percentage value.
   For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
   
   **Returns:** `string | undefined`"
  ^js [decoration-render-options]
  (.-gutterIconSize ^js decoration-render-options))

(defn set-gutter-icon-size!
  "Specifies the size of the gutter icon.
   Available values are 'auto', 'contain', 'cover' and any percentage value.
   For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx"
  ^js [decoration-render-options value]
  (set! (.-gutterIconSize ^js decoration-render-options) value))

(defn overview-ruler-color
  "The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
   
   **Returns:** `string | ThemeColor | undefined`"
  ^js [decoration-render-options]
  (.-overviewRulerColor ^js decoration-render-options))

(defn set-overview-ruler-color!
  "The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations."
  ^js [decoration-render-options value]
  (set! (.-overviewRulerColor ^js decoration-render-options) value))

(defn before
  "Defines the rendering options of the attachment that is inserted before the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [decoration-render-options]
  (.-before ^js decoration-render-options))

(defn set-before!
  "Defines the rendering options of the attachment that is inserted before the decorated text."
  ^js [decoration-render-options value]
  (set! (.-before ^js decoration-render-options) value))

(defn after
  "Defines the rendering options of the attachment that is inserted after the decorated text.
   
   **Returns:** `ThemableDecorationAttachmentRenderOptions | undefined`"
  ^js [decoration-render-options]
  (.-after ^js decoration-render-options))

(defn set-after!
  "Defines the rendering options of the attachment that is inserted after the decorated text."
  ^js [decoration-render-options value]
  (set! (.-after ^js decoration-render-options) value))
