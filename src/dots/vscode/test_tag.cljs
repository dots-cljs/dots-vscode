(ns dots.vscode.test-tag
  "Tags can be associated with {@link TestItem TestItems} and
   {@link TestRunProfile TestRunProfiles}. A profile with a tag can only
   execute tests that include that tag in their {@link TestItem.tags } array.")

(defn id
  "ID of the test tag. `TestTag` instances with the same ID are considered
   to be identical.
   
   **Returns:** `string`"
  ^js [test-tag]
  (.-id ^js test-tag))
