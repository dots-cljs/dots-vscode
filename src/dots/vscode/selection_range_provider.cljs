(ns dots.vscode.selection-range-provider)

(defn provide-selection-ranges
  "Provide selection ranges for the given positions.
   
   Selection ranges should be computed individually and independent for each position. The editor will merge
   and deduplicate ranges but providers must return hierarchies of selection ranges so that a range
   is {@link Range.contains contained} by its parent."
  ^js [selection-range-provider document positions token]
  (.provideSelectionRanges ^js selection-range-provider document positions token))
