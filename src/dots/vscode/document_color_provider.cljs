(ns dots.vscode.document-color-provider
  "The document color provider defines the contract between extensions and feature of
   picking and modifying colors in the editor.")

(defn provide-document-colors
  "Provide colors for the given document.
   
   **Parameters:**
   - `document`: `TextDocument` - The document in which the command was invoked.
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<ColorInformation[]>` - An array of {@link ColorInformationcolor information} or a thenable that resolves to such. The lack of a result
   can be signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-color-provider document token]
  (.provideDocumentColors ^js document-color-provider document token))

(defn provide-color-presentations
  "Provide {@link ColorPresentation representations} for a color.
   
   **Parameters:**
   - `color`: `Color` - The color to show and insert.
   - `context`: `{ readonly document: TextDocument; readonly range: Range; }` - A context object with additional information
   - `token`: `CancellationToken` - A cancellation token.
   
   **Returns:** `ProviderResult<ColorPresentation[]>` - An array of color presentations or a thenable that resolves to such. The lack of a result
   can be signaled by returning `undefined`, `null`, or an empty array."
  ^js [document-color-provider color context token]
  (.provideColorPresentations ^js document-color-provider color context token))
