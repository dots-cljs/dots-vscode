(ns dots.vscode.progress-options
  "Value-object describing where and how progress should show.")

(defn location
  "The location at which progress should show."
  ^js [progress-options]
  (.-location ^js progress-options))

(defn set-location!
  "The location at which progress should show."
  ^js [progress-options value]
  (set! (.-location ^js progress-options) value))

(defn title
  "A human-readable string which will be used to describe the
   operation."
  ^js [progress-options]
  (.-title ^js progress-options))

(defn set-title!
  "A human-readable string which will be used to describe the
   operation."
  ^js [progress-options value]
  (set! (.-title ^js progress-options) value))

(defn cancellable?
  "Controls if a cancel button should show to allow the user to
   cancel the long running operation.  Note that currently only
   `ProgressLocation.Notification` is supporting to show a cancel
   button."
  ^js [progress-options]
  (.-cancellable ^js progress-options))

(defn set-cancellable!
  "Controls if a cancel button should show to allow the user to
   cancel the long running operation.  Note that currently only
   `ProgressLocation.Notification` is supporting to show a cancel
   button."
  ^js [progress-options value]
  (set! (.-cancellable ^js progress-options) value))
