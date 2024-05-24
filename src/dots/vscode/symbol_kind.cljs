(ns dots.vscode.symbol-kind
  "A symbol kind."
  (:refer-clojure :exclude [array boolean key namespace])
  (:require ["vscode" :as vscode]))

(def file
  "The `File` symbol kind."
  (.-File vscode/SymbolKind))

(def module
  "The `Module` symbol kind."
  (.-Module vscode/SymbolKind))

(def namespace
  "The `Namespace` symbol kind."
  (.-Namespace vscode/SymbolKind))

(def package
  "The `Package` symbol kind."
  (.-Package vscode/SymbolKind))

(def class
  "The `Class` symbol kind."
  (.-Class vscode/SymbolKind))

(def method
  "The `Method` symbol kind."
  (.-Method vscode/SymbolKind))

(def property
  "The `Property` symbol kind."
  (.-Property vscode/SymbolKind))

(def field
  "The `Field` symbol kind."
  (.-Field vscode/SymbolKind))

(def constructor
  "The `Constructor` symbol kind."
  (.-Constructor vscode/SymbolKind))

(def enum
  "The `Enum` symbol kind."
  (.-Enum vscode/SymbolKind))

(def interface
  "The `Interface` symbol kind."
  (.-Interface vscode/SymbolKind))

(def function
  "The `Function` symbol kind."
  (.-Function vscode/SymbolKind))

(def variable
  "The `Variable` symbol kind."
  (.-Variable vscode/SymbolKind))

(def constant
  "The `Constant` symbol kind."
  (.-Constant vscode/SymbolKind))

(def string
  "The `String` symbol kind."
  (.-String vscode/SymbolKind))

(def number
  "The `Number` symbol kind."
  (.-Number vscode/SymbolKind))

(def boolean
  "The `Boolean` symbol kind."
  (.-Boolean vscode/SymbolKind))

(def array
  "The `Array` symbol kind."
  (.-Array vscode/SymbolKind))

(def object
  "The `Object` symbol kind."
  (.-Object vscode/SymbolKind))

(def key
  "The `Key` symbol kind."
  (.-Key vscode/SymbolKind))

(def null
  "The `Null` symbol kind."
  (.-Null vscode/SymbolKind))

(def enum-member
  "The `EnumMember` symbol kind."
  (.-EnumMember vscode/SymbolKind))

(def struct
  "The `Struct` symbol kind."
  (.-Struct vscode/SymbolKind))

(def event
  "The `Event` symbol kind."
  (.-Event vscode/SymbolKind))

(def operator
  "The `Operator` symbol kind."
  (.-Operator vscode/SymbolKind))

(def type-parameter
  "The `TypeParameter` symbol kind."
  (.-TypeParameter vscode/SymbolKind))
