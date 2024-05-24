(ns dots.vscode.save-dialog-options
  "Options to configure the behaviour of a file save dialog.")

(defn default-uri
  "The resource the dialog shows when opened.
   
   **Returns:** `Uri | undefined`"
  ^js [save-dialog-options]
  (.-defaultUri ^js save-dialog-options))

(defn set-default-uri!
  "The resource the dialog shows when opened."
  ^js [save-dialog-options value]
  (set! (.-defaultUri ^js save-dialog-options) value))

(defn save-label
  "A human-readable string for the save button.
   
   **Returns:** `string | undefined`"
  ^js [save-dialog-options]
  (.-saveLabel ^js save-dialog-options))

(defn set-save-label!
  "A human-readable string for the save button."
  ^js [save-dialog-options value]
  (set! (.-saveLabel ^js save-dialog-options) value))

(defn filters
  "A set of file filters that are used by the dialog. Each entry is a human-readable label,
   like \"TypeScript\", and an array of extensions, for example:
   ```ts
   {
   	'Images': ['png', 'jpg'],
   	'TypeScript': ['ts', 'tsx']
   }
   ```
   
   **Returns:** `{ [name: string]: string[]; } | undefined`"
  ^js [save-dialog-options]
  (.-filters ^js save-dialog-options))

(defn set-filters!
  "A set of file filters that are used by the dialog. Each entry is a human-readable label,
   like \"TypeScript\", and an array of extensions, for example:
   ```ts
   {
   	'Images': ['png', 'jpg'],
   	'TypeScript': ['ts', 'tsx']
   }
   ```"
  ^js [save-dialog-options value]
  (set! (.-filters ^js save-dialog-options) value))

(defn title
  "Dialog title.
   
   This parameter might be ignored, as not all operating systems display a title on save dialogs
   (for example, macOS).
   
   **Returns:** `string | undefined`"
  ^js [save-dialog-options]
  (.-title ^js save-dialog-options))

(defn set-title!
  "Dialog title.
   
   This parameter might be ignored, as not all operating systems display a title on save dialogs
   (for example, macOS)."
  ^js [save-dialog-options value]
  (set! (.-title ^js save-dialog-options) value))
