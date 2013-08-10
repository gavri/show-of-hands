(ns show-of-hands.plurality (:require [show-of-hands.extensions :refer :all]) (:gen-class))
(defn winners [ballot-sheets]
  (def first-choices (map first ballot-sheets))
  (def freq (frequencies first-choices))
  (max-keys-based-on-value freq)
  )
