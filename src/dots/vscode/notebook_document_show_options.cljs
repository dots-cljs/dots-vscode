(ns dots.vscode.notebook-document-show-options
  "Represents options to configure the behavior of showing a {@link NotebookDocument notebook document} in an {@link NotebookEditor notebook editor}.")

(defn view-column
  "An optional view column in which the {@link NotebookEditor notebook editor} should be shown.
   The default is the {@link ViewColumn.Active active}. Columns that do not exist
   will be created as needed up to the maximum of {@linkcode ViewColumn.Nine }.
   Use {@linkcode ViewColumn.Beside } to open the editor to the side of the currently
   active one."
  ^js [notebook-document-show-options]
  (.-viewColumn ^js notebook-document-show-options))

(defn preserve-focus?
  "An optional flag that when `true` will stop the {@link NotebookEditor notebook editor} from taking focus."
  ^js [notebook-document-show-options]
  (.-preserveFocus ^js notebook-document-show-options))

(defn preview?
  "An optional flag that controls if an {@link NotebookEditor notebook editor}-tab shows as preview. Preview tabs will
   be replaced and reused until set to stay - either explicitly or through editing. The default behaviour depends
   on the `workbench.editor.enablePreview`-setting."
  ^js [notebook-document-show-options]
  (.-preview ^js notebook-document-show-options))

(defn selections
  "An optional selection to apply for the document in the {@link NotebookEditor notebook editor}."
  ^js [notebook-document-show-options]
  (.-selections ^js notebook-document-show-options))
