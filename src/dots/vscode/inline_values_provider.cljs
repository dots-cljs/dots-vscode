(ns dots.vscode.inline-values-provider
  "The inline values provider interface defines the contract between extensions and the editor's debugger inline values feature.
   In this contract the provider returns inline value information for a given document range
   and the editor shows this information in the editor at the end of lines.")

(defn on-did-change-inline-values
  "An optional event to signal that inline values have changed."
  (^js [inline-values-provider]
   (.-onDidChangeInlineValues ^js inline-values-provider))
  (^js [inline-values-provider listener]
   (.onDidChangeInlineValues ^js inline-values-provider listener))
  (^js [inline-values-provider listener this-args]
   (.onDidChangeInlineValues ^js inline-values-provider listener this-args))
  (^js [inline-values-provider listener this-args disposables]
   (.onDidChangeInlineValues ^js inline-values-provider listener this-args disposables)))

(defn set-on-did-change-inline-values!
  "An optional event to signal that inline values have changed."
  ^js [inline-values-provider value]
  (set! (.-onDidChangeInlineValues ^js inline-values-provider) value))

(defn provide-inline-values
  "Provide \"inline value\" information for a given document and range.
   The editor calls this method whenever debugging stops in the given document.
   The returned inline values information is rendered in the editor at the end of lines."
  ^js [inline-values-provider document view-port context token]
  (.provideInlineValues ^js inline-values-provider document view-port context token))
