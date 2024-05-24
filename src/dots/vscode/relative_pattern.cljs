(ns dots.vscode.relative-pattern
  "A relative pattern is a helper to construct glob patterns that are matched
   relatively to a base file path. The base path can either be an absolute file
   path as string or uri or a {@link WorkspaceFolder workspace folder}, which is the
   preferred way of creating the relative pattern.")

(defn base-uri
  "A base file path to which this pattern will be matched against relatively. The
   file path must be absolute, should not have any trailing path separators and
   not include any relative segments (`.` or `..`)."
  ^js [relative-pattern]
  (.-baseUri ^js relative-pattern))

(defn set-base-uri!
  "A base file path to which this pattern will be matched against relatively. The
   file path must be absolute, should not have any trailing path separators and
   not include any relative segments (`.` or `..`)."
  ^js [relative-pattern value]
  (set! (.-baseUri ^js relative-pattern) value))

(defn base
  "A base file path to which this pattern will be matched against relatively.
   
   This matches the `fsPath` value of {@link RelativePattern.baseUri }.
   
   *Note:* updating this value will update {@link RelativePattern.baseUri } to
   be a uri with `file` scheme."
  ^js [relative-pattern]
  (.-base ^js relative-pattern))

(defn set-base!
  "A base file path to which this pattern will be matched against relatively.
   
   This matches the `fsPath` value of {@link RelativePattern.baseUri }.
   
   *Note:* updating this value will update {@link RelativePattern.baseUri } to
   be a uri with `file` scheme."
  ^js [relative-pattern value]
  (set! (.-base ^js relative-pattern) value))

(defn pattern
  "A file glob pattern like `*.{ts,js}` that will be matched on file paths
   relative to the base path.
   
   Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
   the file glob pattern will match on `index.js`."
  ^js [relative-pattern]
  (.-pattern ^js relative-pattern))

(defn set-pattern!
  "A file glob pattern like `*.{ts,js}` that will be matched on file paths
   relative to the base path.
   
   Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
   the file glob pattern will match on `index.js`."
  ^js [relative-pattern value]
  (set! (.-pattern ^js relative-pattern) value))
