(ns dots.vscode.output-channel
  "An output channel is a container for readonly textual information.
   
   To get an instance of an `OutputChannel` use
   {@link window.createOutputChannel createOutputChannel}."
  (:refer-clojure :exclude [name replace]))

(defn name
  "The human-readable name of this output channel."
  ^js [output-channel]
  (.-name ^js output-channel))

(defn append
  "Append the given value to the channel.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [output-channel value]
  (.append ^js output-channel value))

(defn append-line
  "Append the given value and a line feed character
   to the channel.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will be printed.
   
   **Returns:** `void`"
  ^js [output-channel value]
  (.appendLine ^js output-channel value))

(defn replace
  "Replaces all output from the channel with the given value.
   
   **Parameters:**
   - `value`: `string` - A string, falsy values will not be printed.
   
   **Returns:** `void`"
  ^js [output-channel value]
  (.replace ^js output-channel value))

(defn clear
  "Removes all output from the channel.
   
   **Returns:** `void`"
  ^js [output-channel]
  (.clear ^js output-channel))

(defn show
  "Reveal this channel in the UI.
   
   **Parameters:**
   - `column`: `ViewColumn | undefined` - This argument is **deprecated** and will be ignored.
   - `preserve-focus?`: `boolean | undefined` - When `true` the channel will not take focus.
   
   **Returns:** `void`"
  {:arglists '([output-channel]
               [output-channel column]
               [output-channel column preserve-focus?]
               [output-channel preserve-focus?])}
  (^js [output-channel]
   (.show ^js output-channel))
  (^js [a b]
   (.show ^js a b))
  (^js [output-channel column preserve-focus?]
   (.show ^js output-channel column preserve-focus?)))

(defn hide
  "Hide this channel from the UI.
   
   **Returns:** `void`"
  ^js [output-channel]
  (.hide ^js output-channel))

(defn dispose
  "Dispose and free associated resources.
   
   **Returns:** `void`"
  ^js [output-channel]
  (.dispose ^js output-channel))
