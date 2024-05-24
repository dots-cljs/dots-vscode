(ns dots.vscode.inlay-hint
  "Inlay hint information.")

(defn position
  "The position of this hint.
   
   **Returns:** `Position`"
  ^js [inlay-hint]
  (.-position ^js inlay-hint))

(defn set-position!
  "The position of this hint."
  ^js [inlay-hint value]
  (set! (.-position ^js inlay-hint) value))

(defn label
  "The label of this hint. A human readable string or an array of {@link InlayHintLabelPart label parts}.
   
   *Note* that neither the string nor the label part can be empty.
   
   **Returns:** `string | InlayHintLabelPart[]`"
  ^js [inlay-hint]
  (.-label ^js inlay-hint))

(defn set-label!
  "The label of this hint. A human readable string or an array of {@link InlayHintLabelPart label parts}.
   
   *Note* that neither the string nor the label part can be empty."
  ^js [inlay-hint value]
  (set! (.-label ^js inlay-hint) value))

(defn tooltip
  "The tooltip text when you hover over this item.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [inlay-hint]
  (.-tooltip ^js inlay-hint))

(defn set-tooltip!
  "The tooltip text when you hover over this item.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints."
  ^js [inlay-hint value]
  (set! (.-tooltip ^js inlay-hint) value))

(defn kind
  "The kind of this hint. The inlay hint kind defines the appearance of this inlay hint.
   
   **Returns:** `InlayHintKind | undefined`"
  ^js [inlay-hint]
  (.-kind ^js inlay-hint))

(defn set-kind!
  "The kind of this hint. The inlay hint kind defines the appearance of this inlay hint."
  ^js [inlay-hint value]
  (set! (.-kind ^js inlay-hint) value))

(defn text-edits
  "Optional {@link TextEdit text edits} that are performed when accepting this inlay hint. The default
   gesture for accepting an inlay hint is the double click.
   
   *Note* that edits are expected to change the document so that the inlay hint (or its nearest variant) is
   now part of the document and the inlay hint itself is now obsolete.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
   
   **Returns:** `TextEdit[] | undefined`"
  ^js [inlay-hint]
  (.-textEdits ^js inlay-hint))

(defn set-text-edits!
  "Optional {@link TextEdit text edits} that are performed when accepting this inlay hint. The default
   gesture for accepting an inlay hint is the double click.
   
   *Note* that edits are expected to change the document so that the inlay hint (or its nearest variant) is
   now part of the document and the inlay hint itself is now obsolete.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints."
  ^js [inlay-hint value]
  (set! (.-textEdits ^js inlay-hint) value))

(defn padding-left?
  "Render padding before the hint. Padding will use the editor's background color,
   not the background color of the hint itself. That means padding can be used to visually
   align/separate an inlay hint.
   
   **Returns:** `boolean | undefined`"
  ^js [inlay-hint]
  (.-paddingLeft ^js inlay-hint))

(defn set-padding-left!
  "Render padding before the hint. Padding will use the editor's background color,
   not the background color of the hint itself. That means padding can be used to visually
   align/separate an inlay hint."
  ^js [inlay-hint value]
  (set! (.-paddingLeft ^js inlay-hint) value))

(defn padding-right?
  "Render padding after the hint. Padding will use the editor's background color,
   not the background color of the hint itself. That means padding can be used to visually
   align/separate an inlay hint.
   
   **Returns:** `boolean | undefined`"
  ^js [inlay-hint]
  (.-paddingRight ^js inlay-hint))

(defn set-padding-right!
  "Render padding after the hint. Padding will use the editor's background color,
   not the background color of the hint itself. That means padding can be used to visually
   align/separate an inlay hint."
  ^js [inlay-hint value]
  (set! (.-paddingRight ^js inlay-hint) value))
