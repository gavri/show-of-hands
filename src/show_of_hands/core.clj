(ns show-of-hands.core (:require [show-of-hands.extensions :refer :all])
  (:gen-class))
(defn -main
  "main"
  [& args]
  (def ballotSheets (if args (read-string (first args)) [[1 2 3] [2 3 1] [2 1 3] [3 1 2] [3 2 1]]))
  (def firstChoices (map first ballotSheets))
  (def freq (frequencies firstChoices))
  (def winners (max-keys-based-on-value freq))
  (println winners)
  )
