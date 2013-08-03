(load-file "extensions/show-of-hands-lib.clj")
(ns show-of-hands.core
  (:gen-class))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def ballotSheets [[1 2 3] [2 3 1] [2 1 3]])
  (def firstChoices (map first ballotSheets))
  (def freq (frequencies firstChoices))
  (def winner (key (max-keys-based-on-value freq)))
  (println winner)
)
