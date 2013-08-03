(defn max-value [h]
  (apply max (vals h))
  )
(defn max-keys-based-on-value [h]
  (let [m (max-value h)]
    (into [] (for [[k v] h :when (= v m)] k))
    )
  )
