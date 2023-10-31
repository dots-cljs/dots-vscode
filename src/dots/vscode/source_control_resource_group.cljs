(ns dots.vscode.source-control-resource-group
  "A source control resource group is a collection of
   {@link SourceControlResourceState source control resource states}.")

(defn id
  "The id of this source control resource group."
  ^js [source-control-resource-group]
  (.-id ^js source-control-resource-group))

(defn label
  "The label of this source control resource group."
  ^js [source-control-resource-group]
  (.-label ^js source-control-resource-group))

(defn set-label!
  "The label of this source control resource group."
  ^js [source-control-resource-group value]
  (set! (.-label ^js source-control-resource-group) value))

(defn hide-when-empty?
  "Whether this source control resource group is hidden when it contains
   no {@link SourceControlResourceState source control resource states}."
  ^js [source-control-resource-group]
  (.-hideWhenEmpty ^js source-control-resource-group))

(defn set-hide-when-empty!
  "Whether this source control resource group is hidden when it contains
   no {@link SourceControlResourceState source control resource states}."
  ^js [source-control-resource-group value]
  (set! (.-hideWhenEmpty ^js source-control-resource-group) value))

(defn resource-states
  "This group's collection of
   {@link SourceControlResourceState source control resource states}."
  ^js [source-control-resource-group]
  (.-resourceStates ^js source-control-resource-group))

(defn set-resource-states!
  "This group's collection of
   {@link SourceControlResourceState source control resource states}."
  ^js [source-control-resource-group value]
  (set! (.-resourceStates ^js source-control-resource-group) value))

(defn dispose
  "Dispose this source control resource group."
  ^js [source-control-resource-group]
  (.dispose ^js source-control-resource-group))
