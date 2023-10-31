(ns dots.vscode.text-document-content-change-event
  "An event describing an individual change in the text of a {@link TextDocument document}."
  (:refer-clojure :exclude [range]))

(defn range
  "The range that got replaced."
  ^js [text-document-content-change-event]
  (.-range ^js text-document-content-change-event))

(defn range-offset
  "The offset of the range that got replaced."
  ^js [text-document-content-change-event]
  (.-rangeOffset ^js text-document-content-change-event))

(defn range-length
  "The length of the range that got replaced."
  ^js [text-document-content-change-event]
  (.-rangeLength ^js text-document-content-change-event))

(defn text
  "The new text for the range."
  ^js [text-document-content-change-event]
  (.-text ^js text-document-content-change-event))
