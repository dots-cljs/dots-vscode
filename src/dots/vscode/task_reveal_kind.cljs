(ns dots.vscode.task-reveal-kind
  "Controls the behaviour of the terminal's visibility."
  (:require ["vscode" :as vscode]))

(def always
  "Always brings the terminal to front if the task is executed."
  (.-Always vscode/TaskRevealKind))

(def silent
  "Only brings the terminal to front if a problem is detected executing the task
   (e.g. the task couldn't be started because)."
  (.-Silent vscode/TaskRevealKind))

(def never
  "The terminal never comes to front when the task is executed."
  (.-Never vscode/TaskRevealKind))
