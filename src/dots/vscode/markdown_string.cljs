(ns dots.vscode.markdown-string
  "Human-readable text that supports formatting via the [markdown syntax](https://commonmark.org).
   
   Rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax is supported
   when the {@linkcode supportThemeIcons } is set to `true`.
   
   Rendering of embedded html is supported when {@linkcode supportHtml } is set to `true`.")

(defn value
  "The markdown string."
  ^js [markdown-string]
  (.-value ^js markdown-string))

(defn set-value!
  "The markdown string."
  ^js [markdown-string value]
  (set! (.-value ^js markdown-string) value))

(defn trusted?
  "Indicates that this markdown string is from a trusted source. Only *trusted*
   markdown supports links that execute commands, e.g. `[Run it](command:myCommandId)`."
  ^js [markdown-string]
  (.-isTrusted ^js markdown-string))

(defn set-is-trusted!
  "Indicates that this markdown string is from a trusted source. Only *trusted*
   markdown supports links that execute commands, e.g. `[Run it](command:myCommandId)`."
  ^js [markdown-string value]
  (set! (.-isTrusted ^js markdown-string) value))

(defn support-theme-icons?
  "Indicates that this markdown string can contain {@link ThemeIcon ThemeIcons}, e.g. `$(zap)`."
  ^js [markdown-string]
  (.-supportThemeIcons ^js markdown-string))

(defn set-support-theme-icons!
  "Indicates that this markdown string can contain {@link ThemeIcon ThemeIcons}, e.g. `$(zap)`."
  ^js [markdown-string value]
  (set! (.-supportThemeIcons ^js markdown-string) value))

(defn support-html?
  "Indicates that this markdown string can contain raw html tags. Defaults to `false`.
   
   When `supportHtml` is false, the markdown renderer will strip out any raw html tags
   that appear in the markdown text. This means you can only use markdown syntax for rendering.
   
   When `supportHtml` is true, the markdown render will also allow a safe subset of html tags
   and attributes to be rendered. See https://github.com/microsoft/vscode/blob/6d2920473c6f13759c978dd89104c4270a83422d/src/vs/base/browser/markdownRenderer.ts#L296
   for a list of all supported tags and attributes."
  ^js [markdown-string]
  (.-supportHtml ^js markdown-string))

(defn set-support-html!
  "Indicates that this markdown string can contain raw html tags. Defaults to `false`.
   
   When `supportHtml` is false, the markdown renderer will strip out any raw html tags
   that appear in the markdown text. This means you can only use markdown syntax for rendering.
   
   When `supportHtml` is true, the markdown render will also allow a safe subset of html tags
   and attributes to be rendered. See https://github.com/microsoft/vscode/blob/6d2920473c6f13759c978dd89104c4270a83422d/src/vs/base/browser/markdownRenderer.ts#L296
   for a list of all supported tags and attributes."
  ^js [markdown-string value]
  (set! (.-supportHtml ^js markdown-string) value))

(defn base-uri
  "Uri that relative paths are resolved relative to.
   
   If the `baseUri` ends with `/`, it is considered a directory and relative paths in the markdown are resolved relative to that directory:
   
   ```ts
   const md = new vscode.MarkdownString(`[link](./file.js)`);
   md.baseUri = vscode.Uri.file('/path/to/dir/');
   // Here 'link' in the rendered markdown resolves to '/path/to/dir/file.js'
   ```
   
   If the `baseUri` is a file, relative paths in the markdown are resolved relative to the parent dir of that file:
   
   ```ts
   const md = new vscode.MarkdownString(`[link](./file.js)`);
   md.baseUri = vscode.Uri.file('/path/to/otherFile.js');
   // Here 'link' in the rendered markdown resolves to '/path/to/file.js'
   ```"
  ^js [markdown-string]
  (.-baseUri ^js markdown-string))

(defn set-base-uri!
  "Uri that relative paths are resolved relative to.
   
   If the `baseUri` ends with `/`, it is considered a directory and relative paths in the markdown are resolved relative to that directory:
   
   ```ts
   const md = new vscode.MarkdownString(`[link](./file.js)`);
   md.baseUri = vscode.Uri.file('/path/to/dir/');
   // Here 'link' in the rendered markdown resolves to '/path/to/dir/file.js'
   ```
   
   If the `baseUri` is a file, relative paths in the markdown are resolved relative to the parent dir of that file:
   
   ```ts
   const md = new vscode.MarkdownString(`[link](./file.js)`);
   md.baseUri = vscode.Uri.file('/path/to/otherFile.js');
   // Here 'link' in the rendered markdown resolves to '/path/to/file.js'
   ```"
  ^js [markdown-string value]
  (set! (.-baseUri ^js markdown-string) value))

(defn append-text
  "Appends and escapes the given string to this markdown string."
  ^js [markdown-string value]
  (.appendText ^js markdown-string value))

(defn append-markdown
  "Appends the given string 'as is' to this markdown string. When {@linkcode MarkdownString.supportThemeIcons supportThemeIcons} is `true`, {@link ThemeIcon ThemeIcons} in the `value` will be iconified."
  ^js [markdown-string value]
  (.appendMarkdown ^js markdown-string value))

(defn append-codeblock
  "Appends the given string as codeblock using the provided language."
  (^js [markdown-string value]
   (.appendCodeblock ^js markdown-string value))
  (^js [markdown-string value language]
   (.appendCodeblock ^js markdown-string value language)))
