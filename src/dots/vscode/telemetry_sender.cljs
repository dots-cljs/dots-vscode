(ns dots.vscode.telemetry-sender
  "The telemetry sender is the contract between a telemetry logger and some telemetry service. **Note** that extensions must NOT
   call the methods of their sender directly as the logger provides extra guards and cleaning.
   
   ```js
   const sender: vscode.TelemetrySender = {...};
   const logger = vscode.env.createTelemetryLogger(sender);
   
   // GOOD - uses the logger
   logger.logUsage('myEvent', { myData: 'myValue' });
   
   // BAD - uses the sender directly: no data cleansing, ignores user settings, no echoing to the telemetry output channel etc
   sender.logEvent('myEvent', { myData: 'myValue' });
   ```"
  (:refer-clojure :exclude [flush]))

(defn send-event-data
  "Function to send event data without a stacktrace. Used within a {@link TelemetryLogger }
   
   **Parameters:**
   - `event-name`: `string` - The name of the event which you are logging
   - `data`: `Record<string, any> | undefined` - A serializable key value pair that is being logged
   
   **Returns:** `void`"
  (^js [telemetry-sender event-name]
   (.sendEventData ^js telemetry-sender event-name))
  (^js [telemetry-sender event-name data]
   (.sendEventData ^js telemetry-sender event-name data)))

(defn send-error-data
  "Function to send an error. Used within a {@link TelemetryLogger }
   
   **Parameters:**
   - `error`: `Error` - The error being logged
   - `data`: `Record<string, any> | undefined` - Any additional data to be collected with the exception
   
   **Returns:** `void`"
  (^js [telemetry-sender error]
   (.sendErrorData ^js telemetry-sender error))
  (^js [telemetry-sender error data]
   (.sendErrorData ^js telemetry-sender error data)))

(defn flush
  "Optional flush function which will give this sender a chance to send any remaining events
   as its {@link TelemetryLogger } is being disposed
   
   **Returns:** `void | Thenable<void>`"
  ^js [telemetry-sender]
  (.flush ^js telemetry-sender))
