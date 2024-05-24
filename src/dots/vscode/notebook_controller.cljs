(ns dots.vscode.notebook-controller
  "A notebook controller represents an entity that can execute notebook cells. This is often referred to as a kernel.
   
   There can be multiple controllers and the editor will let users choose which controller to use for a certain notebook. The
   {@linkcode NotebookController.notebookType notebookType}-property defines for what kind of notebooks a controller is for and
   the {@linkcode NotebookController.updateNotebookAffinity updateNotebookAffinity}-function allows controllers to set a preference
   for specific notebook documents. When a controller has been selected its
   {@link NotebookController.onDidChangeSelectedNotebooks onDidChangeSelectedNotebooks}-event fires.
   
   When a cell is being run the editor will invoke the {@linkcode NotebookController.executeHandler executeHandler} and a controller
   is expected to create and finalize a {@link NotebookCellExecution notebook cell execution}. However, controllers are also free
   to create executions by themselves.")

(defn id
  "The identifier of this notebook controller.
   
   _Note_ that controllers are remembered by their identifier and that extensions should use
   stable identifiers across sessions.
   
   **Returns:** `string`"
  ^js [notebook-controller]
  (.-id ^js notebook-controller))

(defn notebook-type
  "The notebook type this controller is for.
   
   **Returns:** `string`"
  ^js [notebook-controller]
  (.-notebookType ^js notebook-controller))

(defn supported-languages
  "An array of language identifiers that are supported by this
   controller. Any language identifier from {@linkcode languages.getLanguages getLanguages}
   is possible. When falsy all languages are supported.
   
   Samples:
   ```js
   // support JavaScript and TypeScript
   myController.supportedLanguages = ['javascript', 'typescript']
   
   // support all languages
   myController.supportedLanguages = undefined; // falsy
   myController.supportedLanguages = []; // falsy
   ```
   
   **Returns:** `string[] | undefined`"
  ^js [notebook-controller]
  (.-supportedLanguages ^js notebook-controller))

(defn set-supported-languages!
  "An array of language identifiers that are supported by this
   controller. Any language identifier from {@linkcode languages.getLanguages getLanguages}
   is possible. When falsy all languages are supported.
   
   Samples:
   ```js
   // support JavaScript and TypeScript
   myController.supportedLanguages = ['javascript', 'typescript']
   
   // support all languages
   myController.supportedLanguages = undefined; // falsy
   myController.supportedLanguages = []; // falsy
   ```"
  ^js [notebook-controller value]
  (set! (.-supportedLanguages ^js notebook-controller) value))

(defn label
  "The human-readable label of this notebook controller.
   
   **Returns:** `string`"
  ^js [notebook-controller]
  (.-label ^js notebook-controller))

(defn set-label!
  "The human-readable label of this notebook controller."
  ^js [notebook-controller value]
  (set! (.-label ^js notebook-controller) value))

(defn description
  "The human-readable description which is rendered less prominent.
   
   **Returns:** `string | undefined`"
  ^js [notebook-controller]
  (.-description ^js notebook-controller))

(defn set-description!
  "The human-readable description which is rendered less prominent."
  ^js [notebook-controller value]
  (set! (.-description ^js notebook-controller) value))

(defn detail
  "The human-readable detail which is rendered less prominent.
   
   **Returns:** `string | undefined`"
  ^js [notebook-controller]
  (.-detail ^js notebook-controller))

(defn set-detail!
  "The human-readable detail which is rendered less prominent."
  ^js [notebook-controller value]
  (set! (.-detail ^js notebook-controller) value))

(defn supports-execution-order?
  "Whether this controller supports execution order so that the
   editor can render placeholders for them.
   
   **Returns:** `boolean | undefined`"
  ^js [notebook-controller]
  (.-supportsExecutionOrder ^js notebook-controller))

(defn set-supports-execution-order!
  "Whether this controller supports execution order so that the
   editor can render placeholders for them."
  ^js [notebook-controller value]
  (set! (.-supportsExecutionOrder ^js notebook-controller) value))

(defn create-notebook-cell-execution
  "Create a cell execution task.
   
   _Note_ that there can only be one execution per cell at a time and that an error is thrown if
   a cell execution is created while another is still active.
   
   This should be used in response to the {@link NotebookController.executeHandler execution handler}
   being called or when cell execution has been started else, e.g when a cell was already
   executing or when cell execution was triggered from another source.
   
   **Parameters:**
   - `cell`: `NotebookCell` - The notebook cell for which to create the execution.
   
   **Returns:** `NotebookCellExecution` - A notebook cell execution."
  ^js [notebook-controller cell]
  (.createNotebookCellExecution ^js notebook-controller cell))

(defn execute-handler
  "The execute handler is invoked when the run gestures in the UI are selected, e.g Run Cell, Run All,
   Run Selection etc. The execute handler is responsible for creating and managing {@link NotebookCellExecution execution}-objects.
   
   **Returns:** `(cells: NotebookCell[], notebook: NotebookDocument, controller: NotebookController) => void | Thenable<void>`"
  ^js [notebook-controller]
  (.-executeHandler ^js notebook-controller))

(defn set-execute-handler!
  "The execute handler is invoked when the run gestures in the UI are selected, e.g Run Cell, Run All,
   Run Selection etc. The execute handler is responsible for creating and managing {@link NotebookCellExecution execution}-objects."
  ^js [notebook-controller value]
  (set! (.-executeHandler ^js notebook-controller) value))

(defn interrupt-handler
  "Optional interrupt handler.
   
   By default cell execution is canceled via {@link NotebookCellExecution.token tokens}. Cancellation
   tokens require that a controller can keep track of its execution so that it can cancel a specific execution at a later
   point. Not all scenarios allow for that, eg. REPL-style controllers often work by interrupting whatever is currently
   running. For those cases the interrupt handler exists - it can be thought of as the equivalent of `SIGINT`
   or `Control+C` in terminals.
   
   _Note_ that supporting {@link NotebookCellExecution.token cancellation tokens} is preferred and that interrupt handlers should
   only be used when tokens cannot be supported.
   
   **Returns:** `((notebook: NotebookDocument) => void | Thenable<void>) | undefined`"
  ^js [notebook-controller]
  (.-interruptHandler ^js notebook-controller))

(defn set-interrupt-handler!
  "Optional interrupt handler.
   
   By default cell execution is canceled via {@link NotebookCellExecution.token tokens}. Cancellation
   tokens require that a controller can keep track of its execution so that it can cancel a specific execution at a later
   point. Not all scenarios allow for that, eg. REPL-style controllers often work by interrupting whatever is currently
   running. For those cases the interrupt handler exists - it can be thought of as the equivalent of `SIGINT`
   or `Control+C` in terminals.
   
   _Note_ that supporting {@link NotebookCellExecution.token cancellation tokens} is preferred and that interrupt handlers should
   only be used when tokens cannot be supported."
  ^js [notebook-controller value]
  (set! (.-interruptHandler ^js notebook-controller) value))

(defn on-did-change-selected-notebooks
  "An event that fires whenever a controller has been selected or un-selected for a notebook document.
   
   There can be multiple controllers for a notebook and in that case a controllers needs to be _selected_. This is a user gesture
   and happens either explicitly or implicitly when interacting with a notebook for which a controller was _suggested_. When possible,
   the editor _suggests_ a controller that is most likely to be _selected_.
   
   _Note_ that controller selection is persisted (by the controllers {@link NotebookController.id id}) and restored as soon as a
   controller is re-created or as a notebook is {@link workspace.onDidOpenNotebookDocument opened}.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [notebook-controller]
   (.-onDidChangeSelectedNotebooks ^js notebook-controller))
  (^js [notebook-controller listener]
   (.onDidChangeSelectedNotebooks ^js notebook-controller listener))
  (^js [notebook-controller listener this-args]
   (.onDidChangeSelectedNotebooks ^js notebook-controller listener this-args))
  (^js [notebook-controller listener this-args disposables]
   (.onDidChangeSelectedNotebooks ^js notebook-controller listener this-args disposables)))

(defn update-notebook-affinity
  "A controller can set affinities for specific notebook documents. This allows a controller
   to be presented more prominent for some notebooks.
   
   **Parameters:**
   - `notebook`: `NotebookDocument` - The notebook for which a priority is set.
   - `affinity`: `NotebookControllerAffinity` - A controller affinity
   
   **Returns:** `void`"
  ^js [notebook-controller notebook affinity]
  (.updateNotebookAffinity ^js notebook-controller notebook affinity))

(defn dispose
  "Dispose and free associated resources.
   
   **Returns:** `void`"
  ^js [notebook-controller]
  (.dispose ^js notebook-controller))
