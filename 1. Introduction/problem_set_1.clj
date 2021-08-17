; Solution to problem set #1

(require '[clojure.math.numeric-tower :refer [expt]])

; Problem 1
(defn gibibytes->bytes [gibibytes]
  (* gibibytes (expt 2 30)))