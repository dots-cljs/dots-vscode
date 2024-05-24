(ns dots.vscode.tests
  "Namespace for testing functionality. Tests are published by registering
   {@link TestController } instances, then adding {@link TestItem TestItems}.
   Controllers may also describe how to run tests by creating one or more
   {@link TestRunProfile } instances."
  (:require ["vscode" :as vscode]))

(defn create-test-controller
  "Creates a new test controller.
   
   **Parameters:**
   - `id`: `string` - Identifier for the controller, must be globally unique.
   - `label`: `string` - A human-readable label for the controller.
   
   **Returns:** `TestController` - An instance of the {@link TestController}."
  ^js [id label]
  (.createTestController vscode/tests id label))
