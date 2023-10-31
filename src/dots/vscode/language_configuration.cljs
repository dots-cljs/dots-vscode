(ns dots.vscode.language-configuration
  "The language configuration interfaces defines the contract between extensions
   and various editor features, like automatic bracket insertion, automatic indentation etc.")

(defn comments
  "The language's comment settings."
  ^js [language-configuration]
  (.-comments ^js language-configuration))

(defn set-comments!
  "The language's comment settings."
  ^js [language-configuration value]
  (set! (.-comments ^js language-configuration) value))

(defn brackets
  "The language's brackets.
   This configuration implicitly affects pressing Enter around these brackets."
  ^js [language-configuration]
  (.-brackets ^js language-configuration))

(defn set-brackets!
  "The language's brackets.
   This configuration implicitly affects pressing Enter around these brackets."
  ^js [language-configuration value]
  (set! (.-brackets ^js language-configuration) value))

(defn word-pattern
  "The language's word definition.
   If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
   to provide a word definition that uses exclusion of known separators.
   e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
     /(-?\\d*\\.\\d\\w*)|([^\\`\\~\\!\\@\\#\\%\\^\\&\\*\\(\\)\\-\\=\\+\\[\\{\\]\\}\\\\\\|\\;\\:\\'\\\"\\,\\.\\<\\>\\/\\?\\s]+)/g"
  ^js [language-configuration]
  (.-wordPattern ^js language-configuration))

(defn set-word-pattern!
  "The language's word definition.
   If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
   to provide a word definition that uses exclusion of known separators.
   e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
     /(-?\\d*\\.\\d\\w*)|([^\\`\\~\\!\\@\\#\\%\\^\\&\\*\\(\\)\\-\\=\\+\\[\\{\\]\\}\\\\\\|\\;\\:\\'\\\"\\,\\.\\<\\>\\/\\?\\s]+)/g"
  ^js [language-configuration value]
  (set! (.-wordPattern ^js language-configuration) value))

(defn indentation-rules
  "The language's indentation settings."
  ^js [language-configuration]
  (.-indentationRules ^js language-configuration))

(defn set-indentation-rules!
  "The language's indentation settings."
  ^js [language-configuration value]
  (set! (.-indentationRules ^js language-configuration) value))

(defn on-enter-rules
  "The language's rules to be evaluated when pressing Enter."
  ^js [language-configuration]
  (.-onEnterRules ^js language-configuration))

(defn set-on-enter-rules!
  "The language's rules to be evaluated when pressing Enter."
  ^js [language-configuration value]
  (set! (.-onEnterRules ^js language-configuration) value))
