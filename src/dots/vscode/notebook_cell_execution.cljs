(ns dots.vscode.notebook-cell-execution
  "A NotebookCellExecution is how {@link NotebookController notebook controller} modify a notebook cell as
   it is executing.
   
   When a cell execution object is created, the cell enters the {@linkcode NotebookCellExecutionState.Pending Pending} state.
   When {@linkcode NotebookCellExecution.start start(...)} is called on the execution task, it enters the {@linkcode NotebookCellExecutionState.Executing Executing} state. When
   {@linkcode NotebookCellExecution.end end(...)} is called, it enters the {@linkcode NotebookCellExecutionState.Idle Idle} state.")

(defn cell
  "The {@link NotebookCell cell} for which this execution has been created.
   
   **Returns:** `NotebookCell`"
  ^js [notebook-cell-execution]
  (.-cell ^js notebook-cell-execution))

(defn token
  "A cancellation token which will be triggered when the cell execution is canceled
   from the UI.
   
   _Note_ that the cancellation token will not be triggered when the {@link NotebookController controller}
   that created this execution uses an {@link NotebookController.interruptHandler interrupt-handler}.
   
   **Returns:** `CancellationToken`"
  ^js [notebook-cell-execution]
  (.-token ^js notebook-cell-execution))

(defn execution-order
  "Set and unset the order of this cell execution.
   
   **Returns:** `number | undefined`"
  ^js [notebook-cell-execution]
  (.-executionOrder ^js notebook-cell-execution))

(defn set-execution-order!
  "Set and unset the order of this cell execution."
  ^js [notebook-cell-execution value]
  (set! (.-executionOrder ^js notebook-cell-execution) value))

(defn start
  "Signal that the execution has begun.
   
   **Parameters:**
   - `start-time`: `number | undefined` - The time that execution began, in milliseconds in the Unix epoch. Used to drive the clock
   that shows for how long a cell has been running. If not given, the clock won't be shown.
   
   **Returns:** `void`"
  (^js [notebook-cell-execution]
   (.start ^js notebook-cell-execution))
  (^js [notebook-cell-execution start-time]
   (.start ^js notebook-cell-execution start-time)))

(defn end
  "Signal that execution has ended.
   
   **Parameters:**
   - `success?`: `boolean | undefined` - If true, a green check is shown on the cell status bar.
   If false, a red X is shown.
   If undefined, no check or X icon is shown.
   - `end-time`: `number | undefined` - The time that execution finished, in milliseconds in the Unix epoch.
   
   **Returns:** `void`"
  (^js [notebook-cell-execution]
   (.end ^js notebook-cell-execution))
  (^js [notebook-cell-execution success?]
   (.end ^js notebook-cell-execution success?))
  (^js [notebook-cell-execution success? end-time]
   (.end ^js notebook-cell-execution success? end-time)))

(defn clear-output
  "Clears the output of the cell that is executing or of another cell that is affected by this execution.
   
   **Parameters:**
   - `cell`: `NotebookCell | undefined` - Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
   this execution.
   
   **Returns:** `Thenable<void>` - A thenable that resolves when the operation finished."
  (^js [notebook-cell-execution]
   (.clearOutput ^js notebook-cell-execution))
  (^js [notebook-cell-execution cell]
   (.clearOutput ^js notebook-cell-execution cell)))

(defn replace-output
  "Replace the output of the cell that is executing or of another cell that is affected by this execution.
   
   **Parameters:**
   - `out`: `NotebookCellOutput | readonly NotebookCellOutput[]` - Output that replaces the current output.
   - `cell`: `NotebookCell | undefined` - Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
   this execution.
   
   **Returns:** `Thenable<void>` - A thenable that resolves when the operation finished."
  (^js [notebook-cell-execution out]
   (.replaceOutput ^js notebook-cell-execution out))
  (^js [notebook-cell-execution out cell]
   (.replaceOutput ^js notebook-cell-execution out cell)))

(defn append-output
  "Append to the output of the cell that is executing or to another cell that is affected by this execution.
   
   **Parameters:**
   - `out`: `NotebookCellOutput | readonly NotebookCellOutput[]` - Output that is appended to the current output.
   - `cell`: `NotebookCell | undefined` - Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
   this execution.
   
   **Returns:** `Thenable<void>` - A thenable that resolves when the operation finished."
  (^js [notebook-cell-execution out]
   (.appendOutput ^js notebook-cell-execution out))
  (^js [notebook-cell-execution out cell]
   (.appendOutput ^js notebook-cell-execution out cell)))

(defn replace-output-items
  "Replace all output items of existing cell output.
   
   **Parameters:**
   - `items`: `NotebookCellOutputItem | readonly NotebookCellOutputItem[]` - Output items that replace the items of existing output.
   - `output`: `NotebookCellOutput` - Output object that already exists.
   
   **Returns:** `Thenable<void>` - A thenable that resolves when the operation finished."
  ^js [notebook-cell-execution items output]
  (.replaceOutputItems ^js notebook-cell-execution items output))

(defn append-output-items
  "Append output items to existing cell output.
   
   **Parameters:**
   - `items`: `NotebookCellOutputItem | readonly NotebookCellOutputItem[]` - Output items that are append to existing output.
   - `output`: `NotebookCellOutput` - Output object that already exists.
   
   **Returns:** `Thenable<void>` - A thenable that resolves when the operation finished."
  ^js [notebook-cell-execution items output]
  (.appendOutputItems ^js notebook-cell-execution items output))
