(ns watch-and-tar.server
  (:require [hawk.core :as hawk]))

(defn start!
  "Start the watcher"
  [options]
  (hawk/watch! [{:paths [(:dir options)]
                 :handler (fn [ctx e]
                            (println "event: " e)
                            (println "context: " ctx)
                            ctx)}]))

(defn stop!
  "Stop a watcher"
  [options]
  (hawk/stop! (:watcher options)))

(defn status!
  "Give status info"
  [options]
  (print options))
