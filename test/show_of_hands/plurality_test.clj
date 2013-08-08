(ns show-of-hands.plurality-test (:require [show-of-hands.plurality :as plurality] [midje.sweet :refer :all]))

(facts "plurality"
  (fact "winners"
    (plurality/winners [[1]]) => [1]
    ))
