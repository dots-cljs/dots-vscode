(ns dots.vscode.folding-range
  "A line based folding range. To be valid, start and end line must be bigger than zero and smaller than the number of lines in the document.
   Invalid ranges will be ignored.")

(defn start
  "The zero-based start line of the range to fold. The folded area starts after the line's last character.
   To be valid, the end must be zero or larger and smaller than the number of lines in the document.
   
   **Returns:** `number`"
  ^js [folding-range]
  (.-start ^js folding-range))

(defn set-start!
  "The zero-based start line of the range to fold. The folded area starts after the line's last character.
   To be valid, the end must be zero or larger and smaller than the number of lines in the document."
  ^js [folding-range value]
  (set! (.-start ^js folding-range) value))

(defn end
  "The zero-based end line of the range to fold. The folded area ends with the line's last character.
   To be valid, the end must be zero or larger and smaller than the number of lines in the document.
   
   **Returns:** `number`"
  ^js [folding-range]
  (.-end ^js folding-range))

(defn set-end!
  "The zero-based end line of the range to fold. The folded area ends with the line's last character.
   To be valid, the end must be zero or larger and smaller than the number of lines in the document."
  ^js [folding-range value]
  (set! (.-end ^js folding-range) value))

(defn kind
  "Describes the {@link FoldingRangeKind Kind} of the folding range such as {@link FoldingRangeKind.Comment Comment} or
   {@link FoldingRangeKind.Region Region}. The kind is used to categorize folding ranges and used by commands
   like 'Fold all comments'. See
   {@link FoldingRangeKind } for an enumeration of all kinds.
   If not set, the range is originated from a syntax element.
   
   **Returns:** `FoldingRangeKind | undefined`"
  ^js [folding-range]
  (.-kind ^js folding-range))

(defn set-kind!
  "Describes the {@link FoldingRangeKind Kind} of the folding range such as {@link FoldingRangeKind.Comment Comment} or
   {@link FoldingRangeKind.Region Region}. The kind is used to categorize folding ranges and used by commands
   like 'Fold all comments'. See
   {@link FoldingRangeKind } for an enumeration of all kinds.
   If not set, the range is originated from a syntax element."
  ^js [folding-range value]
  (set! (.-kind ^js folding-range) value))
