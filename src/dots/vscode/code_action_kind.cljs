(ns dots.vscode.code-action-kind
  "Kind of a code action.
   
   Kinds are a hierarchical list of identifiers separated by `.`, e.g. `\"refactor.extract.function\"`.
   
   Code action kinds are used by the editor for UI elements such as the refactoring context menu. Users
   can also trigger code actions with a specific kind with the `editor.action.codeAction` command."
  (:refer-clojure :exclude [contains? empty]))

(defn value
  "String value of the kind, e.g. `\"refactor.extract.function\"`.
   
   **Returns:** `string`"
  ^js [code-action-kind]
  (.-value ^js code-action-kind))

(defn append
  "Create a new kind by appending a more specific selector to the current kind.
   
   Does not modify the current kind.
   
   **Parameters:**
   - `parts`: `string`
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind parts]
  (.append ^js code-action-kind parts))

(defn intersects?
  "Checks if this code action kind intersects `other`.
   
   The kind `\"refactor.extract\"` for example intersects `refactor`, `\"refactor.extract\"` and `\"refactor.extract.function\"`,
   but not `\"unicorn.refactor.extract\"`, or `\"refactor.extractAll\"`.
   
   **Parameters:**
   - `other`: `CodeActionKind` - Kind to check.
   
   **Returns:** `boolean`"
  ^js [code-action-kind other]
  (.intersects ^js code-action-kind other))

(defn contains?
  "Checks if `other` is a sub-kind of this `CodeActionKind`.
   
   The kind `\"refactor.extract\"` for example contains `\"refactor.extract\"` and ``\"refactor.extract.function\"`,
   but not `\"unicorn.refactor.extract\"`, or `\"refactor.extractAll\"` or `refactor`.
   
   **Parameters:**
   - `other`: `CodeActionKind` - Kind to check.
   
   **Returns:** `boolean`"
  ^js [code-action-kind other]
  (.contains ^js code-action-kind other))

(defn empty
  "Empty kind.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-Empty ^js code-action-kind))

(defn quick-fix
  "Base kind for quickfix actions: `quickfix`.
   
   Quick fix actions address a problem in the code and are shown in the normal code action context menu.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-QuickFix ^js code-action-kind))

(defn refactor
  "Base kind for refactoring actions: `refactor`
   
   Refactoring actions are shown in the refactoring context menu.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-Refactor ^js code-action-kind))

(defn refactor-extract
  "Base kind for refactoring extraction actions: `refactor.extract`
   
   Example extract actions:
   
   - Extract method
   - Extract function
   - Extract variable
   - Extract interface from class
   - ...
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-RefactorExtract ^js code-action-kind))

(defn refactor-inline
  "Base kind for refactoring inline actions: `refactor.inline`
   
   Example inline actions:
   
   - Inline function
   - Inline variable
   - Inline constant
   - ...
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-RefactorInline ^js code-action-kind))

(defn refactor-move
  "Base kind for refactoring move actions: `refactor.move`
   
   Example move actions:
   
   - Move a function to a new file
   - Move a property between classes
   - Move method to base class
   - ...
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-RefactorMove ^js code-action-kind))

(defn refactor-rewrite
  "Base kind for refactoring rewrite actions: `refactor.rewrite`
   
   Example rewrite actions:
   
   - Convert JavaScript function to class
   - Add or remove parameter
   - Encapsulate field
   - Make method static
   - ...
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-RefactorRewrite ^js code-action-kind))

(defn source
  "Base kind for source actions: `source`
   
   Source code actions apply to the entire file. They must be explicitly requested and will not show in the
   normal [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) menu. Source actions
   can be run on save using `editor.codeActionsOnSave` and are also shown in the `source` context menu.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-Source ^js code-action-kind))

(defn source-organize-imports
  "Base kind for an organize imports source action: `source.organizeImports`.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-SourceOrganizeImports ^js code-action-kind))

(defn source-fix-all
  "Base kind for auto-fix source actions: `source.fixAll`.
   
   Fix all actions automatically fix errors that have a clear fix that do not require user input.
   They should not suppress errors or perform unsafe fixes such as generating new types or classes.
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-SourceFixAll ^js code-action-kind))

(defn notebook
  "Base kind for all code actions applying to the enitre notebook's scope. CodeActionKinds using
   this should always begin with `notebook.`
   
   This requires that new CodeActions be created for it and contributed via extensions.
   Pre-existing kinds can not just have the new `notebook.` prefix added to them, as the functionality
   is unique to the full-notebook scope.
   
   Notebook CodeActionKinds can be initialized as either of the following (both resulting in `notebook.source.xyz`):
   - `const newKind =  CodeActionKind.Notebook.append(CodeActionKind.Source.append('xyz').value)`
   - `const newKind =  CodeActionKind.Notebook.append('source.xyz')`
   
   Example Kinds/Actions:
   - `notebook.source.organizeImports` (might move all imports to a new top cell)
   - `notebook.source.normalizeVariableNames` (might rename all variables to a standardized casing format)
   
   **Returns:** `CodeActionKind`"
  ^js [code-action-kind]
  (.-Notebook ^js code-action-kind))
