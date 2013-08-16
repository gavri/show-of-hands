(ns show-of-hands.majority (:require [show-of-hands.extensions :refer :all]) (:gen-class))
(defn winners [ballot-sheets]
  (def first-choices (map first ballot-sheets))
  (def freq (frequencies first-choices))
  (def a-candidate-with-votes-gt-or-eq-to-other-candidates (first (max-keys-based-on-value freq)))
  (def the-post (/ (count ballot-sheets) 2))
  (if (> (get freq a-candidate-with-votes-gt-or-eq-to-other-candidates) the-post)
    a-candidate-with-votes-gt-or-eq-to-other-candidates
    )
  )
