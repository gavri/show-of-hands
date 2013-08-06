(ns show-of-hands.core (:require [show-of-hands.plurality :as plurality] [show-of-hands.preferential :as preferential])
  (:gen-class))
(defn -main
  "main"
  [& args]
  (def ballotSheets (if args (read-string (first args)) [[1 3 2] [2 3 1] [2 1 3] [3 1 2] [3 2 1]]))
  (println (plurality/winners ballotSheets))
  (println (preferential/winners ballotSheets))
  )
