(ns show-of-hands.bucklin (:require [show-of-hands.majority :as majority]) (:gen-class))
(defn winners [ballot-sheets]
  (majority/winners ballot-sheets)
  )
