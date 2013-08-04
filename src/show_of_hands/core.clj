(ns show-of-hands.core
  (:gen-class))
(defn max-value [h]
  (apply max (vals h))
  )
(defn max-keys-based-on-value [h]
  (let [m (max-value h)]
    (into [] (for [[k v] h :when (= v m)] k))
    )
  )
(defn -main
  "main"
  [& args]
  (def ballotSheets (if args (read-string (first args)) [[1 2 3] [2 3 1] [2 1 3] [3 1 2] [3 2 1]]))
  (def firstChoices (map first ballotSheets))
  (def freq (frequencies firstChoices))
  (def winners (max-keys-based-on-value freq))
  (println winners)
  )
