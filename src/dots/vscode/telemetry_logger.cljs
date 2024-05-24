(ns dots.vscode.telemetry-logger
  "A telemetry logger which can be used by extensions to log usage and error telementry.
   
   A logger wraps around an {@link TelemetrySender sender} but it guarantees that
   - user settings to disable or tweak telemetry are respected, and that
   - potential sensitive data is removed
   
   It also enables an \"echo UI\" that prints whatever data is send and it allows the editor
   to forward unhandled errors to the respective extensions.
   
   To get an instance of a `TelemetryLogger`, use
   {@link env.createTelemetryLogger `createTelemetryLogger`}.")

(defn on-did-change-enable-states
  "An {@link Event } which fires when the enablement state of usage or error telemetry changes.
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [telemetry-logger]
   (.-onDidChangeEnableStates ^js telemetry-logger))
  (^js [telemetry-logger listener]
   (.onDidChangeEnableStates ^js telemetry-logger listener))
  (^js [telemetry-logger listener this-args]
   (.onDidChangeEnableStates ^js telemetry-logger listener this-args))
  (^js [telemetry-logger listener this-args disposables]
   (.onDidChangeEnableStates ^js telemetry-logger listener this-args disposables)))

(defn usage-enabled?
  "Whether or not usage telemetry is enabled for this logger."
  ^js [telemetry-logger]
  (.-isUsageEnabled ^js telemetry-logger))

(defn errors-enabled?
  "Whether or not error telemetry is enabled for this logger."
  ^js [telemetry-logger]
  (.-isErrorsEnabled ^js telemetry-logger))

(defn log-usage
  "Log a usage event.
   
   After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event.
   Automatically supports echoing to extension telemetry output channel.
   
   **Parameters:**
   - `event-name`: `string` - The event name to log
   - `data`: `Record<string, any> | undefined` - The data to log
   
   **Returns:** `void`"
  (^js [telemetry-logger event-name]
   (.logUsage ^js telemetry-logger event-name))
  (^js [telemetry-logger event-name data]
   (.logUsage ^js telemetry-logger event-name data)))

(defn log-error
  "Log an error event.
   
   After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event. Differs from `logUsage` in that it will log the event if the telemetry setting is Error+.
   Automatically supports echoing to extension telemetry output channel.
   Log an error event.
   
   Calls `TelemetrySender.sendErrorData`. Does cleaning, telemetry checks, and data mix-in.
   Automatically supports echoing to extension telemetry output channel.
   Will also automatically log any exceptions thrown within the extension host process.
   
   **Parameters:**
   - `error`: `Error` - The error object which contains the stack trace cleaned of PII
   - `event-name`: `string` - The event name to log
   - `data`: `Record<string, any> | undefined` - Additional data to log alongside the stack trace
   
   **Returns:** `void`"
  {:arglists '([telemetry-logger error]
               [telemetry-logger error data]
               [telemetry-logger event-name]
               [telemetry-logger event-name data])}
  (^js [a b]
   (.logError ^js a b))
  (^js [a b c]
   (.logError ^js a b c)))

(defn dispose
  "Dispose this object and free resources.
   
   **Returns:** `void`"
  ^js [telemetry-logger]
  (.dispose ^js telemetry-logger))
