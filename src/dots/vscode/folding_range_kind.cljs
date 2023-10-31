(ns dots.vscode.folding-range-kind
  "An enumeration of specific folding range kinds. The kind is an optional field of a {@link FoldingRange }
   and is used to distinguish specific folding ranges such as ranges originated from comments. The kind is used by commands like
   `Fold all comments` or `Fold all regions`.
   If the kind is not set on the range, the range originated from a syntax element other than comments, imports or region markers."
  (:refer-clojure :exclude [comment])
  (:require ["vscode" :as vscode]))

(def comment
  "Kind for folding range representing a comment."
  (.-Comment vscode/FoldingRangeKind))

(def imports
  "Kind for folding range representing a import."
  (.-Imports vscode/FoldingRangeKind))

(def region
  "Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`."
  (.-Region vscode/FoldingRangeKind))
