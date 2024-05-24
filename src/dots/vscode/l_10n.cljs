(ns dots.vscode.l-10n
  "Namespace for localization-related functionality in the extension API. To use this properly,
   you must have `l10n` defined in your extension manifest and have bundle.l10n.<language>.json files.
   For more information on how to generate bundle.l10n.<language>.json files, check out the
   [vscode-l10n repo](https://github.com/microsoft/vscode-l10n).
   
   Note: Built-in extensions (for example, Git, TypeScript Language Features, GitHub Authentication)
   are excluded from the `l10n` property requirement. In other words, they do not need to specify
   a `l10n` in the extension manifest because their translated strings come from Language Packs."
  (:require ["vscode" :as vscode]))

(defn t
  "Marks a string for localization. If a localized bundle is available for the language specified by
   {@link env.language } and the bundle has a localized value for this message, then that localized
   value will be returned (with injected {@link args } values for any templated values).
   Marks a string for localization. If a localized bundle is available for the language specified by
   {@link env.language } and the bundle has a localized value for this message, then that localized
   value will be returned (with injected args values for any templated values).
   
   **Parameters:**
   - `message`: `string` - The message to localize. Supports named templating where strings like `{foo}` and `{bar}` are
   replaced by the value in the Record for that key (foo, bar, etc).
   - `options`: `{ message: string; args?: Record<string, any> | (string | number | boolean)[] | undefined; comment: string | string[]; }` - The options to use when localizing the message.
   - `args`: `Record<string, any>` - The arguments to be used in the localized string. The name of the key in the record is used to
   match the template placeholder in the localized string.
   
   **Returns:** `string` - localized string with injected arguments."
  {:arglists '([& options]
               [message & args]
               [message args])}
  (^js [a & more]
   (.. vscode/l10n -t (apply vscode/l10n (to-array (cons a more)))))
  (^js [message args]
   (.t vscode/l10n message args)))

(defn bundle
  "The bundle of localized strings that have been loaded for the extension.
   It's undefined if no bundle has been loaded. The bundle is typically not loaded if
   there was no bundle found or when we are running with the default language.
   
   **Returns:** `{ [key: string]: string; } | undefined`"
  ^js []
  (.-bundle vscode/l10n))

(defn uri
  "The URI of the localization bundle that has been loaded for the extension.
   It's undefined if no bundle has been loaded. The bundle is typically not loaded if
   there was no bundle found or when we are running with the default language.
   
   **Returns:** `Uri | undefined`"
  ^js []
  (.-uri vscode/l10n))
