(ns dots.vscode.inlay-hint-label-part
  "An inlay hint label part allows for interactive and composite labels of inlay hints.")

(defn value
  "The value of this label part.
   
   **Returns:** `string`"
  ^js [inlay-hint-label-part]
  (.-value ^js inlay-hint-label-part))

(defn set-value!
  "The value of this label part."
  ^js [inlay-hint-label-part value]
  (set! (.-value ^js inlay-hint-label-part) value))

(defn tooltip
  "The tooltip text when you hover over this label part.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [inlay-hint-label-part]
  (.-tooltip ^js inlay-hint-label-part))

(defn set-tooltip!
  "The tooltip text when you hover over this label part.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints."
  ^js [inlay-hint-label-part value]
  (set! (.-tooltip ^js inlay-hint-label-part) value))

(defn location
  "An optional {@link Location source code location} that represents this label
   part.
   
   The editor will use this location for the hover and for code navigation features: This
   part will become a clickable link that resolves to the definition of the symbol at the
   given location (not necessarily the location itself), it shows the hover that shows at
   the given location, and it shows a context menu with further code navigation commands.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
   
   **Returns:** `Location | undefined`"
  ^js [inlay-hint-label-part]
  (.-location ^js inlay-hint-label-part))

(defn set-location!
  "An optional {@link Location source code location} that represents this label
   part.
   
   The editor will use this location for the hover and for code navigation features: This
   part will become a clickable link that resolves to the definition of the symbol at the
   given location (not necessarily the location itself), it shows the hover that shows at
   the given location, and it shows a context menu with further code navigation commands.
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints."
  ^js [inlay-hint-label-part value]
  (set! (.-location ^js inlay-hint-label-part) value))

(defn command
  "An optional command for this label part.
   
   The editor renders parts with commands as clickable links. The command is added to the context menu
   when a label part defines {@link InlayHintLabelPart.location location} and {@link InlayHintLabelPart.command command} .
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
   
   **Returns:** `Command | undefined`"
  ^js [inlay-hint-label-part]
  (.-command ^js inlay-hint-label-part))

(defn set-command!
  "An optional command for this label part.
   
   The editor renders parts with commands as clickable links. The command is added to the context menu
   when a label part defines {@link InlayHintLabelPart.location location} and {@link InlayHintLabelPart.command command} .
   
   *Note* that this property can be set late during
   {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints."
  ^js [inlay-hint-label-part value]
  (set! (.-command ^js inlay-hint-label-part) value))
