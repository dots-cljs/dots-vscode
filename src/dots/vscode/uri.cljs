(ns dots.vscode.uri
  "A universal resource identifier representing either a file on disk
   or another resource, like untitled resources."
  (:require ["vscode" :as vscode]))

(defn scheme
  "Scheme is the `http` part of `http://www.example.com/some/path?query#fragment`.
   The part before the first colon."
  ^js [uri]
  (.-scheme ^js uri))

(defn authority
  "Authority is the `www.example.com` part of `http://www.example.com/some/path?query#fragment`.
   The part between the first double slashes and the next slash."
  ^js [uri]
  (.-authority ^js uri))

(defn path
  "Path is the `/some/path` part of `http://www.example.com/some/path?query#fragment`."
  ^js [uri]
  (.-path ^js uri))

(defn query
  "Query is the `query` part of `http://www.example.com/some/path?query#fragment`."
  ^js [uri]
  (.-query ^js uri))

(defn fragment
  "Fragment is the `fragment` part of `http://www.example.com/some/path?query#fragment`."
  ^js [uri]
  (.-fragment ^js uri))

(defn fs-path
  "The string representing the corresponding file system path of this Uri.
   
   Will handle UNC paths and normalize windows drive letters to lower-case. Also
   uses the platform specific path separator.
   
   * Will *not* validate the path for invalid characters and semantics.
   * Will *not* look at the scheme of this Uri.
   * The resulting string shall *not* be used for display purposes but
   for disk operations, like `readFile` et al.
   
   The *difference* to the {@linkcode Uri.path path}-property is the use of the platform specific
   path separator and the handling of UNC paths. The sample below outlines the difference:
   ```ts
   const u = URI.parse('file://server/c$/folder/file.txt')
   u.authority === 'server'
   u.path === '/shares/c$/file.txt'
   u.fsPath === '\\\\server\\c$\\folder\\file.txt'
   ```"
  ^js [uri]
  (.-fsPath ^js uri))

(defn with
  "Derive a new Uri from this Uri.
   
   ```ts
   let file = Uri.parse('before:some/file/path');
   let other = file.with({ scheme: 'after' });
   assert.ok(other.toString() === 'after:some/file/path');
   ```"
  ^js [uri change]
  (.with ^js uri change))

(defn to-string
  "Returns a string representation of this Uri. The representation and normalization
   of a URI depends on the scheme.
   
   * The resulting string can be safely used with {@link Uri.parse }.
   * The resulting string shall *not* be used for display purposes.
   
   *Note* that the implementation will encode _aggressive_ which often leads to unexpected,
   but not incorrect, results. For instance, colons are encoded to `%3A` which might be unexpected
   in file-uri. Also `&` and `=` will be encoded which might be unexpected for http-uris. For stability
   reasons this cannot be changed anymore. If you suffer from too aggressive encoding you should use
   the `skipEncoding`-argument: `uri.toString(true)`."
  (^js [uri]
   (.toString ^js uri))
  (^js [uri skip-encoding?]
   (.toString ^js uri skip-encoding?)))

(defn to-json
  "Returns a JSON representation of this Uri."
  ^js [uri]
  (.toJSON ^js uri))

(defn parse
  "Create an URI from a string, e.g. `http://www.example.com/some/path`,
   `file:///usr/home`, or `scheme:with/path`.
   
   *Note* that for a while uris without a `scheme` were accepted. That is not correct
   as all uris should have a scheme. To avoid breakage of existing code the optional
   `strict`-argument has been added. We *strongly* advise to use it, e.g. `Uri.parse('my:uri', true)`"
  (^js [value]
   (.parse vscode/Uri value))
  (^js [value strict?]
   (.parse vscode/Uri value strict?)))

(defn file
  "Create an URI from a file system path. The {@link Uri.scheme scheme}
   will be `file`.
   
   The *difference* between {@link Uri.parse } and {@link Uri.file } is that the latter treats the argument
   as path, not as stringified-uri. E.g. `Uri.file(path)` is *not* the same as
   `Uri.parse('file://' + path)` because the path might contain characters that are
   interpreted (# and ?). See the following sample:
   ```ts
   const good = URI.file('/coding/c#/project1');
   good.scheme === 'file';
   good.path === '/coding/c#/project1';
   good.fragment === '';
   
   const bad = URI.parse('file://' + '/coding/c#/project1');
   bad.scheme === 'file';
   bad.path === '/coding/c'; // path is now broken
   bad.fragment === '/project1';
   ```"
  ^js [path]
  (.file vscode/Uri path))

(defn join-path
  "Create a new uri which path is the result of joining
   the path of the base uri with the provided path segments.
   
   - Note 1: `joinPath` only affects the path component
   and all other components (scheme, authority, query, and fragment) are
   left as they are.
   - Note 2: The base uri must have a path; an error is thrown otherwise.
   
   The path segments are normalized in the following ways:
   - sequences of path separators (`/` or `\\`) are replaced with a single separator
   - for `file`-uris on windows, the backslash-character (`\\`) is considered a path-separator
   - the `..`-segment denotes the parent segment, the `.` denotes the current segment
   - paths have a root which always remains, for instance on windows drive-letters are roots
   so that is true: `joinPath(Uri.file('file:///c:/root'), '../../other').fsPath === 'c:/other'`"
  ^js [base & path-segments]
  (.. vscode/Uri -joinPath (apply vscode/Uri (to-array (cons base path-segments)))))

(defn from
  "Create an URI from its component parts"
  ^js [components]
  (.from vscode/Uri components))
