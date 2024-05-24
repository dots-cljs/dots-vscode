(ns dots.vscode.language-status-item
  "A language status item is the preferred way to present language status reports for the active text editors,
   such as selected linter or notifying about a configuration problem."
  (:refer-clojure :exclude [name]))

(defn id
  "The identifier of this item."
  ^js [language-status-item]
  (.-id ^js language-status-item))

(defn name
  "The short name of this item, like 'Java Language Status', etc."
  ^js [language-status-item]
  (.-name ^js language-status-item))

(defn set-name!
  "The short name of this item, like 'Java Language Status', etc."
  ^js [language-status-item value]
  (set! (.-name ^js language-status-item) value))

(defn selector
  "A {@link DocumentSelector selector} that defines for what editors
   this item shows."
  ^js [language-status-item]
  (.-selector ^js language-status-item))

(defn set-selector!
  "A {@link DocumentSelector selector} that defines for what editors
   this item shows."
  ^js [language-status-item value]
  (set! (.-selector ^js language-status-item) value))

(defn severity
  "The severity of this item.
   
   Defaults to {@link LanguageStatusSeverity.Information information}. You can use this property to
   signal to users that there is a problem that needs attention, like a missing executable or an
   invalid configuration."
  ^js [language-status-item]
  (.-severity ^js language-status-item))

(defn set-severity!
  "The severity of this item.
   
   Defaults to {@link LanguageStatusSeverity.Information information}. You can use this property to
   signal to users that there is a problem that needs attention, like a missing executable or an
   invalid configuration."
  ^js [language-status-item value]
  (set! (.-severity ^js language-status-item) value))

(defn text
  "The text to show for the entry. You can embed icons in the text by leveraging the syntax:
   
   `My text $(icon-name) contains icons like $(icon-name) this one.`
   
   Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
   `light-bulb`, `thumbsup`, `zap` etc."
  ^js [language-status-item]
  (.-text ^js language-status-item))

(defn set-text!
  "The text to show for the entry. You can embed icons in the text by leveraging the syntax:
   
   `My text $(icon-name) contains icons like $(icon-name) this one.`
   
   Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
   `light-bulb`, `thumbsup`, `zap` etc."
  ^js [language-status-item value]
  (set! (.-text ^js language-status-item) value))

(defn detail
  "Optional, human-readable details for this item."
  ^js [language-status-item]
  (.-detail ^js language-status-item))

(defn set-detail!
  "Optional, human-readable details for this item."
  ^js [language-status-item value]
  (set! (.-detail ^js language-status-item) value))

(defn busy?
  "Controls whether the item is shown as \"busy\". Defaults to `false`."
  ^js [language-status-item]
  (.-busy ^js language-status-item))

(defn set-busy!
  "Controls whether the item is shown as \"busy\". Defaults to `false`."
  ^js [language-status-item value]
  (set! (.-busy ^js language-status-item) value))

(defn command
  "A {@linkcode Command command} for this item."
  ^js [language-status-item]
  (.-command ^js language-status-item))

(defn set-command!
  "A {@linkcode Command command} for this item."
  ^js [language-status-item value]
  (set! (.-command ^js language-status-item) value))

(defn accessibility-information
  "Accessibility information used when a screen reader interacts with this item"
  ^js [language-status-item]
  (.-accessibilityInformation ^js language-status-item))

(defn set-accessibility-information!
  "Accessibility information used when a screen reader interacts with this item"
  ^js [language-status-item value]
  (set! (.-accessibilityInformation ^js language-status-item) value))

(defn dispose
  "Dispose and free associated resources.
   
   **Returns:** `void`"
  ^js [language-status-item]
  (.dispose ^js language-status-item))
