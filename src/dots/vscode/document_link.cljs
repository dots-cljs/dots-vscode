(ns dots.vscode.document-link
  "A document link is a range in a text document that links to an internal or external resource, like another
   text document or a web site."
  (:refer-clojure :exclude [range]))

(defn range
  "The range this link applies to."
  ^js [document-link]
  (.-range ^js document-link))

(defn set-range!
  "The range this link applies to."
  ^js [document-link value]
  (set! (.-range ^js document-link) value))

(defn target
  "The uri this link points to."
  ^js [document-link]
  (.-target ^js document-link))

(defn set-target!
  "The uri this link points to."
  ^js [document-link value]
  (set! (.-target ^js document-link) value))

(defn tooltip
  "The tooltip text when you hover over this link.
   
   If a tooltip is provided, is will be displayed in a string that includes instructions on how to
   trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
   user settings, and localization."
  ^js [document-link]
  (.-tooltip ^js document-link))

(defn set-tooltip!
  "The tooltip text when you hover over this link.
   
   If a tooltip is provided, is will be displayed in a string that includes instructions on how to
   trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
   user settings, and localization."
  ^js [document-link value]
  (set! (.-tooltip ^js document-link) value))
