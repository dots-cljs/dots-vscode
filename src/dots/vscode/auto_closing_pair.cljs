(ns dots.vscode.auto-closing-pair
  "Describes pairs of strings where the close string will be automatically inserted when typing the opening string.")

(defn open
  "The string that will trigger the automatic insertion of the closing string."
  ^js [auto-closing-pair]
  (.-open ^js auto-closing-pair))

(defn set-open!
  "The string that will trigger the automatic insertion of the closing string."
  ^js [auto-closing-pair value]
  (set! (.-open ^js auto-closing-pair) value))

(defn close
  "The closing string that will be automatically inserted when typing the opening string."
  ^js [auto-closing-pair]
  (.-close ^js auto-closing-pair))

(defn set-close!
  "The closing string that will be automatically inserted when typing the opening string."
  ^js [auto-closing-pair value]
  (set! (.-close ^js auto-closing-pair) value))

(defn not-in
  "A set of tokens where the pair should not be auto closed."
  ^js [auto-closing-pair]
  (.-notIn ^js auto-closing-pair))

(defn set-not-in!
  "A set of tokens where the pair should not be auto closed."
  ^js [auto-closing-pair value]
  (set! (.-notIn ^js auto-closing-pair) value))
