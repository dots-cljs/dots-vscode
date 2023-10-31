(ns dots.vscode.configuration-change-event
  "An event describing the change in Configuration")

(defn affects-configuration?
  "Checks if the given section has changed.
   If scope is provided, checks if the section has changed for resources under the given scope."
  (^js [configuration-change-event section]
   (.affectsConfiguration ^js configuration-change-event section))
  (^js [configuration-change-event section scope]
   (.affectsConfiguration ^js configuration-change-event section scope)))
