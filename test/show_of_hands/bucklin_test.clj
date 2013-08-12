(ns show-of-hands.bucklin-test (:require [show-of-hands.bucklin :as bucklin] [midje.sweet :refer :all]))
(facts "bucklin"
       (fact "degenerate" (bucklin/winners [[1, 2]]) => 1)
       (future-fact "winner determined from first preferences" (bucklin/winners [[1, 2] [2, 1] [2, 1]]) => 2)
       (future-fact "winner determined from first and second preferences" (bucklin/winners [[1, 2, 3] [1, 2, 3] [2, 1, 3] [2, 3, 1] [3, 2, 1]]) => 2)
       )
