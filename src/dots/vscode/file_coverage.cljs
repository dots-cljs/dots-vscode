(ns dots.vscode.file-coverage
  "Contains coverage metadata for a file."
  (:require ["vscode" :as vscode]))

(defn uri
  "File URI."
  ^js [file-coverage]
  (.-uri ^js file-coverage))

(defn statement-coverage
  "Statement coverage information. If the reporter does not provide statement
   coverage information, this can instead be used to represent line coverage."
  ^js [file-coverage]
  (.-statementCoverage ^js file-coverage))

(defn set-statement-coverage!
  "Statement coverage information. If the reporter does not provide statement
   coverage information, this can instead be used to represent line coverage."
  ^js [file-coverage value]
  (set! (.-statementCoverage ^js file-coverage) value))

(defn branch-coverage
  "Branch coverage information."
  ^js [file-coverage]
  (.-branchCoverage ^js file-coverage))

(defn set-branch-coverage!
  "Branch coverage information."
  ^js [file-coverage value]
  (set! (.-branchCoverage ^js file-coverage) value))

(defn declaration-coverage
  "Declaration coverage information. Depending on the reporter and
   language, this may be types such as functions, methods, or namespaces."
  ^js [file-coverage]
  (.-declarationCoverage ^js file-coverage))

(defn set-declaration-coverage!
  "Declaration coverage information. Depending on the reporter and
   language, this may be types such as functions, methods, or namespaces."
  ^js [file-coverage value]
  (set! (.-declarationCoverage ^js file-coverage) value))

(defn from-details
  "Creates a {@link FileCoverage } instance with counts filled in from
   the coverage details.
   
   **Parameters:**
   - `uri`: `Uri` - Covered file URI
   - `details`: `readonly FileCoverageDetail[]`
   
   **Returns:** `FileCoverage`"
  ^js [uri details]
  (.fromDetails vscode/FileCoverage uri details))
