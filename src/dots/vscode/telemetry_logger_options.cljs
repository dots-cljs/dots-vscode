(ns dots.vscode.telemetry-logger-options
  "Options for creating a {@link TelemetryLogger }")

(defn ignore-built-in-common-properties?
  "Whether or not you want to avoid having the built-in common properties such as os, extension name, etc injected into the data object.
   Defaults to `false` if not defined."
  ^js [telemetry-logger-options]
  (.-ignoreBuiltInCommonProperties ^js telemetry-logger-options))

(defn ignore-unhandled-errors?
  "Whether or not unhandled errors on the extension host caused by your extension should be logged to your sender.
   Defaults to `false` if not defined."
  ^js [telemetry-logger-options]
  (.-ignoreUnhandledErrors ^js telemetry-logger-options))

(defn additional-common-properties
  "Any additional common properties which should be injected into the data object."
  ^js [telemetry-logger-options]
  (.-additionalCommonProperties ^js telemetry-logger-options))
