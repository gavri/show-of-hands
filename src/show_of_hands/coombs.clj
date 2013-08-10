(ns show-of-hands.coombs (:require [show-of-hands.preferential :as preferential]) (:gen-class))

(defn candidate-with-highest-number-of-bottom-ranks [ballot-sheets]
  (def last-ranks (map last ballot-sheets))
  (key (reduce (partial max-key val) (frequencies last-ranks)))
  )

(defn winners [ballot-sheets]
  (preferential/winners ballot-sheets candidate-with-highest-number-of-bottom-ranks)
  )
