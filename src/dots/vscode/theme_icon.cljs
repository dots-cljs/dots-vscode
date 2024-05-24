(ns dots.vscode.theme-icon
  "A reference to a named icon. Currently, {@link ThemeIcon.File File}, {@link ThemeIcon.Folder Folder},
   and [ThemeIcon ids](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing) are supported.
   Using a theme icon is preferred over a custom icon as it gives product theme authors the possibility to change the icons.
   
   *Note* that theme icons can also be rendered inside labels and descriptions. Places that support theme icons spell this out
   and they use the `$(<name>)`-syntax, for instance `quickPick.label = \"Hello World $(globe)\"`.")

(defn id
  "The id of the icon. The available icons are listed in https://code.visualstudio.com/api/references/icons-in-labels#icon-listing.
   
   **Returns:** `string`"
  ^js [theme-icon]
  (.-id ^js theme-icon))

(defn color
  "The optional ThemeColor of the icon. The color is currently only used in {@link TreeItem }.
   
   **Returns:** `ThemeColor | undefined`"
  ^js [theme-icon]
  (.-color ^js theme-icon))

(defn file
  "Reference to an icon representing a file. The icon is taken from the current file icon theme or a placeholder icon is used.
   
   **Returns:** `ThemeIcon`"
  ^js [theme-icon]
  (.-File ^js theme-icon))

(defn folder
  "Reference to an icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon is used.
   
   **Returns:** `ThemeIcon`"
  ^js [theme-icon]
  (.-Folder ^js theme-icon))
