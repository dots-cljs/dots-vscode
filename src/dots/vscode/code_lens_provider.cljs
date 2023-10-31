(ns dots.vscode.code-lens-provider
  "A code lens provider adds {@link Command commands} to source text. The commands will be shown
   as dedicated horizontal lines in between the source text.")

(defn on-did-change-code-lenses
  "An optional event to signal that the code lenses from this provider have changed."
  (^js [code-lens-provider]
   (.-onDidChangeCodeLenses ^js code-lens-provider))
  (^js [code-lens-provider listener]
   (.onDidChangeCodeLenses ^js code-lens-provider listener))
  (^js [code-lens-provider listener this-args]
   (.onDidChangeCodeLenses ^js code-lens-provider listener this-args))
  (^js [code-lens-provider listener this-args disposables]
   (.onDidChangeCodeLenses ^js code-lens-provider listener this-args disposables)))

(defn set-on-did-change-code-lenses!
  "An optional event to signal that the code lenses from this provider have changed."
  ^js [code-lens-provider value]
  (set! (.-onDidChangeCodeLenses ^js code-lens-provider) value))

(defn provide-code-lenses
  "Compute a list of {@link CodeLens lenses}. This call should return as fast as possible and if
   computing the commands is expensive implementors should only return code lens objects with the
   range set and implement {@link CodeLensProvider.resolveCodeLens resolve}."
  ^js [code-lens-provider document token]
  (.provideCodeLenses ^js code-lens-provider document token))

(defn resolve-code-lens
  "This function will be called for each visible code lens, usually when scrolling and after
   calls to {@link CodeLensProvider.provideCodeLenses compute}-lenses."
  ^js [code-lens-provider code-lens token]
  (.resolveCodeLens ^js code-lens-provider code-lens token))
