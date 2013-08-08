(ns show-of-hands.coombs-test (:require [show-of-hands.coombs :as coombs] [midje.sweet :refer :all]))

(facts "coombs"
  (fact "winners"
    (coombs/winners [[1]]) => '(1)
  )
)
