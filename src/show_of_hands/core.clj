(ns show-of-hands.core (:require [show-of-hands.plurality :as plurality] [show-of-hands.instant-run-off :as instant-run-off] [show-of-hands.coombs :as coombs])
  (:gen-class))
(defn -main
  "main"
  [& args]
  (def ballotSheets (if args (read-string (first args)) [[1 3 2] [2 1 3] [2 1 3] [3 1 2] [3 2 1]]))
  (println (plurality/winners ballotSheets))
  (println (instant-run-off/winners ballotSheets))
  (println (coombs/winners ballotSheets))
  )
