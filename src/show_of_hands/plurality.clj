(ns show-of-hands.plurality (:require [show-of-hands.extensions :refer :all]) (:gen-class))
(defn winners [ballotSheets]
  (def firstChoices (map first ballotSheets))
  (def freq (frequencies firstChoices))
  (max-keys-based-on-value freq)
  )
