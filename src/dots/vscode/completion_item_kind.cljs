(ns dots.vscode.completion-item-kind
  "Completion item kinds."
  (:refer-clojure :exclude [keyword])
  (:require ["vscode" :as vscode]))

(def text (.-Text vscode/CompletionItemKind))

(def method (.-Method vscode/CompletionItemKind))

(def function (.-Function vscode/CompletionItemKind))

(def constructor (.-Constructor vscode/CompletionItemKind))

(def field (.-Field vscode/CompletionItemKind))

(def variable (.-Variable vscode/CompletionItemKind))

(def class (.-Class vscode/CompletionItemKind))

(def interface (.-Interface vscode/CompletionItemKind))

(def module (.-Module vscode/CompletionItemKind))

(def property (.-Property vscode/CompletionItemKind))

(def unit (.-Unit vscode/CompletionItemKind))

(def value (.-Value vscode/CompletionItemKind))

(def enum (.-Enum vscode/CompletionItemKind))

(def keyword (.-Keyword vscode/CompletionItemKind))

(def snippet (.-Snippet vscode/CompletionItemKind))

(def color (.-Color vscode/CompletionItemKind))

(def reference (.-Reference vscode/CompletionItemKind))

(def file (.-File vscode/CompletionItemKind))

(def folder (.-Folder vscode/CompletionItemKind))

(def enum-member (.-EnumMember vscode/CompletionItemKind))

(def constant (.-Constant vscode/CompletionItemKind))

(def struct (.-Struct vscode/CompletionItemKind))

(def event (.-Event vscode/CompletionItemKind))

(def operator (.-Operator vscode/CompletionItemKind))

(def type-parameter (.-TypeParameter vscode/CompletionItemKind))

(def user (.-User vscode/CompletionItemKind))

(def issue (.-Issue vscode/CompletionItemKind))
