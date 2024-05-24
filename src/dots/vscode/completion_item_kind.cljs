(ns dots.vscode.completion-item-kind
  "Completion item kinds."
  (:refer-clojure :exclude [keyword])
  (:require ["vscode" :as vscode]))

(def text
  "The `Text` completion item kind."
  (.-Text vscode/CompletionItemKind))

(def method
  "The `Method` completion item kind."
  (.-Method vscode/CompletionItemKind))

(def function
  "The `Function` completion item kind."
  (.-Function vscode/CompletionItemKind))

(def constructor
  "The `Constructor` completion item kind."
  (.-Constructor vscode/CompletionItemKind))

(def field
  "The `Field` completion item kind."
  (.-Field vscode/CompletionItemKind))

(def variable
  "The `Variable` completion item kind."
  (.-Variable vscode/CompletionItemKind))

(def class
  "The `Class` completion item kind."
  (.-Class vscode/CompletionItemKind))

(def interface
  "The `Interface` completion item kind."
  (.-Interface vscode/CompletionItemKind))

(def module
  "The `Module` completion item kind."
  (.-Module vscode/CompletionItemKind))

(def property
  "The `Property` completion item kind."
  (.-Property vscode/CompletionItemKind))

(def unit
  "The `Unit` completion item kind."
  (.-Unit vscode/CompletionItemKind))

(def value
  "The `Value` completion item kind."
  (.-Value vscode/CompletionItemKind))

(def enum
  "The `Enum` completion item kind."
  (.-Enum vscode/CompletionItemKind))

(def keyword
  "The `Keyword` completion item kind."
  (.-Keyword vscode/CompletionItemKind))

(def snippet
  "The `Snippet` completion item kind."
  (.-Snippet vscode/CompletionItemKind))

(def color
  "The `Color` completion item kind."
  (.-Color vscode/CompletionItemKind))

(def reference
  "The `Reference` completion item kind."
  (.-Reference vscode/CompletionItemKind))

(def file
  "The `File` completion item kind."
  (.-File vscode/CompletionItemKind))

(def folder
  "The `Folder` completion item kind."
  (.-Folder vscode/CompletionItemKind))

(def enum-member
  "The `EnumMember` completion item kind."
  (.-EnumMember vscode/CompletionItemKind))

(def constant
  "The `Constant` completion item kind."
  (.-Constant vscode/CompletionItemKind))

(def struct
  "The `Struct` completion item kind."
  (.-Struct vscode/CompletionItemKind))

(def event
  "The `Event` completion item kind."
  (.-Event vscode/CompletionItemKind))

(def operator
  "The `Operator` completion item kind."
  (.-Operator vscode/CompletionItemKind))

(def type-parameter
  "The `TypeParameter` completion item kind."
  (.-TypeParameter vscode/CompletionItemKind))

(def user
  "The `User` completion item kind."
  (.-User vscode/CompletionItemKind))

(def issue
  "The `Issue` completion item kind."
  (.-Issue vscode/CompletionItemKind))
