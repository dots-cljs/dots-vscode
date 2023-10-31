(ns dots.vscode.symbol-kind
  "A symbol kind."
  (:refer-clojure :exclude [array boolean key namespace])
  (:require ["vscode" :as vscode]))

(def file (.-File vscode/SymbolKind))

(def module (.-Module vscode/SymbolKind))

(def namespace (.-Namespace vscode/SymbolKind))

(def package (.-Package vscode/SymbolKind))

(def class (.-Class vscode/SymbolKind))

(def method (.-Method vscode/SymbolKind))

(def property (.-Property vscode/SymbolKind))

(def field (.-Field vscode/SymbolKind))

(def constructor (.-Constructor vscode/SymbolKind))

(def enum (.-Enum vscode/SymbolKind))

(def interface (.-Interface vscode/SymbolKind))

(def function (.-Function vscode/SymbolKind))

(def variable (.-Variable vscode/SymbolKind))

(def constant (.-Constant vscode/SymbolKind))

(def string (.-String vscode/SymbolKind))

(def number (.-Number vscode/SymbolKind))

(def boolean (.-Boolean vscode/SymbolKind))

(def array (.-Array vscode/SymbolKind))

(def object (.-Object vscode/SymbolKind))

(def key (.-Key vscode/SymbolKind))

(def null (.-Null vscode/SymbolKind))

(def enum-member (.-EnumMember vscode/SymbolKind))

(def struct (.-Struct vscode/SymbolKind))

(def event (.-Event vscode/SymbolKind))

(def operator (.-Operator vscode/SymbolKind))

(def type-parameter (.-TypeParameter vscode/SymbolKind))
