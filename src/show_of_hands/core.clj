(ns show-of-hands.core (:require [show-of-hands.plurality :as plurality] [show-of-hands.instant-runoff :as instant-runoff] [show-of-hands.coombs :as coombs])
  (:gen-class))
(defn -main
  "main"
  [& args]
  (def ballot-sheets (if args (read-string (first args)) [[1 3 2] [2 1 3] [2 1 3] [3 1 2] [3 2 1]]))
  (println (plurality/winners ballot-sheets))
  (println (instant-runoff/winners ballot-sheets))
  (println (coombs/winners ballot-sheets))
  )
