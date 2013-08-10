(ns show-of-hands.preferential (:require [show-of-hands.extensions :refer :all]) (:gen-class))

(defn ballot-sheets-with-one-candidate-removed [ballot-sheets candidate-to-be-removed]
  (map (partial remove #(= % candidate-to-be-removed)) ballot-sheets)
)

(defn frequency-of-top-ranked-candidates [ballot-sheets]
  (def top-ranks (map first ballot-sheets))
  (frequencies top-ranks)
)

(defn winners [ballot-sheets s]
  (def tally (frequency-of-top-ranked-candidates ballot-sheets))
  (def number-of-unique-top-ranks (count tally))
  (if (= number-of-unique-top-ranks 1)
    (keys tally)
    (do
      (def candidate-to-be-removed (s ballot-sheets))
      (winners (ballot-sheets-with-one-candidate-removed ballot-sheets candidate-to-be-removed) s)
      )
    )
  )
