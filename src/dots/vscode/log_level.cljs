(ns dots.vscode.log-level
  "Log levels"
  (:require ["vscode" :as vscode]))

(def off
  "No messages are logged with this level."
  (.-Off vscode/LogLevel))

(def trace
  "All messages are logged with this level."
  (.-Trace vscode/LogLevel))

(def debug
  "Messages with debug and higher log level are logged with this level."
  (.-Debug vscode/LogLevel))

(def info
  "Messages with info and higher log level are logged with this level."
  (.-Info vscode/LogLevel))

(def warning
  "Messages with warning and higher log level are logged with this level."
  (.-Warning vscode/LogLevel))

(def error
  "Only error messages are logged with this level."
  (.-Error vscode/LogLevel))
