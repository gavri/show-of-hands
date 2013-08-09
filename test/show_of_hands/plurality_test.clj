(ns show-of-hands.plurality-test (:require [show-of-hands.plurality :as plurality] [show-of-hands.test-data-factory :as factory] [midje.sweet :refer :all]))

(facts "plurality"
       (fact "degenerate case"
             (doseq [i (factory/random-small-integers 100)]
               (plurality/winners [[i]]) => [i]
             )
             )
       (fact "majority is plurality"
             (plurality/winners [[1] [2] [2]]) => [2]
            )
       (fact "plurality need not be a majority"
             (plurality/winners [[1] [1] [2] [2] [2] [3] [3]]) => [2]
             )
       (fact "plurality with equal winners"
             (plurality/winners [[1] [2]]) => [1 2]
             )
       )
