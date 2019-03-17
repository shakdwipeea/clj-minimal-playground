(ns user.core
  (:require [nrepl.server :as nrepl]
            ))

(defn nrepl-handler []
  (require 'cider.nrepl)
  (ns-resolve 'cider.nrepl 'cider-nrepl-handler))

(defn -main [& args]
  (println "Starting nrepl..")
  (nrepl/start-server :port 9001 :handler (nrepl-handler))
  (println "Try M-x cider-connect with localhost and port 9001"))
