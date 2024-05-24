(ns dots.vscode.comment-rule
  "Describes how comments for a language work.")

(defn line-comment
  "The line comment token, like `// this is a comment`
   
   **Returns:** `string | undefined`"
  ^js [comment-rule]
  (.-lineComment ^js comment-rule))

(defn set-line-comment!
  "The line comment token, like `// this is a comment`"
  ^js [comment-rule value]
  (set! (.-lineComment ^js comment-rule) value))

(defn block-comment
  "The block comment character pair, like `/* block comment *&#47;`
   
   **Returns:** `CharacterPair | undefined`"
  ^js [comment-rule]
  (.-blockComment ^js comment-rule))

(defn set-block-comment!
  "The block comment character pair, like `/* block comment *&#47;`"
  ^js [comment-rule value]
  (set! (.-blockComment ^js comment-rule) value))
