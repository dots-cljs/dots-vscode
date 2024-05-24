(ns dots.vscode.telemetry-trusted-value
  "A special value wrapper denoting a value that is safe to not clean.
   This is to be used when you can guarantee no identifiable information is contained in the value and the cleaning is improperly redacting it.")

(defn value
  "The value that is trusted to not contain PII."
  ^js [telemetry-trusted-value]
  (.-value ^js telemetry-trusted-value))
