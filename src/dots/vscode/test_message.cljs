(ns dots.vscode.test-message
  "Message associated with the test state. Can be linked to a specific
   source range -- useful for assertion failures, for example."
  (:require ["vscode" :as vscode]))

(defn message
  "Human-readable message text to display."
  ^js [test-message]
  (.-message ^js test-message))

(defn set-message!
  "Human-readable message text to display."
  ^js [test-message value]
  (set! (.-message ^js test-message) value))

(defn expected-output
  "Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown."
  ^js [test-message]
  (.-expectedOutput ^js test-message))

(defn set-expected-output!
  "Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown."
  ^js [test-message value]
  (set! (.-expectedOutput ^js test-message) value))

(defn actual-output
  "Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown."
  ^js [test-message]
  (.-actualOutput ^js test-message))

(defn set-actual-output!
  "Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown."
  ^js [test-message value]
  (set! (.-actualOutput ^js test-message) value))

(defn location
  "Associated file location."
  ^js [test-message]
  (.-location ^js test-message))

(defn set-location!
  "Associated file location."
  ^js [test-message value]
  (set! (.-location ^js test-message) value))

(defn context-value
  "Context value of the test item. This can be used to contribute message-
   specific actions to the test peek view. The value set here can be found
   in the `testMessage` property of the following `menus` contribution points:
   
   - `testing/message/context` - context menu for the message in the results tree
   - `testing/message/content` - a prominent button overlaying editor content where
      the message is displayed.
   
   For example:
   
   ```json
   \"contributes\": {
     \"menus\": {
       \"testing/message/content\": [
         {
           \"command\": \"extension.deleteCommentThread\",
           \"when\": \"testMessage == canApplyRichDiff\"
         }
       ]
     }
   }
   ```
   
   The command will be called with an object containing:
   - `test`: the {@link TestItem } the message is associated with, *if* it
      is still present in the {@link TestController.items } collection.
   - `message`: the {@link TestMessage } instance."
  ^js [test-message]
  (.-contextValue ^js test-message))

(defn set-context-value!
  "Context value of the test item. This can be used to contribute message-
   specific actions to the test peek view. The value set here can be found
   in the `testMessage` property of the following `menus` contribution points:
   
   - `testing/message/context` - context menu for the message in the results tree
   - `testing/message/content` - a prominent button overlaying editor content where
      the message is displayed.
   
   For example:
   
   ```json
   \"contributes\": {
     \"menus\": {
       \"testing/message/content\": [
         {
           \"command\": \"extension.deleteCommentThread\",
           \"when\": \"testMessage == canApplyRichDiff\"
         }
       ]
     }
   }
   ```
   
   The command will be called with an object containing:
   - `test`: the {@link TestItem } the message is associated with, *if* it
      is still present in the {@link TestController.items } collection.
   - `message`: the {@link TestMessage } instance."
  ^js [test-message value]
  (set! (.-contextValue ^js test-message) value))

(defn diff
  "Creates a new TestMessage that will present as a diff in the editor.
   
   **Parameters:**
   - `message`: `string | MarkdownString` - Message to display to the user.
   - `expected`: `string` - Expected output.
   - `actual`: `string` - Actual output.
   
   **Returns:** `TestMessage`"
  ^js [message expected actual]
  (.diff vscode/TestMessage message expected actual))
