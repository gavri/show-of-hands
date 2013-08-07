(ns show-of-hands.coombs (:require [show-of-hands.preferential :as preferential]) (:gen-class))

(defn candidateWithHighestNumberOfBottomRanks [ballotSheets]
  (def lastRanks (map last ballotSheets))
  (key (reduce (partial max-key val) (frequencies lastRanks)))
  )

(defn winners [ballotSheets]
  (preferential/winners ballotSheets candidateWithHighestNumberOfBottomRanks)
  )
