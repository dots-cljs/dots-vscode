(ns dots.vscode.commenting-range-provider
  "Commenting range provider for a {@link CommentController comment controller}.")

(defn provide-commenting-ranges
  "Provide a list of ranges which allow new comment threads creation or null for a given document
   
   **Parameters:**
   - `document`: `TextDocument`
   - `token`: `CancellationToken`
   
   **Returns:** `ProviderResult<Range[]>`"
  ^js [commenting-range-provider document token]
  (.provideCommentingRanges ^js commenting-range-provider document token))
