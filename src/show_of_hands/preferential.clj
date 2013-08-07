(ns show-of-hands.preferential (:require [show-of-hands.extensions :refer :all]) (:gen-class))

(defn ballotSheetsWithOneCandidateRemoved [ballotSheets candidateTobeRemoved]
  (map (partial remove #(= % candidateTobeRemoved)) ballotSheets)
)

(defn frequencyOfTopRankedCandidates [ballotSheets]
  (def topRanks (map first ballotSheets))
  (frequencies topRanks)
)

(defn winners [ballotSheets s]
  (def tally (frequencyOfTopRankedCandidates ballotSheets))
  (def numberOfUniqueTopRanks (count tally))
  (if (= numberOfUniqueTopRanks 1)
    (keys tally)
    (do
      (def candidateTobeRemoved (s ballotSheets))
      (winners (ballotSheetsWithOneCandidateRemoved ballotSheets candidateTobeRemoved) s)
      )
    )
  )
