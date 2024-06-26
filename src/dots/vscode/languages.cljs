(ns dots.vscode.languages
  "Namespace for participating in language-specific editor [features](https://code.visualstudio.com/docs/editor/editingevolved),
   like IntelliSense, code actions, diagnostics etc.
   
   Many programming languages exist and there is huge variety in syntaxes, semantics, and paradigms. Despite that, features
   like automatic word-completion, code navigation, or code checking have become popular across different tools for different
   programming languages.
   
   The editor provides an API that makes it simple to provide such common features by having all UI and actions already in place and
   by allowing you to participate by providing data only. For instance, to contribute a hover all you have to do is provide a function
   that can be called with a {@link TextDocument } and a {@link Position } returning hover info. The rest, like tracking the
   mouse, positioning the hover, keeping the hover stable etc. is taken care of by the editor.
   
   ```javascript
   languages.registerHoverProvider('javascript', {
   	provideHover(document, position, token) {
   		return new Hover('I am a hover!');
   	}
   });
   ```
   
   Registration is done using a {@link DocumentSelector document selector} which is either a language id, like `javascript` or
   a more complex {@link DocumentFilter filter} like `{ language: 'typescript', scheme: 'file' }`. Matching a document against such
   a selector will result in a {@link languages.match score} that is used to determine if and how a provider shall be used. When
   scores are equal the provider that came last wins. For features that allow full arity, like {@link languages.registerHoverProvider hover},
   the score is only checked to be `>0`, for other features, like {@link languages.registerCompletionItemProvider IntelliSense} the
   score is used for determining the order in which providers are asked to participate."
  (:require ["vscode" :as vscode]))

(defn languages
  "Return the identifiers of all known languages.
   
   **Returns:** `Thenable<string[]>` - Promise resolving to an array of identifier strings."
  ^js []
  (.getLanguages vscode/languages))

(defn set-text-document-language
  "Set (and change) the {@link TextDocument.languageId language} that is associated
   with the given document.
   
   *Note* that calling this function will trigger the {@linkcode workspace.onDidCloseTextDocument onDidCloseTextDocument} event
   followed by the {@linkcode workspace.onDidOpenTextDocument onDidOpenTextDocument} event.
   
   **Parameters:**
   - `document`: `TextDocument` - The document which language is to be changed
   - `language-id`: `string` - The new language identifier.
   
   **Returns:** `Thenable<TextDocument>` - A thenable that resolves with the updated document."
  ^js [document language-id]
  (.setTextDocumentLanguage vscode/languages document language-id))

(defn match
  "Compute the match between a document {@link DocumentSelector selector} and a document. Values
   greater than zero mean the selector matches the document.
   
   A match is computed according to these rules:
   1. When {@linkcode DocumentSelector } is an array, compute the match for each contained `DocumentFilter` or language identifier and take the maximum value.
   2. A string will be desugared to become the `language`-part of a {@linkcode DocumentFilter }, so `\"fooLang\"` is like `{ language: \"fooLang\" }`.
   3. A {@linkcode DocumentFilter } will be matched against the document by comparing its parts with the document. The following rules apply:
      1. When the `DocumentFilter` is empty (`{}`) the result is `0`
      2. When `scheme`, `language`, `pattern`, or `notebook` are defined but one doesn't match, the result is `0`
      3. Matching against `*` gives a score of `5`, matching via equality or via a glob-pattern gives a score of `10`
      4. The result is the maximum value of each match
   
   Samples:
   ```js
   // default document from disk (file-scheme)
   doc.uri; //'file:///my/file.js'
   doc.languageId; // 'javascript'
   match('javascript', doc); // 10;
   match({ language: 'javascript' }, doc); // 10;
   match({ language: 'javascript', scheme: 'file' }, doc); // 10;
   match('*', doc); // 5
   match('fooLang', doc); // 0
   match(['fooLang', '*'], doc); // 5
   
   // virtual document, e.g. from git-index
   doc.uri; // 'git:/my/file.js'
   doc.languageId; // 'javascript'
   match('javascript', doc); // 10;
   match({ language: 'javascript', scheme: 'git' }, doc); // 10;
   match('*', doc); // 5
   
   // notebook cell document
   doc.uri; // `vscode-notebook-cell:///my/notebook.ipynb#gl65s2pmha`;
   doc.languageId; // 'python'
   match({ notebookType: 'jupyter-notebook' }, doc) // 10
   match({ notebookType: 'fooNotebook', language: 'python' }, doc) // 0
   match({ language: 'python' }, doc) // 10
   match({ notebookType: '*' }, doc) // 5
   ```
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A document selector.
   - `document`: `TextDocument` - A text document.
   
   **Returns:** `number` - A number `>0` when the selector matches and `0` when the selector does not match."
  ^js [selector document]
  (.match vscode/languages selector document))

(defn diagnostics
  "Get all diagnostics for a given resource.
   Get all diagnostics.
   
   **Parameters:**
   - `resource`: `Uri` - A resource
   
   **Returns:** `[Uri, Diagnostic[]][]` - An array of uri-diagnostics tuples or an empty array."
  (^js []
   (.getDiagnostics vscode/languages))
  (^js [resource]
   (.getDiagnostics vscode/languages resource)))

(defn create-diagnostic-collection
  "Create a diagnostics collection.
   
   **Parameters:**
   - `name`: `string | undefined` - The {@link DiagnosticCollection.name name} of the collection.
   
   **Returns:** `DiagnosticCollection` - A new diagnostic collection."
  (^js []
   (.createDiagnosticCollection vscode/languages))
  (^js [name]
   (.createDiagnosticCollection vscode/languages name)))

(defn create-language-status-item
  "Creates a new {@link LanguageStatusItem language status item}.
   
   **Parameters:**
   - `id`: `string` - The identifier of the item.
   - `selector`: `DocumentSelector` - The document selector that defines for what editors the item shows.
   
   **Returns:** `LanguageStatusItem` - A new language status item."
  ^js [id selector]
  (.createLanguageStatusItem vscode/languages id selector))

(defn register-completion-item-provider
  "Register a completion provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and groups of equal score are sequentially asked for
   completion items. The process stops when one or many providers of a group return a
   result. A failing provider (rejected promise or exception) will not fail the whole
   operation.
   
   A completion item provider can be associated with a set of `triggerCharacters`. When trigger
   characters are being typed, completions are requested but only from providers that registered
   the typed character. Because of that trigger characters should be different than {@link LanguageConfiguration.wordPattern word characters},
   a common trigger character is `.` to trigger member completions.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `CompletionItemProvider<CompletionItem>` - A completion provider.
   - `trigger-characters`: `string[]` - Trigger completion when the user types one of the characters.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider & trigger-characters]
  (.. vscode/languages -registerCompletionItemProvider (apply vscode/languages (to-array (list* selector provider trigger-characters)))))

(defn register-inline-completion-item-provider
  "Registers an inline completion provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `InlineCompletionItemProvider` - An inline completion provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerInlineCompletionItemProvider vscode/languages selector provider))

(defn register-code-actions-provider
  "Register a code action provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `CodeActionProvider<CodeAction>` - A code action provider.
   - `metadata`: `CodeActionProviderMetadata | undefined` - Metadata about the kind of code actions the provider provides.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  (^js [selector provider]
   (.registerCodeActionsProvider vscode/languages selector provider))
  (^js [selector provider metadata]
   (.registerCodeActionsProvider vscode/languages selector provider metadata)))

(defn register-code-lens-provider
  "Register a code lens provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `CodeLensProvider<CodeLens>` - A code lens provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerCodeLensProvider vscode/languages selector provider))

(defn register-definition-provider
  "Register a definition provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DefinitionProvider` - A definition provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDefinitionProvider vscode/languages selector provider))

(defn register-implementation-provider
  "Register an implementation provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `ImplementationProvider` - An implementation provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerImplementationProvider vscode/languages selector provider))

(defn register-type-definition-provider
  "Register a type definition provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `TypeDefinitionProvider` - A type definition provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerTypeDefinitionProvider vscode/languages selector provider))

(defn register-declaration-provider
  "Register a declaration provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DeclarationProvider` - A declaration provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDeclarationProvider vscode/languages selector provider))

(defn register-hover-provider
  "Register a hover provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `HoverProvider` - A hover provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerHoverProvider vscode/languages selector provider))

(defn register-evaluatable-expression-provider
  "Register a provider that locates evaluatable expressions in text documents.
   The editor will evaluate the expression in the active debug session and will show the result in the debug hover.
   
   If multiple providers are registered for a language an arbitrary provider will be used.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `EvaluatableExpressionProvider` - An evaluatable expression provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerEvaluatableExpressionProvider vscode/languages selector provider))

(defn register-inline-values-provider
  "Register a provider that returns data for the debugger's 'inline value' feature.
   Whenever the generic debugger has stopped in a source file, providers registered for the language of the file
   are called to return textual data that will be shown in the editor at the end of lines.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `InlineValuesProvider` - An inline values provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerInlineValuesProvider vscode/languages selector provider))

(defn register-document-highlight-provider
  "Register a document highlight provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and groups sequentially asked for document highlights.
   The process stops when a provider returns a `non-falsy` or `non-failure` result.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentHighlightProvider` - A document highlight provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDocumentHighlightProvider vscode/languages selector provider))

(defn register-document-symbol-provider
  "Register a document symbol provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentSymbolProvider` - A document symbol provider.
   - `meta-data`: `DocumentSymbolProviderMetadata | undefined` - metadata about the provider
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  (^js [selector provider]
   (.registerDocumentSymbolProvider vscode/languages selector provider))
  (^js [selector provider meta-data]
   (.registerDocumentSymbolProvider vscode/languages selector provider meta-data)))

(defn register-workspace-symbol-provider
  "Register a workspace symbol provider.
   
   Multiple providers can be registered. In that case providers are asked in parallel and
   the results are merged. A failing provider (rejected promise or exception) will not cause
   a failure of the whole operation.
   
   **Parameters:**
   - `provider`: `WorkspaceSymbolProvider<SymbolInformation>` - A workspace symbol provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [provider]
  (.registerWorkspaceSymbolProvider vscode/languages provider))

(defn register-reference-provider
  "Register a reference provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `ReferenceProvider` - A reference provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerReferenceProvider vscode/languages selector provider))

(defn register-rename-provider
  "Register a rename provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and asked in sequence. The first provider producing a result
   defines the result of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `RenameProvider` - A rename provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerRenameProvider vscode/languages selector provider))

(defn register-document-semantic-tokens-provider
  "Register a semantic tokens provider for a whole document.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentSemanticTokensProvider` - A document semantic tokens provider.
   - `legend`: `SemanticTokensLegend`
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider legend]
  (.registerDocumentSemanticTokensProvider vscode/languages selector provider legend))

(defn register-document-range-semantic-tokens-provider
  "Register a semantic tokens provider for a document range.
   
   *Note:* If a document has both a `DocumentSemanticTokensProvider` and a `DocumentRangeSemanticTokensProvider`,
   the range provider will be invoked only initially, for the time in which the full document provider takes
   to resolve the first request. Once the full document provider resolves the first request, the semantic tokens
   provided via the range provider will be discarded and from that point forward, only the document provider
   will be used.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentRangeSemanticTokensProvider` - A document range semantic tokens provider.
   - `legend`: `SemanticTokensLegend`
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider legend]
  (.registerDocumentRangeSemanticTokensProvider vscode/languages selector provider legend))

(defn register-document-formatting-edit-provider
  "Register a formatting provider for a document.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentFormattingEditProvider` - A document formatting edit provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDocumentFormattingEditProvider vscode/languages selector provider))

(defn register-document-range-formatting-edit-provider
  "Register a formatting provider for a document range.
   
   *Note:* A document range provider is also a {@link DocumentFormattingEditProvider document formatter}
   which means there is no need to {@link languages.registerDocumentFormattingEditProvider register} a document
   formatter when also registering a range provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentRangeFormattingEditProvider` - A document range formatting edit provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDocumentRangeFormattingEditProvider vscode/languages selector provider))

(defn register-on-type-formatting-edit-provider
  "Register a formatting provider that works on type. The provider is active when the user enables the setting `editor.formatOnType`.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `OnTypeFormattingEditProvider` - An on type formatting edit provider.
   - `first-trigger-character`: `string` - A character on which formatting should be triggered, like `}`.
   - `more-trigger-character`: `string[]` - More trigger characters.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider first-trigger-character & more-trigger-character]
  (.. vscode/languages -registerOnTypeFormattingEditProvider (apply vscode/languages (to-array (list* selector provider first-trigger-character more-trigger-character)))))

(defn register-signature-help-provider
  "Register a signature help provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and called sequentially until a provider returns a
   valid result.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `SignatureHelpProvider` - A signature help provider.
   - `metadata`: `SignatureHelpProviderMetadata` - Information about the provider.
   - `trigger-characters`: `string[]` - Trigger signature help when the user types one of the characters, like `,` or `(`.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  (^js [selector provider & trigger-characters]
   (.. vscode/languages -registerSignatureHelpProvider (apply vscode/languages (to-array (list* selector provider trigger-characters)))))
  (^js [selector provider metadata]
   (.registerSignatureHelpProvider vscode/languages selector provider metadata)))

(defn register-document-link-provider
  "Register a document link provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentLinkProvider<DocumentLink>` - A document link provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerDocumentLinkProvider vscode/languages selector provider))

(defn register-color-provider
  "Register a color provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `DocumentColorProvider` - A color provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerColorProvider vscode/languages selector provider))

(defn register-inlay-hints-provider
  "Register a inlay hints provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `InlayHintsProvider<InlayHint>` - An inlay hints provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerInlayHintsProvider vscode/languages selector provider))

(defn register-folding-range-provider
  "Register a folding range provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged.
   If multiple folding ranges start at the same position, only the range of the first registered provider is used.
   If a folding range overlaps with an other range that has a smaller position, it is also ignored.
   
   A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `FoldingRangeProvider` - A folding range provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerFoldingRangeProvider vscode/languages selector provider))

(defn register-selection-range-provider
  "Register a selection range provider.
   
   Multiple providers can be registered for a language. In that case providers are asked in
   parallel and the results are merged. A failing provider (rejected promise or exception) will
   not cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `SelectionRangeProvider` - A selection range provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerSelectionRangeProvider vscode/languages selector provider))

(defn register-call-hierarchy-provider
  "Register a call hierarchy provider.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `CallHierarchyProvider` - A call hierarchy provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerCallHierarchyProvider vscode/languages selector provider))

(defn register-type-hierarchy-provider
  "Register a type hierarchy provider.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `TypeHierarchyProvider` - A type hierarchy provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerTypeHierarchyProvider vscode/languages selector provider))

(defn register-linked-editing-range-provider
  "Register a linked editing range provider.
   
   Multiple providers can be registered for a language. In that case providers are sorted
   by their {@link languages.match score} and the best-matching provider that has a result is used. Failure
   of the selected provider will cause a failure of the whole operation.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider is applicable to.
   - `provider`: `LinkedEditingRangeProvider` - A linked editing range provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when being disposed."
  ^js [selector provider]
  (.registerLinkedEditingRangeProvider vscode/languages selector provider))

(defn register-document-drop-edit-provider
  "Registers a new {@link DocumentDropEditProvider }.
   
   **Parameters:**
   - `selector`: `DocumentSelector` - A selector that defines the documents this provider applies to.
   - `provider`: `DocumentDropEditProvider` - A drop provider.
   
   **Returns:** `Disposable` - A {@link Disposable} that unregisters this provider when disposed of."
  ^js [selector provider]
  (.registerDocumentDropEditProvider vscode/languages selector provider))

(defn set-language-configuration
  "Set a {@link LanguageConfiguration language configuration} for a language.
   
   **Parameters:**
   - `language`: `string` - A language identifier like `typescript`.
   - `configuration`: `LanguageConfiguration` - Language configuration.
   
   **Returns:** `Disposable` - A {@link Disposable} that unsets this configuration."
  ^js [language configuration]
  (.setLanguageConfiguration vscode/languages language configuration))

(defn on-did-change-diagnostics
  "An {@link Event } which fires when the global set of diagnostics changes. This is
   newly added and removed diagnostics.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js []
   (.-onDidChangeDiagnostics vscode/languages))
  (^js [listener]
   (.onDidChangeDiagnostics vscode/languages listener))
  (^js [listener this-args]
   (.onDidChangeDiagnostics vscode/languages listener this-args))
  (^js [listener this-args disposables]
   (.onDidChangeDiagnostics vscode/languages listener this-args disposables)))
