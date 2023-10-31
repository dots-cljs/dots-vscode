(ns dots.vscode.text-line
  "Represents a line of text, such as a line of source code.
   
   TextLine objects are __immutable__. When a {@link TextDocument document} changes,
   previously retrieved lines will not represent the latest state."
  (:refer-clojure :exclude [range]))

(defn line-number
  "The zero-based line number."
  ^js [text-line]
  (.-lineNumber ^js text-line))

(defn text
  "The text of this line without the line separator characters."
  ^js [text-line]
  (.-text ^js text-line))

(defn range
  "The range this line covers without the line separator characters."
  ^js [text-line]
  (.-range ^js text-line))

(defn range-including-line-break
  "The range this line covers with the line separator characters."
  ^js [text-line]
  (.-rangeIncludingLineBreak ^js text-line))

(defn first-non-whitespace-character-index
  "The offset of the first character which is not a whitespace character as defined
   by `/\\s/`. **Note** that if a line is all whitespace the length of the line is returned."
  ^js [text-line]
  (.-firstNonWhitespaceCharacterIndex ^js text-line))

(defn empty-or-whitespace?
  "Whether this line is whitespace only, shorthand
   for {@link TextLine.firstNonWhitespaceCharacterIndex } === {@link TextLine.text TextLine.text.length}."
  ^js [text-line]
  (.-isEmptyOrWhitespace ^js text-line))
