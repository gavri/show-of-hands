(ns show-of-hands.instant-run-off (:require [show-of-hands.preferential :as preferential]) (:gen-class))

(defn candidateWithLowestNumberOfTopRanks [ballotSheets]
  (key (reduce (partial min-key val) (preferential/frequencyOfTopRankedCandidates ballotSheets)))
)

(defn winners [ballotSheets]
  (preferential/winners ballotSheets candidateWithLowestNumberOfTopRanks)
  )
