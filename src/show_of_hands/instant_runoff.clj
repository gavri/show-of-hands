(ns show-of-hands.instant-runoff (:require [show-of-hands.preferential :as preferential]) (:gen-class))

(defn candidate-with-lowest-number-of-top-ranks [ballot-sheets]
  (key (reduce (partial min-key val) (preferential/frequency-of-top-ranked-candidates ballot-sheets)))
)

(defn winners [ballot-sheets]
  (preferential/winners ballot-sheets candidate-with-lowest-number-of-top-ranks)
  )
