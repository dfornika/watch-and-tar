(ns watch-and-tar.server
  (:require [hawk.core :as hawk]
            [watch-and-tar.handlers :as handlers]))

(defn start!
  "Start the watcher"
  [options]
  (hawk/watch! [{:paths [(:dir options)]
                 :handler handlers/print-handler}]))

(defn stop!
  "Stop a watcher"
  [options]
  (hawk/stop! (:watcher options)))

(defn status!
  "Give status info"
  [options]
  (print options))
