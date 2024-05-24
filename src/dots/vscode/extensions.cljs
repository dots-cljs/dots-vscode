(ns dots.vscode.extensions
  "Namespace for dealing with installed extensions. Extensions are represented
   by an {@link Extension }-interface which enables reflection on them.
   
   Extension writers can provide APIs to other extensions by returning their API public
   surface from the `activate`-call.
   
   ```javascript
   export function activate(context: vscode.ExtensionContext) {
   	let api = {
   		sum(a, b) {
   			return a + b;
   		},
   		mul(a, b) {
   			return a * b;
   		}
   	};
   	// 'export' public api-surface
   	return api;
   }
   ```
   When depending on the API of another extension add an `extensionDependencies`-entry
   to `package.json`, and use the {@link extensions.getExtension getExtension}-function
   and the {@link Extension.exports exports}-property, like below:
   
   ```javascript
   let mathExt = extensions.getExtension('genius.math');
   let importedApi = mathExt.exports;
   
   console.log(importedApi.mul(42, 1));
   ```"
  (:require ["vscode" :as vscode]))

(defn extension
  "Get an extension by its full identifier in the form of: `publisher.name`.
   
   **Parameters:**
   - `extension-id`: `string` - An extension identifier.
   
   **Returns:** `Extension<T> | undefined` - An extension or `undefined`."
  ^js [extension-id]
  (.getExtension vscode/extensions extension-id))

(defn all
  "All extensions currently known to the system."
  ^js []
  (.-all vscode/extensions))

(defn on-did-change
  "An event which fires when `extensions.all` changes. This can happen when extensions are
   installed, uninstalled, enabled or disabled.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChange vscode/extensions))
  (^js [listener]
   (.onDidChange vscode/extensions listener))
  (^js [listener this-args]
   (.onDidChange vscode/extensions listener this-args))
  (^js [listener this-args disposables]
   (.onDidChange vscode/extensions listener this-args disposables)))
