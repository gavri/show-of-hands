(ns show-of-hands.test-data-factory)

(defn random-integers-between [start end]
  (repeatedly #(rand-nth (range start end)))
  )

(defn random-small-integers [n]
  (take n (random-integers-between -1000 1000))
)
