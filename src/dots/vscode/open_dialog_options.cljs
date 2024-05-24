(ns dots.vscode.open-dialog-options
  "Options to configure the behaviour of a file open dialog.
   
   * Note 1: On Windows and Linux, a file dialog cannot be both a file selector and a folder selector, so if you
   set both `canSelectFiles` and `canSelectFolders` to `true` on these platforms, a folder selector will be shown.
   * Note 2: Explicitly setting `canSelectFiles` and `canSelectFolders` to `false` is futile
   and the editor then silently adjusts the options to select files.")

(defn default-uri
  "The resource the dialog shows when opened."
  ^js [open-dialog-options]
  (.-defaultUri ^js open-dialog-options))

(defn set-default-uri!
  "The resource the dialog shows when opened."
  ^js [open-dialog-options value]
  (set! (.-defaultUri ^js open-dialog-options) value))

(defn open-label
  "A human-readable string for the open button."
  ^js [open-dialog-options]
  (.-openLabel ^js open-dialog-options))

(defn set-open-label!
  "A human-readable string for the open button."
  ^js [open-dialog-options value]
  (set! (.-openLabel ^js open-dialog-options) value))

(defn can-select-files?
  "Allow to select files, defaults to `true`."
  ^js [open-dialog-options]
  (.-canSelectFiles ^js open-dialog-options))

(defn set-can-select-files!
  "Allow to select files, defaults to `true`."
  ^js [open-dialog-options value]
  (set! (.-canSelectFiles ^js open-dialog-options) value))

(defn can-select-folders?
  "Allow to select folders, defaults to `false`."
  ^js [open-dialog-options]
  (.-canSelectFolders ^js open-dialog-options))

(defn set-can-select-folders!
  "Allow to select folders, defaults to `false`."
  ^js [open-dialog-options value]
  (set! (.-canSelectFolders ^js open-dialog-options) value))

(defn can-select-many?
  "Allow to select many files or folders."
  ^js [open-dialog-options]
  (.-canSelectMany ^js open-dialog-options))

(defn set-can-select-many!
  "Allow to select many files or folders."
  ^js [open-dialog-options value]
  (set! (.-canSelectMany ^js open-dialog-options) value))

(defn filters
  "A set of file filters that are used by the dialog. Each entry is a human-readable label,
   like \"TypeScript\", and an array of extensions, for example:
   ```ts
   {
   	'Images': ['png', 'jpg'],
   	'TypeScript': ['ts', 'tsx']
   }
   ```"
  ^js [open-dialog-options]
  (.-filters ^js open-dialog-options))

(defn set-filters!
  "A set of file filters that are used by the dialog. Each entry is a human-readable label,
   like \"TypeScript\", and an array of extensions, for example:
   ```ts
   {
   	'Images': ['png', 'jpg'],
   	'TypeScript': ['ts', 'tsx']
   }
   ```"
  ^js [open-dialog-options value]
  (set! (.-filters ^js open-dialog-options) value))

(defn title
  "Dialog title.
   
   This parameter might be ignored, as not all operating systems display a title on open dialogs
   (for example, macOS)."
  ^js [open-dialog-options]
  (.-title ^js open-dialog-options))

(defn set-title!
  "Dialog title.
   
   This parameter might be ignored, as not all operating systems display a title on open dialogs
   (for example, macOS)."
  ^js [open-dialog-options value]
  (set! (.-title ^js open-dialog-options) value))
