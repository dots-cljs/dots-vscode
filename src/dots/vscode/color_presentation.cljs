(ns dots.vscode.color-presentation
  "A color presentation object describes how a {@linkcode Color } should be represented as text and what
   edits are required to refer to it from source code.
   
   For some languages one color can have multiple presentations, e.g. css can represent the color red with
   the constant `Red`, the hex-value `#ff0000`, or in rgba and hsla forms. In csharp other representations
   apply, e.g. `System.Drawing.Color.Red`.")

(defn label
  "The label of this color presentation. It will be shown on the color
   picker header. By default this is also the text that is inserted when selecting
   this color presentation."
  ^js [color-presentation]
  (.-label ^js color-presentation))

(defn set-label!
  "The label of this color presentation. It will be shown on the color
   picker header. By default this is also the text that is inserted when selecting
   this color presentation."
  ^js [color-presentation value]
  (set! (.-label ^js color-presentation) value))

(defn text-edit
  "An {@link TextEdit edit} which is applied to a document when selecting
   this presentation for the color.  When `falsy` the {@link ColorPresentation.label label}
   is used."
  ^js [color-presentation]
  (.-textEdit ^js color-presentation))

(defn set-text-edit!
  "An {@link TextEdit edit} which is applied to a document when selecting
   this presentation for the color.  When `falsy` the {@link ColorPresentation.label label}
   is used."
  ^js [color-presentation value]
  (set! (.-textEdit ^js color-presentation) value))

(defn additional-text-edits
  "An optional array of additional {@link TextEdit text edits} that are applied when
   selecting this color presentation. Edits must not overlap with the main {@link ColorPresentation.textEdit edit} nor with themselves."
  ^js [color-presentation]
  (.-additionalTextEdits ^js color-presentation))

(defn set-additional-text-edits!
  "An optional array of additional {@link TextEdit text edits} that are applied when
   selecting this color presentation. Edits must not overlap with the main {@link ColorPresentation.textEdit edit} nor with themselves."
  ^js [color-presentation value]
  (set! (.-additionalTextEdits ^js color-presentation) value))
