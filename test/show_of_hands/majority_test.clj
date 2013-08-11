(ns show-of-hands.majority-test (:require [show-of-hands.majority :as majority] [midje.sweet :refer :all]))

(facts "majority"
       (fact "degenerate" (majority/winners [[1]]) => 1)
       (fact "simple" (majority/winners [[1] [2] [2]]) => 2)
       (fact "plurality isn't a majority" (majority/winners [[1] [1] [2] [2] [2] [3] [3]]) => nil)
       (fact "No shared victories" (majority/winners [[1] [1] [2] [2]]) => nil)
       )
