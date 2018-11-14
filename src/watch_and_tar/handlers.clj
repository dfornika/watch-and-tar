(ns watch-and-tar.handlers
  (:require [me.raynes.fs.compression :as fs.compress]
            [clojure.java.io :as io]))

(defn print-handler [ctx e]
  "Just print the event and context."
  (if (.isDirectory (:file e))
    (do (println "event: " e)
        (println "context: " ctx)
        (println "path: " (.getPath (:file e)))
        ctx)))

(defn compress-handler [ctx e]
  "Compress directories as they are created."
  (if (= (:kind e) :created)
    (fs.compress/zip (:file e)))
  ctx)
  
