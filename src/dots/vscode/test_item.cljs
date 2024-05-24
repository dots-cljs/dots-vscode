(ns dots.vscode.test-item
  "An item shown in the \"test explorer\" view.
   
   A `TestItem` can represent either a test suite or a test itself, since
   they both have similar capabilities."
  (:refer-clojure :exclude [range]))

(defn id
  "Identifier for the `TestItem`. This is used to correlate
   test results and tests in the document with those in the workspace
   (test explorer). This cannot change for the lifetime of the `TestItem`,
   and must be unique among its parent's direct children.
   
   **Returns:** `string`"
  ^js [test-item]
  (.-id ^js test-item))

(defn uri
  "URI this `TestItem` is associated with. May be a file or directory.
   
   **Returns:** `Uri | undefined`"
  ^js [test-item]
  (.-uri ^js test-item))

(defn children
  "The children of this test item. For a test suite, this may contain the
   individual test cases or nested suites.
   
   **Returns:** `TestItemCollection`"
  ^js [test-item]
  (.-children ^js test-item))

(defn parent
  "The parent of this item. It's set automatically, and is undefined
   top-level items in the {@link TestController.items } and for items that
   aren't yet included in another item's {@link TestItem.children children}.
   
   **Returns:** `TestItem | undefined`"
  ^js [test-item]
  (.-parent ^js test-item))

(defn tags
  "Tags associated with this test item. May be used in combination with
   {@link TestRunProfile.tag tags}, or simply as an organizational feature.
   
   **Returns:** `readonly TestTag[]`"
  ^js [test-item]
  (.-tags ^js test-item))

(defn set-tags!
  "Tags associated with this test item. May be used in combination with
   {@link TestRunProfile.tag tags}, or simply as an organizational feature."
  ^js [test-item value]
  (set! (.-tags ^js test-item) value))

(defn can-resolve-children?
  "Indicates whether this test item may have children discovered by resolving.
   
   If true, this item is shown as expandable in the Test Explorer view and
   expanding the item will cause {@link TestController.resolveHandler }
   to be invoked with the item.
   
   Default to `false`.
   
   **Returns:** `boolean`"
  ^js [test-item]
  (.-canResolveChildren ^js test-item))

(defn set-can-resolve-children!
  "Indicates whether this test item may have children discovered by resolving.
   
   If true, this item is shown as expandable in the Test Explorer view and
   expanding the item will cause {@link TestController.resolveHandler }
   to be invoked with the item.
   
   Default to `false`."
  ^js [test-item value]
  (set! (.-canResolveChildren ^js test-item) value))

(defn busy?
  "Controls whether the item is shown as \"busy\" in the Test Explorer view.
   This is useful for showing status while discovering children.
   
   Defaults to `false`.
   
   **Returns:** `boolean`"
  ^js [test-item]
  (.-busy ^js test-item))

(defn set-busy!
  "Controls whether the item is shown as \"busy\" in the Test Explorer view.
   This is useful for showing status while discovering children.
   
   Defaults to `false`."
  ^js [test-item value]
  (set! (.-busy ^js test-item) value))

(defn label
  "Display name describing the test case.
   
   **Returns:** `string`"
  ^js [test-item]
  (.-label ^js test-item))

(defn set-label!
  "Display name describing the test case."
  ^js [test-item value]
  (set! (.-label ^js test-item) value))

(defn description
  "Optional description that appears next to the label.
   
   **Returns:** `string | undefined`"
  ^js [test-item]
  (.-description ^js test-item))

(defn set-description!
  "Optional description that appears next to the label."
  ^js [test-item value]
  (set! (.-description ^js test-item) value))

(defn sort-text
  "A string that should be used when comparing this item
   with other items. When `falsy` the {@link TestItem.label label}
   is used.
   
   **Returns:** `string | undefined`"
  ^js [test-item]
  (.-sortText ^js test-item))

(defn set-sort-text!
  "A string that should be used when comparing this item
   with other items. When `falsy` the {@link TestItem.label label}
   is used."
  ^js [test-item value]
  (set! (.-sortText ^js test-item) value))

(defn range
  "Location of the test item in its {@link TestItem.uri uri}.
   
   This is only meaningful if the `uri` points to a file.
   
   **Returns:** `Range | undefined`"
  ^js [test-item]
  (.-range ^js test-item))

(defn set-range!
  "Location of the test item in its {@link TestItem.uri uri}.
   
   This is only meaningful if the `uri` points to a file."
  ^js [test-item value]
  (set! (.-range ^js test-item) value))

(defn error
  "Optional error encountered while loading the test.
   
   Note that this is not a test result and should only be used to represent errors in
   test discovery, such as syntax errors.
   
   **Returns:** `string | MarkdownString | undefined`"
  ^js [test-item]
  (.-error ^js test-item))

(defn set-error!
  "Optional error encountered while loading the test.
   
   Note that this is not a test result and should only be used to represent errors in
   test discovery, such as syntax errors."
  ^js [test-item value]
  (set! (.-error ^js test-item) value))
