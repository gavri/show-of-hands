(ns show-of-hands.instant-runoff-test (:require [show-of-hands.instant-runoff :as instant-runoff] [midje.sweet :refer :all]))
(facts "instant runoff"
  (fact "about plus"
    (instant-runoff/winners [[1]]) => '(1)
)
)
