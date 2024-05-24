(ns dots.vscode.log-output-channel
  "A channel for containing log output.
   
   To get an instance of a `LogOutputChannel` use
   {@link window.createOutputChannel createOutputChannel}."
  (:refer-clojure :exclude [name replace]))

(defn log-level
  "The current log level of the channel. Defaults to {@link env.logLevel editor log level}.
   
   **Returns:** `LogLevel`"
  ^js [log-output-channel]
  (.-logLevel ^js log-output-channel))

(defn on-did-change-log-level
  "An {@link Event } which fires when the log level of the channel changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [log-output-channel]
   (.-onDidChangeLogLevel ^js log-output-channel))
  (^js [log-output-channel listener]
   (.onDidChangeLogLevel ^js log-output-channel listener))
  (^js [log-output-channel listener this-args]
   (.onDidChangeLogLevel ^js log-output-channel listener this-args))
  (^js [log-output-channel listener this-args disposables]
   (.onDidChangeLogLevel ^js log-output-channel listener this-args disposables)))

(defn trace
  "Outputs the given trace message to the channel. Use this method to log verbose information.
   
   The message is only logged if the channel is configured to display {@link LogLevel.Trace trace} log level.
   
   **Parameters:**
   - `message`: `string` - trace message to log
   - `args`: `any[]`
   
   **Returns:** `void`"
  ^js [log-output-channel message & args]
  (.. ^js log-output-channel -trace (apply ^js log-output-channel (to-array (cons message args)))))

(defn debug
  "Outputs the given debug message to the channel.
   
   The message is only logged if the channel is configured to display {@link LogLevel.Debug debug} log level or lower.
   
   **Parameters:**
   - `message`: `string` - debug message to log
   - `args`: `any[]`
   
   **Returns:** `void`"
  ^js [log-output-channel message & args]
  (.. ^js log-output-channel -debug (apply ^js log-output-channel (to-array (cons message args)))))

(defn info
  "Outputs the given information message to the channel.
   
   The message is only logged if the channel is configured to display {@link LogLevel.Info info} log level or lower.
   
   **Parameters:**
   - `message`: `string` - info message to log
   - `args`: `any[]`
   
   **Returns:** `void`"
  ^js [log-output-channel message & args]
  (.. ^js log-output-channel -info (apply ^js log-output-channel (to-array (cons message args)))))

(defn warn
  "Outputs the given warning message to the channel.
   
   The message is only logged if the channel is configured to display {@link LogLevel.Warning warning} log level or lower.
   
   **Parameters:**
   - `message`: `string` - warning message to log
   - `args`: `any[]`
   
   **Returns:** `void`"
  ^js [log-output-channel message & args]
  (.. ^js log-output-channel -warn (apply ^js log-output-channel (to-array (cons message args)))))

(defn error
  "Outputs the given error or error message to the channel.
   
   The message is only logged if the channel is configured to display {@link LogLevel.Error error} log level or lower.
   
   **Parameters:**
   - `error`: `string | Error` - Error or error message to log
   - `args`: `any[]`
   
   **Returns:** `void`"
  ^js [log-output-channel error & args]
  (.. ^js log-output-channel -error (apply ^js log-output-channel (to-array (cons error args)))))

(defn name
  "The human-readable name of this output channel.
   
   **Returns:** `string`"
  ^js [log-output-channel]
  (.-name ^js log-output-channel))

(defn append
  "Append the given value to the channel.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [log-output-channel value]
  (.append ^js log-output-channel value))

(defn append-line
  "Append the given value and a line feed character
   to the channel.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will be printed.
   
   **Returns:** `void`"
  ^js [log-output-channel value]
  (.appendLine ^js log-output-channel value))

(defn replace
  "Replaces all output from the channel with the given value.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [log-output-channel value]
  (.replace ^js log-output-channel value))

(defn clear
  "Removes all output from the channel.
   
   **Returns:** `void`"
  ^js [log-output-channel]
  (.clear ^js log-output-channel))

(defn show
  "Reveal this channel in the UI.
   
   **Parameters:**
   - `column`: `ViewColumn | undefined` - This argument is **deprecated** and will be ignored.
   - `preserve-focus?`: `boolean | undefined` - When `true` the channel will not take focus.
   
   **Returns:** `void`"
  {:arglists '([log-output-channel]
               [log-output-channel column]
               [log-output-channel column preserve-focus?]
               [log-output-channel preserve-focus?])}
  (^js [log-output-channel]
   (.show ^js log-output-channel))
  (^js [a b]
   (.show ^js a b))
  (^js [log-output-channel column preserve-focus?]
   (.show ^js log-output-channel column preserve-focus?)))

(defn hide
  "Hide this channel from the UI.
   
   **Returns:** `void`"
  ^js [log-output-channel]
  (.hide ^js log-output-channel))

(defn dispose
  "Dispose and free associated resources.
   
   **Returns:** `void`"
  ^js [log-output-channel]
  (.dispose ^js log-output-channel))
