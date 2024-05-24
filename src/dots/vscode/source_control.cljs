(ns dots.vscode.source-control
  "An source control is able to provide {@link SourceControlResourceState resource states}
   to the editor and interact with the editor in several source control related ways."
  (:refer-clojure :exclude [count]))

(defn id
  "The id of this source control.
   
   **Returns:** `string`"
  ^js [source-control]
  (.-id ^js source-control))

(defn label
  "The human-readable label of this source control.
   
   **Returns:** `string`"
  ^js [source-control]
  (.-label ^js source-control))

(defn root-uri
  "The (optional) Uri of the root of this source control.
   
   **Returns:** `Uri | undefined`"
  ^js [source-control]
  (.-rootUri ^js source-control))

(defn input-box
  "The {@link SourceControlInputBox input box} for this source control.
   
   **Returns:** `SourceControlInputBox`"
  ^js [source-control]
  (.-inputBox ^js source-control))

(defn count
  "The UI-visible count of {@link SourceControlResourceState resource states} of
   this source control.
   
   If undefined, this source control will
   - display its UI-visible count as zero, and
   - contribute the count of its {@link SourceControlResourceState resource states} to the UI-visible aggregated count for all source controls
   
   **Returns:** `number | undefined`"
  ^js [source-control]
  (.-count ^js source-control))

(defn set-count!
  "The UI-visible count of {@link SourceControlResourceState resource states} of
   this source control.
   
   If undefined, this source control will
   - display its UI-visible count as zero, and
   - contribute the count of its {@link SourceControlResourceState resource states} to the UI-visible aggregated count for all source controls"
  ^js [source-control value]
  (set! (.-count ^js source-control) value))

(defn quick-diff-provider
  "An optional {@link QuickDiffProvider quick diff provider}.
   
   **Returns:** `QuickDiffProvider | undefined`"
  ^js [source-control]
  (.-quickDiffProvider ^js source-control))

(defn set-quick-diff-provider!
  "An optional {@link QuickDiffProvider quick diff provider}."
  ^js [source-control value]
  (set! (.-quickDiffProvider ^js source-control) value))

(defn commit-template
  "Optional commit template string.
   
   The Source Control viewlet will populate the Source Control
   input with this value when appropriate.
   
   **Returns:** `string | undefined`"
  ^js [source-control]
  (.-commitTemplate ^js source-control))

(defn set-commit-template!
  "Optional commit template string.
   
   The Source Control viewlet will populate the Source Control
   input with this value when appropriate."
  ^js [source-control value]
  (set! (.-commitTemplate ^js source-control) value))

(defn accept-input-command
  "Optional accept input command.
   
   This command will be invoked when the user accepts the value
   in the Source Control input.
   
   **Returns:** `Command | undefined`"
  ^js [source-control]
  (.-acceptInputCommand ^js source-control))

(defn set-accept-input-command!
  "Optional accept input command.
   
   This command will be invoked when the user accepts the value
   in the Source Control input."
  ^js [source-control value]
  (set! (.-acceptInputCommand ^js source-control) value))

(defn status-bar-commands
  "Optional status bar commands.
   
   These commands will be displayed in the editor's status bar.
   
   **Returns:** `Command[] | undefined`"
  ^js [source-control]
  (.-statusBarCommands ^js source-control))

(defn set-status-bar-commands!
  "Optional status bar commands.
   
   These commands will be displayed in the editor's status bar."
  ^js [source-control value]
  (set! (.-statusBarCommands ^js source-control) value))

(defn create-resource-group
  "Create a new {@link SourceControlResourceGroup resource group}.
   
   **Parameters:**
   - `id`: `string`
   - `label`: `string`
   
   **Returns:** `SourceControlResourceGroup`"
  ^js [source-control id label]
  (.createResourceGroup ^js source-control id label))

(defn dispose
  "Dispose this source control.
   
   **Returns:** `void`"
  ^js [source-control]
  (.dispose ^js source-control))
