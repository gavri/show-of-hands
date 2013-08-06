(ns show-of-hands.preferential (:require [show-of-hands.extensions :refer :all]) (:gen-class))

(defn candidateWithLowestNumberOfTopRanks [frequencyOfTopRankedCandidates]
  (key (reduce (partial min-key val) frequencyOfTopRankedCandidates))
)

(defn ballotSheetsWithOneCandidateRemoved [ballotSheets candidateTobeRemoved]
  (map (partial remove #(= % candidateTobeRemoved)) ballotSheets)
)

(defn winners [ballotSheets]
  (def topRanks (map first ballotSheets))
  (def countOfUniqueTopRankedCandidates (count (set topRanks)))
  (def frequencyOfTopRankedCandidates (frequencies topRanks))
  (def numberOfUniqueTopRanks (count (vals frequencyOfTopRankedCandidates)))
  (if (= numberOfUniqueTopRanks 1)
    (keys frequencyOfTopRankedCandidates)
    (do
      (def candidateTobeRemoved (candidateWithLowestNumberOfTopRanks frequencyOfTopRankedCandidates))
      (winners (ballotSheetsWithOneCandidateRemoved ballotSheets candidateTobeRemoved))
      )
    )
  )
